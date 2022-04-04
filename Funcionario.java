package polimorfismoEdados;

public class Funcionario {
 private int Id;
 public Funcionario(int Id, String nome) {
	 this.setId(Id);
	 this.setNome(nome);
	 
 }
 public Funcionario() {
	 
 }
 public Funcionario(String nome) {
	 this.setNome(nome);
 }
 public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public Funcionario(int Id, String nome, double salario) {
	 
 }
 String nome;
 double salario;
 void atualizaSalario() {
	 salario = 1666 * ((this.tempo* 0.05) + 1);
 }
 public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
int tempo;
}
