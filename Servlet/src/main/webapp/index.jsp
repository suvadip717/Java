<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Servlet</title>
    <link
      rel="stylesheet"
      href="<%= application.getContextPath() %>/CSS/style.css"
    />
  </head>
  <body>
    <div class="container">
      <%@include file="menu.jsp"%>
      <h1>Welcome to home page</h1>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
        tempor incididunt ut labore et dolore magna aliqu
      </p>
    </div>
  </body>
  <script src="<%= application.getContextPath() %>/JS/test.js"></script>
</html>
