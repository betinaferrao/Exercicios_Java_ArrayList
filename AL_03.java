package aula_5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AL_03 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Integer numero;
		char opcao = 'S';
		int X;
		int qntd = 0;

		while (opcao == 'S') {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
			numeros.add(numero);
			opcao = JOptionPane.showInputDialog("Deseja adicionar mais um n�mero?").toUpperCase().charAt(0);
		}

		X = Integer.parseInt(JOptionPane.showInputDialog("N�mero para pesquisa: "));

		for (Integer i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == X) {
				qntd++;
			}
		}

		if (qntd > 0) {
			System.out.println("Encontramos o n�mero " + X);
		} else {
			System.out.println("N�o encontramos o n�mero " + X);
		}
	}
}

/*
 * Fa�a um programa Java que leia um arraylist de N n�meros, ap�s informe um
 * n�mero X onde deve-se verificar se o mesmo est� contido no vetor;
 */
