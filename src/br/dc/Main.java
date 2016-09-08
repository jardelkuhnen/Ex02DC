package br.dc;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		solicitaNúmero();

	}

	/**
	 * Método responsável por solicita número ao usuário e chamar o método
	 * responsável por relizar processamento dos dados
	 */
	private static void solicitaNúmero() {
		boolean numeroValido = false;
		Integer numeroInformadoInteger;

		while (numeroValido == false) {

			String numeroInformado = JOptionPane.showInputDialog(
					"Informe um número múltiplo de 10, entre 10 e 1000").trim();

			if (numeroInformado.equals("")) {
				JOptionPane.showMessageDialog(null,
						"Nenhum número informado, sistema será finalizado!");
				System.exit(0);

			} else {
				numeroInformadoInteger = Integer.parseInt(numeroInformado);

				if (numeroInformadoInteger % 10 != 0) {
					JOptionPane.showMessageDialog(null,
							"Número informado não é multiplo de dez!",
							"Atenção", JOptionPane.WARNING_MESSAGE);
				} else {
					numeroValido = true;
					processaNumero(numeroInformadoInteger);
				}
			}

		}
	}

	/**
	 * Método que faz processamento dos dados e solicita a impressão ou não do
	 * array
	 * 
	 * @param numeroInformado
	 */
	private static void processaNumero(Integer numeroInformado) {

		Integer[] vetor = new Integer[10];

		for (int i = 0; i < vetor.length; i++) {

			if (i % 3 == 0) {
				vetor[i] = i * 30 * numeroInformado;
			} else {
				vetor[i] = i * 10 * numeroInformado;
			}

		}

		int decisao = JOptionPane.showConfirmDialog(null,
				"Deseja saber o somatório das posições?");

		if (decisao == 0) {
			for (int i = 0; i < vetor.length; i++) {
				System.out.println(vetor[i] + " posição: " + i);
			}
		} else {
			System.exit(0);
		}

	}

}
