package atividade1;

import java.util.Random;
import java.util.Scanner;

public class Menu {
	public static int inputI() {
		return new Scanner(System.in).nextInt();
	}

	public static void main(String[] args) {
		
		classVetor vetorMenu = new classVetor(10);
		Pilhas pilha = new Pilhas(5);
		Filas fila = new Filas(5);
				
		int posicao,valor,op,recebe;
		int inserir = 0;
		int delete = 0;
		
		do {
			System.out.println("-----MENU-----");
			System.out.println("1-Povoa vetor\n"
					+ "2-Povoa vetor sequencia\n"
					+ "3-Atribuir valor\n"
					+ "4-Retorna valor\n"
					+ "5-Informa tamanho (Normal, Filas e Pilhas)\n"
					+ "6-Informa ocupa (Normal, Filas e Pilhas)\n"
					+ "7-Adiciona valor\n"
					+ "8-Maior valor\n"
					+ "9-Menor valor\n"
					+ "10-Lista os valores (Normal, Filas e Pilhas)\n"
					+ "11-Inserir um valor em uma determinada posicao\n"
					+ "12-Remove valor\n"
					+ "13-Remove valor informa posicao\n"
					+ "14-Busca sequencial\n"
					+ "15-Busca binaria\n"
					+ "16-Bubblesort\n"
					+ "17-Insertsort\n"
					+ "18-Selectionsort\n"
					+ "19-Filas ilimite\n"
					+ "20-Filas limite\n"
					+ "21-Pilhas\n"
					+ "22-Sair");
			System.out.println("-----Opcao------");
			op = inputI();
			switch(op) {
			case 1:
				vetorMenu.povoaVetor();
				break;
			case 2:
				vetorMenu.povoaVetorSequencial();
				break;
			case 3:
				System.out.println("Digite o valor:");
				valor = inputI();
				vetorMenu.atribuirValor(valor);
				break;
			case 4:
				System.out.println("Digite o valor:");
				valor = inputI();
				recebe = vetorMenu.returnaValor(valor);
				if (-1 == recebe) {
					System.out.println("Nao existe");
				} else {
					System.out.println("Existe o valor");
				}
				break;	
			case 5:
				System.out.println("Informa tamanho: normal[1] Filas[2] Pilhas[3]");
				op = inputI();
				if(op == 1) {					
					System.out.println("Normal");
					System.out.println(vetorMenu.tamanhoo());
				}else if(op == 2){
					System.out.println("Filas");
					System.out.println(fila.tamanhoo());
				}else if(op == 3){
					System.out.println("Pilhas");
					System.out.println(pilha.tamanhoo());
				}else {
					System.out.println("Invalido");
				}
				break;
			case 6:
				System.out.println("Quantos ocupam: normal[1] Filas[2] Pilhas[3]");
				op = inputI();
				if(op == 1) {					
					System.out.println("Normal");
					vetorMenu.ocupar();
				}else if(op == 2){
					System.out.println("Filas");
					fila.ocupar();
				}else if(op == 3){
					System.out.println("Pilhas");
					pilha.ocupar();
				}else {
					System.out.println("Invalido");
				}
				break;
			case 7:
				System.out.println("Digite o valor:");
				valor = inputI();
				recebe = vetorMenu.adicionaValor(valor);
				if(-1 == recebe) {
					System.out.println("Nao existe o espaco");
				} else {
					System.out.println("Adicionou");
				}
				break;
			case 8:
				System.out.print("Mostra o valor maior: ");
				valor = vetorMenu.maiorValor();
				System.out.println(valor);
				break;
			case 9:
				System.out.print("Mostra o valor menor: ");
				valor = vetorMenu.menorValor();
				System.out.println(valor);
				break;
			case 10:
				System.out.println("Lista normal[1] Filas[2] Pilhas[3]");
				op = inputI();
				if(op == 1) {					
					System.out.println("Normal:");
					vetorMenu.print();
				}else if(op == 2){
					System.out.println("Filas");
					fila.print();
				}else if(op == 3){
					System.out.println("Pilhas");
					pilha.print();
				}else {
					System.out.println("Invalido");
				}
				System.out.println();
				break;
			case 11:
				System.out.println("Escolhe posicao: ");
				posicao = inputI();
				System.out.println("Escolhe valor: ");
				valor = inputI();
				vetorMenu.valorPosicao(posicao, valor);
				break;
			case 12:
				System.out.println("Apaga o valor:");
				valor = inputI();
				int del = vetorMenu.apagarValor(valor);
				if(del == -1) {
					System.out.println("Nao encontrado o valor");
				} else {					
					System.out.println("Voce apagou o valor: " + valor);
				}
				break;
			case 13:
				System.out.println("Apaga o valor:");
				valor = inputI();
				int dele = vetorMenu.apagarPosicao(valor);
				if(dele == -1) {
					System.out.println("Nao encontrado o valor");
				} else {					
					System.out.println("Voce apagou o valor " + valor + " e posicao " + dele);
				}
				break;
			case 14:
				vetorMenu.ordem();
				System.out.print("Escolhe o valor: ");
				valor = inputI();
				int y = vetorMenu.sequencial(valor);
				if(y == -1) {
					System.out.println("Não encontrado");
				} else {					
					System.out.println("Posicao eh: " + y);
				}
				break;
			case 15:
				vetorMenu.ordem();
				System.out.print("Escolhe o valor: ");
				valor = inputI();
				int inicio = 0;
				int ultimo = vetorMenu.tamanhoo()-1;
				int v = vetorMenu.binaria(valor,inicio,ultimo);
				System.out.println("Posicao eh: " + v);
				break;
			case 16:
				System.out.println("Bubblesort");
				vetorMenu.bubblesort();
				break;
			case 17:
				System.out.print("Insertion");
				vetorMenu.insertion();
				System.out.println();
				break;
			case 18:
				System.out.println("Selection");
				vetorMenu.selection();
				break;
			case 19:
				System.out.println("Filas ilimite");
				System.out.println("Inserir[1] ou Remover[2]");
				op = inputI();
				if(op == 1) {					
					System.out.println("Digite o valor:");
					valor = inputI();
					inserir = fila.inserirLimite(valor,inserir);//provistorio
				}else if(op == 2){
					System.out.println("Remove");
					delete = fila.apagarLimite(delete);//provistorio
				}else {
					System.out.println("Invalido");
				}
				break;
			case 20:
				System.out.println("Filas limite");
				System.out.println("Inserir[1] ou Remover[2]");
				op = inputI();
				if(op == 1) {					
					System.out.println("Digite o valor:");
					valor = inputI();
					inserir = fila.inserirLimite(valor,inserir);
				}else if(op == 2){
					System.out.println("Remove");
					delete = fila.apagarLimite(delete);
				}else {
					System.out.println("Invalido");
				}
				break;
			case 21:
				System.out.println("Pilhas");
				System.out.println("Inserir[1] ou Remover[2]");
				op = inputI();
				if(op == 1) {					
					System.out.println("Digite o valor:");
					valor = inputI();
					pilha.inserir(valor);
				}else if(op == 2){
					System.out.println("Remove");
					pilha.apagar();
				}else {
					System.out.println("Invalido");
				}
				break;
			case 22:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opcao invalido");
			}
		}while(op!=22);
		
		System.out.println("Terminando...");
	}/*main*/
}