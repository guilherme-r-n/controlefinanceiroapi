package br.com.guilherme.gestao_de_clientes;

import br.com.guilherme.gestao_de_clientes.entity.ClientePessoaFisicaEntity;
import br.com.guilherme.gestao_de_clientes.service.ClientePessoaFisicaService;

public class GestaoDeClientesApplication {

	public static void main(String[] args) {

		ClientePessoaFisicaEntity cliente1 = new ClientePessoaFisicaEntity();
		ClientePessoaFisicaService cadCliente = new ClientePessoaFisicaService();

		cliente1.setId((long) 5);
		cliente1.setNome("Patrick Mahomes");
		cliente1.setCpf("11250015260");
		cliente1.setEmail("pmahomes@gmail.com");
		cliente1.setTelefone("064999878833");
		cliente1.setEndereco("Avenida dos Pampas Qd 10 Lt 05, Leontino");
		cliente1.setCidade("Mineiros");
		cliente1.setEstado("Goiás");

		// cadCliente.cadastrarClientePessoaFisica(cliente1);
		// cadCliente.atualizar(2, cliente1);
		cadCliente.listar();

		// cadCliente.deletarClientePessoaFisica(3);
		// cadCliente.deletarClientePessoaFisica(4);

	}

}
