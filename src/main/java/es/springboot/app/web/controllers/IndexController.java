package es.springboot.app.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.springboot.app.web.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", "Spring MVC");
		return "index";

	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		

		Usuario usuario = new Usuario();
		
		usuario.setNombre("Alberto");
		usuario.setApellido("Ogayar");
		usuario.setEmail("alogayar@gmail.com");

		model.addAttribute("usuario", usuario);
		
		return "perfil";

	}
	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios = new ArrayList<>();		
		
		model.addAttribute("usuarios", usuarios);
		return "listar";
	}

}
