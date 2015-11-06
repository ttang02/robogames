package fr.insta.robot.dao.impl;

import org.junit.Test;

import fr.insta.robot.AbstractRgItTest;
import fr.insta.robot.bo.UserEntity;
import fr.insta.robot.entities.RGEntityFactory;
import fr.insta.robot.services.UserService;

public class TestUserService extends AbstractRgItTest {

	@Test
	public void test() {
		UserEntity user = RGEntityFactory.getUserEntityInstance();
		UserService userService = (UserService) getContext().getBean("userService");
		userService.persistUser(user);
		getContext().close();
	}

}
