<%@page import="org.hibernate.Session"%>
<%@page import="com.helper.*"%>
<%@page import="com.entities.*"%>
<%@page import="org.hibernate.query.Query"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add Notes : Edit</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link href="CSS/style.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<div>
			<h2>Edit Note:</h2>
		</div>
		<br>
		<%
		int noteId = Integer.parseInt(request.getParameter("note_id").trim());
		Session s = FactoryProvider.getFactory().openSession();
		Note note = (Note) s.get(Note.class, noteId);
		%>
		<form action="UpdateServlet" method="post">
		
		  <input value="<%=note.getId()%>" name="noteId" type="hidden">
			<div class="mb-3">
				<label for="title" class="form-label">Note Title</label> 
				<input name="title" required
					type="text" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Today task" 
					value="<%=note.getTitle()%>"/>
			</div>

			<div class="mb-3">
				<label for="content" class="form-label">Note Details</label>
				<textarea name="content" required class="form-control" id="content" rows="3"
					placeholder="My today task is going to school"
					style="height: 300px"><%=note.getContent()%></textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-success">Update Note</button>
			</div>
			
		</form>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>