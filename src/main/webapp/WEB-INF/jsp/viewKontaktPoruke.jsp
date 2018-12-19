<%-- 
    Document   : viewKontaktPoruke
    Created on : Oct 4, 2018, 8:01:12 AM
    Author     : Jelena
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<br/><br/><br/>
<h3 style="text-align: center">Pregled poruka</h3>
<br/><br/>
<c:if test="${!empty poruke}">

    <table class="table table-hover">
        <thead>
            <tr>
                <th>Ime</th>
                <th>E-mail</th>
                <th>Broj telefona</th>
                <th>Naslov poruke</th>
                <th>Poruka</th>
                <th>Opcije</th>
            </tr>
        </thead>
        <tbody> 
            <c:forEach items="${poruke}" var="poruka">
                <tr>
                    <td>${poruka.imeKontakt}</td>
                    <td>${poruka.emailKontakt}</td>
                    <td>${poruka.brojTelefonaKontakt}</td>
                    <td>${poruka.naslovKontakt}</td>
                    <td>${poruka.porukaKontakt}</td>
                    <td><a href="<c:url value='/deleteKontaktPoruka/${poruka.idKontakt}' />">Obrisi</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>



