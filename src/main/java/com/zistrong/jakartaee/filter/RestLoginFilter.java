package com.zistrong.jakartaee.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter(filterName = "RestLoginFilter", urlPatterns = "/rest/*")
public class RestLoginFilter implements Filter {
    public void init(FilterConfig config) {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        System.out.println("url= " + ((HttpServletRequest) request).getRequestURL());

        chain.doFilter(request, response);
    }
}
