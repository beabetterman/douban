<html>
<head>
	<meta http-equiv=Content-Type content="charset=utf-8">
</head>
<body>
<h2>Check the session </h2>
<div>
	<table>
		<tr>
			<td>Session ID </td><td><%=session.getId()%></td>
		</tr>
		<tr>
			<td>Server Real IP & Port</td><td><%=request.getAttribute("server_ip") %></td>
		</tr>
		<tr>
			<td>Nginx IP:</td><td><%=request.getAttribute("proxy_ip") %></td>
		</tr>
		<tr>
			<td>Your IP:</td><td><%=request.getAttribute("client_ip") %></td>
		</tr>
	</table>
	
</div>
<div>
	<input type="button" onclick="javascript:window.location.reload()" value="Refresh"/><br/>
	<label>Click the button to try change the server. Check the Session ID information.</label>
</div>

</body>
</html>
