
class Calculadora {

	public static void divisao(int num1, int num2) {
		if (num1 < num2){
			System.out.println("Imposivel realizar calculo!! \n");
		}
		else
		{
			int divide = num1 / num2;
			System.out.println("A divisao e: "+divide);
		}
	}

	public static void multiplicacao(int num1, int num2) {
		int multiplica = num1 * num2;
		System.out.println("A multiplicacao e: "+multiplica);
	}

	public static void subtracao(int num1, int num2) {
		int diminui = num1 - num2;
		System.out.println("A subtracao e: "+diminui);
	}

	public static void soma(int num1, int num2) {
		System.out.println("A soma e: "+ somaComRetorno(num1, num2));
	}

	public static int somaComRetorno(int num1, int num2) {
		int soma = num1 + num2;
		return soma;
	}
	public static void SomaVariosNumeros(int[] numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			int j = numeros[i];
			soma = soma + j;
		}
		System.out.println("A soma de Varios num é: " + soma);
	}
	
	public static void MultVariosNumeros(int[] numeros) {
		int mult = 1;
		for (int i = 0; i < numeros.length; i++) {
			int j = numeros[i];
			mult = mult * j;

		}
		System.out.println("A mult de Varios num é: " + mult);
	}
}