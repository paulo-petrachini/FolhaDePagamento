package ui;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

import java.util.ArrayList;

public class TesteFolha {
	public static void main (String args[]) {
		
	ArrayList<Funcionario> lista; // declarei uma variável LISTA do tipo ArrayList de Funcionários

	lista = new ArrayList<Funcionario>();

	lista.add(new Chefe("Jose","11111", 5000.0f, 10.0f, 100.0f));
	lista.add(new Comissionado("João", "22222", 3000.0f, 25.0f));
	lista.add(new Horista("Maria", "33333", 80.0f, 160));
	lista.add(new Horista("Mara", "44444", 75.0f, 35));
	lista.add(new Empreiteiro("Pedro","55555", 2750.0f));
	lista.add(new Empreiteiro("ana", "66666", 4500.0f));
	lista.add(new Horista("Adroaldo", "77777", 60.0f,90));
	lista.add(new Horista("Heitor", "88888", 75.0f, 35));
	lista.add(new Comissionado("Neusa", "99999", 6000.0f, 25.0f));
	lista.add(new Chefe("Jose2","111111", 15000.0f, 10.0f, 100.0f));
	lista.add(new Comissionado("João2", "222222", 3000.0f, 25.0f));
	lista.add(new Horista("Maria2", "333333", 80.0f, 160));
	lista.add(new Horista("Mara2", "444444", 75.0f, 35));
	lista.add(new Empreiteiro("Pedro2","555555", 2750.0f));
	lista.add(new Empreiteiro("ana", "666666", 4500.0f));
	lista.add(new Horista("Adroaldo2", "777777", 60.0f,90));
	lista.add(new Horista("Heitor2", "888888", 75.0f, 35));
	lista.add(new Comissionado("Neusa2", "999999", 6000.0f, 25.0f));
	lista.add(new Chefe("Jose3","311111", 25000.0f, 10.0f, 100.0f));
	lista.add(new Comissionado("João3", "322222", 3000.0f, 25.0f));
	lista.add(new Horista("Maria3", "3333333", 80.0f, 160));
	lista.add(new Horista("Mara3", "344444", 75.0f, 35));
	lista.add(new Empreiteiro("Pedro3","355555", 2750.0f));
	lista.add(new Empreiteiro("ana3", "366666", 4500.0f));
	lista.add(new Horista("Adroaldo3", "377777", 60.0f,90));
	lista.add(new Horista("Heitor3", "388888", 75.0f, 35));
	lista.add(new Comissionado("Neusa3", "399999", 6000.0f, 25.0f));
	lista.add(new Chefe("Jose4","4111111", 35000.0f, 10.0f, 100.0f));
	lista.add(new Comissionado("João4", "4222222", 3000.0f, 25.0f));
	lista.add(new Horista("Maria4", "4333333", 80.0f, 160));
	lista.add(new Horista("Mara4", "44444444", 75.0f, 35));
	lista.add(new Empreiteiro("Pedro4","4555555", 2750.0f));
	lista.add(new Empreiteiro("ana4", "4666666", 4500.0f));
	lista.add(new Horista("Adroaldo4", "4777777", 60.0f,90));
	lista.add(new Horista("Heitor4", "4888888", 75.0f, 35));
	lista.add(new Comissionado("Neusa4", "4999999", 6000.0f, 25.0f));

		for (int i=0; i<lista.size(); i++) {
			Funcionario f=lista.get(i);
			System.out.println(i+ " - "+f + "   Salario R$ " + f.calcularSalario());
		}
	}
		
	/*	Funcionario f1, f2, f3, f4;
				
		f1 = new Chefe("Jose","11111",5000.0f,10.0f,100.0f);
		f2 = new Comissionado("João","22222",3000.0f,25.0f);
		f3 = new Horista("Maria","33333",80.0f,160);
		f4 = new Empreiteiro("Ana","44444",4500.0f);
		
		System.out.println("*** Folha de Pagamento");
		System.out.println("Salário Chefe       : "+f1.calcularSalario());
		System.out.println("Salário Comissionado: "+f2.calcularSalario());
		System.out.println("Salário Horista     : "+f3.calcularSalario());
		System.out.println("Salário Empreiteiro : "+f4.calcularSalario());
	} */
}
