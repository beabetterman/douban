<html>
<body>
<h2>Hello World! From JSP folder.</h2>
<h2>${cm.id}</h2>
<table>
	<tr>
		<td>${cm.id}</td><td>${cm.user_name}</td><td>${cm.movie_name}</td><td>${cm.rating_desc}</td>
		<td>${cm.votes_num}</td><td>${cm.comment}</td>
	</tr>
</table>
<div>
	<%@include file="template.html" %>
</div>
</body>
</html>