<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add Notes : Home</title>
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
		<div class="card">
			<img alt="Notes Image" src="img/note.png" class="img-fluid mx-auto mt-3" style="max-width:400px">
			<h1 class="text-primary text-uppercase text-center mt-3">Start Taking Your Notes</h1>
			<div class="container text-center mb-3">
				<a href="./add_notes.jsp"><button type="submit" class="btn btn-outline-primary text-center">Start Here</button></a>
			</div>
		</div>
		<br>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>