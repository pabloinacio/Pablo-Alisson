package Alura.forum.controller;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import Alura.forum.modelo.Resposta;

public class RespostaDTO {

	private Long Id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	
	
	public RespostaDTO(Resposta resposta) {

	this.Id=resposta.getId();
	this.mensagem = resposta.getMensagem();
	this.dataCriacao=resposta.getDataCriacao();
	this.nomeAutor = resposta.getAutor().getNome();
	}


	public Long getId() {
		return Id;
	}


	public String getMensagem() {
		return mensagem;
	}


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}


	public String getNomeAutor() {
		return nomeAutor;
	}
	
	
	
	
	
}
