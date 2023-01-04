package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JPasswordField p;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("kullanıcı adi");
		lblNewLabel.setBounds(167, 96, 90, 28);
		contentPane.add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(166, 135, 158, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("sifre");
		lblNewLabel_1.setBounds(167, 176, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		
		
		String pass = "12345";
		p = new JPasswordField();
		p.setBounds(166, 201, 158, 20);
		contentPane.add(p);
		
		JButton btn = new JButton("GİRİS");
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String pass = new String(p.getPassword());
				String adi = t1.getText();
				String sql = "SELECT * FROM user" + " WHERE username='"+adi+"'";
				ResultSet rs = null;
				System.out.println("1");
				
				try {
					rs = Baglanti.bul(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			System.out.println("2");

				try {
					while(rs.next())
					{
						if(adi.equals(rs.getString("username")) && pass.equals(rs.getString("sifre")))
							System.out.println("giriş başarılı");
						else
							System.out.println("giris basarısız");
			
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					
					e1.printStackTrace();
				}
				
			}
		});
		btn.setBounds(365, 262, 89, 23);
		contentPane.add(btn);
	}
}
