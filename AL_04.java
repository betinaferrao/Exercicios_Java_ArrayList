package aula_5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AL_04 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> mediasF = new ArrayList<Integer>();
		char opcao = 'S';
		String resul = "";


		while (opcao == 'S') {
			String nome = JOptionPane.showInputDialog("Nome: ");
			nomes.add(nome);
			
			Integer mediaF = Integer.parseInt(JOptionPane.showInputDialog("M�dia Final do aluno: "));
			mediasF.add(mediaF);
			opcao = JOptionPane.showInputDialog("Tem mais algu�m???").toUpperCase().charAt(0);
		}
		

		for (int i = 0; i < mediasF.size(); i++) {
			if (mediasF.get(i) > 7) {
				resul += "Alunos com m�dia maior que sete: " + nomes.get(i) + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, resul);
	}
}

/*
 * Fa�a um programa Java que Leia o Nome e a M�dia Final de N alunos, ap�s
 * mostre os dados dos alunos com M�dia maior que a M�dia;
 */
