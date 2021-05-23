package controllers;

import java.util.Scanner;

import enums.Servicos;

public class PetShopController {

	private Scanner teclado = new Scanner(System.in);
	private AtendimentoController atendimentoController = new AtendimentoController();

	public void exibirMenu() {
		System.out.println("Bem-Vindo(a)!\n" + "Menu \n" + "1 - Adicionar atendimento. \n" + "2 - Ver atendimentos. \n"
				+ "3 - Finalizar atendimento. \n" + "4 - Fechar menu. \n");
	}

	public void escolherOpcaoMenu(Integer escolha) {
		int opcao;

		switch (escolha) {
		case 1:

			System.out.println("Escolha o serviço desejado: \n" + Servicos.TOSA.opcao + " - " + Servicos.TOSA + "\n"
					+ Servicos.BANHO.opcao + " - " + Servicos.BANHO + "\n" + Servicos.PROMOCAO.opcao + " - "
					+ Servicos.PROMOCAO + " - Tosa e banho\n");

			opcao = teclado.nextInt();
			atendimentoController.criarAtendimento(opcao);

			break;
		case 2:

			atendimentoController.verAtendimentos();

			break;

		case 3:

			atendimentoController.finalizarAtendimento();

			break;

		default:
			System.out.println("Escolha uma das opções do menu.");
			break;

		}
	}

}