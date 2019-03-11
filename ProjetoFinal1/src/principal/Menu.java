package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToggleButton;
import principal.Login;
import turma.Turmatela;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public Menu(String nomeprof) {
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JLabel lblBemVindo = new JLabel("Bem vindo ");
		lblBemVindo.setBounds(15, 16, 69, 17);
		lblBemVindo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.setLayout(null);
		contentPane.add(lblBemVindo);
		
		JLabel lblOQueDeseja = new JLabel("O que deseja ?");
		lblOQueDeseja.setBounds(26, 58, 104, 17);
		contentPane.add(lblOQueDeseja);
		
		JButton nova_turma = new JButton("Nova Turma");
		nova_turma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Turmatela turmatela = new Turmatela(nomeprof);
							turmatela.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		nova_turma.setBounds(15, 131, 104, 53);
		contentPane.add(nova_turma);
		
		JLabel nome_prof = new JLabel();
		nome_prof.setText(nomeprof.toUpperCase());
		nome_prof.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nome_prof.setBounds(83, 13, 120, 22);
		contentPane.add(nome_prof);
	}
}
