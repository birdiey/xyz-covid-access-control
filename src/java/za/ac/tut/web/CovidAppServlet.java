
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.business.CovidRegulations;


public class CovidAppServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String wearingMask =request.getParameter("wearingMask");
        String sanitizing =request.getParameter("sanitizing");
        int temp =Integer.parseInt(request.getParameter("temp"));
        
        
        CovidRegulations cR = new CovidRegulations();
        String results = cR.determiningAccessToPremise(wearingMask, sanitizing, temp);
        
        request.setAttribute("wearingMask", wearingMask);
        request.setAttribute("sanitizing", sanitizing);
        request.setAttribute("temp", temp);
        request.setAttribute("results", results);
        
        
        RequestDispatcher disp = request.getRequestDispatcher("output.jsp");
        disp.forward(request, response);
        
        
    }


}
