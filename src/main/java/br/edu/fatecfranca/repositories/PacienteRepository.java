package br.edu.fatecfranca.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.fatecfranca.model.Paciente;

// esta classe interface deve herdar a classe MongoRepository
public interface PacienteRepository extends MongoRepository<Paciente, String>{

	// o fato da interface herdar o MongotRepository faz com que ela tenha:
	
	// save - salva um paciente
	// delete - remove um paciente
	// update - atualiza um paciente
	// get - consulta os pacientes
	
}
