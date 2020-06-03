package Fabrica;

public abstract class CarroFactory {
	
	public Carro usaCarro(String tipoCarro, String Marca, String Cor, String Placa, String Velocidade_atual) {
		Carro carro;
		carro = criaCarro(tipoCarro, Marca, Cor, Placa, Velocidade_atual);
		carro.Acelerar();
		return carro;
	}

	protected abstract Carro criaCarro(String tipoCarro, String Marca, String Cor, String Placa, String Velocidade_Atual);
}
