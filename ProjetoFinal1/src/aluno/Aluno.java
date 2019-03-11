package aluno;



import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import turma.Turma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Servicos.*;

public class Aluno extends JFrame {
	
	//************************** INSTANCIANDO COMPONENTES ********************
	private JPanel contentPane;
	private JTextField aluno; // receber nome do aluno
	private JTextField P1; // receber nota
	private JTextField P2;// receber nota
	private JTextField P3;// receber nota
	private JTextField P4;// receber nota
	private JLabel lblP; // label nota
	private JLabel lblP_1;// label nota
	private JLabel lblP_2;// label nota
	private JLabel lblP_3;// label nota
	private JButton btnCadastrar; // botão cadastrar
	private JTable table; // tabela de cadastro de alunos 
	
	//*************************************************************************
	//######################## VARIAVEIS #######################
	private int avaliacao; // receber variaveis de outra classe sem perder o valor 
	String turma; // receber variaveis de outra classe sem perder o valor 
	Turma T; // instanciando objeto do tipo Turma

	//************************* DECLARANDO ARRAY ***********************************
		ArrayList <Turma> cad_aluno = new ArrayList();
		List<String> lista_nome = new ArrayList(); // Array de string para ser plotado na tela do usuario
	
	//*********************************************************************************

	
	//============================ 	ORGANIZAR TABELA =======================================
	private void OrganizaTable() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Numero");
		modelo.addColumn("Nome");
		if(lista_nome.isEmpty()) {
			modelo.addRow(new String[] {"Sem informações", "Sem informações"});
			
		}else {
			for (int i = 1; i < lista_nome.size(); i++) {
			    modelo.addRow(new String[] {String.valueOf(i),lista_nome.get(i)});
			}
		}
		
