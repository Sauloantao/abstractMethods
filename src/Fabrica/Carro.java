package Fabrica;

public abstract class Carro {
	String Marca;
	String Cor;
	String Placa;
	String Velocidade_atual;
	
	public abstract String Ligar();
	public abstract String Acelerar();
	public abstract String Parar();
}
