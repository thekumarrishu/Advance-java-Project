/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.league;

/**
 *
 * @author INNOCENT
 */
public class errorpageservlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException 
    {
        generateView(request, response);
    }
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {
        generateView(request, response);
    }
    
    public void generateView(HttpServletRequest request,HttpServletResponse response)throws IOException
    {
        //Set page title
        String pagetitle = "Duke's Soccer league : Error page";
        //Retrieve the errorMsg from the request-scope
        List errorMsg = (List) request.getAttribute("errorMsg");
        //Specify the content type in HTML
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         //Generate the HTML response
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>"+ pagetitle +"</title>");
        out.println("</head>");
        out.println("<body bgcolor='white>");
        // Generating page heading 
        
        out.println("<!-- Page Heading -->");
        out.println("<table border='1' cellpadding='5' cellspacing='0' width='400'>");
        out.println("<tr bgcolor='red' align='center' valign='center' height='20'>");
        out.println("  <td><h3>" + pagetitle + "</h3></td>");
        out.println("</tr>");
        out.println("</table>");
        
        //Generating main body
        
        out.println("<p>");
        out.println("<font color='red'>Please correct the following errors:");
        out.println("<ul>");
        
        Iterator items = errorMsg.iterator();
        while(items.hasNext())
        {
            String message = (String)items.next();
            out.println("<li>"+message+"</li>");
        }
        out.println("</ul>");
        out.println("Backup and try again:");
        out.println("</font>");
        out.println("</p>");
        out.println("</body>");
        out.println("</html>");
    }
    
    
}

    