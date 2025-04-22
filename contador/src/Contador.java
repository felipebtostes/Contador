import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Primeiro parâmetro deve ser menor que o segundo parâmetro!");
		}
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;
		for (int contar = 0; contar <= contagem; contar++) {
            System.out.println("Imprimindo numero " + contar);
        }
		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException();
	}
}
