package br.com.javatagua.sa1.app5;

import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.CalculoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculoBO cbo = new CalculoBO();
		
		String resp1 = JOptionPane.showInputDialog("Digite o faturamento de Janeiro: ");
		String resp2 = JOptionPane.showInputDialog("Digite o faturamento de Fevereiro: ");
		String resp3 = JOptionPane.showInputDialog("Digite o faturamento de Março: ");
		double ValorJan = Double.parseDouble(resp1);
		double ValorFev = Double.parseDouble(resp2);
		double ValorMar = Double.parseDouble(resp3);
		JOptionPane.showMessageDialog(null, "Média Trimestral de faturamento: " + cbo.calcular(ValorJan, ValorFev, ValorMar));
		
	 

	}

}
