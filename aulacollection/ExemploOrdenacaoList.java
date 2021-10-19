package aulacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato("Jon", 18, "Preto");
		Gato gato2 = new Gato("Simba", 6, "Tigrado");
		Gato gato3 = new Gato("Jon", 12, "Amarelo");
		System.out.println(gato1);
		System.out.println(gato2);
		System.out.println(gato3);
				
		List<Gato> meusGatos = new ArrayList<>();
		meusGatos.add(gato1);
		meusGatos.add(gato2);
		meusGatos.add(gato3);
		
		System.out.println("Minha lista de gatos: ");
		System.out.println(meusGatos);
		
		System.out.println("Ordem Aleadoria de exibição: ");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Odem Natural Nome: ");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordem de Idade: ");
		//Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("Ordem de Cor");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("Ordem de Nome, Cor e Idade: ");
		//Collections.sort(meusGatos, new ComparatorNomeCorIdade());
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
		//meusGatos.sort(Comparator.comparing(Gato::getNome)); Demonstração de lambida!
		
		
	}
}

