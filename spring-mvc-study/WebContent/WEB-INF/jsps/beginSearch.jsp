<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查找航班</title>
</head>
<body>
	<h1>Search for Flights</h1>
	<spring:nestedPath path="flightSearchCriteria">
	<form action="" method="post">
		<table>
			<tr>
				<td>Depart From:</td>
				<td>
					<spring:bind path="departFrom">
						<input type="text" name="${status.expression}" value="${status.value}" />
					</spring:bind>
				</td>
				<td>Depart On:</td>
				<td>
					<spring:bind path="departOn">
						<input type="text" name="${status.expression}" value="${status.value}" />
					</spring:bind>
					<span style="font-size:smaller">(yyyy-MM-dd HH)</span>
				</td>
			</tr>
			<tr>
				<td>Arrive At:</td>
				<td>
					<spring:bind path="arriveAt">
						<input type="text" name="${status.expression}" value="${status.value}" />
					</spring:bind>
				</td>
				<td>Return On:</td>
				<td>
					<spring:bind path="returnOn">
						<input type="text" name="${status.expression}" value="${status.value}" />
					</spring:bind>
					<span style="font-size:smaller">(yyyy-MM-dd HH)</span>
				</td>
			</tr>
			<tr>
				<td/>
				<td><input type="submit" value="search"></td>
				<td/>
				<td/>
			</tr>
		</table>
	</form>
	</spring:nestedPath>
</body>
</html>