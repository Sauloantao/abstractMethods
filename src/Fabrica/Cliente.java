package Fabrica;

import javax.swing.JOptionPane;

public class Cliente {
	CarroFactory fabrica;
	
	Cliente(CarroFactory fabrica){
		this.fabrica = fabrica;
	}
	
	public static void main(String[] args) {
		String tipoCarro;
		String Marca; 
		String Cor; 
		String Placa; 
		String Velocidade_atual;
		tipoCarro = JOptionPane.showInputDialog("Digite um modelo de Carro, Tracker/Celta/Prisma/Onix");
		Marca = JOptionPane.showInputDialog("Digite a marca do Carro");
		Cor = JOptionPane.showInputDialog("Escolha uma cor para o carro");
		Placa = JOptionPane.showInputDialog("Digite a placa do Carro");
		Velocidade_atual = JOptionPane.showInputDialog("Qual a velocidade atual do carro?");
		
		CarroFactory factory;
		switch(tipoCarro) {
			case "Tracker":
				factory = new FabricaSUV();
				factory.usaCarro(tipoCarro, Marca, Cor, Placa, Velocidade_atual);
				break;
			case "Prisma":
				factory = new FabricaSedan();
				factory.usaCarro(tipoCarro, Marca, Cor, Placa, Velocidade_atual);
				break;
			case "Onix":
				factory = new FabricaHatch();
				factory.usaCarro(tipoCarro, Marca, Cor, Placa, Velocidade_atual);
				break;
			case "Celta":
				factory = new FabricaHatch();
				factory.usaCarro(tipoCarro, Marca, Cor, Placa, Velocidade_atual);
				break;
		}
		
		
	}
}
