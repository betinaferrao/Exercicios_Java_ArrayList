package aula_5;
import java.util.ArrayList;

public class AL_01 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);

		System.out.println("Tamanho " + numeros.size());
		
		for(Integer i=0; i < numeros.size(); i++) {
			System.out.println("Numero: " + numeros.get(i));
		}
	}
}
