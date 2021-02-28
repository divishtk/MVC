<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
html, body {
	height: 100%;
}

html {
	display: table;
	margin: auto;
}

body {
	display: table-cell;
	horizontal-align: middle;
}
</style>
<body>
	<h1>Junk Food Advisor</h1>
	<br><br>
	<h3>Select Eatables</h3>
	<form method="post" action="Controller">
		<table cellspacing="5" cellpadding="5" width="100%">
			<tr>
				<th align="right">Type :</th>
				<td><select name="type" size=1>
						<option value="icecream">Ice Cream</option>
						<option value="softdrink">Soft Drink</option>
						<option value="chocolate">Chocolates</option>
						<option value="sweets">Sweets</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><br>
				<input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
