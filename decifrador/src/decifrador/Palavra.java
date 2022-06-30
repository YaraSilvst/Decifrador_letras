package decifrador;

class Palavra {
	String palavra;
	int nletra;

	Palavra (String p, int n) {
		this.palavra = p;
		this.nletra = n;
	}

	String getPalavra() {
	    return palavra;
	}

	int getNumeroLetra() {
	    return nletra;
	}	  
} 
