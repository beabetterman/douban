<html>
<head>
	<meta http-equiv=Content-Type content="charset=utf-8">
</head>
<body>
<h2>Hello World!</h2>
<div>
	<span>Server:&nbsp;</span><span><%=request.getServerName()+":"+request.getServerPort()%></span>&nbsp;<span>SessionID:&nbsp;</span><span><%=session.getId()%></span>
</div>

<div id="rest_post_api">
	<form action="rest/rest_post_api" method="post">
		<div><span>Name: </span><span></span><input type="text" name="user_name"/></div>
		<div><span>Password: </span><span><input type="text" name="password"/></div>
		<div><input type="submit" value="POST" /></div>
		
	</form>
</div>

<div id="rest_get_api">
	<form action="rest/rest_get_api?infor=123" method="post">
		<div><span>Name: </span><span><input type="text" name="user_name_fake" value="FakeName"/></div>
		<div><span>Password: </span><span><input type="text" name="password_fake" value="FakePsd"/></div>
		<div><input type="submit" value="GET" /></div>
	</form>
</div>

<div id="rest_more">
	<span>ALL : GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS</span><br/>
	<span>TODO : PUT, PATCH, DELETE, HEAD, OPTIONS</span>
</div>
<br/>
<div>
	<p>
	This is information about HTTP operations.<br/>
	&nbsp;&nbsp;GET(SELECT) : Get one or one items.<br/>
	&nbsp;&nbsp;POST(CREATE) : Create a new item.<br/>
	&nbsp;&nbsp;PUT(UPDATE) : Update the item, client provide all information.<br/>
	&nbsp;&nbsp;PATCH(UPDATE) : Update item for the given attributes.<br/>
	&nbsp;&nbsp;DELETE(DELETE) : Delete item.<br/>
<br/>
Not offen use.<br/>
	&nbsp;&nbsp;HEAD: Get meata data.<br/>
	&nbsp;&nbsp;OPTIONS: Get data information. Could modify or not.<br/>

	</p>
</div>


</body>
</html>
