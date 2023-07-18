<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>
<%@ include file="/init.jsp"%>
<portlet:actionURL var="addLov" name="addLov">
</portlet:actionURL>
<form action="<%=addLov%>" method="post">
    <label for="EnName">En Name:</label>
    <input type="text" id="EnName" name="<portlet:namespace/>EnName" ><br>

    <label for="ArName">Ar Name:</label>
    <input type="text" id="ArName" name="<portlet:namespace/>ArName" ><br>

    <button type="submit" > add Lov</button>
</form>
 