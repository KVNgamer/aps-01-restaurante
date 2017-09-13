package Restaurante;

public class Pedido {
	Restaurante rest1=new Restaurante();
	double ped1=rest1.prato1.getPreco();
	double ped2=rest1.prato2.getPreco();
	double ped3=rest1.prato3.getPreco();
	double somaPedido=ped1+ped2+ped3;
}
