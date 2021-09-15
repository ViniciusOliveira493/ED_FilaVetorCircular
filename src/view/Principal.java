package view;

import controller.Fila;

public class Principal {
	public static void main(String[] args) {
		String n1 = "Marcela Alessandra Corte Real";
		String n2 = "Márcia Malu Evelyn Lima";
		String n3 = "Diego Murilo Nascimento";
		String n4 = "Ricardo Kauê Sales";
		String n5 = "Luiza Ayla Louise Teixeira";
		String n6 = "Joana Giovana Assunção";
		String n7 = "Sebastião Rafael Heitor da Paz";
		String n8 = "Thales Sérgio Pires";
		
		Fila f = new Fila(4);
		
		f.desenfileira(); // o programa deve exibir o erro de fila vazia
		System.out.println("Fila está vazia ? = "+f.vazia());
		System.out.println("Fila está cheia ? = "+f.cheia());
		System.out.println("A fila possui: "+f.tamanho()+" itens");
		f.enfileira(n1);
		f.enfileira(n2);
		System.out.println("Fila está vazia ?[adicionado 2 itens] = "+f.vazia());
		System.out.println("Fila está cheia ?[adicionado 2 itens] = "+f.cheia());
		System.out.println("A fila possui: "+f.tamanho()+" itens");
		f.enfileira(n3);
		f.enfileira(n4);
		System.out.println("Fila está vazia ?[adicionado 4 itens] = "+f.vazia());
		System.out.println("Fila está cheia ?[adicionado 4 itens] = "+f.cheia());
		System.out.println("A fila possui: "+f.tamanho()+" itens");
		System.out.println();
		
		f.mostrarFila();
		f.enfileira(n8); // o programa deve exibir o erro de fila cheia
		System.out.println("Cabeça:"+f.cabeca());
		System.out.println("Cauda:"+f.cauda());
		System.out.println("\n");
		
		System.out.println("Objeto removido:"+f.desenfileira().toString());
		f.mostrarFila();
		System.out.println("A fila possui: "+f.tamanho()+" itens");
		System.out.println();
		
		System.out.println("Objeto removido:"+f.desenfileira().toString());
		f.mostrarFila();
		System.out.println("A fila possui: "+f.tamanho()+" itens");
		System.out.println();
		
		System.out.println("Objeto removido:"+f.desenfileira().toString());
		f.mostrarFila();
		System.out.println("A fila possui: "+f.tamanho()+" itens");
		System.out.println();
		
		System.out.println("Objeto removido:"+f.desenfileira().toString());
		f.mostrarFila();
		System.out.println("Fila está vazia ? = "+f.vazia());
		System.out.println("Fila está cheia ? = "+f.cheia());
		System.out.println("A fila possui: "+f.tamanho()+" itens");
		
		System.out.println("-----------------------------------------\n\n");
		
		f.enfileira(n5);
		f.enfileira(n6);
		f.enfileira(n7);
		f.enfileira(n8);
		System.out.println("Fila está vazia ? = "+f.vazia());
		System.out.println("Fila está cheia ? = "+f.cheia());
		System.out.println("A fila possui: "+f.tamanho()+" itens");
		
		f.mostrarFila();
		System.out.println();
		
		System.out.println("Thales Sérgio Pires está na fila ? = "+f.pesquisa("Thales Sérgio Pires"));
		System.out.println("Joana Giovana Assunção está na fila ? = "+f.pesquisa(n6));
		
		System.out.println("Marcela Alessandra Corte Real está na fila ? = "+f.pesquisa("Marcela Alessandra Corte Real"));
		
		
	}
}
