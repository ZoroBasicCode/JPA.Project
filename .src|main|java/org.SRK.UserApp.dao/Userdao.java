package org.SRK.UserApp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.SRK.UserApp.dto.User;

public class Userdao {
EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
EntityManager m=f.createEntityManager();
	public User SaveUser(User u)
	{
		EntityTransaction t=m.getTransaction();
		m.persist(u);
		t.begin();
		t.commit();
		return u;
		
	}
	public User UpdateUser(User u)
	{
		EntityTransaction t=m.getTransaction();
		m.merge(u);
		t.begin();
		t.commit();
		return u;
	}
	public User findUser(int id)
	{
		return m.find(User.class, id);
	}
	public List<User> fetchAll()
	{
		String qr="select u from User u";
		Query q=m.createQuery(qr);
		return q.getResultList();
	}
	public boolean DeleteUser(int id)
	{
		EntityTransaction t=m.getTransaction();
		User u=m.find(User.class, id);
		if(u!=null)
		{
			m.remove(u);
			t.begin();
			t.commit();
			return true;
		}
		return false;
	}
	public User verify(long phon,String password)
	{
		Query q=m.createQuery("select u from User u where u.phon=?1 and u.password=?2");
		q.setParameter(1, phon);
		q.setParameter(2, password);
		List<User> users=q.getResultList();
		if(users.size()>0)
			return users.get(0);
		return null;
	}
	
}
