<html>
	<head>
		<title>List of Products</title>
	</head>
	<body>
		<#list products as product>
    		<span>${product}</span>
		<#else>
		    <p> Empty list !</p>
		</#list>
	</body>
</html>