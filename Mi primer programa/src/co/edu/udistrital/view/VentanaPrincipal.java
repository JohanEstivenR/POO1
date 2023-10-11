package co.edu.udistrital.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	private PanelPrincipal panel;
	
	public VentanaPrincipal() {
		setTitle("Mi primer programa");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.RED);
		
		inicilizarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public void inicilizarComponentes() {
		
		panel = new PanelPrincipal();
		panel.setBounds(25, 25, 735, 510);
		getContentPane().add(panel);
		
	}

	public PanelPrincipal getPanel() {
		return panel;
	}

	public void setPanel(PanelPrincipal panel) {
		this.panel = panel;
	}
	

}
