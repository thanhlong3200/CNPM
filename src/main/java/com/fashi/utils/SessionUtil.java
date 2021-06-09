package com.fashi.utils;

import javax.servlet.http.HttpServletRequest;

public class SessionUtil {

    private static SessionUtil instance = null;
    
    private SessionUtil() {};

    public static SessionUtil getInstance() {
        if (instance == null) {
        	instance = new SessionUtil();
        }
        return instance;
    }

    public void putValue(HttpServletRequest request, String key, Object value) {
        request.getSession().setAttribute(key, value);
    }

    public Object getValue(HttpServletRequest request, String key) {
        return request.getSession().getAttribute(key);
    }

    public void removeValue(HttpServletRequest request, String key) {
        request.getSession().removeAttribute(key);
    }
}
