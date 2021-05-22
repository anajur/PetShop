package controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Scanner;

import entities.Animal;
import entities.Atendimento;
import entities.Endereco;
import entities.Pessoa;
import enums.Especie;
import enums.Servicos;
import enums.Sexo;

public class AtendimentoController {
	private Scanner teclado = new Scanner(System.in);
	private LinkedList<Atendimento> atendimentoList = new LinkedList<>();

	public void criarAtendimento(int opcao) {
		Atendimento atendimento = new Atendimento();
		Animal animal = new Animal();
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();

		String resposta;

		System.out.println("Seu nome completo:");
		resposta = teclado.nextLine();
		pessoa.setNomeCompleto(resposta);

		System.out.println("Seu celular:");
		resposta = teclado.nextLine();
		pessoa.setCelular(resposta);

		System.out.println("Seu email:");
		resposta = teclado.nextLine();
		pessoa.setEmail(resposta);

		System.out.println("Seu cpf:");
		resposta = teclado.nextLine();
		pessoa.setCpf(resposta);

		System.out.println("Sua cidade:");
		resposta = teclado.nextLine();
		endereco.setCidade(resposta);

		System.out.println("Seu bairro:");
		resposta = teclado.nextLine();
		endereco.setBairro(resposta);

		System.out.println("Número da casa:");
		resposta = teclado.nextLine();
		endereco.setNumero(Integer.parseInt(resposta));

		System.out.println("Seu cep:");
		resposta = teclado.nextLine();
		endereco.setCep(Integer.parseInt(resposta));

		System.out.println("Complemento:");
		resposta = teclado.nextLine();
		endereco.setComplemento(resposta);

		System.out.println("Seu cpf:");
		resposta = teclado.nextLine();
		pessoa.setCpf(resposta);

		System.out.println("Nome do seu animal:");
		resposta = teclado.next();
		animal.setNome(resposta);

		System.out.println("Raça do seu animal:");
		resposta = teclado.next();
		animal.setRaca(resposta);

		System.out.println("Alergias do seu animal:");
		resposta = teclado.next();
		animal.setAlergias(resposta);

		System.out.println("Seu animal é do sexo 1-Feminino ou 2-Masculino:");
		resposta = teclado.next();
		animal.setSexo(resposta == "1" ? Sexo.F : Sexo.M);

		System.out.println("Seu animal é um 1-cachorro ou 2-gato?");
		resposta = teclado.next();
		animal.setEspecie(resposta == "1" ? Especie.CACHORRO : Especie.GATO);

		System.out.println("Digite a data de nascimento do seu animal no formato dd/mm/yyyy");
		resposta = teclado.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(resposta,formatter);
		animal.setDataNascimento(date);

		animal.setDono(pessoa);
		pessoa.getAnimalList().add(animal);
		pessoa.setEndereco(endereco);
		atendimento.setAnimal(animal);
		atendimento.setDiaAtendimento(LocalDate.now());
		System.out.println("Atendimento cadastrado!");
		switch (opcao) {
		case 1:
			atendimento.setServicoSelecionado(Servicos.TOSA);
			atendimento.setPreco(Servicos.TOSA.valor);
			break;

		case 2:
			atendimento.setServicoSelecionado(Servicos.BANHO);
			atendimento.setPreco(Servicos.BANHO.valor);
			break;

		case 3:
			atendimento.setServicoSelecionado(Servicos.PROMOCAO);
			atendimento.setPreco(Servicos.PROMOCAO.valor);
			break;

		default:
			System.out.println("Opcão inválida.");
			break;
		}

		atendimentoList.addLast(atendimento);

	}

	public Atendimento finalizarAtendimento() {
		Atendimento finalizado = atendimentoList.getFirst();
		System.out.print("Valor total a pagar: R$ %.2f" + finalizado.getPreco() + "\n");
		System.out.println("Obrigado e volte sempre!");
		finalizado.setEncerrado(true);
		return atendimentoList.removeFirst();
	}

	public void verAtendimentos() {

		System.out.println(atendimentoList.toString());

	}

}
