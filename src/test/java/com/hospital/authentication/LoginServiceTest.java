package com.hospital.authentication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import com.hospital.entities.HospitalService;
import com.hospital.models.Employee;

public class LoginServiceTest {

    @Test
    public void successfulLoginSetsSessionAndRedirects() throws Exception {
        LoginService svc = new LoginService();

        // replace hospitalService with mock
        HospitalService mockSvc = mock(HospitalService.class);
        svc.hospitalService = mockSvc;

        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);

        when(req.getSession()).thenReturn(session);
        when(session.getAttribute("employee")).thenReturn(null);
        when(req.getParameter("user")).thenReturn("alice");
        when(req.getParameter("pass")).thenReturn("pwd");

        Employee emp = new Employee();
        emp.setEmployeeId(1);
        when(mockSvc.getEmployee(anyString(), anyString())).thenReturn(emp);

        // capture redirect
        ArgumentCaptor<String> capt = ArgumentCaptor.forClass(String.class);
        doNothing().when(resp).sendRedirect(capt.capture());

        svc.doPost(req, resp);

        // verify redirect to home
        assertEquals("home.jsp", capt.getValue());
        verify(session).setAttribute("employee", emp);
    }

    @Test
    public void failedLoginRedirectsToIndex() throws Exception {
        LoginService svc = new LoginService();
        HospitalService mockSvc = mock(HospitalService.class);
        svc.hospitalService = mockSvc;

        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);

        when(req.getSession()).thenReturn(session);
        when(session.getAttribute("employee")).thenReturn(null);
        when(req.getParameter("user")).thenReturn("bob");
        when(req.getParameter("pass")).thenReturn("bad");

        when(mockSvc.getEmployee(anyString(), anyString())).thenReturn(null);

        ArgumentCaptor<String> capt = ArgumentCaptor.forClass(String.class);
        doNothing().when(resp).sendRedirect(capt.capture());

        svc.doPost(req, resp);

        assertEquals("index.jsp?error=true", capt.getValue());
    }

}
