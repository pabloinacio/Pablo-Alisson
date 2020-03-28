package Alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByTitulo(String filtro);


}
