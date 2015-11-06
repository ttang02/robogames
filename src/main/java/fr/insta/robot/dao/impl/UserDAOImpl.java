package fr.insta.robot.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.insta.robot.bo.UserEntity;
import fr.insta.robot.dao.UserDAO;
import fr.insta.robot.entities.UserEntityImpl;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	@Autowired private SessionFactory sessionFactory;

	/**
	 * @Transactional annotation below will trigger Spring Hibernate transaction manager to automatically create
	 * a hibernate session. See src/main/webapp/WEB-INF/servlet-context.xml
	 */
	@Override
	@Transactional
	public void persist(UserEntity user) {
		sessionFactory.getCurrentSession().persist(user);
	}

	@Override
	@Transactional
	public UserEntity findById(String id) {
		return (UserEntity) sessionFactory.getCurrentSession().get(UserEntityImpl.class, id);
	}

	@Override
	@Transactional
	public void update(UserEntity user) {
		sessionFactory.getCurrentSession().update(user);
	}

	@Override
	@Transactional
	public void delete(UserEntity user) {
		sessionFactory.getCurrentSession().delete(user);

	}

}
