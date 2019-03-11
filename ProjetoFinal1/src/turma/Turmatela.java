package turma;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import aluno.Aluno;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class Turmatela extends JFrame {
	private JPanel contentPane;
	private JTextField n_turma;
	/**
	 * Launch the application.
	 */
	/*
	 * ################## MAIN ################
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Turmatela turmatela = new Turmatela();
					turmatela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//CAMPO FORMATADO ####################
	protected void formatarCampo() {
		try {
			MaskFormatter mask = new MaskFormatter("###-#");
			mask.install(n_turma);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null,"Erro ao formatar texto","ERRO",JOptionPane.ERROR_MESSAGE); 
		}
	}
	*/
	/**
	 * Create the frame.
	 */
	public Turmatela(String nomeprof) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		//formatarCampo();
		
		JLabel lblNDaTurma = new JLabel("N\u00BA da Turma: ");
		lblNDaTurma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNDaTurma.setBounds(42, 57, 94, 17);
		contentPane.add(lblNDaTurma);
		//formatarCampo();
		
		JButton btnBimestre = new JButton("Bimestre");
		btnBimestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Aluno aluno = new Aluno(2,n_turma.getText(),nomeprof);
							aluno.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnBimestre.setBounds(42, 169, 94, 70);
		contentPane.add(btnBimestre);
		
		JButton btnTrimestre = new JButton("Trimestre");
		btnTrimestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Aluno aluno = new Aluno(3,n_turma.getText(),nomeprof);
							aluno.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnTrimestre.setBounds(146, 169, 94, 70);
		contentPane.add(btnTrimestre);
		
		JButton btnSemestre = new JButton("Semestre");
		btnSemestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Aluno aluno = new Aluno(6,n_turma.getText(),nomeprof);
							aluno.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnSemestre.setBounds(250, 169, 94, 70);
		contentPane.add(btnSemestre);
		
		n_turma = new JTextField();
		n_turma.setBounds(146, 57, 90, 20);
		contentPane.add(n_turma);
		n_turma.setColumns(10);
		
		
		
	}

	

	public void setTxturma(JTextField txturma) {
	}

}
