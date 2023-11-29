package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class cadastroClienteCheckin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textDataNascimento;
	private JTextField textDataEntrada;
	private JTextField textHora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroClienteCheckin frame = new cadastroClienteCheckin();
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
	public cadastroClienteCheckin() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Cadastro do Cliente Check-in");
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][85px,grow][][360.00][][grow][]", "[21px][][][][][][][][][][][]"));

		//colocar um jlabel para colocar as imagens
		//código para redimensionar as imagens. 
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/ClientebotaoSair.png")).getImage().getScaledInstance(110, 30, Image.SCALE_DEFAULT));
				
				ImageIcon imageIcon1= new ImageIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/Châteu_Imperial-removebg-preview 2LogoInicio.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				
				JLabel lblNewLabel = new JLabel("");
				//evento de clique 
				lblNewLabel.addMouseListener(new MouseAdapter() {
					@Override
					//usado o evento maouseClicked para sair 
					public void mouseClicked(MouseEvent e) {
						setVisible(false);
					}
				});
				lblNewLabel.setIcon(imageIcon);
				
						
						contentPane.add(lblNewLabel, "cell 0 0");
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/Châteu_Imperial-removebg-preview 3logoMenor.png")));
				contentPane.add(lblNewLabel_1, "cell 1 0");
				
				JLabel lblNewLabel_2 = new JLabel("Seja Bem Vindo!");
				lblNewLabel_2.setForeground(new Color(1, 50, 1));
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
				contentPane.add(lblNewLabel_2, "cell 2 0");
				
				JLabel lblNewLabel_3 = new JLabel("Insira a informações abaixo para check-in e cadastro:");
				lblNewLabel_3.setForeground(new Color(1, 50, 1));
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				contentPane.add(lblNewLabel_3, "cell 2 1");
				
				JLabel lblNome = new JLabel("Nome:");
				lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
				contentPane.add(lblNome, "cell 0 3,alignx left");
				
				textNome = new JTextField();
				textNome.setBorder(new LineBorder(new Color(1, 50, 1)));
				textNome.setSelectedTextColor(new Color(1, 50, 1));
				textNome.setForeground(new Color(0, 0, 0));
				textNome.setDisabledTextColor(new Color(1, 50, 1));
				textNome.setBackground(new Color(255, 255, 255));
				contentPane.add(textNome, "cell 1 3,growx");
				textNome.setColumns(10);
				
				JLabel lblCPF = new JLabel("CPF:");
				lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
				contentPane.add(lblCPF, "cell 0 4,alignx left");
				
				textCPF = new JTextField();
				textCPF.setBorder(new LineBorder(new Color(1, 50, 1)));
				contentPane.add(textCPF, "cell 1 4,growx");
				textCPF.setColumns(10);
				
				JLabel lblDataNascimento = new JLabel("Data de nascimento:");
				lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
				contentPane.add(lblDataNascimento, "cell 0 5,alignx left");
				
				textDataNascimento = new JTextField();
				textDataNascimento.setBorder(new LineBorder(new Color(1, 50, 1)));
				contentPane.add(textDataNascimento, "cell 1 5,growx");
				textDataNascimento.setColumns(10);
				
				JLabel lblDataEntradaHora = new JLabel("Data e hora de entrada");
				lblDataEntradaHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
				contentPane.add(lblDataEntradaHora, "cell 0 6,alignx left");
				
				textDataEntrada = new JTextField();
				textDataEntrada.setBorder(new LineBorder(new Color(1, 50, 1)));
				contentPane.add(textDataEntrada, "cell 1 6,growx");
				textDataEntrada.setColumns(10);
				
				textHora = new JTextField();
				textHora.setBorder(new LineBorder(new Color(1, 50, 1)));
				contentPane.add(textHora, "cell 2 6,growx");
				textHora.setColumns(10);
	}

}
