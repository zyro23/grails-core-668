<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title></title>
  </head>

  <body>
    <g:form action="save" enctype="multipart/form-data" method="PUT">
      <g:textField name="name"/>
      <br/>
      <g:textArea name="description"/>
      <br/>
      <input type="file" name="assetFiles" multiple="multiple">
      <br/>
      <g:submitButton name="submit" value="create"/>
    </g:form>
  </body>
</html>
