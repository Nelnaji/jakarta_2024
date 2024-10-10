package demo.jakarta.servlets.plane;

import demo.jakarta.entities.Plane;
import demo.jakarta.services.PlaneService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

import static java.lang.Long.parseLong;

@WebServlet("/plane")
public class PlaneIndexServlet extends HttpServlet {

    @Inject
    private PlaneService planeService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Plane> planes = planeService.getAll();
        req.setAttribute("planes", planes);
        req.getRequestDispatcher("/WEB-INF/pages/plane/planeIndex.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String form = req.getReader().readLine();
        String[] fields = form.split("&");
        String action = fields[0].split("=")[1];

        switch (action) {
            case "delete":
                Long planeId = parseLong(fields[1].split("=")[1]);
                planeService.delete(planeId);
                break;

        }

        // Redirect back to the plane list after deletion
        resp.sendRedirect(req.getContextPath() + "/plane");
    }
}
