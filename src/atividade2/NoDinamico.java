package atividade2;

public class NoDinamico {
	
	private int valor;
	private NoDinamico proximo;
	
	public NoDinamico() {
		
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int val) {
		valor = val;
	}

	public NoDinamico getProximo() {
		return proximo;
	}

	public void setProximo(NoDinamico no) {
		proximo = no;
	}
}
