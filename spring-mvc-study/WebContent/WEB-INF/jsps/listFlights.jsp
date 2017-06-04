<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>航班列表</title>
</head>
<body>
	<h1>List Flights</h1>
	<p>
		You searched for flights leaving ${searchFlights.departFrom} on or about
		${searchFlights.departOn} heading to ${searchFlights.arriveAt}, return on
		or about ${searchFlights.returnOn}. 
	</p>
	<table>
		<thead>
			<tr>
				<th>Number of legs</th>
				<th>Total travel time</th>
				<th>Total cost</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${flights}" var="flight">
				<tr>
					<td>${flight.numberOfLegs}</td>
					<td>${flight.totalTravelTime}</td>
					<td>$${flight.totalCost}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>