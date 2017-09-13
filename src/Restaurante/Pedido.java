package Restaurante;

public class Pedido {
	private Restaurante rest1=new Restaurante();
	
	private double ped1=rest1.prato1.getPreco();
	private double ped2=rest1.prato2.getPreco();
	private double ped3=rest1.prato3.getPreco();
	
	double somaPedido=ped1+ped2+ped3;
}
