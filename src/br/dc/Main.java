package br.dc;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		solicitaN�mero();

	}

	/**
	 * M�todo respons�vel por solicita n�mero ao usu�rio e chamar o m�todo
	 * respons�vel por relizar processamento dos dados
	 */
	private static void solicitaN�mero() {
		boolean numeroValido = false;
		Integer numeroInformadoInteger;

		while (numeroValido == false) {

			String numeroInformado = JOptionPane.showInputDialog(
					"Informe um n�mero m�ltiplo de 10, entre 10 e 1000").trim();

			if (numeroInformado.equals("")) {
				JOptionPane.showMessageDialog(null,
						"Nenhum n�mero informado, sistema ser� finalizado!");
				System.exit(0);

			} else {
				numeroInformadoInteger = Integer.parseInt(numeroInformado);

				if (numeroInformadoInteger % 10 != 0) {
					JOptionPane.showMessageDialog(null,
							"N�mero informado n�o � multiplo de dez!",
							"Aten��o", JOptionPane.WARNING_MESSAGE);
				} else {
					numeroValido = true;
					processaNumero(numeroInformadoInteger);
				}
			}

		}
	}

	/**
	 * M�todo que faz processamento dos dados e solicita a impress�o ou n�o do
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
				"Deseja saber o somat�rio das posi��es?");

		if (decisao == 0) {
			for (int i = 0; i < vetor.length; i++) {
				System.out.println(vetor[i] + " posi��o: " + i);
			}
		} else {
			System.exit(0);
		}

	}

}
