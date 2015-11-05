package fr.insta.robot.bean.user;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/** Bean de gestion des User */
@ManagedBean(name = "user")
@ViewScoped
public class UserBean {
	public void buttonAction(ActionEvent actionEvent) {
        addMessage("Welcome to Primefaces!!");
    }
     
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage("Hey Welcome to my first user page");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
