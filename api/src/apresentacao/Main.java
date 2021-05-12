package apresentacao;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import entities.Animal;
import entities.Atendimento;
import entities.Endereco;
import entities.Pessoa;
import entities.PetShop;
import enums.Especie;
import enums.Servicos;
import enums.Sexo;


public class Main {
	public static void main(String[] args) {
		Pessoa cliente = new Pessoa("Lorelai Campos", "051998986865", "lorelai@gmail.com",
				new Endereco("Porto Alegre", "Zona Sul", 302, 57073038, "casa"), "01355046009",
				new ArrayList<Animal>());
		Animal cachorro = new Animal("Labrador", "Caramelo", new Date("10/05/2021"), cliente, "nenhuma", Sexo.M,
				Especie.CACHORRO);

		List<Servicos> servicos = new ArrayList<>();
		servicos.add(Servicos.TOSA);
		servicos.add(Servicos.BANHO);
		Atendimento atendimento = new Atendimento(cachorro, servicos, new Date("10/05/2021"), 30.20);
		
		List<Atendimento> atendimentos = new ArrayList<>();

		PetShop petShop = new PetShop(atendimentos);
		petShop.getAtendimentoList().add(atendimento);
	}
}
