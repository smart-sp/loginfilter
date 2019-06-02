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
 * Servlet Filter implementation class Filter2
 */
@WebFilter("/Login1")
public class Filter2 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		out.print("in filter 2....!!!");
				HttpServletRequest req=(HttpServletRequest) request;
				String m=req.getParameter("pass");
				//String n=req.getParameter("pass");
				if(m.equals("admin"))
				{
					out.print("filter 2 pass....!!!");
					
					chain.doFilter(request, response);
				}
				else
				{
					
					out.print("Filter 2 error....!!!");
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
