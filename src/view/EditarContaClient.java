package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


import control.EditarContaClientControl;

import model.Client;
import model.Dados;

public class EditarContaClient extends JFrame implements ActionListener {
    private final EditarContaClientControl controller;
  //  private final Client client;
 	private final JPanel contentPane;
 	private final JLabel nameLabel;
 	private final JLabel dateLabel;
 	private final JLabel cpfLabel;
 	private final JLabel emailLabel;
 	private final JLabel senhaLabel;
 	private final JTextField nameField;
 	private final JTextField dateField;
 	private final JTextField cpfField;
 	private final JTextField emailField;
 	private final JTextField senhaField;
 	private final JButton confirmarBtn;
 	private final JButton voltarBtn;
 	private int a = Dados.getIndexOfContaLogado(); 
 
 	/**
	 * Tela responsável para o editar conta do cliente logado.
	 * classe usando dados.getIndexOfContaLogado  em modelo.Dados que retorne posicao do objeto cliente atual em nosso arraylist
	 * usando esses informacoes estou editando informacoes do cliente logado 
	 *  

 */
	
		public  EditarContaClient() {
			
			
	        controller = new EditarContaClientControl(this);

			setResizable(false);
			setTitle("Editar Cliente");
			this.setSize(425, 340);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 425, 340);
			
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);

			nameLabel = new JLabel("Nome");
			nameLabel.setFont(new Font(null, Font.PLAIN, 14));
			nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
			nameLabel.setBounds(30, 11, 152, 35);
			contentPane.add(nameLabel);

			dateLabel = new JLabel("Data de nascimento");
			dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
			dateLabel.setFont(new Font(null, Font.PLAIN, 14));
			dateLabel.setBounds(30, 57, 152, 35);
			contentPane.add(dateLabel);

			cpfLabel = new JLabel("CPF");
			cpfLabel.setHorizontalAlignment(SwingConstants.CENTER);
			cpfLabel.setFont(new Font(null, Font.PLAIN, 14));
			cpfLabel.setBounds(30, 103, 152, 35);
			contentPane.add(cpfLabel);

			emailLabel = new JLabel("Email");
			emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
			emailLabel.setFont(new Font(null, Font.PLAIN, 14));
			emailLabel.setBounds(33, 149, 152, 35);
			contentPane.add(emailLabel);

			senhaLabel = new JLabel("Senha");
			senhaLabel.setHorizontalAlignment(SwingConstants.CENTER);
			senhaLabel.setFont(new Font(null, Font.PLAIN, 14));
			senhaLabel.setBounds(33, 198, 152, 35);
			contentPane.add(senhaLabel);

			nameField = new JTextField();
			nameField.setBounds(215, 16, 157, 27);
			contentPane.add(nameField);
			nameField.setColumns(10);
			nameField.setText(Dados.getClientes().get(a).getNome());

			dateField = new JTextField();
			dateField.setColumns(10);
			dateField.setBounds(215, 62, 157, 27);
			contentPane.add(dateField);
			dateField.setText(Dados.getClientes().get(a).getDataDeNascimento());

			cpfField = new JTextField();
			cpfField.setColumns(10);
			cpfField.setBounds(215, 108, 157, 27);
			contentPane.add(cpfField);
			cpfField.setText(Dados.getClientes().get(a).getCpf());

			emailField = new JTextField();
			emailField.setColumns(10);
			emailField.setBounds(215, 152, 157, 27);
			contentPane.add(emailField);
			emailField.setText(Dados.getClientes().get(a).getEmail());

			senhaField = new JTextField();
			senhaField.setColumns(10);
			senhaField.setBounds(215, 198, 157, 27);
			contentPane.add(senhaField);
			senhaField.setText(Dados.getClientes().get(a).getSenha());

			confirmarBtn = new JButton("Editar");
			confirmarBtn.setBounds(61, 244, 109, 41);
			confirmarBtn.addActionListener(this);
			contentPane.add(confirmarBtn);

			voltarBtn = new JButton("Voltar");
			voltarBtn.setBounds(247, 244, 109, 41);
			voltarBtn.addActionListener(this);
			contentPane.add(voltarBtn);

			setLocationRelativeTo(null);
		
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.controller.executarBotao((JButton)e.getSource());	
		}
	
	
	public void mensagemConfirmarCadastro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	@Override
	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getNameLabel() {
		return nameLabel;
	}

	public JLabel getDateLabel() {
		return dateLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JLabel getEmailLabel() {
		return emailLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public JTextField getNameField() {
		return nameField;
	}

	public JTextField getDateField() {
		return dateField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JButton getConfirmarBtn() {
		return confirmarBtn;
	}

	public JButton getVoltarBtn() {
		return voltarBtn;
	}

	public EditarContaClientControl getController() {
		return controller;
	}

	public int getA() {
		return a;
	}
	
	
	

}
