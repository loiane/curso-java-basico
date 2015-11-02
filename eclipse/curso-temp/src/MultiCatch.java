public class MultiCatch {

	public static void main(String[] args) {

		int[] numero = {4, 8, 16, 21, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};

		for (int i=0; i<numero.length; i++){
			try{
				if (numero[i] % 2 != 0){
					throw new NaoInteiroException(numero[i], denom[i]);
				}
				System.out.println(numero[i] + "/" + denom[i] + " = " + (numero[i]/denom[i]));
			}
			catch (ArithmeticException | ArrayIndexOutOfBoundsException | NaoInteiroException e){
				e.printStackTrace();
			}
		}
	}
	
}