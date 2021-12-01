package aula_5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AL_07 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		ArrayList<Integer> numeros2 = new ArrayList<Integer>(); 
		char opcao = 'S';
		
		while(opcao == 'S') {
			Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
			numeros.add(numero);
			opcao = JOptionPane.showInputDialog("Deseja digitar mais algum número?").toUpperCase().charAt(0);
		}
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) > 0) {
				numeros2.add(numeros.get(i)); 
			}
		}
		
		JOptionPane.showMessageDialog(null, "Números maiores que zero: " + numeros2);
		
		
	}
}

/*
 * Faça um programa Java que leia N numeros, após copie os valores positivos
 * para um segundo ArrayList;
 */