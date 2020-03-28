package Alura.forum.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Alura.forum.modelo.Resposta;
import Alura.forum.modelo.StatusTopico;
import Alura.forum.modelo.Topico;

public class DetalhesdoTopicoDTO {

	private Long Id;
	private String titulo;
	private String mensagem;
	private LocalDateTime datacriacao;
	private String NomeAutor;
	private StatusTopico status;
	private List<RespostaDTO> respostas;

	public DetalhesdoTopicoDTO(Topico topico) {

		this.Id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.datacriacao= topico.getDataCriacao();
		this.NomeAutor=topico.getAutor().getNome();
		this.status = topico.getStatus();
		this.respostas = new ArrayList<>();
		this.respostas.addAll(topico.getRespostas().stream().map(RespostaDTO::new).collect(Collectors.toList()));
	}

	public Long getId() {
		return Id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDatacriacao() {
		return datacriacao;
	}

	public String getNomeAutor() {
		return NomeAutor;
	}

	public StatusTopico getStatus() {
		return status;
	}

	public List<RespostaDTO> getRespostas() {
		return respostas;
	}

	
	
	
	
}
