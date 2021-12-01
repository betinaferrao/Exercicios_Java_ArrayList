package aula_5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AL_06 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		char opcao = 'S';
		
		while(opcao == 'S') {
			Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
			if (numero > 0) {
				numeros.add(numero);
			}
			opcao = JOptionPane.showInputDialog("Deseja digitar mais algum número?").toUpperCase().charAt(0);
		}
		
		JOptionPane.showMessageDialog(null, "Números maiores que zero: " + numeros);
		
		
	}
}

/*
 * Faça um programa Java que leia N números e armazene em um ArrayList apenas os
 * positivos digitados;
 */