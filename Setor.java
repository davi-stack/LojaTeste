package polimorfismoEdados;
import java.util.ArrayList;
public class Setor {
ArrayList<Funcionario> FuncionariosSetor;
public Setor() {
	this.FuncionariosSetor = new ArrayList<Funcionario>();
}
 void addToSetor(Funcionario fun) {
	 FuncionariosSetor.add(fun);
 }
 void listarFunSetor() {
	 System.out.println("\n funcionarios do setor: ");
	 for(Funcionario a :FuncionariosSetor) {
		 a.getNome();
		 System.out.print("\n");
	 }
 }
}
