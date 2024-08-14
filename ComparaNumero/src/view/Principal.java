 package view;

import javax.swing.JOptionPane;

import controller.ComparaNumero;

public class Principal {

	public static void main(String[] args) {
		int numA;
		int numB;
		do {
		numA = Integer.parseInt(JOptionPane.showInputDialog("insira numero entre 10 e 999999"));
		}while (numA<10||numA>999999);
		
		do {
			numB = Integer.parseInt(JOptionPane.showInputDialog("insira numero entre 0 e 9"));
			}while (numB<0||numB>10);
		ComparaNumero compNum= new ComparaNumero();
		String numeroA= Integer.toString(numA);
		String numeroB= Integer.toString(numB);
		int resp = compNum.conmparaNum(numeroA, numeroB);
		System.out.println( numB + " se repete " + resp+ " em "+ numA );
	}
	
}
