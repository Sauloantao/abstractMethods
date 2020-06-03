package Fabrica;

public class Celta extends Carro {
		public Celta (String Marca, String Cor, String Placa, String Velocidade_atual) {
			this.Marca = Marca;
			this.Cor = Cor;
			this.Placa = Placa;
			this.Velocidade_atual = Velocidade_atual;
		}
	
		public String Ligar() {
	
			System.out.println("Celta Carro Ligado");
			return null;
		}
	
		@Override
		public String Acelerar() {
			System.out.println("Celta Carro Acelera 5km/h");
			return null;
		}
	
		@Override
		public String Parar() {
			System.out.println("Celta Carro parado");
			return null;
		}
	}


