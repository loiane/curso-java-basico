package com.loiane.cursojava.aula35;

public class Calculadora {

	//5! = 5 * 4 * 3 * 2 * 1 = 120
    //0! = 1
    public static int fatorial(int num){
      
        if (num == 0){
            return 1;
        }
        
        int total = 1;
        for (int i=num; i>1; i--){
            total *= i;
        }
        
        return total;
    }
    
    //5! = 5 * 4 * 3 * 2 * 1 = 120
    //4! = 4 * 3 * 2 * 1 = 24
    //5! = 5 * 4!
    //0! = 1
    public static int fatorialRecursivo(int num){
    	
    		System.out.println("Calculando o fatorial de " + num);
    	
    		if (num == 0){
    			System.out.println("Fatorial de 0 é 1");
    			return 1;
    		}
    		
    		System.out.println("Chamando fatorial "+(num-1));
    	
    		return num * fatorialRecursivo(num-1);
    }
}
