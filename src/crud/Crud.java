package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.User;

public class Crud {
	EntityManagerFactory emf;
	EntityManager em;
	
	public Crud(){
		emf = Persistence.createEntityManagerFactory("araujo");
		em = emf.createEntityManager();
	}
	
	public void saveUser(User user){
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		emf.close();
	};
	
	public void removeUser(User user){
		em.getTransaction().begin();
		em.remove(user);
		em.getTransaction().commit();
		emf.close();
	};
	
	
//	public Query userSeekLogin(String login){
//		em.getTransaction().begin();
//		String queryString = "from User where login = :login";
//        Query query = em.createQuery(queryString);
//		em.getTransaction().commit();
//		emf.close();
//		return query;
//	}
	
	public User buscarId(int id){
		em.getTransaction().begin();
		User user = em.find(User.class, id);
		em.getTransaction().commit();
		emf.close();
		return user;
	}
		
	@SuppressWarnings("unchecked")
	public List<User> userList(){
		em.getTransaction().begin();
		Query consult = em.createQuery("select user from User user");
		List<User> users = consult.getResultList();
		em.getTransaction().commit();
		emf.close();
		return users;
	}
}

