package view;

import controller.FilaCircular;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String args[]) {
		
		FilaCircular f = new FilaCircular(3);
		int opc = 0, e = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog(" 1 - Adiciona " + "\n 2 - Remove " + "\n 3 - Mostra Fila " + "\n 9 - Finalizar"));
			switch (opc) {
			case 1:
				e = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
				f.adiciona(e);
				break;
			case 2:
				System.out.println(f.remove());
				break;
			case 3:
				System.out.println(f.toString());
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
			}
		}
		
	}
	
}