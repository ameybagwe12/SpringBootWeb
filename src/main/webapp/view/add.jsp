<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <!--JSP SYNTAX-->
        <!--IF WORKING WITH SESSION-->
        <!--<h2>Result is: <%= session.getAttribute("result") %> </h2>-->
        <!--JSTL SYNTAX-->
        <!--<h2>Result is: ${result} </h2>-->
        <h2> Welcome ${alien1.aname} with id ${alien1.aid} to ${course}</h2>




    </body>
</html>