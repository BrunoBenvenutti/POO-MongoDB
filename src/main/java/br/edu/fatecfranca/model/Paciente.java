package br.edu.fatecfranca.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// A classe deve ser relacionada a um documento do MongoDB
@Document(collection="paciente")
public class Paciente {
	
	@Id
	private String id;
	
	private String nome;
	private int idade;
	private float peso;
	private float temperatura;
	
	public Paciente() {
		super();
		
	}
	public Paciente(String id, String nome, int idade, float peso, float temperatura) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.temperatura = temperatura;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
	
	

}
