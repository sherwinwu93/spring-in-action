<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles"  prefix="t"%>
<%@ page session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<s:url value="/resources/style.css"/>" >
</head>
<body>
    <%--插入头部--%>
    <div id="header">
        <t:insertAttribute name="header"/>
    </div>
    <%--插入主体内容--%>
    <div id="content">
        <t:insertAttribute name="body" />
    </div>
    <%--插入底部--%>
    <div id="footer">
        <t:insertAttribute name="footer" />
    </div>
</body>
</html>