package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

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
import javax.swing.border.AbstractBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class cadastroClienteCheckin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textDataNascimento;
	private JTextField textDataEntrada;
	private JTextField textNumeroQuarto;
	private JTextField textNacionalidade;
	private JTextField textCodigoReserva;
	private JTextField textTelefone;
	private JTextField textCEP;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textCidade;
	private JTextField textEstado;
	private JTextField textEmail;

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
		setBounds(100, 100, 855, 537);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		//colocar um jlabel para colocar as imagens
		//código para redimensionar as imagens. 
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/ClientebotaoSair.png")).getImage().getScaledInstance(110, 30, Image.SCALE_DEFAULT));
				
				//ImageIcon imageIcon1= new ImageIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/Châteu_Imperial-removebg-preview 2LogoInicio.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				
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
				
				JLabel lblNewLabel_2 = new JLabel("Seja Bem Vindo!");
				lblNewLabel_2.setForeground(new Color(1, 50, 1));
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
				
				JLabel lblNewLabel_3 = new JLabel("Insira a informações abaixo para check-in e cadastro:");
				lblNewLabel_3.setForeground(new Color(1, 50, 1));
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				
				JLabel lblNome = new JLabel("Nome:");
				lblNome.setForeground(new Color(1, 50, 1));
				lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textNome = new JTextField();
				textNome.setBorder(new LineBorder(new Color(1, 50, 1)));
				textNome.setSelectedTextColor(new Color(1, 50, 1));
				textNome.setForeground(new Color(0, 0, 0));
				textNome.setDisabledTextColor(new Color(1, 50, 1));
				textNome.setBackground(new Color(255, 255, 255));
				textNome.setColumns(10);
				
				JLabel lblCPF = new JLabel("CPF:");
				lblCPF.setForeground(new Color(1, 50, 1));
				lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textCPF = new JTextField();
				textCPF.setBorder(new LineBorder(new Color(1, 50, 1)));
				textCPF.setColumns(10);
				
				JLabel lblDataNascimento = new JLabel("Data de nascimento:");
				lblDataNascimento.setForeground(new Color(1, 50, 1));
				lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textDataNascimento = new JTextField();
				textDataNascimento.setBorder(new LineBorder(new Color(1, 50, 1)));
				textDataNascimento.setColumns(10);
				
				JLabel lblDataCheckin = new JLabel("Data de check-in:");
				lblDataCheckin.setForeground(new Color(1, 50, 1));
				lblDataCheckin.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textDataEntrada = new JTextField();
				textDataEntrada.setBorder(new LineBorder(new Color(1, 50, 1)));
				textDataEntrada.setColumns(10);
				
				textNumeroQuarto = new JTextField();
				textNumeroQuarto.setBorder(new LineBorder(new Color(1, 50, 1)));
				textNumeroQuarto.setColumns(10);
				
				JLabel lblEmail = new JLabel("Email:");
				lblEmail.setForeground(new Color(1, 50, 1));
				lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				JLabel lblLogo = new JLabel("");
				lblLogo.setIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/Châteu_Imperial-removebg-preview 3.png")));
				lblLogo.setToolTipText("");
				
				JLabel lblNumeroQuarto = new JLabel("Número do quarto:");
				lblNumeroQuarto.setForeground(new Color(1, 50, 1));
				lblNumeroQuarto.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				JLabel lblGenero = new JLabel("Genêro:");
				lblGenero.setForeground(new Color(1, 50, 1));
				lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				JComboBox comboBoxGenero = new JComboBox();
				
				JLabel lblNacionalidade = new JLabel("Nacionalidade:");
				lblNacionalidade.setForeground(new Color(1, 50, 1));
				lblNacionalidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textNacionalidade = new JTextField();
				textNacionalidade.setColumns(10);
				
				JLabel lblCodigodaReserva = new JLabel("Código da reserva:");
				lblCodigodaReserva.setForeground(new Color(1, 50, 1));
				lblCodigodaReserva.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textCodigoReserva = new JTextField();
				textCodigoReserva.setColumns(10);
				
				JLabel lblTelefone = new JLabel("Telefone:");
				lblTelefone.setForeground(new Color(1, 50, 1));
				lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textTelefone = new JTextField();
				textTelefone.setColumns(10);
				
				JLabel lblCEP = new JLabel("CEP:");
				lblCEP.setForeground(new Color(1, 50, 1));
				lblCEP.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textCEP = new JTextField();
				textCEP.setColumns(10);
				
				JLabel lblRua = new JLabel("Rua:");
				lblRua.setForeground(new Color(1, 50, 1));
				lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textField = new JTextField();
				textField.setColumns(10);
				
				JLabel lblBairro = new JLabel("Bairro:");
				lblBairro.setForeground(new Color(1, 50, 1));
				lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				
				JLabel lblCidade = new JLabel("Cidade:");
				lblCidade.setForeground(new Color(1, 50, 1));
				lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textCidade = new JTextField();
				textCidade.setColumns(10);
				
				JLabel lblEstado = new JLabel("Estado:");
				lblEstado.setForeground(new Color(1, 50, 1));
				lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				textEstado = new JTextField();
				textEstado.setColumns(10);
	
				Color bordeColor = new Color(1,50,1);
				int voltaMenor = 4;
				RoundedBorder roundedBorder = new RoundedBorder(voltaMenor, bordeColor);
				
				textEstado.setBorder(roundedBorder);
				textNome.setBorder(roundedBorder);
				textDataNascimento.setBorder(roundedBorder);
				textCPF.setBorder(roundedBorder);
				textNacionalidade.setBorder(roundedBorder);
				textTelefone.setBorder(roundedBorder);
				textCEP.setBorder(roundedBorder);
				textField.setBorder(roundedBorder);
				textField_1.setBorder(roundedBorder);
				textCidade.setBorder(roundedBorder);
				textDataEntrada.setBorder(roundedBorder);
				textNumeroQuarto.setBorder(roundedBorder);
				textCodigoReserva.setBorder(roundedBorder);
				
				JButton btnLimpar = new JButton("");
				btnLimpar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textNome.setText(" ");
						textEstado.setText(" ");
						textDataNascimento.setText(" ");
						textCPF.setText(" ");
						textNacionalidade.setText(" ");
						textTelefone.setText(" ");
						textCEP.setText(" ");
						textField.setText(" ");
						textField_1.setText(" ");
						textCidade.setText(" ");
						textDataEntrada.setText(" ");
						textNumeroQuarto.setText(" ");
						textCodigoReserva.setText(" ");
						
											
					}
				});
				btnLimpar.setIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/Clientelimpar.png")));
				
				JButton btnCadastrar = new JButton("");
				btnCadastrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//gerar o código
						
						
						
						
					}
				});
				btnCadastrar.setIcon(new ImageIcon(cadastroClienteCheckin.class.getResource("/Imagem/Group 23cadastrar.png")));
				
				textEmail = new JTextField();
				textEmail.setBorder(new LineBorder(new Color(1, 50, 1)));
				textEmail.setColumns(10);
				
				GroupLayout gl_contentPane = new GroupLayout(contentPane);
				gl_contentPane.setHorizontalGroup(
					gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(lblNewLabel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(120)
									.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_3)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(26)
									.addComponent(lblNome)
									.addGap(22)
									.addComponent(textNome, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(lblDataNascimento)
									.addGap(10)
									.addComponent(textDataNascimento, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(lblCPF)
									.addGap(23)
									.addComponent(textCPF, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(26)
									.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(19)
									.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblGenero, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(53)
											.addComponent(comboBoxGenero, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(93)
											.addComponent(textNacionalidade, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblNacionalidade, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(23)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(67)
											.addComponent(textTelefone, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(36)
											.addComponent(textCEP, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblCEP, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addGap(26)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(42)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblRua, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addGap(10)
									.addComponent(lblBairro, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(26)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(64)
											.addComponent(textCidade, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblCidade, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(60)
											.addComponent(textEstado, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblEstado, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(26)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDataCheckin, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(112)
											.addComponent(textDataEntrada, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(132)
											.addComponent(textNumeroQuarto, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblNumeroQuarto, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
									.addGap(17)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(125)
											.addComponent(textCodigoReserva, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblCodigodaReserva, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(152)
									.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(136)
									.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
							.addGap(53))
				);
				gl_contentPane.setVerticalGroup(
					gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel)
							.addGap(8)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLogo)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(42)
									.addComponent(lblNewLabel_2)
									.addGap(10)
									.addComponent(lblNewLabel_3)))
							.addGap(50)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNome)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(textNome, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblDataNascimento)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(textDataNascimento, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblCPF)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(textCPF, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
							.addGap(16)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEmail)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(2)
											.addComponent(lblGenero, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
										.addComponent(comboBoxGenero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textNacionalidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(1)
											.addComponent(lblNacionalidade, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)))))
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(1)
											.addComponent(textTelefone, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblTelefone, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)))
								.addComponent(textCEP, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addComponent(lblCEP, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblRua, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblBairro, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
							.addGap(13)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addComponent(lblCidade, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
								.addComponent(textEstado, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblEstado, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)))
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDataCheckin)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(3)
											.addComponent(textDataEntrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(1)
											.addComponent(textNumeroQuarto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblNumeroQuarto, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addComponent(textCodigoReserva, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblCodigodaReserva, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
							.addGap(45)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
				);
				contentPane.setLayout(gl_contentPane);
				
				
	}
	static class RoundedBorder extends AbstractBorder {

		private final int radius;

	    private final Color color;



	    public RoundedBorder(int radius, Color color) {

	        this.radius = radius;

	        this.color = color;

	    }



	    @Override

	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

	        Color oldColor = g.getColor();

	        g.setColor(color);

	        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);

	        g.setColor(oldColor);

	    }



	    @Override

	    public Insets getBorderInsets(Component c) {

	        return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);

	    }



	    @Override

	    public boolean isBorderOpaque() {

	        return true;

	    }

    }
    }

