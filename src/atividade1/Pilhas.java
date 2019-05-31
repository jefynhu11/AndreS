package atividade1;

public class Pilhas {
	
	int vt[];
	
	public Pilhas(int tam) {
		vt = new int[tam];
	}
	
	public void inserir(int valor) {
		for (int i = 0; i < vt.length; i++) {
			if(vt[i]==0) {				
				vt[i]=valor;
				break;
			}
		}
	}
	
	public void apagar() {
		for (int i = (vt.length-1); i>= 0; i--) {
			if(vt[i]==0) {
			}else {
				System.out.println("Apagou " + vt[i]);
				vt[i]=0;
				break;
			}			
		}
	}
	
	public void print() {
		for (int i = 0; i < vt.length; i++) {
			System.out.print(vt[i] + " ");
		}
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

}