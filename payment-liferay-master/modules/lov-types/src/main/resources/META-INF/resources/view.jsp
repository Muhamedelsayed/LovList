<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="/init.jsp"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>

<%@page import="com.ejada.LOVList.model.LOVLIST"%>
<portlet:renderURL var="add_type">
	<portlet:param name="mvcPath" value="/createLov.jsp" />
</portlet:renderURL>
<%
	List<LOVLIST> records = (List<LOVLIST>) request.getAttribute("records") != null
			? (List<LOVLIST>) request.getAttribute("records")
			: new ArrayList<>();
%>


		
	<div class="table-responsive">
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>En Name</th>
					<th>Ar Name</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<%
					for (LOVLIST record : records) {
				%>
				<tr>
					<td><%=record.getId()%></td>
					<td><%=record.getEnName()%></td>
					<td><%=record.getArName()%></td>
					<td>
						<div class="drop-down">
							<div type="button" id="dropdownMenuButton" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false">
								<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
									fill="currentColor" class="bi bi-three-dots-vertical"
									viewBox="0 0 16 16">
<path
										d="M9.5 13a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0z" />
</svg>
							</div>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
							</div>
						</div>
					</td>
				<tr>
					<%
						}
					%>
				
			</tbody>
		</table>
		<a href="<%=add_type%>" class="btn btn-primary">Add type</a>
		
	</div>
