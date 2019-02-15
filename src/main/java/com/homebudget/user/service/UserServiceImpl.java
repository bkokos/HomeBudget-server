package com.homebudget.user.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homebudget.user.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@PersistenceContext
	  private EntityManager em;
	
	public User findUserByNick(String nick) {
		TypedQuery<User> query = em.createQuery("select u from User u where u.nick = :nick", User.class);
		query.setParameter("nick", nick);		
		return query.getSingleResult();
	}
}
