package atividade1;

public class Filas {
	
	int vt[];
	
	public Filas(int tam) {
		vt = new int[tam];
	}
	
	public int inserirLimite(int valor,int inserir) {
		
		for (; inserir < vt.length; ) {
			if(vt[inserir] == 0) {				
				vt[inserir] = valor;
				break;
			}					
		}
		inserir = inserir + 1;
		return inserir;
	}
	
	public int apagarLimite(int delete) {
		for ( ; delete < vt.length; ) {
			if(vt[delete]!=0) {
				vt[delete] = 0;
				break;
			}			
		}
		return delete = delete + 1;
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