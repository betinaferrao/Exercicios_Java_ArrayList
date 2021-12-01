package aula_5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AL_05 {
	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> numeros2 = new ArrayList<Integer>();
		char opcao = 'S';
		Double media = 0.0;
		Double soma = 0.0;
		
		while (opcao == 'S') {
			Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
			numeros.add(numero);
			soma += numero;
			opcao = JOptionPane.showInputDialog("Tem mais alguém???").toUpperCase().charAt(0);
		}
		
		
		media = (soma * 1.0) / numeros.size();

		for (Integer i = 0; i < numeros.size(); i++)
			
			if (numeros.get(i) >  media) {
				numeros2.add(numeros.get(i));
			} else {
				numeros2.add(0);
			}
		
			JOptionPane.showMessageDialog(null, numeros2);
	}
}

/*
 * Faça um programa Java que leia um ArrayList de N números, após realize a
 * troca dos menores que a média por 0;
 */