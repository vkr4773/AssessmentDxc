<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
       <title>Home2</title>
       
                  
</head>
<body>

<div>
                    <form  action="backHome">
                           <span>
                                 ThankYou for Adding Author <br>
                                 Author Name: ${author.authorName } <br>
                                 Author Id: ${author.authorId}<br>
                                 Author Interest: ${author.authorInterest}<br>
                                 Author Phone: ${author.authorNumber}<br>
                                 
                           </span>
                     

                           <div >
                                        <button >
                                               <span>
                                                     Back to Home
                                               </span>
                                        </button>
                                 </div>
                    </form>
             </div>
</body>
</html>

