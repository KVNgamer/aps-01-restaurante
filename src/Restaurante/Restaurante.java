package Restaurante;

public class Restaurante {
	Prato prato1=new Prato("Arroz com feijao","Arroz com feijao simples",14.90);
	Prato prato2=new Prato("Massa e oleo","espaguete",19.90);
	Prato prato3=new Prato("miojo","miojo feito com agua natural",02.20);
	
	public void mostracardapio(){
		System.out.println(prato1.toString());
		System.out.println(prato2.toString());
		System.out.println(prato3.toString());
	}
}
