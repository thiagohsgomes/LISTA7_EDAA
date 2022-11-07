import java.util.*;

public class Main {
	
	public static void troca(int fim, int inicio, int v[]) {
		int aux;
		if(inicio < fim) {
			aux = v[inicio];
			v[inicio] = v[fim];
			v[fim] = aux;
			troca(fim - 1, inicio + 1, v);
		}
	}
	
	public static void imprime(int v[], int tam) {
		if(tam == 1) {
			System.out.printf("[%d] ", v[tam - 1]);
		}
		else {
			imprime(v, tam - 1);
			System.out.printf("[%d] ", v[tam - 1]);
		}
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int vet[] = new int[6];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = aleatorio.nextInt(10);
		}
		
		System.out.println("Vetor original: ");
		Main.imprime(vet, vet.length);
		Main.troca(vet.length - 1, 0, vet);
		System.out.println();
		System.out.println();
		System.out.println("Vetor invertido: ");
		Main.imprime(vet, vet.length);
		
		entrada.close();
		
	}	
}