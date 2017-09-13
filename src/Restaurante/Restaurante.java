package Restaurante;

public class Restaurante {
	Prato prato1=new Prato("Arroz com feijao","Arroz com feijao simples",14.90);
	Prato prato2=new Prato("Massa e oleo","espaguete",19.90);
	Prato prato3=new Prato("miojo","miojo feito com agua natural",02.20);

	
	public void fazPedido(){
		Pedido pedido1=new Pedido();
		System.out.println("Total a pagar é $" + pedido1.somaPedido);
	}
	public void troco() {
		Pedido pedido1=new Pedido();
		System.out.println("Total pago 50$");
		double recebido=50.00;
		double troco=recebido-pedido1.somaPedido;
		System.out.println("Total troco do cliente $ "+ troco );
	}
	
	public void mostracardapio(){
		System.out.println(prato1.toString());
		System.out.println(prato2.toString());
		System.out.println(prato3.toString());
	}
}
