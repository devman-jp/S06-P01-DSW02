package pe.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.dto.UserDtoRequest;
import pe.edu.dto.UserDtoResponse;
import pe.edu.security.TokenUtil;
import pe.edu.security.UserDetailService;

@RestController
public class UsuarioController {
	@Autowired
	private TokenUtil util;
	
	@Autowired
	private UserDetailService service;
	
	@RequestMapping(path = "/crearToken",method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UserDtoRequest request){
		
		UserDetails user = service.loadUserByUsername(request.getUsuario());
		if(user.getPassword().equals(request.getContrasenia()))
			return ResponseEntity.ok(new UserDtoResponse(util.generateToken(user.getUsername())));
		else
			throw new UsernameNotFoundException("Contraseña invalidad");
	}
}
