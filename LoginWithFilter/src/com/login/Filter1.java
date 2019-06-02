package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class Filter1
 */
@WebFilter("/Login1")
public class Filter1 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
PrintWriter out=response.getWriter();
out.print("in filter 1....!!!");
		HttpServletRequest req=(HttpServletRequest) request;
		String m=req.getParameter("user");
		//String n=req.getParameter("pass");
		if(m.equals("admin"))
		{
			out.print("filter 1 pass....!!!");
			
		chain.doFilter(request, response);
		}
		else
		{
			
			out.print("Filter 1 error.....!!!");
		}
		out.print("out filter....!!!");
		
		}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
