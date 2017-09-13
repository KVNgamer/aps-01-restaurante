package Restaurante;

public class Prato {
	private String nome,descricao;
	private double preco;
	public Prato(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void addIgrediente(String ingrediente) {
		this.descricao+=ingrediente;
	}
	@Override
	public String toString() {
		return "Nome do prato: " + nome + ",\nDescrição do Prato: " + descricao +" \n";
	}
	
}
