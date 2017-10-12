package classe;

import java.awt.BorderLayout;
import java.io.File;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import astar.Matrix;

import java.awt.Color;

@SuppressWarnings("serial")
public class TelaJogo extends JFrame {

	private static JPanel contentPane;
	static Matrix mtx;
	static File file;
	static Scanner sc;
	static Icon icon_Monstro;
	static JLabel label_Monstro;
	static JLabel label_Humano;
	static int matrix[][];

	/**
	 * Create the frame.
	 */
	public TelaJogo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 1) {
					contentPane.add(createJLabel("monstro.jpg", "monstro", i, j));
				}
				if (matrix[i][j] == 2) {
					contentPane.add(createJLabel("monstro.jpg", "monstro", i, j));
				}
				if (matrix[i][j] == 3) {
					contentPane.add(createJLabel("monstro.jpg", "monstro", i, j));
				}
			}
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			TelaJogo frame = new TelaJogo();
			frame.setVisible(true);

			// mtx = new Matrix();
			// file = new File("Matrix");
			// sc = new Scanner(file);
			// matrix = mtx.buildMatrix(sc, 800, 600);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static JLabel createJLabel(String src, String name, int locationRow, int locationColumn) {
		Icon icon = new ImageIcon(src);
		JLabel label = new JLabel(icon);
		label.setName(name);
		label.setLocation(locationRow, locationColumn);
		label.setVisible(true);
		return label;
	}
}