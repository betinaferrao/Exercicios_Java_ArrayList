package aula_5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AL_07 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		ArrayList<Integer> numeros2 = new ArrayList<Integer>(); 
		char opcao = 'S';
		
		while(opcao == 'S') {
			Integer numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero: "));
			numeros.add(numero);
			opcao = JOptionPane.showInputDialog("Deseja digitar mais algum n�mero?").toUpperCase().charAt(0);
		}
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) > 0) {
				numeros2.add(numeros.get(i)); 
			}
		}
		
		JOptionPane.showMessageDialog(null, "N�meros maiores que zero: " + numeros2);
		
		
	}
}

/*
 * Fa�a um programa Java que leia N numeros, ap�s copie os valores positivos
 * para um segundo ArrayList;
 */