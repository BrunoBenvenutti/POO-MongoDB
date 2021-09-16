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

import br.edu.fatecfranca.model.Medico;
import br.edu.fatecfranca.repositories.MedicoRepository;

@RestController
public class MedicoController {
	
	//criar a injeção de dependência
	@Autowired
	MedicoRepository injecao; // poderemos chamar métodos com objeto injeção sem instancia-lo
	
	@GetMapping("/medico")
	public List<Medico> busca(){
		return injecao.findAll();
	}
	
	@PostMapping("/medico")
	public String insere(@RequestBody Medico medico) {
		injecao.save(medico);
		return "Médico salvo com sucesso";
	}
	
	@DeleteMapping("/medico/{id}")
	public String remove(@PathVariable String id) {
		injecao.deleteById(id);
		return "Médico foi removido com sucesso";
	}
	
	@PutMapping("/medico")
	public String atualiza(@RequestBody Medico medico) {
		injecao.save(medico); // como o médico já terá id, ele atualiza
		return "Médico atualizado com sucesso";
		}
	

}
