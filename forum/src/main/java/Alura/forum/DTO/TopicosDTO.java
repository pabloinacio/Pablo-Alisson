package Alura.forum.DTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Alura.forum.modelo.Curso;
import Alura.forum.modelo.Topico;

public class TopicosDTO {

	private Long Id;
	private String titulo;
	private String mensagem;
	private LocalDateTime datacriacao;

	public TopicosDTO(Topico topico) {

		this.Id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();

	}

	public LocalDateTime getDatacriacao() {
		return datacriacao;
	}

	public Long getId() {

		return this.Id;
	}

	public String getTitulo() {

		return this.titulo;
	}

	public String getMensagem() {

		return this.mensagem;
	}
	
	
	public static List<TopicosDTO> converter(List<Topico> topicos) {
		
	return topicos.stream().map(TopicosDTO:: new).collect(Collectors.toList());
	}

}
