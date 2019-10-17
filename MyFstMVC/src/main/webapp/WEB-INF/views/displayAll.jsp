<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
       <title>DisplayAll</title>
             
</head>
<body>
<table >
<tr>
<td>authorName</td>
<td>authorId</td>
<td>authorInterest</td>
<td>authorNumber</td>
</tr>
<c:forEach items="${authors}" var="out">
<tr>
<td>${out.authorName}</td>
<td>${out.authorId}</td>
<td>${out.authorInterest}</td>
<td>${out.authorNumber}</td>
</tr>

</c:forEach>

</table>

<form action="backHome">
<div >
                                 
                                        
                                        <button>
                                               <span>
                                                     Back to Home
                                                     
                                                </span>
                                        </button>
                                 </div>

</form>

</body>
</html>
