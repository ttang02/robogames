package fr.insta.robot.services;

import fr.insta.robot.AbstractServiceFactory;

/**
 * Factory des services.
 */
public class RGServiceFactory extends AbstractServiceFactory {
	/**
     * Le singleton.
     */
    private static final RGServiceFactory INSTANCE = new RGServiceFactory();

    /**
     * Constructeur privé pour singleton.
     */
    private RGServiceFactory() {
        super();
    }

    /**
     * @return le singleton
     */
    public static RGServiceFactory getInstance() {
        return INSTANCE;
    }
    
    /**
     * Méthode qui créee et renvoie un objet de type HabilitationExterneService.
     * @return un service exposant les méthodes de haut niveau pour les actions sur les objets de type HabilitationExterne
     */
    public UserService getUserService() {
    	return (UserService) getContext().getBean("userService");
    }
}
