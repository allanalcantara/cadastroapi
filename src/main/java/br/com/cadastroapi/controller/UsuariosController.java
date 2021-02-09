package br.com.cadastroapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.cadastroapi.model.UsuariosModel;
import br.com.cadastroapi.repository.UsuariosRepository;

@Controller
public class UsuariosController {
	
	@Autowired
	private UsuariosRepository repository;

	// Consulta pelo codigo no api. e Retorna o Resultado.
	@GetMapping(path = "/api/{codigo}")
	public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
		return repository.findById(codigo)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());		
	}

	// Salva os Registros código
	@PostMapping(path = "/api/")
	public UsuariosModel adicionar(@RequestBody UsuariosModel usuarios) {
		return repository.save(usuarios);
	}
	
	// faz a edição do mesmo pelo código
	@PutMapping(path = "/api/edit/")
	public UsuariosModel editar(@RequestBody UsuariosModel usuarios) {
		return repository.save(usuarios);
	}
	
	
	// deleta puxando os dados pelo código id
	@DeleteMapping(path = "/api/del")
	public void deletar(@RequestBody UsuariosModel usuarios) {
		repository.delete(usuarios);		
	}

}
