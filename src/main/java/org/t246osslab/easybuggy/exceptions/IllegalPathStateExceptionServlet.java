package org.t246osslab.easybuggy.exceptions;

import java.awt.geom.GeneralPath;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/ipse" })
public class IllegalPathStateExceptionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        GeneralPath subPath = new GeneralPath(GeneralPath.WIND_EVEN_ODD, 100);
        subPath.closePath();
    }
}
