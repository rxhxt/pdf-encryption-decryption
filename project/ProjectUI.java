package project;

import java.awt.EventQueue;
//import java.io.File;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFileChooser;

public class ProjectUI {

    private JFrame frame;
    private JPasswordField passwordField;
    private Encrypt E = new Encrypt();
    private Decrypt D = new Decrypt();
    private Ui u = new Ui();
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ProjectUI window = new ProjectUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ProjectUI() {
        initialize();



    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 374, 399);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        passwordField = new JPasswordField();
        passwordField.setBounds(32, 134, 285, 33);
        frame.getContentPane().add(passwordField);

        JLabel passlabel = new JLabel("Enter Password");
        passlabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        passlabel.setBounds(33, 88, 159, 33);
        frame.getContentPane().add(passlabel);

        JButton fileupload = new JButton("Upload FIle");
        fileupload.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                u.getpath();
            }
        });
        fileupload.setFont(new Font("Tahoma", Font.PLAIN, 16));
        fileupload.setBounds(32, 34, 159, 41);
        frame.getContentPane().add(fileupload);

        JButton encrypter = new JButton("Encrypt");
        encrypter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0)
            {

                E.getpassword(passwordField.getText());
                if(passwordField.getText() != "")
                {
                    passwordField.setText("");
                    try {
                        E.encrypt();
                    }
                    catch(Exception e)
                    {
                        System.out.println("failed");
                    }
                }
                else
                {
                    //password varification
                }
            }
        });
        encrypter.setFont(new Font("Tahoma", Font.PLAIN, 16));
        encrypter.setBounds(32, 209, 160, 41);
        frame.getContentPane().add(encrypter);

        JButton decrypter = new JButton("Decrypt");
        decrypter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                D.getpassword(passwordField.getText());
                passwordField.setText("");
                try {
                    D.decrypt();
                }
                catch(Exception i)
                {
                    System.out.println("failed");
                }
            }
        });
        decrypter.setFont(new Font("Tahoma", Font.PLAIN, 16));
        decrypter.setBounds(32, 280, 158, 41);
        frame.getContentPane().add(decrypter);
    }
}
