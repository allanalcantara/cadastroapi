package br.com.cadastroapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.cadastroapi.model.UsuariosModel;
import br.com.cadastroapi.repository.UsuariosRepository;

@RestController
public class IndexController {
	
	@Autowired
	private UsuariosRepository repository;
	
	@RequestMapping("/")
    public String index(){
        return "Hello World!";
    }	

	@RequestMapping("/api")
	public List<UsuariosModel> listagem(){
		return repository.findAll();
	}

}
