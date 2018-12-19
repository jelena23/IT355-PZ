<%-- 
    Document   : viewKategorijeFitnesCentara
    Created on : Oct 4, 2018, 8:00:49 AM
    Author     : Jelena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Pregled kategorija centra</h3>
<br/><br/>
<c:if test="${!empty kategorijeFitnesCentara}">

    <table class="table table-hover">
        <thead>
            <tr>
                <th>Naziv kategorije</th>
                <th>Izmena</th>
                <th>Brisanje</th>
            </tr>
        </thead>
        <tbody> 
            <c:forEach items="${kategorijeFitnesCentara}" var="kategorijaFitnesCentra">
                <tr>
                    <td>${kategorijaFitnesCentra.nazivKategorija}</td>
                    <td><a href="<c:url value='/editKategorijaFitnesCentra/${kategorijaFitnesCentra.idKategorijaFitnesCentra}' />">Izmeni</a></td>
                    <td><a href="<c:url value='/deleteKategorijaFitnesCentra/${kategorijaFitnesCentra.idKategorijaFitnesCentra}' />">Obrisi</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>


