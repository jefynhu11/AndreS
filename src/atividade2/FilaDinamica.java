package atividade2;

public class FilaDinamica {
	
	inicio = fim = null;
	
	public void enfileiraNo(int valor) {
		System.out.println("Enfileirando...");
		NoDinamico novoNo = new NoDinamico();
		novoNo = setValor(valor);
		System.out.println(novoNo.getValor());
		novoNo = proximo(null);
		
		if(fim!=null) {
			fim.setProximo(novoNo);
		}
		
		fim = novoNo;
		
		if(inicio==null) {
			inicio = novoNo;
		}
	}
	
	public void desenfileiraNo() {
		if(inicio==null) {
			System.out.println("Fila vazio!");
		}else {
			System.out.println("Desenfileirando");
			System.out.println(inicio.getValor());
			inicio = inicio.getProximo();
		}
	}
	
	public void listaTudo() {
		if(inicio==null) {
			System.out.println("Fila vazio!");
		}else {
			System.out.println("Toda a fila...");
			noDinamico noLista = inicio;
			do {
				System.out.println(noLista.getValor());
				noLista = noLista.getProximo();
			}while(noLista!=null);
		}
	}
	
}