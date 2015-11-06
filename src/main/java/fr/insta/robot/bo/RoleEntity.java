package fr.insta.robot.bo;

import java.io.Serializable;

public interface RoleEntity extends Serializable {

	/**
	 * Retourne l'id
	 * @return l'id
	 */
	Long getId();
	
	/**
	 * Met à jour l'id
	 * @param id l'id
	 */
	void setId(Long id);
	
	/**
	 * Retourne le libelle
	 * @return le libelle
	 */
	String getLibelle();
	
	/**
	 * Met à jour le libelle
	 * @param libelle le libelle
	 */
	void setLibelle(String libelle);
}
