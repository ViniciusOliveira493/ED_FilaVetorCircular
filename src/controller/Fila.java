package controller;

public class Fila {
	private int frente;
	private int fim;
	private Object vetor[];
	private int tamanho;
	
	public Fila(int comprimento) {
		this.frente = 0;
		this.fim = 0;
		this.vetor = new Object[comprimento];
		this.tamanho = 0;
	}
	
	public void enfileira(Object obj) {
		if(!cheia()) {
			fim++;
			//se a variável fim estiver passado da última posição do vetor, voltar para a primeira posição
			if(fim == vetor.length) {
				fim = 0;
			}
			vetor[fim] = obj;	
			this.tamanho++;
		}else {
			System.err.println("A fila está cheia");
		}
	}
	
	public Object desenfileira() {
		Object obj = new Object();
		if(!vazia()) {
			frente++;
			if(frente == vetor.length) {
				frente = 0;
			}
			obj = vetor[frente];
			vetor[frente] = null;
			this.tamanho--;			
		}else {
			System.err.println("A fila está vazia");
		}
		return obj;
	}
	
	public Object cabeca() {
		Object obj = new Object();
		if(!vazia()) {
			int aux = frente+1;			
			if(aux == vetor.length) {
				aux = 0;
			}
			obj = vetor[aux];						
		}else {
			System.err.println("A fila está vazia");
		}
		return obj;
	}
	
	public Object cauda() {
		Object obj = new Object();
		if(!vazia()) {
			obj = vetor[fim];						
		}else {
			System.err.println("A fila está vazia");
		}
		return obj;
	}
	
	public void mostrarFila() {
		String fila = "[";
		int i = frente+1;
		int j = 0;
		while(j < this.tamanho) {
			if(i == vetor.length) {
				i = 0;
			}
			fila += vetor[i].toString();
			// se i for diferente do fim da lista, adicionar ", " à String fila
			if(!(i == fim)) {
				fila += ", ";
			}
			i++;
			j++;
		}
		fila += "]";
		System.out.println(fila);
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	public boolean pesquisa(Object obj) {
		boolean encontrou = false;
		//percorrendo toda a fila para ver se o elemento está presente
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == obj) {
				encontrou = true;
			}
		}
		return encontrou;
	}
	
	public boolean cheia(){
		return vetor[frente] != null;
	}
	
	public boolean vazia(){
		int posicao = frente +1;
		if(posicao == vetor.length) {
			posicao = 0;
		}
		return vetor[posicao] == null;
	}
}
