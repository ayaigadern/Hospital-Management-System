package com.hospital.authentication;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;

import com.hospital.actions.AdminListener;
import com.hospital.utils.ActionType;

public class ProcessRoutingTest {

    @Test
    public void addEmployeeActionInvokesAdminListener() throws Exception {
        // create mock listener and inject into AdminListener singleton
        AdminListener mockAdmin = mock(AdminListener.class);

        Field f = AdminListener.class.getDeclaredField("adminListener");
        f.setAccessible(true);
        f.set(null, mockAdmin);

        Process servlet = new Process();

        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);

        when(req.getParameter("action")).thenReturn(ActionType.AddEmployee.name());

        servlet.doGet(req, resp);

        verify(mockAdmin).addEmployee(req, resp);
    }

}
