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
<br/>


------------------------------------
<br/>
<#list ["Mon", "Tue", "Wed", "Thu", "Fri", "Sta", "Sun"] as x>  
  ${x_index+1}.${x} <#if x_has_next>,</#if>
  <#if x=="Thu"><#break></#if>  
</#list>
<br/>  
<div>${cm.id}</div>
------------------------------------------------
<br/>
<#list cm?keys>
	<ul>
		<#items as key>
		<li>${key}:${items[key]}</li>
		</#items>
	</ul>
</#list>


<div>
   1:${curTime?date}<br/>
   2:${curTime?datetime}<br/>
   3:${curTime?time}
</div>
${curTime?string("yyyy-MM-dd HH:mm:ss zzzz")}  <br/>
${curTime?string("EEE, MMM d, ''yy")}  <br/>
${curTime?string("EEEE, MMMM dd, yyyy, hh:mm:ss a '('zzz')'")}  <br/>
</body>  
</html>