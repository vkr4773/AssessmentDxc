<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>

</head>
<body style="text-align: center;">


<div>
<form>
<span>
Author Details!
</span>
<br>

<div>
<span>Author Name</span>
<input type="text" name="authorName" placeholder="Enter the Auhtor Name">
</div>
<br>


<br>
<div >
<button formaction="dispData">
<span>
Search Author by Name
</span>
</button>
</div>




<div>
<button formaction="viewData">
<span>
Display All Authors
</span>
</button>
</div>

<div >
<button  formaction="deleteData">
<span>
          Delete Author
</span>
</button>
</div>
</form>

</div>