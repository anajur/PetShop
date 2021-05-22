package entities;

import enums.Servicos;

import java.time.LocalDate;

public class Atendimento {

	private Animal animal;
	private Servicos servicoSelecionado;
	private LocalDate diaAtendimento;
	private Double preco;
	private Boolean encerrado = false;

	public Atendimento(Animal animal, LocalDate diaAtendimento, Double preco, Servicos servicoSelecionado) {
		this.animal = animal;
		this.diaAtendimento = diaAtendimento;
		this.preco = preco;
		this.servicoSelecionado = servicoSelecionado;
	}

	public Atendimento() {
	}

	public boolean isEncerrado() {
		return encerrado;
	}

	public void setEncerrado(boolean encerrado) {
		this.encerrado = encerrado;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public LocalDate getDiaAtendimento() {
		return diaAtendimento;
	}

	public void setDiaAtendimento(LocalDate diaAtendimento) {
		this.diaAtendimento = diaAtendimento;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Servicos getServicoSelecionado() {
		return servicoSelecionado;
	}

	public void setServicoSelecionado(Servicos servicoSelecionado) {
		this.servicoSelecionado = servicoSelecionado;
	}

	@Override
	public String toString() {
		return "Atendimento [animal=" + animal + ", servicoSelecionado=" + servicoSelecionado + ", diaAtendimento="
				+ diaAtendimento + ", preco=" + preco + ", encerrado=" + encerrado + "]\n";
	}

}