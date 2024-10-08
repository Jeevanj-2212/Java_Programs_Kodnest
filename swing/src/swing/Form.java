package swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Form extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Form frame = new Form();
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
    public Form() {
        setTitle("Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
        // Main panel setup
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(245, 245, 245));  // Light gray background
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Title label
        JLabel lblNewLabel = new JLabel("Form");
        lblNewLabel.setForeground(new Color(255, 87, 34)); // Dark orange title
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel.setBounds(158, 23, 120, 13);
        contentPane.add(lblNewLabel);

        // Name label
        JLabel lblNewLabel_1 = new JLabel("Name");
        lblNewLabel_1.setForeground(new Color(64, 64, 64)); // Dark gray label text
        lblNewLabel_1.setBounds(50, 73, 98, 13);
        contentPane.add(lblNewLabel_1);

        // Phone number label
        JLabel lblNewLabel_2 = new JLabel("Phone Number");
        lblNewLabel_2.setForeground(new Color(64, 64, 64)); // Dark gray label text
        lblNewLabel_2.setBounds(50, 107, 98, 13);
        contentPane.add(lblNewLabel_2);

        // Email label
        JLabel lblNewLabel_3 = new JLabel("Email");
        lblNewLabel_3.setForeground(new Color(64, 64, 64)); // Dark gray label text
        lblNewLabel_3.setBounds(50, 143, 98, 13);
        contentPane.add(lblNewLabel_3);

        // Age label
        JLabel lblNewLabel_4 = new JLabel("Age");
        lblNewLabel_4.setForeground(new Color(64, 64, 64)); // Dark gray label text
        lblNewLabel_4.setBounds(50, 173, 98, 13);
        contentPane.add(lblNewLabel_4);

        // DOB label
        JLabel lblNewLabel_5 = new JLabel("DOB");
        lblNewLabel_5.setForeground(new Color(64, 64, 64)); // Dark gray label text
        lblNewLabel_5.setBounds(50, 199, 98, 13);
        contentPane.add(lblNewLabel_5);

        // Name text field
        textField = new JTextField();
        textField.setBounds(158, 70, 160, 19);  // Adjusted size
        contentPane.add(textField);
        textField.setColumns(10);

        // Phone number text field
        textField_1 = new JTextField();
        textField_1.setBounds(158, 104, 160, 19);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        // Email text field
        textField_2 = new JTextField();
        textField_2.setBounds(158, 140, 160, 19);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        // Age text field
        textField_3 = new JTextField();
        textField_3.setBounds(158, 170, 160, 19);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        // DOB text field
        textField_4 = new JTextField();
        textField_4.setBounds(158, 196, 160, 19);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        // Submit button
        JButton btnNewButton = new JButton("Submit");
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(new Color(33, 150, 243));  // Blue submit button
        btnNewButton.setBounds(158, 232, 85, 21);
        contentPane.add(btnNewButton);
    }
}
