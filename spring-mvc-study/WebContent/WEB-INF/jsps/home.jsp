<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>特价机票</title>
</head>
<body>
	<h1>Welcome to Flight Booking Service</h1>
	<p>We have special deals as follows:</p>
	<ul>
		<c:forEach items="${specials}" var="special">
		<li>
			${special.departFrom.name} - ${special.arriveAt.name} from $${special.cost}
		</li>
		</c:forEach>
	</ul>
	<p><a href="search">search for a flight.</a></p>
</body>
</html>