/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import model.league;

/**
 *
 * @author INNOCENT
 */
public class listleagueservlet extends HttpServlet 
{
    private List leaguelist = null;
    
    public void doGet(HttpServletRequest request , HttpServletResponse response)throws IOException
    {
        leaguelist = new LinkedList();
        leaguelist.add( new league(2003, "Spring","Soccer League (Spring '03)"));
        leaguelist.add( new league( 2003,"Summer","Summer Soccer Fest 2003"));
         leaguelist.add( new league(2003, "Fall",
                               "Fall Soccer League (2003)") );
    leaguelist.add( new league(2004, "Spring",
                               "Soccer League (Spring '04)") );
    leaguelist.add( new league(2004, "Summer",
                               "The Summer of Soccer Love 2004") );
    leaguelist.add( new league(2004, "Fall",
                               "Fall Soccer League (2004)") );
    
    // Set page title
    String pageTitle = "Duke's Soccer League: List Leagues";

    // Specify the content type is HTML
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    // Generate the HTML response
    out.println("<html>");
    out.println("<head>");
    out.println("  <title>" + pageTitle + "</title>");
    out.println("</head>");
    out.println("<body bgcolor='white'>");

    // Generate page heading
    out.println("<!-- Page Heading -->");
    out.println("<table border='1' cellpadding='5' cellspacing='0' width='400'>");
    out.println("<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>");
    out.println("  <td><h3>" + pageTitle + "</h3></td>");
    out.println("</tr>");
    out.println("</table>");

    // Generate main body
    out.println("<p>");
    out.println("The set of soccer leagues are:");
    out.println("</p>");

    out.println("<ul>");
    Iterator items = leaguelist.iterator();
    while ( items.hasNext() ) {
      league league = (league) items.next();
      out.println("  <li>" + league.gettitle() + "</li>");
    }
    out.println("</ul>");

    out.println("</body>");
    out.println("</html>");
    
    
    }//end of doget
    
}//end of listleagueservler clas

    