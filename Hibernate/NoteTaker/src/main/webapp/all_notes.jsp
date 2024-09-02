<%@page import="org.hibernate.Session"%>
<%@page import="com.helper.*"%>
<%@page import="com.entities.*"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add Notes : All Notes</title>
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
			<h2>All Notes:</h2>
		</div>
		<br>

		<div class="row">
			<div class="col-12">
				<%
				Session s = FactoryProvider.getFactory().openSession();
				Query q = s.createQuery("from Note");
				List<Note> list = q.list();
				for (Note note : list) {
				%>
				<div class="card">
					<img src="img/note.png" style="max-width:100px" class="card-img-top p-2" alt="...">
					<div class="card-body">
						<h5 class="card-title"><%=note.getTitle()%></h5>
						<p class="card-text"><%=note.getContent()%></p>
						<p class="card-text text-primary"><%=note.getAddedDate()%></p>
						<a href="edit.jsp?note_id=<%=note.getId() %>" class="btn btn-primary">Update</a>
						<a href="DeleteServlet?note_id=<%=note.getId()%>" class="btn btn-danger">Delete</a>
					</div>
				</div>
				<br>
				<%
				}
				s.close();
				%>
			</div>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>