package com.umss.dev.CoursesManagement.service;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import com.umss.dev.CoursesManagement.model.UsuarioPrueba;

import com.umss.dev.CoursesManagement.repository.UsuarioPruebaRepository;

@Service
public class UsuarioPruebaService {
	private UsuarioPruebaRepository usuarioPruebaRepository;
	private Logger logger = LoggerFactory.getLogger(InstructorService.class);
	public UsuarioPruebaService(UsuarioPruebaRepository usuarioPruebaRepository) {
		super();
		this.usuarioPruebaRepository = usuarioPruebaRepository;
	}

	public List<UsuarioPrueba> findAll() {
		return usuarioPruebaRepository.findAll();
	}
	
	public UsuarioPrueba findByUsername(String username) {
		logger.info("se esta obteniendo un usuario especifico");
		return usuarioPruebaRepository.findbyUsername(username);
		}
	
}