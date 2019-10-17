
  package com.myspr.demo;
  
  import java.text.DateFormat; import java.util.ArrayList; import
  java.util.Date; import java.util.Locale;
  
  import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Controller; import
  org.springframework.ui.Model; import
  org.springframework.web.bind.annotation.ModelAttribute; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RequestMethod; import
  org.springframework.web.bind.annotation.RequestParam;
  
 import com.myspr.dao.AuthorDao; import com.myspr.model.Author;
 


@Controller
public class HomeController {
               ArrayList<Author> lis = new ArrayList<Author>();
               
               
               
               @RequestMapping(value = "/")
                                      
                                     public String home2(Locale locale,Model model) {       
                                                return "home2";
               }
                 @Autowired
                 AuthorDao authorDao;
               
               
               @RequestMapping(value = "/saveAuthor")
    
                                                 public String saveresturant(@ModelAttribute Author res) {
                              
            	   						authorDao.saveAuthor(res);
                                      lis.add(res);
                                                            return "display";
}
               
               @RequestMapping(value = "/backHome")
    
    public String backHome(@ModelAttribute Author res) {

               return "home2";
}
               
               @RequestMapping(value = "/dispData")
    
    public String dispData(Model model,@RequestParam("authorName") String name) {
                              Author author=authorDao.getData(name);
                              model.addAttribute("author",author);

               return "display";
}
               
               @RequestMapping(value = "/viewData")
               public String viewData(Model model,@ModelAttribute Author res)
               {
                 
                              ArrayList<Author> authors = authorDao.viewData(res);
                              
                              model.addAttribute("authors",authors);
                              return "displayAll";

               }
               @RequestMapping(value = "/updateData")
               public String updateData(@ModelAttribute Author res)
               {
                 
                              
            	   authorDao.updateData(res);
               return "home2";
               

               }
               
               
               
               
             @RequestMapping(value = "/deleteDataDesign")
             public String deleteDataDesign() {

               
                       	  
                          return "deleteSearchDesign";
             }
              
               @RequestMapping(value = "/deleteData")         
    public String deleteData(Model model,@RequestParam("authorName") String name) {
            	   authorDao.deleteData(name);
               return "home2";
}
                 
                              
                              
                              
               
}
