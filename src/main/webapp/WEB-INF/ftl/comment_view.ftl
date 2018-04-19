<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>another</title>
</head>
<body>  
<#list testList as item>  
testListItem : ${item}<br/>  
</#list>

<table>
	<tr>
		<td>${cm.id}</td><td>${cm.user_name}</td><td>${cm.movie_name}</td><td>${cm.rating_desc}</td>
		<td>${cm.votes_num}</td><td>${cm.comment}</td>
	</tr>
</table>

</body>  
</html>