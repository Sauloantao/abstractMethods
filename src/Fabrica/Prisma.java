package Fabrica;

public class Prisma extends Carro {
		public Prisma (String Marca, String Cor, String Placa, String Velocidade_atual) {
			this.Marca = Marca;
			this.Cor = Cor;
			this.Placa = Placa;
			this.Velocidade_atual = Velocidade_atual;
		}
	
		public String Ligar() {
	
			System.out.println("Prisma Carro Ligado");
			return null;
		}
	
		@Override
		public String Acelerar() {
			System.out.println("Prisma Carro Acelera 10km/h");
			return null;
		}
	
		@Override
		public String Parar() {
			System.out.println("Prisma Carro parado");
			return null;
		}
	}
