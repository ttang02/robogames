package fr.insta.robot.bo;

import java.io.Serializable;

public interface InformationsEntity extends Serializable {

	/**
	 * retourne un id
	 * @return id
	 */
	Integer getId();
	/**
	 * mise à jour de l'id
	 * @param id
	 */
	void setId(Integer id);
	/**
	 * retourne un nom
	 * @return nom
	 */
	String getNom();
	/**
	 * mise à jour du nom
	 * @param nom
	 */
	void setNom(String nom);
	/**
	 * retourne un prénom
	 * @return prénom
	 */
	String getPrenom();
	/**
	 * mise à jour du prénom
	 * @param prenom
	 */
	void setPrenom(String prenom);
	/**
	 * retourne un user
	 * @return
	 */
	UserEntity getUser();
	/**
	 * mise à jour du user
	 * @param user
	 */
	void setUser(UserEntity user);
	
}
