<%-- 
    Document   : addFitnesCentar
    Created on : Oct 4, 2018, 7:57:39 AM
    Author     : Jelena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Dodavanje centra</h3>
<br/><br/>
<c:url var="addFitnesCentar" value="/addFitnesCentar" ></c:url>
    <div class="container">
        <div class="col-md-6 col-md-offset-3">

        <c:url var="post_url"  value="/addFitnesCentar/" />
        <form:form method="POST" action="${post_url}" modelAttribute="fitnesCentar">
            <% String success = (String) request.getAttribute("successMsg"); %>
            <%= (success != null) ? "<div class=\"alert alert-success\">"+success+"</div>" : "" %>
            <div class="form-group">
                <form:label for="kategorijaFitnesCentra" path="kategorijaFitnesCentra">Kategorije centara</form:label>
                <form:select id="slcRole" class="form-control" path="kategorijaFitnesCentra">
                    <form:option value="">SELECT</form:option>
                    <form:options items="${kategorijeFitnesCentara}" itemValue="idKategorijaFitnesCentra" itemLabel="nazivKategorija" />
                </form:select>
            </div>
            <div class="form-group">
                <form:hidden path="idFitnesCentar" />
            </div>
            <div class="form-group">
                <form:label path="imeFitnesCentar">Ime centra</form:label>
                <form:input type="imeFitnesCentar" id="imeFitnesCentar" class="form-control" placeholder="Ime fitnes centra" path="imeFitnesCentar" />
            </div>
            <div class="form-group">
                <form:label path="clanarina">Clanarina</form:label>
                <form:input type="clanarina" id="clanarina" class="form-control" placeholder="Clanarina" path="clanarina" />
            </div>
            <div class="form-group">
                <form:label path="opis">Opis</form:label>
                <form:input type="opis" id="opis" class="form-control" placeholder="Opis centra" path="opis" />
            </div>
            <div class="form-group">
                <form:label path="radnoVreme">Radno vreme</form:label>
                <form:input type="radnoVreme" id="radnoVreme" class="form-control" placeholder="Radno vreme centra" path="radnoVreme" />
            </div>
            
            <button type="submit" class="btn btn-primary" style="display: block; margin: auto; background-color: teal">Dodaj centar</button>
        </form:form>
    </div>
</div>
