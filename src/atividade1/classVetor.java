package atividade1;

import java.util.Arrays;
import java.util.Random;

public class classVetor {
	
	int[] vt;
	Random rand = new Random(System.currentTimeMillis());
	
	public classVetor(int tam) {
		vt = new int[tam];
	}
	
	public void povoaVetor() {
		for (int i = 0; i < vt.length; i++) {
			vt [i] = rand.nextInt(500);
		}
	}
	
	public void povoaVetorSequencial() {
		vt [0] = rand.nextInt(500);
		for (int i = 1; i < vt.length; i++) {
			vt [i] = rand.nextInt(500) + vt [i-1];
		}
	}
	
	public void atribuirValor(int valor) {
		for (int i = 0; i < vt.length; i++) {			
			if(vt[i]==0) {
				vt[i]=valor;
				break;
			}
		}
	}
	
	public int returnaValor(int valor) {
		int y = -1;
		for (int i = 0; i < vt.length; i++) {
			if (vt[i]==valor) {
				y = 0;
			}
		}
		return y;
	}
	
	public int tamanhoo() { 
		return vt.length;
	}
	
	public void ocupar() {
		int y=0;
		for (int i=0;i<vt.length;i++) {
			if (vt[i] != 0) {
				y++;
			}
		}
		System.out.println(y);		
	}

	public int adicionaValor(int valor) {
		int y = -1;
		for (int i = 0; i < vt.length; i++) {
			if (vt[i]==0) {
				vt[i]=valor;
				y = 0;
			}
		}
		return y;
	}
	
	public int maiorValor() {
		int maior=vt[0];
		for (int i=1;i<vt.length;i++) {
			if(vt[i]>maior) {
				maior = vt[i];
			}
		}
		return maior;
	}
	
	public int menorValor() {
		int menor=vt[0];
		for (int i=1;i<vt.length;i++) {
			if(vt[i]<menor) {
				menor = vt[i];
			}
		}
		return menor;
	}

	public void print() {
		for (int i = 0; i < vt.length; i++) {
			System.out.print(vt[i] + " ");
		}
	}
	
	public void valorPosicao(int x, int y) {
		for (int i = 0; i < vt.length; i++) {
			if (i == x) {
				vt[i] = y;
			}
		}
	}

	public int apagarValor(int x) {
		int pos = -1;
		for (int i=0; i<vt.length;i++) {
			if (vt[i] == x) {
				vt[i] = 0;
				pos = i;
			}
		}
		return pos;
	}

	public int apagarPosicao(int x) {
		int pos = -1;
		for (int i=0; i<vt.length;i++) {
			if (vt[i] == x) {
				vt[i] = 0;
				pos = i;
			}
		}
		return pos;
	}
	
	public int sequencial(int valor) {
		int x=-1;
		for(int i = 0; i < vt.length; i++) {
			if (valor == vt[i]) {
				x = i;
			}
		}
		return x;
	}

	public int binaria(int escolhe, int comeca, int fim) {
		int meio = comeca + (fim-comeca)/2;
		if(vt[meio]==escolhe) {
			return meio;
		} else {
			if (vt[meio]<escolhe) {
				comeca = meio + 1;
			}else {
				fim = meio - 1;
			}
		}
		if (fim<comeca) {
			return -1;
		}else {
			return binaria(escolhe, comeca, fim);
		}
	}

	public void bubblesort() {
		int i,aux = 0;
		
		for(i = vt.length; i>=1; i--){
			for(int j = 1; j<i; j++){
				if(vt[j-1] > vt[j]){
					aux = vt[j];
					vt[j] = vt[j-1];
					vt[j-1] = aux;
				}
			}
		}
	}

	public void insertion() {
		int i,j,key;
		
		for (j = 1; j < vt.length; j++){
			key = vt[j];
			for (i = j - 1; (i >= 0) && (vt[i] > key); i--){
				vt[i + 1] = vt[i];
			}
			vt[i + 1] = key;
		}
	}
	
	public void selection() {
		for (int i = 0; i < vt.length - 1; i++) {
			int aux = i;
			for (int j = i + 1; j < vt.length; j++) {
				if( vt[j] < vt[aux] ) {
					aux = j;
				}
			}
			int menor = vt[aux];
			vt[aux] = vt[i];
			vt[i] = menor;
		}
	}
	
	public void ordem() {
		Arrays.sort(vt);
	}	
}