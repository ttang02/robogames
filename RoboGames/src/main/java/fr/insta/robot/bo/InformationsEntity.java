package fr.insta.robot.bo;

import java.io.Serializable;

public interface InformationsEntity extends Serializable {

	/**
	 * Retourne l'id
	 * @return l'id
	 */
	Long getId();
	
	/**
	 * Met à jour l'id
	 * @param id
	 */
	void setId(Long id);
	
	/**
	 * Retourne le nom
	 * @return
	 */
	String getNom();
	
	/**
	 * Met à jour le nom
	 * @param nom
	 */
	void setNom(String nom);
	
	/**
	 * Retourne le prénom
	 * @return prenom
	 */
	String getPrenom();
	
	/**
	 * Met à jour le prenom
	 * @param prenom
	 */
	void setPrenom(String prenom);
	
	/**
	 * Retourne l'user
	 * @return l'user
	 */
	UserEntity getUser();
	
	/**
	 * Met à jour l'user
	 * @param user l'user
	 */
	void setUser(UserEntity user);
}
