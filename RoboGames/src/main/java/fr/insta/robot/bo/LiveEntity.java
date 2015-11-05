package fr.insta.robot.bo;

import java.io.Serializable;

public interface LiveEntity extends Serializable {
	/**
	 * Retourne l'URL
	 * @return l'URL
	 */
	String getUrl();
	
	/**
	 * Mise à jour de l'URL
	 * @param url
	 */
	void setUrl(String url);
	
}
