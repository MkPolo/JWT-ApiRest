package com.tutorial.crud.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutorial.crud.security.entity.Rol;
import com.tutorial.crud.security.enums.RolNombre;
import com.tutorial.crud.security.service.RolService;

@Component
public class CreatedRoles implements CommandLineRunner{

	@Autowired
	RolService rolService;
	
	@Override
	public void run(String... args) throws Exception {
//		Rol roladmin = new Rol(RolNombre.ROLE_ADMIN);
//		Rol roluser = new Rol(RolNombre.ROLE_USER);
//		rolService.save(roladmin);
//		rolService.save(roluser);
	}

}
