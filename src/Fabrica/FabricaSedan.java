package Fabrica;

public class FabricaSedan extends CarroFactory{
	protected Carro criaCarro(String tipoCarro, String Marca, String Cor, String Placa, String Velocidade_atual) {
		Carro carro = null;
		switch (tipoCarro) {
			case "Prisma":
				carro = new Prisma(Marca, Cor, Placa, Velocidade_atual);
				break;
		}
		return null;
	}
}
