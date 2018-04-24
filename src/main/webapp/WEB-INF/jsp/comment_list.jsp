<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<body>
<h2>Hello World! From JSP folder.</h2>
<h2>${commentMovieList.size()}</h2>
<!-- 
<table>
	<tr>
		<td>${cm.id}</td><td>${cm.user_name}</td><td>${cm.movie_name}</td><td>${cm.rating_desc}</td>
		<td>${cm.votes_num}</td><td>${cm.comment}</td>
	</tr>
</table>
 -->
<div>
	<table border='1'>
		<c:if test="${!empty commentMovieList}">
			<c:forEach items="${commentMovieList}" var="cm">
				<tr>
					
					<td>${cm.id}</td><td>${cm.user_name}</td><td>${cm.movie_name}</td><td>${cm.rating_desc}</td>
		<td>${cm.votes_num}</td><td>${cm.comment}</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</div>
<div>
	<%@include file="template.html" %>
</div>
</body>
</html>