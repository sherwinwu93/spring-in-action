<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spittle</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
</head>
<body>
<div>
    <div><c:out value="${spittle.message}"></c:out></div>
    <div>
        <span><c:out value="${spittle.time}"/></span>
    </div>
</div>
</body>
</html>