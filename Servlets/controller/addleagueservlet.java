/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.league;
/**
 *
 * @author INNOCENT
 */
public class addleagueservlet extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        List errorMsg = new LinkedList();
        request.setAttribute ("errorMsg",errorMsg);
        try
        {
            //retrieve data from page
            String yearstr = request.getParameter("year").trim();
            String season = request.getParameter("season").trim();
            String title = request.getParameter("title").trim();
            
            //perform data conversions by typecasting
            
            int year = -1;
            try
            {
                year = Integer.parseInt(yearstr);
            }catch(NumberFormatException nfe)
            {
                errorMsg.add("The 'year' field must be a positive integer.");
            }
            //Verify form parameters
            if ( (year!= -1) && ((year < 2000) || (year > 2010)) )
            {
                errorMsg.add("The 'year' field must within 2000 to 2010.");
            }
            
            //Verify form parameters
            
            if( season.equals("UNKNOWN"))
            {
                errorMsg.add("Please enter a League season.");
            }
            if ( title.length()==0)
            {
                errorMsg.add("Please enter thhe title of the league.");
            }
            if ( ! errorMsg.isEmpty())
            {
              RequestDispatcher view = request.getRequestDispatcher("errorpageservlet");
              view.forward(request,response);
              return;
            }
            
            // send the user back to the AddDvd form , if there were errors
            
            //perform business logic
            
            league league = new league(year,season,title);
             //Store the new league in the request-scope
            
            request.setAttribute("league",league);
             //Send the success view
            
            RequestDispatcher view =  request.getRequestDispatcher("successservlet");
            
            view.forward(request, response);
            return;
        }
            
            //Handle any unusualException
         catch (Exception e)
         {
             errorMsg.add(e.getMessage());
            RequestDispatcher view = request.getRequestDispatcher("addleagueservlet");
            view.forward(request, response);
            //log stack trace
            e.printStackTrace(System.err);
         }//End try catch
            
            
        
    }//End of do post
}//end addleagueservlet class

   