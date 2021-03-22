package application;

import javax.swing.JOptionPane;

import entities.Quadrado;

public class Program {

	public static void main(String[] args) {
		
		int h = Integer.parseInt(JOptionPane.showInputDialog("Digite tamanho do lado A:  "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite tamanho do lado b:  "));
	
		Quadrado quadrado = new Quadrado(h,b);
		quadrado.asterisco(h, b);
	}

}
