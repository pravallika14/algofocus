package org.oecm67.uiApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirestServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter out=res.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+ "<h1>welcome"+name+place+"</h1>"
						+ "</body><html>");
		out.flush();
		out.close();
		
		
	}
	
	

}
