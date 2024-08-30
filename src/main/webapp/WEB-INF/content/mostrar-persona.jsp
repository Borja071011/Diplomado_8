<%-- 
    Document   : saludos
    Created on : 24 ago 2024, 09:06:11
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<!-- se muestran el nombre de la persona utilizando priperty el cual se extrae desde el cuadro del nombre con un texfiald  -->
<html>
    <head>
            <title>Mostrar Persona con Struts 2</title>
    </head>
    <body>
        <h1> Personas con Struts 2</h1>
        <s:form>
            <s:textfield name="nombre"/>
            <s:submit value="Enviar"/>
        
        </s:form>
        
        <div>
            nombre proporcionado: <s:property value="nombre"/>
           
        </div>
        
    </body>
</html>
