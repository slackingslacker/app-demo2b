<!DOCTYPE html>
<html>
<head>
<title>My Store</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<#list allProducts as prod>
			<tr>
				<td>${prod.name}</td>
				<td>${prod.price?string["0.00"]}</td>
			</tr>
			</#list>
		</tbody>
	</table>
</body>
</html>