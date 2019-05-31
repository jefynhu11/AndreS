package atividade2;

public class Teste {

	public static void main(String[] args) {
		
		FilaDinamica filaD = new FilaDinamica();
		filaD.enfileiraNo(5);
		
		PilhaDinamica pilha = new PilhaDinamica();
		
		pilha.listaTudo();
		
		pilha.empilhaNo(9);
		pilha.empilhaNo(5);
		pilha.empilhaNo(7);
		pilha.empilhaNo(3);
		
		pilha.listaTudo();
		
		pilha.desempilhado();
		
		pilha.listaTudo();
		

	}

}
