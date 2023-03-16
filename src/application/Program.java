package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);

	      int anterior = 0;
	      int fibo = 1;
	      System.out.println("insira um numero");
	      int num = sc.nextInt();
	      boolean pertence = false;
		
	      for (int i = 1; fibo < num; i++) {
	    	    int proximo = fibo + anterior;
	    	    anterior = fibo; 
	    	    fibo = proximo; 
	    	    if (fibo == num) {
	    	        pertence = true;
	    	        break;
	    	    }
	    	}

	    	if (pertence) {
	    	    System.out.println("Pertence");
	    	} else {
	    	    System.out.println("Não pertence");
	    	}
	      
	}

}
