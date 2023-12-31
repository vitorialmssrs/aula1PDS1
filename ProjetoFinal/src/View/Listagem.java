package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Listagem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listagem frame = new Listagem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Listagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<-| Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(1, 50, 1));
		btnNewButton.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Listagem.class.getResource("/Imagem/Châteu_Imperial-removebg-preview 3.png")));
		lblNewLabel.setBounds(105, 22, 143, 125);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Listagem");
		lblNewLabel_1.setForeground(new Color(1, 50, 1));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(287, 36, 221, 81);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(1, 50, 1));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 157, 817, 291);
		contentPane.add(panel);
		
		table = new JTable();
		table.setForeground(new Color(1, 50, 1));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
	}
}
