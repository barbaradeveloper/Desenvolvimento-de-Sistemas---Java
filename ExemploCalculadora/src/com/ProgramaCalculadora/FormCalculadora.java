package com.ProgramaCalculadora;

import java.awt.FlowLayout; 

import java.swing.JButton;
import java.swing.JFrame;
import java.swing.JLabel;
import java.swing.JTextField;
import java.swing.Container;

public class FormCalculadora extends JFrame{
	// Declaração dos componentes
	private JButton btCalcular;
	private JTextField tfNumero1;
	private JTextField tfNumero2;
	private Jlabel lbNumero1;
	private Jlabel lbNumero2;
	private JLabel Resultado;
}

// Container para armazenar os componentes
 	Container container;
 	public FormCalculadora() {
	// Configuração da janela 
	this.setTitle("SENAI TDS: Calculadora soma");
	// Declarar o modelo do layout 
	this.setLayout(new Flow Layout());
	this.setVisible(true);
	this.setSize(600, 150);
	
	// Construindo o container
	container = this.getContentPanel();
	
	// Instanciar os componentes gráficos
	btCalcular = new JButton("Calcular");
	tfNumero1 = new JTextField(10);
	tfNumero2 = new JTextField(10);
	lbNumero1 = new JLabel("Número 1");
	lbNumero2 = new JLabel("Número 2");
	
	// Agrupa componentes em ordem de exibição
	container.add(lbNumero1);
	container.add(lbNumero2);
	container.add(tfNumero1);
	container.add(tfNumero2);
	container.add(btCalcular);
	container.add(lbResultado);	
}
