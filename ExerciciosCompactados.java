package ValueOf;

import javax.swing.JOptionPane;

public class ExerciciosCompactados {

	public static void main(String[] args) {

		int conversaoA = (int) (Math.random() * 100);

		double conversaoB = Math.floor(Math.random() * 100);

		char conversaoC = 'F';

		Boolean conversaoD = false;

		float conversaoE = 3.14f;

		JOptionPane.showMessageDialog(null,
				"Valores convertidos em Strings : " + "\n" + String.valueOf(conversaoA) + "\n"
						+ String.valueOf(conversaoB) + "\n" + String.valueOf(conversaoC) + "\n"
						+ String.valueOf(conversaoD) + " \n" + String.valueOf(conversaoE));

	}

}