		table.setModel(modelo);
	}
	
	//======================================= CRIANDO TELA ===================================================
	public Aluno(int avaliacao, String turma, String nomeprof) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		aluno = new JTextField();
		aluno.setBounds(260, 57, 164, 20);
		contentPane.add(aluno);
		aluno.setColumns(10);
		
		JLabel lblAluno = new JLabel("ALUNO:");
		lblAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAluno.setBounds(206, 57, 54, 17);
		contentPane.add(lblAluno);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 9));
		table.setBounds(10, 11, 186, 240);
		contentPane.add(table);
		
		//forma que eu encontrei de entrepassar as variaveis entre as classes sem perder o dados
		this.avaliacao = avaliacao;
		this.turma = turma;
		
		// CADA CASO IRÁ APARECER A QTD DE PROVAS CORRESPONDENTE AO TIPO DE AVALIAÇÃO
		switch(this.avaliacao) {
		case 6:
			P1 = new JTextField();
			P1.setBounds(206, 137, 70, 20);
			contentPane.add(P1);
			P1.setColumns(10);
			
			P2 = new JTextField();
			P2.setColumns(10);
			P2.setBounds(286, 137, 70, 20);
			contentPane.add(P2);
			
			lblP = new JLabel("\tP1");
			lblP.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblP.setBounds(227, 106, 25, 20);
			contentPane.add(lblP);
			
			lblP_1 = new JLabel("\tP2");
			lblP_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblP_1.setBounds(305, 106, 25, 20);
			contentPane.add(lblP_1);
			break;
		
		case 3:
			P1 = new JTextField();
			P1.setBounds(206, 137, 70, 20);
			contentPane.add(P1);
			P1.setColumns(10);
			
			P2 = new JTextField();
			P2.setColumns(10);
			P2.setBounds(286, 137, 70, 20);
			contentPane.add(P2);
			
			lblP = new JLabel("\tP1");
			lblP.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblP.setBounds(227, 106, 25, 20);
			contentPane.add(lblP);
			
			lblP_1 = new JLabel("\tP2");
			lblP_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblP_1.setBounds(305, 106, 25, 20);
			contentPane.add(lblP_1);
			
			P3 = new JTextField();
			P3.setColumns(10);
			P3.setBounds(206, 197, 70, 20);
			contentPane.add(P3);
			
			lblP_2 = new JLabel("\tP3");
			lblP_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblP_2.setBounds(227, 166, 25, 20);
			contentPane.add(lblP_2);
			break;
			
		case 2:
			P1 = new JTextField();
			P1.setBounds(206, 137, 70, 20);
			contentPane.add(P1);
			P1.setColumns(10);
			
			P2 = new JTextField();
			P2.setColumns(10);
			P2.setBounds(286, 137, 70, 20);
			contentPane.add(P2);
			
			lblP = new JLabel("\tP1");
			lblP.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblP.setBounds(227, 106, 25, 20);
			contentPane.add(lblP);
			
			lblP_1 = new JLabel("\tP2");
			lblP_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblP_1.setBounds(305, 106, 25, 20);
			contentPane.add(lblP_1);
			
			P3 = new JTextField();
			P3.setColumns(10);
			P3.setBounds(206, 197, 70, 20);
			contentPane.add(P3);
			
			lblP_2 = new JLabel("\tP3");
			lblP_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblP_2.setBounds(227, 166, 25, 20);
			contentPane.add(lblP_2);

			P4 = new JTextField();
			P4.setColumns(10);
			P4.setBounds(286, 197, 70, 20);
			contentPane.add(P4);
			
			lblP_3 = new JLabel("\tP4");
			lblP_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblP_3.setBounds(305, 168, 25, 20);
			contentPane.add(lblP_3);
			break;
		}
		
	
		
		
		btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//---------------------------- INSTANCIANDO LIST ---------------------------------------
				String nome_aluno = aluno.getText();
				String nota_P1= P1.getText();
				String nota_P2= P2.getText();
				String nota_P3;
				String nota_P4;
				lista_nome.add(nome_aluno); // PASSANDO PRO LIST QUE VAI PLOTAR NA TELA
				//---------------------------------------------------------------------------------------
				
				//#################### COLOCANDO OS VALORES DENTRO DO CONSTRUTOR ###########################################
				switch (avaliacao) {
				case 6:
					T = new Turma(nome_aluno,turma,nota_P1,nota_P2); // construtor semestre
					break;
				case 3:
					nota_P3= P3.getText();
					T = new Turma(nome_aluno,turma,nota_P1,nota_P2,nota_P3); // construtor trimestre
					break;
				case 2:
					nota_P3= P3.getText();
					nota_P4= P4.getText();
					T= new Turma(nome_aluno,turma,nota_P1,nota_P2,nota_P3,nota_P4); // construtor bimestre
					break;
				}
				//###################################################################################################
				
				//CADASTRANDO O ARRAYLIST ********************
				cad_aluno.add(T);
				//*******************************************
				
				aluno.setText("");
				switch(avaliacao) {
				case 6:
				P1.setText("");
				P2.setText("");
				break;
				case 3:
				P3.setText("");
				break;
				case 2:
				P3.setText("");
				P4.setText("");
				break;
				}
				
				OrganizaTable();


			}
		});
		btnCadastrar.setBounds(322, 228, 110, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(206, 228, 89, 23);
		contentPane.add(btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = JOptionPane.showInputDialog(null, "Qual posicao deseja excluir?");
				int i = Integer.parseInt(n);
				if (i > cad_aluno.size()) {
					JOptionPane.showMessageDialog(null, "Numero invalido! Tente novamente.");

				} else {
					Excluir del = new Excluir();
					del.excluiarray(cad_aluno, i);
					OrganizaTable();
				}
			}
		});

		//======================================= IMPRIMINDO ARQUIVO ========================================
		JButton btnImprime = new JButton("IMPRIMIR");
		btnImprime.setBounds(330, 10, 100, 20);
		contentPane.add(btnImprime);
		btnImprime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Imprime imprimearquivo= new Imprime();
				try {
					imprimearquivo.imprimearray(cad_aluno,nomeprof,turma,avaliacao);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Ficha da turma cadastrada com sucesso.");
			}
		});
		//========================================================================================================

	} // FINAL DO CONSTRUTOR Aluno()

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					Aluno a = new Aluno(2,"000","Fabiano");
					a.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	}
	
	


