package entities;

import javax.swing.JOptionPane;

public class Quadrado {
	
	private int h;
	private int b;
	
	public Quadrado(int h, int b) {
		this.h = h;
		this.b = b;
	}
	
	public int getH() {
		return h;
	}
	
	public void setH(int h) {
		this.h = h;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void asterisco(int h, int b) {
		char asterisc = '*';
		
		if((h>0 && h<=20) && (b>0 && b<=20)) {
		for(int i=0; i<h; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(asterisc + " ");
			}
			System.out.println();
		}
		
		}
		else {
			JOptionPane.showMessageDialog(null, "Erro!");
		}
	}
	}

