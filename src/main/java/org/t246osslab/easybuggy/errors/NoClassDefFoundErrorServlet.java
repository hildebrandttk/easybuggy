package org.t246osslab.easybuggy.errors;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.t246osslab.easybuggy.core.utils.DeleteClassWhileMavenBuild;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/ncdfe" })
public class NoClassDefFoundErrorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        new DeleteClassWhileMavenBuild();
    }
}
