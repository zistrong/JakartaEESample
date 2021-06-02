package com.zistrong.jakartaee.listener;

import jakarta.faces.event.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionDataSaveAndRestoreListener implements HttpSessionListener, SystemEventListener {


    @Override
    public void processEvent(SystemEvent systemEvent) throws AbortProcessingException {
        if (systemEvent instanceof PostConstructApplicationEvent) {
        } else if (systemEvent instanceof PreDestroyApplicationEvent) {
        } else if (systemEvent instanceof PostValidateEvent) {
        }
    }

    @Override
    public boolean isListenerForSource(Object source) {
        return true;
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("sessionCreated: " + httpSessionEvent.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("sessionDestroyed: " + httpSessionEvent.getSession().getId());
    }
}
