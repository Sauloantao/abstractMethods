package Fabrica;

public class FabricaHatch extends CarroFactory{
	protected Carro criaCarro(String tipoCarro, String Marca, String Cor, String Placa, String Velocidade_atual) {
		Carro carro = null;
		switch (tipoCarro) {
			case "Onix":
				carro = new Onix(Marca, Cor, Placa, Velocidade_atual);
				break;
			case "Celta":
				carro = new Celta(Marca, Cor, Placa, Velocidade_atual);
				break;
		}
		return null;
	}

}
