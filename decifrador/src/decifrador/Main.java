package decifrador;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
	    ArrayList<Palavra> listaPalavras = new ArrayList<Palavra>();
	    
	    listaPalavras.add(new Palavra("Inverno e melhor que verao"));
	    int var1 = listaPalavras.get(0).getPalavra().split(" ", -1).length - 1;
	    String var2[] = new String[var1];
	    var2 = listaPalavras.get(0).getPalavra().split(" ");
	    
	    System.out.println(listaPalavras.get(0).getPalavra());
	    for(int contador = var1; 0 <= contador; contador--) {
	    	System.out.println(var2[contador].length() + " - " + var2[contador]);
	    }
	}
}
