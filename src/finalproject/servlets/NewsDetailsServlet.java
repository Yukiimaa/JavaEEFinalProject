package finalproject.servlets;

import finalproject.db.DBConnector;
import finalproject.models.Comment;
import finalproject.models.News;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/newsdetails")
public class NewsDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int newsId = Integer.parseInt(request.getParameter("newsId"));
        News news = DBConnector.getNewsById(newsId);
        ArrayList<Comment> comments = DBConnector.getCommentsByNewsId(newsId);
        request.setAttribute("newsbyid", news);
        request.setAttribute("commentsbynewsid", comments);
        request.getRequestDispatcher("/newsdetails.jsp").forward(request,response);
    }

}
