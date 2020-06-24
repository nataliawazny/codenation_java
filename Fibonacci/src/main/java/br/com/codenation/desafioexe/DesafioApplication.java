package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {


	public static List<Integer> fibonacci() {
		List<Integer> numeros = new ArrayList<>();
		int n1 = 0;
		int n2 = 1;

		numeros.add(n1);
		numeros.add(n2);

		int index = 0;
		while (index<=350) {
			index = n1 + n2;
			n1 = n2;
			n2 = index;
			numeros.add(index);
		}
		return numeros;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}