<%-- 
    Document   : login
    Created on : Oct 4, 2018, 7:59:27 AM
    Author     : Jelena
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<%@include file="header.jsp" %>
<link href="<c:url value="/resources/css/footer.css" />" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<html>
    <head>
        <title>Prijavljivanje</title>
    </head>
    <body onload='document.loginForm.username.focus();'>
        <c:if test="${not empty error}">
            <div class="error">${error}</div>
        </c:if>
        <c:if test="${not empty msg}">
            <div class="msg" style="text-align: center"><h3>${msg}</h3></div>
        </c:if>
        <div class="container">    
            <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
                <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title" style="text-align: center">Prijavljivanje</div>
                    </div>     
                    <div style="padding-top:30px" class="panel-body" >
                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                        <form id="loginForm" class="form-horizontal" role="form" action="<c:url value='/j_spring_security_check' />"
                              method='POST'>
                            <div style="margin-bottom: 25px" class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input id="emailKorisnik" type="text" class="form-control" name="emailKorisnik" value="" placeholder="Vas E-Mail">                                        
                            </div>

                            <div style="margin-bottom: 25px" class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input id="password" type="password" class="form-control" name="password" placeholder="Lozinka">
                            </div>

                            <div style="margin-top:10px; text-align: center;" class="form-group" >
                                <!-- Button -->
                                <div class="col-sm-12 controls">
                                    <input id="btn-login" class="btn btn-success" style="background-color: teal" name="submit" type="submit" value="Prijavljivanje"/>
                                </div>
                            </div>
                            <input type="hidden" name="${_csrf.parameterName}"
                                   value="${_csrf.token}" />
                        </form>
                    </div>
                </div>  
            </div>
        </div>
        
</body>
</html>
