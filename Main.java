import java.util.Scanner;

class Main { 
	public static void main(String args[]) { 


		Scanner entrada = new Scanner (System.in);
		int continuar;
		do{
			//implementando soma e mult de vários números.

			System.out.println("Quantidade de números: ");
			int qtdNum = entrada.nextInt();
			int[] numeros = new int[qtdNum];
			for(int i = 0; i < numeros.length;i++) {
				System.out.println("Digite o número: ");
				numeros[i] = entrada.nextInt();
			}

			System.out.println("AGORA SELECIONE UMA OPERAÇÃO :");
			System.out.println("\n\n[1] SOMA");
			System.out.println("[2] SUBTRAI");
			System.out.println("[3] MULTIPLICA");
			System.out.println("[4] DIVIDE");
			System.out.println("[5] SOMA VARIOS NUM");
			System.out.println("[6] MULTIPLICA VARIOS NUM");
			System.out.println(">> Digite uma opcao: ");

			int opc = entrada.nextInt();

			switch(opc){

			case 1:
				Calculadora.soma(numeros[0], numeros[1]);
				break;

			case 2:
				Calculadora.subtracao(numeros[0], numeros[1]);
				break;

			case 3:
				Calculadora.multiplicacao(numeros[0], numeros[1]);
				break;

			case 4:
				Calculadora.divisao(numeros[0], numeros[1]);
				break;

			case 5:
				Calculadora.SomaVariosNumeros(numeros);
				break;

			
			case 6:
				Calculadora.MultVariosNumeros(numeros);
				break;

			default:
				System.out.print("Operação invalida!!");

			}

			System.out.println("Quer continuar? 1/SIM e 2/NÃO");
			continuar = entrada.nextInt();

		}while(continuar == 1);
		System.out.print("Programa finalizado");

	}
}