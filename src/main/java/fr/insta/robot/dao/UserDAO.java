package fr.insta.robot.dao;

import fr.insta.robot.bo.UserEntity;

public interface UserDAO {

	/**
	 * Persiste l'entite en base
	 * @param user l'user
	 */
	void persist(UserEntity user);
	
	/**
	 * Cherche l'entite en base par son id
	 * @param id l'id
	 * @return un UserEntity
	 */
	UserEntity findById(String id);

	/**
	 * Met à jour l'entite
	 * @param user l'user
	 */
	void update(UserEntity user);

	/**
	 * Supprime l'entite
	 * @param user l'user
	 */
	void delete(UserEntity user);
}
