package Alura.forum.controller;

import java.lang.module.FindException;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import javax.sound.midi.Patch;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import Alura.forum.DTO.TopicosDTO;
import Alura.forum.controller.form.topicoForm;
import Alura.forum.modelo.Curso;
import Alura.forum.modelo.Topico;
import Alura.forum.repository.CursoRepository;
import Alura.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topico")
public class TopicosControler {

	@Autowired
	TopicoRepository topicosrepository;
	@Autowired
	CursoRepository CursoRepository;

	@GetMapping
	private List<TopicosDTO> topicos(String filtro) {
		
		if(filtro != null) {
		List<Topico> topicos = topicosrepository.findByTitulo(filtro);
		return TopicosDTO.converter(topicos);}else {
			
			List<Topico> topicos = topicosrepository.findAll();
			return TopicosDTO.converter(topicos);
			
		}
	}

	@PostMapping
	private ResponseEntity<TopicosDTO> cadastrar(@RequestBody @Valid topicoForm form, UriComponentsBuilder uriBuilder){
		
		Topico topico = form.converter(CursoRepository);
		topicosrepository.save(topico);
		
		URI uri = uriBuilder.path("/topico/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(uri).body(new TopicosDTO(topico));
		
	}
	
	@GetMapping("/{id}")
	private DetalhesdoTopicoDTO topicos(@PathVariable Long id) {
		
		Topico topico = topicosrepository.getOne(id);
		return new DetalhesdoTopicoDTO(topico);
		
	}
}
