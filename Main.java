package polimorfismoEdados;
import java.util.Scanner;

  public class Main {
	  private static Scanner tec;

	public static void main(String args[]) {
	  	int opc;
	  	String nome;
		tec = new Scanner(System.in);
        Setor setor = new Setor();
	  	do {
	  		opc = tec.nextInt();
	  		System.out.println("\n---------------");
	  		System.out.println("Escolha uma opcao");
	  		System.out.println("1 - Inserir Funcionario");
	  		System.out.println("2 - Lista de Funcionario do setor");
	  		System.out.println("3 - Situacao");
	  		System.out.println("0 - Sair");
	  		System.out.println("\n---------------");
	  		
	  	  		switch(opc){
	  		case 1:
	  			
	  			nome = tec.next();
	  			Funcionario fun =new Funcionario(nome);
	  			setor.addToSetor(fun);
	  			break;
	  		case 2:
	  			setor.listarFunSetor();
	  			break;
	  		case 3:
	  			break;
	  		case 0:
	  			break;
	  			default:
	  				
	  		}
	  	}while(opc!=0);
	  }
	  
	  }
