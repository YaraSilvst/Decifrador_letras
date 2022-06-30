package decifrador;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<String> listaPalavras;
	    ArrayList<Palavra> palavras = new ArrayList<Palavra>();
	  
	    String frase = "inverno e melhor que verao";
	    listaPalavras = Arrays.asList(frase.split(""));

	    for(int contador = 0; contador < listaPalavras.size()-1; contador++){
	      palavras.add(new Palavra(listaPalavras.get(contador), listaPalavras.get(contador).length()));
	    }

	    for(int contador = listaPalavras.size() ; 0 < contador; contador--){
	     System.out.println(palavras.get(contador).getPalavra() + "" + palavras.get(contador).getNumeroLetra());
	    }
	}
}
