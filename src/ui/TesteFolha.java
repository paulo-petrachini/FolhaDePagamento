package ui;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class TesteFolha {
	public static void main (String args[]) {
		
		Funcionario f1, f2, f3, f4;
				
		f1 = new Chefe("Jose","11111",5000.0f,10.0f,100.0f);
		f2 = new Comissionado("João","22222",3000.0f,25.0f);
		f3 = new Horista("Maria","33333",80.0f,160);
		f4 = new Empreiteiro("Ana","44444",4500.0f);
		
		System.out.println("*** Folha de Pagamento");
		System.out.println("Salário Chefe       : "+f1.calcularSalario());
		System.out.println("Salário Comissionado: "+f2.calcularSalario());
		System.out.println("Salário Horista     : "+f3.calcularSalario());
		System.out.println("Salário Empreiteiro : "+f4.calcularSalario());
	}
}
