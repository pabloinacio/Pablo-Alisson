package Alura.forum.controller.form;

import java.lang.module.FindException;
import java.util.Arrays;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import Alura.forum.modelo.Curso;
import Alura.forum.modelo.Topico;
import Alura.forum.repository.CursoRepository;
import Alura.forum.repository.TopicoRepository;

public class topicoForm {

	@NotNull @NotEmpty @Length(min= 1)
	private String titulo;
	@NotNull @NotEmpty @Length(min= 1)
	private String mensagem;
	@NotNull @NotEmpty @Length(min= 1)
	private String nomeCurso;
	
	public topicoForm() {
	}
	
	
	

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}




	public Topico converter(CursoRepository cursoRepository) {

		Curso curso = cursoRepository.findByNome(nomeCurso);
		
		return new Topico(titulo, mensagem, curso);
	}

	
	
	
	
	
	
	
	
	


/*
	public Topico converter(CursoRepository cursorepository) {
		Curso curso = cursorepository.findByNome(nomeCurso);
		
		return new Topico(titulo, mensagem, curso);
	}
*/
}
