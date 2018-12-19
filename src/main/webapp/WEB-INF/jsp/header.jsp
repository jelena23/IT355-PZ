<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"   prefix="sec" %>
<%
    String uri = request.getRequestURI();
    String pageName = uri.substring(uri.lastIndexOf("/") + 1);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css"/>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/flatly/bootstrap.min.css"/>
        <link rel="stylesheet" href="<c:url value="/resources/css/header.css" />"

        <script>
            $(document).ready(function () {
                $("table").DataTable();
            });
        </script>
        <title>MetLife</title>
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-default navbar-custom navbar-fixed-top">
                <div class="container-fluid" >
                    <div class="navbar-header" style="background-color: teal">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="/MetLife/" style="background-color: teal">MetLife</a>
                    </div>
                    <div class="collapse navbar-collapse" style="background-color: teal">
                        <ul class="nav navbar-nav">
                            <c:url var="home"  value="/" />
                            <c:url var="galerija"  value="/galerija" />
                            <c:url var="kontakt"  value="/kontakt" />
                            <c:url var="onama"  value="/onama" />
                            <c:url var="zakazivanjetermina"  value="/zakazivanjeTermina" />
                            <c:url var="addfitnescentar"  value="/addFitnesCentar/" />
                            <c:url var="addkategorijafitnescentra"  value="/addKategorijaFitnesCentra" />
                            <c:url var="addtermin"  value="/addTermin/" />
                            <c:url var="viewfitnescentri"  value="/viewFitnesCentri" />
                            <c:url var="viewkategorijefitnescentara"  value="/viewKategorijeFitnesCentara" />
                            <c:url var="viewtermini"  value="/viewTermini" />
                            <c:url var="viewkontaktporuke"  value="/viewKontaktPoruke" />
                          
                            <li class="<%=  (pageName.equals("home.jsp")) ? "active" : ""%>"><a href="${home}" style="background-color: teal">Pocetna</a></li>
                            <li class="<%=  (pageName.equals("galerija.jsp")) ? "active" : ""%>"><a href="${galerija}" style="background-color: teal">Galerija</a></li>
                            <li class="<%=  (pageName.equals("kontakt.jsp")) ? "active" : ""%>"><a href="${kontakt}" style="background-color: teal">Kontakt</a></li>
                            <li class="<%=  (pageName.equals("onama.jsp")) ? "active" : ""%>"><a href="${onama}" style="background-color: teal">O nama</a></li>
                               <c:if test="${pageContext.request.userPrincipal.name != null}">    
                            <li class="<%=  (pageName.equals("zakazivanjeTermina.jsp")) ? "active" : ""%>"><a href="${zakazivanjetermina}" style="background-color: teal">Rezervacija termina</a></li>
                               </c:if>
                            <sec:authorize access="hasRole('ROLE_ADMIN')">
                               <c:if test="${pageContext.request.userPrincipal.name != null}"> 
                            <li class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="background-color: teal">Pregled centara<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li class="<%= (pageName.equals("addFitnesCentar.jsp")) ? "active" : ""%>"><a href="${addfitnescentar}">Dodaj centar</a></li>
                                    <li class="<%=   (pageName.equals("viewFitnesCentri.jsp")) ? "active" : ""%>"><a href="${viewfitnescentri}">Lista centara</a></li>
                                </ul>
                            </li>
                                </c:if>
                            </sec:authorize>
                            <sec:authorize access="hasRole('ROLE_ADMIN')">
                                <c:if test="${pageContext.request.userPrincipal.name != null}">
                            <li class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="background-color: teal">Pregled kategorija centara<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li class="<%=  (pageName.equals("addKategorijaFitnesCentra.jsp")) ? "active" : ""%>"><a href="${addkategorijafitnescentra}">Dodaj kategoriju fitnes centra</a></li>
                                    <li class="<%=   (pageName.equals("viewKategorijeFitnesCentara.jsp")) ? "active" : ""%>"><a href="${viewkategorijefitnescentara}">Lista kategorija centara</a></li>
                                </ul>
                            </li>
                                </c:if>
                            </sec:authorize>
                            <sec:authorize access="hasRole('ROLE_ADMIN')">
                                <c:if test="${pageContext.request.userPrincipal.name != null}">
                            <li class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="background-color: teal">Pregled termina<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li class="<%=   (pageName.equals("addTermin.jsp")) ? "active" : ""%>"><a href="${addtermin}">Dodaj termin</a></li>
                                    <li class="<%=   (pageName.equals("viewTermini.jsp")) ? "active" : ""%>"><a href="${viewtermini}">Lista termina</a></li>
                                </ul>
                            </li>
                                </c:if>
                            </sec:authorize>
                            <sec:authorize access="hasRole('ROLE_ADMIN')">
                                <c:if test="${pageContext.request.userPrincipal.name != null}">
                            
                                    <li class="<%=   (pageName.equals("viewKontaktPoruke.jsp")) ? "active" : ""%>"><a href="${viewkontaktporuke}" style="background-color: teal">Pregled pristiglih poruka</a></li>
                                    
                                </c:if>
                            </sec:authorize>
                            
                         
                        </ul>
                        
                        <ul class="nav navbar-nav navbar-right">
                            <c:url var="login"  value="/login" />
                            <c:url var="registration"  value="/registration" />
                            <c:url var="logoutUrl"  value="/j_spring_security_logout" />
                            <c:if test="${pageContext.request.userPrincipal.name == null}">
                            <li class="<%=   (pageName.equals("login.jsp")) ? "active" : ""%>"><a href="${login}" style="background-color: teal">Prijavljivanje</a></li>
                            <li class="<%=   (pageName.equals("registration.jsp")) ? "active" : ""%>"><a href="${registration}" style="background-color: teal">Registracija</a></li>
                            </c:if>
                            <c:if test="${pageContext.request.userPrincipal.name != null}">
                            <li class="<%=   (pageName.equals("home.jsp")) ? "active" : ""%>"><a href="${logoutUrl}" style="background-color: teal">Odjavljivanje</a></li>
                            </c:if>
                       </ul>
                    </div>
                </div>
            </nav>