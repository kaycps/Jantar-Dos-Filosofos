import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame {

	private JPanel contentPane;
	private static View v;

	/**
	 * Launch the application.
	 */
	public static synchronized View getInstance() {
		if(v==null) {
			return v = new View();
		}else {
			return v;
		}
	}

	JLabel lbGarfo1 = new JLabel("");
	JLabel lbGarfo2 = new JLabel("");
	JLabel lbGarfo3 = new JLabel("");
	JLabel lbGarfo4 = new JLabel("");
	JLabel lbGarfo5 = new JLabel("");
	
	JLabel lbComidaMesa = new JLabel("");
	JLabel ComidaF1 = new JLabel("");
	JLabel ComidaF2 = new JLabel("");
	JLabel ComidaF3 = new JLabel("");
	JLabel ComidaF4 = new JLabel("");
	JLabel ComidaF5 = new JLabel("");
	private final Label label = new Label("Filosofo 1");
	private final Label label_1 = new Label("Filosofo 2");
	private final Label label_2 = new Label("Filosofo 3");
	private final Label label_3 = new Label("Filosofo 4");
	private final Label label_4 = new Label("Filosofo 5");
	
	
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbGarfo1.setIcon(new ImageIcon("D:\\figuras\\reto.png"));
		lbGarfo1.setBounds(360, 312, 82, 32);
		lbGarfo1.setVisible(false);
		contentPane.add(lbGarfo1);
		
		
		lbGarfo2.setIcon(new ImageIcon("img\\esquerda.png"));
		lbGarfo2.setBounds(384, 211, 82, 32);
		lbGarfo2.setVisible(false);
		contentPane.add(lbGarfo2);
		
		
		lbGarfo3.setIcon(new ImageIcon("img\\baixo.png"));
		lbGarfo3.setBounds(295, 150, 82, 32);
		lbGarfo3.setVisible(false);
		contentPane.add(lbGarfo3);
		
		
		lbGarfo4.setIcon(new ImageIcon("img\\deitado.png"));
		lbGarfo4.setBounds(214, 211, 82, 32);
		lbGarfo4.setVisible(false);
		contentPane.add(lbGarfo4);
		
		
		lbGarfo5.setIcon(new ImageIcon("img\\deitado.png"));
		lbGarfo5.setBounds(249, 312, 82, 32);
		lbGarfo5.setVisible(false);
		contentPane.add(lbGarfo5);
		
		
		lbComidaMesa.setIcon(new ImageIcon("img\\janta.png"));
		lbComidaMesa.setBounds(295, 228, 46, 32);
		contentPane.add(lbComidaMesa);
		
		
		ComidaF1.setIcon(new ImageIcon("img\\janta.png"));
		ComidaF1.setBounds(301, 312, 46, 32);
		ComidaF1.setVisible(false);
		contentPane.add(ComidaF1);
		
		
		ComidaF2.setIcon(new ImageIcon("D:\\figuras\\janta.png"));
		ComidaF2.setBounds(360, 254, 46, 32);
		ComidaF2.setVisible(false);
		contentPane.add(ComidaF2);
		
		
		ComidaF3.setIcon(new ImageIcon("img\\janta.png"));
		ComidaF3.setBounds(337, 176, 46, 32);
		ComidaF3.setVisible(false);
		contentPane.add(ComidaF3);
		
		
		ComidaF4.setIcon(new ImageIcon("img\\janta.png"));
		ComidaF4.setBounds(249, 176, 46, 32);
		ComidaF4.setVisible(false);
		contentPane.add(ComidaF4);
		
		
		ComidaF5.setIcon(new ImageIcon("img\\janta.png"));
		ComidaF5.setBounds(224, 254, 46, 32);
		ComidaF5.setVisible(false);
		contentPane.add(ComidaF5);
		
		JLabel lblJantarDosFilsofos = new JLabel("Jantar dos Fil\u00F3sofos");
		lblJantarDosFilsofos.setBounds(260, 11, 117, 14);
		contentPane.add(lblJantarDosFilsofos);
		
		JLabel Filosofo4 = new JLabel("New label");
		Filosofo4.setIcon(new ImageIcon("img\\filosofoEsquerda.png"));
		Filosofo4.setBounds(184, 102, 60, 60);
		contentPane.add(Filosofo4);
		
		JLabel Filosofo5 = new JLabel("New label");
		Filosofo5.setIcon(new ImageIcon("img\\filosofoEsquerda.png"));
		Filosofo5.setBounds(138, 274, 60, 60);
		contentPane.add(Filosofo5);
		
		JLabel Filosofo1 = new JLabel("New label");
		Filosofo1.setIcon(new ImageIcon("img\\filosofoFrente.png"));
		Filosofo1.setBounds(287, 376, 60, 60);
		contentPane.add(Filosofo1);
		
		JLabel Filosofo2 = new JLabel("New label");
		Filosofo2.setIcon(new ImageIcon("img\\filosofoDireita.png"));
		Filosofo2.setBounds(428, 274, 60, 60);
		contentPane.add(Filosofo2);
		
		JLabel Filosofo3 = new JLabel("New label");
		Filosofo3.setIcon(new ImageIcon("img\\filosofoDireita.png"));
		Filosofo3.setBounds(384, 102, 60, 60);
		contentPane.add(Filosofo3);
		label.setFont(new Font("Dialog", Font.PLAIN, 12));
		label.setBounds(287, 450, 62, 22);
		
		contentPane.add(label);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1.setBounds(426, 350, 62, 22);
		
		contentPane.add(label_1);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_2.setBounds(384, 172, 62, 22);
		
		contentPane.add(label_2);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_3.setBounds(184, 176, 62, 22);
		
		contentPane.add(label_3);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_4.setBounds(138, 350, 62, 22);
		
		contentPane.add(label_4);
		
		Button button = new Button("Pause");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		button.setBounds(47, 436, 70, 22);
		contentPane.add(button);
	}
}
