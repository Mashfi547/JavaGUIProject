import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
    JPanel panel;
    JLabel userLabel, passLabel;
    JTextField userTF;
    JPasswordField passPF;
    JButton loginBtn, exitBtn;

    public LoginFrame() {
        super("Banking System Login");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);

        userLabel = new JLabel("User Name:");
        userLabel.setBounds(100, 80, 100, 30);
        panel.add(userLabel);

        userTF = new JTextField();
        userTF.setBounds(200, 80, 150, 30);
        panel.add(userTF);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(100, 130, 100, 30);
        panel.add(passLabel);

        passPF = new JPasswordField();
        passPF.setBounds(200, 130, 150, 30);
        panel.add(passPF);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(120, 200, 100, 30);
        panel.add(loginBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(240, 200, 100, 30);
        panel.add(exitBtn);

        this.add(panel);

        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userTF.getText();
                String pass = new String(passPF.getPassword());

                if (user.equals("admin") && pass.equals("1234")) {
                    dispose(); // close login
                    new MainMenuFrame(); // go to main menu
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials!");
                }
            }
        });

        exitBtn.addActionListener(e -> System.exit(0));
    }
}


