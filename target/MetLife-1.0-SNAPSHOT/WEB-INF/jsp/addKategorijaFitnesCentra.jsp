<%-- 
    Document   : addKategorijaFitnesCentra
    Created on : Oct 4, 2018, 7:58:00 AM
    Author     : Jelena
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ include file="header.jsp" %>

<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>

<h3 style="text-align: center">Dodavanje kategorije centara</h3>
<br/><br/>
<div class="container">
    <div class="col-md-6 col-md-offset-3">
        <c:url var="addKategorijaFitnesCentra" value="/addKategorijaFitnesCentra" ></c:url>
        <c:url var="post_url"  value="/addKategorijaFitnesCentra/" />
        <form:form method="POST" modelAttribute="kategorijaFitnesCentra" action="${post_url}">
            <% String success = (String) request.getAttribute("successMsg");%>
            <%= (success != null) ? "<div class=\"alert alert-success\">" + success + "</div>" : ""%>
            <div class="form-group">
                <form:hidden path="idKategorijaFitnesCentra" />
            </div>
            <div class="form-group">
                <form:label path="nazivKategorija">Naziv kategorije centra</form:label>
                <form:input type="nazivKategorija" class="form-control" id="nazivKategorija" placeholder="Unesite naziv kategorije" path="nazivKategorija" />
            </div>
            <button type="submit" class="btn btn-primary" style="display: block; margin: auto; background-color: teal">Dodaj kategoriju centra</button>
        </form:form>
    </div>
</div>
<br/><br/><br/><br/>   
