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
public class PetClinicSecurityWithoutAuthTokenTests {
	@Autowired
	private PetClinicService petClinicService;
	
	@Test(expected = AuthenticationCredentialsNotFoundException.class)
	public void testFindOwners() {
		petClinicService.findOwners();
	}
}
