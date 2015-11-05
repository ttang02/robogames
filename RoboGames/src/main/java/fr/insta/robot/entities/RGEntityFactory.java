package fr.insta.robot.entities;

import fr.insta.robot.bo.UserEntity;

/**
 * Factory qui permet de créer les objets métiers.
 */
public final class RGEntityFactory {

	/**
     * Constructeur bloqué on ne doit accéder que par les méthodes statiques.
     */
    private RGEntityFactory() {
        super();
    }
    
    /**
     * Méthode qui crée et renvoie un objet de type UserEntity.
     * @return un UserEntity
     */
    public static UserEntity getUserEntityInstance() {
        return new UserEntityImpl();
    }
    
}
