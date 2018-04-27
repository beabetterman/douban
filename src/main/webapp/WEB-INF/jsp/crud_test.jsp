<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>CRUD Page</title>
	<script type="text/javascript">
		function updateMultiItems() {
			document.itemsForm.action="${pageContext.request.contextPath}/comment/update_multi_items";
			document.itemsForm.submit();
		}
		
		function updateItem() {
			//document.itemsForm.action="${pageContext.request.contextPath}/comment/update_item";
			// TODO  Ajax post and response.
			alert("Function will be added soon.");
			return false;
		}
	</script>
</head>
<body>
<div>
<form name="itemsForm" action="${pageContext.request.contextPath }/comment/query_items" method="post">
Query
<table width="100%" border=1>
	<tr>
		<td>
			
			<label>Rating</label><input type="text" name="rating" value="${queryItem.rating!=null?queryItem.rating:''}"/>
		</td>
		<td>
			<label>Movie Name</label><input type="text" name="movie_name" value="${queryItem.movie_name!=null?queryItem.movie_name:''}"/>
			
		</td>
		<td>
			<input type="submit" value="Query"/>
			<input type="button" value="UpdateItems" onclick="updateMultiItems()">
		</td>
	</tr>
</table>
<div>Comment List</div>

<table width="100%" border=1>
	<tr>
		<td>User Name</td>
		<td>Movie Name</td>
		<td>Rating</td>
		<td>Rating DESC</td>
		<td>Comment</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${itemsList}" var="item" varStatus="s">
		<tr>
			<td>
				<input type="hidden" name="itemsList[${s.index}].id" value="${item.id}"> 
				${item.user_name}
			</td>
			<td>${item.movie_name}</td>
			<td><input type="text" name="itemsList[${s.index}].rating" value="${item.rating}"> </td>
			<td>${item.rating_desc}</td>
			<td>${item.comment}</td>
			
			<td><input type="button" value="UpdateItem" onclick="updateItem()"></td>
		</tr>
	</c:forEach>

</table>
</form>
</div>

</body>
</html>