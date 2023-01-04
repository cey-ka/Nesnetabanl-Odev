package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Gui {

	public static void main(String[] args) {
		JFrame f = new JFrame("Gui Deneme");
		JLabel lbl, lbl2;
		JTextField t1;
		JPasswordField p;
		JButton b;
		String adi =  "Ali";
		String sifre = "12345";
		
		lbl = new JLabel("Kullanici adi");
		lbl.setBounds(100, 70, 100, 30);
		
		t1 = new JTextField();
		t1.setBounds(100, 100, 150, 20);
		
		lbl2 = new JLabel("sifre");
		lbl2.setBounds(100, 130,100, 30);
		
		p = new JPasswordField();
		p.setBounds(100, 160, 150, 20);
		
		b = new JButton("Test");
		b.setBounds(100, 190, 70, 20);
		
		
		b.addActionListener(new ActionListener(
				
				) {

					@Override
					public void actionPerformed(ActionEvent e) {
						String pass = new String(p.getPassword()); 
						
						if(adi.equals(t1.getText()))
						{
							if(sifre.equals(pass))
							{
								t1.setText(" ");
								p.setText(" ");
								System.out.println("giris basarili");
							}
							
							else
							{
								System.out.println("sifre hatali");
							}
						}
						
						else
						{
							System.out.println("kullanıcı adi ya da sifre hatali");
						}
						
					}
			
		});
		
		
		f.add(b);
		f.add(lbl2);
		f.add(p);
		f.add(t1);
		f.add(lbl);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
