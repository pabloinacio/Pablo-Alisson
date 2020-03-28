package Alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Alura.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
	
	
	Curso findByNome(String nome); 
	
	
	

}
