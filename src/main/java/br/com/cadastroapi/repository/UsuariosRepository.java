package br.com.cadastroapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.cadastroapi.model.UsuariosModel;


public interface UsuariosRepository extends JpaRepository<UsuariosModel, Integer>{

}
