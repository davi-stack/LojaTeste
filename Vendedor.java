package polimorfismoEdados;

public class Vendedor extends Funcionario{
	public Vendedor(int Id, String nome) {
		super(Id, nome);
		// TODO Auto-generated constructor stub
	}
	public Vendedor(){
		
	}
	double vendas;
	void atualizaSalario() {
		 this.salario = 900 + (0.05*vendas);
	 }
	 String nome;
	 int [] HorarioAlmoco[];
	 double salario;
	  void vender(produto i, double preco, int quant) {
		 i.quantidade -= quant;
		 this.vendas += i.preco * quant;
	  }
	
}
