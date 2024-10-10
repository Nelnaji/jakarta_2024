package demo.jakarta.servlets.pilot;


import demo.jakarta.entities.Pilot;
import demo.jakarta.services.PilotService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/pilot")
public class PilotIndexServlet extends HttpServlet {

    @Inject
    private PilotService pilotService;

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Pilot> planes = pilotService.getAll();
        req.setAttribute("planes", planes);
        req.getRequestDispatcher("/WEB-INF/pages/plane/pilot/pilotIndex").forward(req,resp);
    }

}
