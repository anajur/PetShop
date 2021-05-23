package apresentacao;

import java.util.Scanner;

import controllers.PetShopController;

public class Main {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		PetShopController petShop = new PetShopController();

		int escolha;

		do {

			petShop.exibirMenu();
			escolha = teclado.nextInt();
			petShop.escolherOpcaoMenu(escolha);

		} while (escolha != 4);

		teclado.close();
	}
}