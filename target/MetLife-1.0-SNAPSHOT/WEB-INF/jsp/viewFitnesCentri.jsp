<%-- 
    Document   : viewFitnesCentri
    Created on : Oct 4, 2018, 8:00:31 AM
    Author     : Jelena
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Pregled centara</h3>
<br/><br/>
<c:if test="${!empty fitnesCentri}">

    <table class="table table-hover">
        <thead>
            <tr>
                <th>Kategorija centrq</th>
                <th>Ime centra</th>
                <th>Clanarina</th>
                <th>Opis</th>
                <th>Radno Vreme</th>
                <th>Izmena</th>
                <th>Brisanje</th>
            </tr>
        </thead>
        <tbody> 
            <c:forEach items="${fitnesCentri}" var="fitnesCentar">
                <tr>
                    <td>${fitnesCentar.kategorijaFitnesCentra.nazivKategorija}</td>
                    <td>${fitnesCentar.imeFitnesCentar}</td>
                    <td>${fitnesCentar.clanarina}</td>
                    <td>${fitnesCentar.opis}</td>
                    <td>${FitnesCentar.radnoVreme}</td>
                    <td><a href="<c:url value='/editFitnesCentar/${fitnesCentar.idFitnesCentar}' />">Izmeni</a></td>
                    <td><a href="<c:url value='/deleteFitnesCentar/${fitnesCentar.idFitnesCentar}' />">Obrisi</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>

