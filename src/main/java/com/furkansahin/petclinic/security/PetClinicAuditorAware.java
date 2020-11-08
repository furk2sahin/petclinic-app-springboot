package com.furkansahin.petclinic.security;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class PetClinicAuditorAware implements AuditorAware<String> {
	
	@Override
	public Optional<String> getCurrentAuditor(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return Optional.ofNullable(authentication!=null ? authentication.getName() : null);
	}
}
