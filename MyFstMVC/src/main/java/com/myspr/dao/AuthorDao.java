package com.myspr.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myspr.model.Author;

@Component
public class AuthorDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void saveAuthor(Author author){	
	Session session=	sessionFactory.getCurrentSession();
	session.save(author);
	}
	
	@Transactional
	public void updateAuthor(Author author){	
	Session session=	sessionFactory.getCurrentSession();
	session.saveOrUpdate(author);
	}
	
	@Transactional
    public Author getData(String name)
    {
                 Session session = sessionFactory.getCurrentSession();
                 Author author=(Author)session.createQuery("from Author where authorName='"+name+"'").uniqueResult();
                 return author;
    }
    
    @Transactional
    public ArrayList<Author> viewData(Author author)
    {
                 Session session = sessionFactory.getCurrentSession();
                 ArrayList<Author> authors = (ArrayList<Author>)session.createQuery("from Author").list();
                 return authors;
    }
    
    
    @Transactional
    public void updateData(Author author)
    
    {
                 Session session = sessionFactory.getCurrentSession();
                 session.update(author);
    }
   
    
    @Transactional
    public void deleteData(String name)
        {
                   
                   Session session = sessionFactory.getCurrentSession();
                  
                   session.createQuery("delete from Author where authorName='"+name+"'").executeUpdate();
                                                
        }

	
	public AuthorDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	
	public AuthorDao() {
		}
	
}
