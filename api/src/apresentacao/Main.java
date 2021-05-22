package apresentacao;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import entities.Animal;
import entities.Atendimento;
import entities.Endereco;
import entities.Pessoa;
import entities.PetShop;
import enums.Especie;
import enums.Servicos;
import enums.Sexo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		Pessoa cliente = new Pessoa(
				"Lorelai Campos", 
				"051998986865", 
				"lorelai@gmail.com",
				new Endereco(
						"Porto Alegre", 
						"Zona Sul", 
						302, 
						57073038, 
						"casa"), 
				"01355046009",
				new ArrayList<Animal>()
				);
		
		Animal cachorro = new Animal(
				"Labrador", 
				"Caramelo", 
				LocalDate.parse("2000-02-02"), 
				cliente, 
				"nenhuma", 
				Sexo.M,
				Especie.CACHORRO
				);

		List<Servicos> servicos = new LinkedList<>();
		servicos.add(Servicos.TOSA);
		servicos.add(Servicos.BANHO);
		
		Atendimento atendimento = new Atendimento(cachorro, LocalDate.now(), 30.20, Servicos.BANHO);
		
		List<Atendimento> atendimentos = new ArrayList<>();
		
		PetShop petShop = new PetShop();
		
		int escolha;
		String escolhaServico;
		
		System.out.println("Dog Caramelo");
		
		do {
			
			petShop.exibirMenu();
			escolha = teclado.nextInt();
			petShop.escolherOpcaoMenu(escolha);
			
		} while (escolha != 4);
		
		System.out.println("Obrigado e volte sempre.");
		
	}
}