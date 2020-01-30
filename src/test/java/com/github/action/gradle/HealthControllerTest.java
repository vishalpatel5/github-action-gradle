package com.github.action.gradle;

import com.github.action.gradle.controller.HealthController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HealthControllerTest {

	@InjectMocks
	HealthController controller;

	@Test
	public void checkHealthSuccess() {
		Assert.assertEquals("I am healthy",controller.checkHEalth());
	}

//	@Test
//	public void checkHealthFail() {
//		Assert.assertEquals("I not healthy!",controller.checkHEalth());
//	}

}
