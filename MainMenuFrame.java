import javax.swing.*;

public class MainMenuFrame extends JFrame {
    public MainMenuFrame() {
        super("Main Menu");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Welcome to the Banking System");
        label.setBounds(70, 30, 250, 30);
        panel.add(label);

        JButton createBtn = new JButton("Create Account");
        createBtn.setBounds(100, 80, 180, 30);
        panel.add(createBtn);

        JButton logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(100, 130, 180, 30);
        logoutBtn.addActionListener(e -> {
            dispose();
            new LoginFrame().setVisible(true);
        });
        panel.add(logoutBtn);

        this.add(panel);
        this.setVisible(true);
    }
}

