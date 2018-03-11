package controller;

public class FilaCircular {

	private int dados[];
	private int tamanho, inicio, fim;

	public FilaCircular(int c) {
		dados = new int[c];
		tamanho = 0;
		inicio = 0;
		fim = 0;
	}

	public void adiciona(int e) {
		if (tamanho == dados.length) {
			System.out.println("Erro, lista cheia.");
		} else {
			dados[fim] = e;
			fim++;
			if (fim == dados.length) {
				fim = 0;
			}
			tamanho++;
		}
	}

	public int remove() {
		int r = 0;
		if (tamanho == 0) {
			System.out.println("Erro, lista vazia.");
		} else {
			r = dados[inicio];
			inicio++;
			if (inicio == dados.length) {
				inicio = 0;
			}
			tamanho--;
		}
		return r;
	}

	public String toString() {
		String r = "";
		int cont = 0, i = inicio;
		while (cont < tamanho) {
			r += " " + dados[i];
			if (++i == dados.length) {
				i = 0;
			}
			cont++;
		}
		return r;
	}
	
}
