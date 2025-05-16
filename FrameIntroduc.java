import java.lang.*;
import javax.swing.*;

public class FrameIntroduc extends JFrame{
	ImageIcon img;
	JLabel userLabel, passLabel, imgLabel;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginBtn, exitBtn;
	JRadioButton r1, r2, r3;
	JCheckBox c1, c2, c3;
	ButtonGroup bg1;
	JComboBox combo;
	JPanel panel;



	public FrameIntroduc()
	{
		super("Banking System");
		this.setSize(1200, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		
		userLabel = new JLabel("User id : ");
		userLabel.setBounds(150, 115, 100, 30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(280, 115, 100, 30);
		panel.add(userTF);
		
		passLabel = new JLabel("Password : ");
		passLabel.setBounds(150, 165, 100, 30);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(280, 165, 100, 30);
		panel.add(passPF);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(180, 225, 80, 30);
		panel.add(loginBtn);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(300, 225, 80, 30);
		panel.add(exitBtn);
		
		c1 = new JCheckBox("Keep You Logged In");
		c1.setBounds(400, 225, 100, 20);
		panel.add(c1);
	
		String items[] = {"Personal Account", "Business Account", "Savings Account", "Direct Investing", "Rewards"};
		combo = new JComboBox<>(items);
		combo.setBounds(120, 80, 100, 30);
		panel.add(combo);
		
		
		
		img = new ImageIcon("Images/Image.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(650, 100, 400, 400);
		panel.add(imgLabel);
	
		this.add(panel);
	}
}