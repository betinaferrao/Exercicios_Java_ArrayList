package aula_5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AL_06 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		char opcao = 'S';
		
		while(opcao == 'S') {
			Integer numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero: "));
			if (numero > 0) {
				numeros.add(numero);
			}
			opcao = JOptionPane.showInputDialog("Deseja digitar mais algum n�mero?").toUpperCase().charAt(0);
		}
		
		JOptionPane.showMessageDialog(null, "N�meros maiores que zero: " + numeros);
		
		
	}
}

/*
 * Fa�a um programa Java que leia N n�meros e armazene em um ArrayList apenas os
 * positivos digitados;
 */