package controller;

public class ComparaNumero {

	public ComparaNumero() {
		super();}
	
	public int conmparaNum(String numA, String numB ) {
		int quantidade=0;
		int numeroB= Integer.parseInt(numB) ;
		   String[]vetorDigitos = numA.split("");
		   for( String digitos: vetorDigitos ) {
			   int digito = Integer.parseInt(digitos);
			   
			   if (digito == numeroB) {
			    quantidade = quantidade + 1;
			   ;
		   }
		   }
		 return(quantidade);
	}
	}