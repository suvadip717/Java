package com.servlets;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.println("hello update");
			int noteId = Integer.parseInt(request.getParameter("noteId").trim());
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			System.out.println(noteId);
			
			Session s = FactoryProvider.getFactory().openSession();
			Transaction tx = s.beginTransaction();
			
			Note note = s.get(Note.class, noteId);
			
			note.setTitle(title);
			note.setContent(content);
			note.setAddedDate(new Date());

			tx.commit();
			s.close();
			
			response.sendRedirect("all_notes.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
