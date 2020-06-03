package Fabrica;

public class FabricaSUV extends CarroFactory {

	protected Carro criaCarro(String tipoCarro, String Marca, String Cor, String Placa, String Velocidade_atual) {
		Carro carro = null;
		switch (tipoCarro) {
			case "Tracker":
				carro = new Tracker(Marca, Cor, Placa, Velocidade_atual);
				break;
		}
		return null;
	}

}
