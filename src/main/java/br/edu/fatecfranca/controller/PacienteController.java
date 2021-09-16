package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.Paciente;
import br.edu.fatecfranca.repositories.PacienteRepository;

@RestController // controla as requisições do tipo RestFull
public class PacienteController {
	
	// vamos fazer uma injeção dependencia
	// podermos usar métodos de uma classe e instancia-la
	// observe que criamos um objeto sem fazer new
	@Autowired
	PacienteRepository injecao;
	// consulta todos os pacientes no banco de dados
	@GetMapping("/paciente")
	public List<Paciente> busca(){
		return injecao.findAll();
		
	}
	
	@PostMapping("/paciente")
	// insere um paciente no banco de dados
	public String insere(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		return "Paciente inserido com sucesso";
	}
	// remove um paciente do banco de dados
	@DeleteMapping("/paciente/{id}")
	public String remove(@PathVariable("id") String id) {
		injecao.deleteById(id);
		return "Removido com sucesso";
	}
	
	// atualiza um paciente no banco de dados
	@PutMapping("/paciente")
	public String atualiza(@RequestBody Paciente paciente) {
		// se o objeto paciente ja tiver id existente, o método save()
		// atualiza o paciente com os dados contidos no objeto
		
		injecao.save(paciente);
		return "Atualizado com sucesso";
		
	}
	
	

}
