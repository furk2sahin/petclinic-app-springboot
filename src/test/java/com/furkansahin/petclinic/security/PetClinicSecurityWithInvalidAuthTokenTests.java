package com.furkansahin.petclinic.security;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.junit4.SpringRunner;

import com.furkansahin.petclinic.service.PetClinicService;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.profiles.active=dev")
public class PetClinicSecurityWithInvalidAuthTokenTests {
	@Autowired
	private PetClinicService petClinicService;
	
	@Before
	public void setUp() {
		TestingAuthenticationToken authenticationToken = new TestingAuthenticationToken("user", "secret", "ROLE_XXX");
		SecurityContextHolder.getContext().setAuthentication(authenticationToken);
	}
	
	@After
	public void tearDown() {
		SecurityContextHolder.clearContext();
	}
	
	@Test(expected = AccessDeniedException.class)
	public void testFindOwners() {
		petClinicService.findOwners();
	}
}
