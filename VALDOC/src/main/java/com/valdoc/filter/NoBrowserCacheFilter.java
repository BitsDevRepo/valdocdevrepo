//package com.valdoc.filter;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletResponse;
//
//public class NoBrowserCacheFilter implements Filter{
//
//    @Override
//    public void destroy() {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse res,
//            FilterChain chain) throws IOException, ServletException {
//        HttpServletResponse response=(HttpServletResponse)res;
//        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
//        response.setHeader("Pragma", "no-cache");
//        response.setDateHeader("Expires", -1);
//        chain.doFilter(req, res);
//    }
//
//    @Override
//    public void init(FilterConfig arg0) throws ServletException {
//
//    }
//
//}