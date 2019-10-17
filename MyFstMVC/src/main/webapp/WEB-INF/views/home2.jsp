 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link  href="<c:url value ='/resources/images/icons/favicon.ico'/>" rel="icon">
<!--===============================================================================================-->
	<link  href="<c:url value ='/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css'/>" rel="stylesheet" >
<!--===============================================================================================-->
	<link  href="<c:url value ='/resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css'/>" rel="stylesheet" >
<!--===============================================================================================-->
	<link  href="<c:url value ='/resources/css/util.css'/>" rel="stylesheet" >
	<link  href="<c:url value='/resources/css/main.css' />" rel="stylesheet" >
<!--===============================================================================================-->
</head>
<body >
	<div class="container-contact100" style="background-image: url('resources/images/bg-01.jpg');">
		<div class="wrap-contact100">


<form class="contact100-form validate-form">
<span class="contact100-form-title">
Author Details!
</span>
<br>

<div class="wrap-input100 rs1-wrap-input100 validate-input">
<span class="contact100-form-title">Author Name</span>
<input class="input100" type="text" name="authorName" placeholder="Enter the Auhtor Name">
</div>
<br>

<div class="wrap-input100 rs1-wrap-input100 validate-input">
<span class="contact100-form-title">Author Id</span>
<input class="input100" type="text" name="authorId" placeholder="Enter Auhtor Id">
</div>
<br>

<div class="wrap-input100 rs1-wrap-input100 validate-input">
<span class="contact100-form-title">Authors Areas of Interest</span>
<select name="authorInterest">
<option value="fiction">Fiction</option>
<option value="horror">Horror </option>
<option value="Science">Science</option>
<option value="Literature">Literature</option>
</select>
</div>
<br>

<div class="wrap-input100 rs1-wrap-input100 validate-input">
<span class="contact100-form-title">Author Phone Number</span>
<textarea class="input100" name="authorNumber" placeholder="Phone Number"></textarea>
</div>
<br>

<div class="wrap-input100 rs1-wrap-input100 validate-input">
<button class="contact100-form-btn" formaction="saveAuthor">
<span class="contact100-form-title">
ADD AUTHOR
</span>
</button>
</div>

<br>
<div class="wrap-input100 rs1-wrap-input100 validate-input">
<button class="contact100-form-btn" formaction="deleteDataDesign">
<span class="contact100-form-title">
Search Author by Name
</span>
</button>
</div>



<div class="wrap-input100 rs1-wrap-input100 validate-input">
<button class="contact100-form-btn" formaction="updateData">
<span class="contact100-form-title">
          Update Author
</span>
</button>
</div>



</form>

<form class="contact100-form validate-form">
<div class="wrap-input100 rs1-wrap-input100 validate-input">
<button  class="contact100-form-btn" formaction="viewData">
<span class="contact100-form-title">
Display All Authors
</span>
</button>
</div>
</form>

<form class="contact100-form validate-form">

<div class="wrap-input100 rs1-wrap-input100 validate-input">
<button  class="contact100-form-btn" formaction="deleteDataDesign">
<span class="contact100-form-title">
          Delete Author
</span>
</button>
</div>
</form>

</div>
</div>

</body>