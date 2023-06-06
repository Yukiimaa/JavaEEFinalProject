package finalproject.servlets;

import finalproject.db.DBConnector;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(value = "/deletenews")
public class DeleteNewsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int newsId = Integer.parseInt(request.getParameter("newsId"));
        DBConnector.deleteComments(newsId);
        DBConnector.deleteNewsContent(newsId);
        DBConnector.deleteNews(newsId);
        response.sendRedirect("/main");
    }
}
