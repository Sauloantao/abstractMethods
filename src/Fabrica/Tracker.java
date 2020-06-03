package Fabrica;

public class Tracker extends Carro{
	public Tracker(String Marca, String Cor, String Placa, String Velocidade_atual) {
		this.Marca = Marca;
		this.Cor = Cor;
		this.Placa = Placa;
		this.Velocidade_atual = Velocidade_atual;
	}

	public String Ligar() {

		System.out.println("Tracker Carro Ligado");
		return null;
	}

	@Override
	public String Acelerar() {
		System.out.println("Tracker Carro Acelera 10km/h");
		return null;
	}

	@Override
	public String Parar() {
		System.out.println("Tracker Carro parado");
		return null;
	}

}
