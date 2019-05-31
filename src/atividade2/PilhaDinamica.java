package atividade2;

public class PilhaDinamica {
	
	private NoDinamico topo;
	
	public PilhaDinamica() {
		topo = null;
	}
	
	public void empilhaNo(int val) {
		System.out.println("\nEmpilhando...");
		NoDinamico novoNo = new NoDinamico();
		novoNo.setValor(val);
		System.out.println(novoNo.getValor());
		novoNo.setProximo(topo);
		topo = novoNo;
	}
	
	public void desempilhado() {
		if(topo == null) {
			System.out.println("Pilha vazia");
		}else {
			System.out.println("\nDesempilhando...");
		}
	}
	
	public void listaTudo() {
		if(topo == null) {
			System.out.println("Pilha vazia!");
		}else {
			System.out.println("\nToda a pilha...");
			NoDinamico noListagem = topo;
			do {
				System.out.println(noListagem.getValor());
			}while(noListagem!=null);
		}
	}

}
