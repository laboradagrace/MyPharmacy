/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypharmacy;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

//import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import validate.Validate;
import validate.Medicine;
import validate.db;
import javax.swing.JOptionPane; // for errors

/**
 *
 * @author laboradagr_sd2022
 */
public class MyPharmacy extends JFrame {

    //data medicine information storage
    private ArrayList<Medicine> Medicines = new ArrayList<>();
    static String CurrentUser;
    static int CurrentUserAge;
    //validator
    Validate regValidator = new Validate();
    //connect to db
    db db = new db();
    //login  form //
    private JButton b1;
    private JPanel panel;
    private JLabel label1;
    private JLabel lusername;
    private JLabel lpassword;
    private JTextField textFieldUn;
    private JTextField textFieldPw;
    private JLabel reg;

    //register  form //
    private JButton regButton;
    private JPanel regForm;
    private JLabel regUsername;
    private JLabel regPassword;
    private JLabel regConfirmPass;
    private JTextField textFieldU;
    private JTextField textFieldP;
    private JTextField textFieldCP;
    private JLabel loginLabel;
    private JLabel registerText;
    private JLabel ageText;
    private JTextField age;

    public MyPharmacy() {
        b1 = new JButton();
        panel = new JPanel();
        label1 = new JLabel(); // user icon
        lusername = new JLabel();
        lpassword = new JLabel();
        textFieldUn = new javax.swing.JTextField();
        textFieldPw = new javax.swing.JTextField();
        reg = new JLabel();

        //username text
        lusername.setForeground(Color.white);

        lusername.setText("Username : ");
        lusername.setSize(900, 400);
        lusername.setLocation(50, 4);
        lusername.setVisible(true);
        //password text
        lpassword.setForeground(Color.white);

        lpassword.setText("Password : ");
        lpassword.setSize(900, 450);
        lpassword.setLocation(50, 20);
        lpassword.setVisible(true);
        //username text field
        textFieldUn.setForeground(Color.black);
        textFieldUn.setSize(130, 25);
        textFieldUn.setLocation(130, 192);
        textFieldUn.setVisible(true);
        //Password text field
        textFieldPw.setForeground(Color.black);
        textFieldPw.setSize(130, 25);
        textFieldPw.setLocation(130, 235);
        textFieldPw.setVisible(true);
        //register text
        reg.setForeground(Color.white);
        reg.setText("CLICK to Register!");
        reg.setSize(900, 400);
        reg.setLocation(140, 170);
        reg.setVisible(true);

        panel.setLayout(null);
        this.setLayout(null);
        this.setVisible(true);
        panel.setBackground(Color.pink);
        panel.setSize(400, 400);
        panel.setLocation(280, 100);
        this.setSize(1000, 700);
        this.setLocation(200, 200);

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypharmacy/icon2.png")));
        label1.setSize(200, 200);
        //add events
        b1.addMouseListener(
                new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt
            ) {
                jButton1MouseClicked(evt);
            }
        }
        );

        reg.addMouseListener(
                new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt
            ) {
                regMouseClicked(evt);
            }
        }
        );

        b1.setSize(100, 30);
        b1.setText("LOGIN");
        b1.setLocation(145, 300);
        label1.setLocation(130, 2);
        b1.setVisible(true);
        panel.setVisible(true);
        label1.setVisible(true);
        //add components
        panel.add(label1);
        panel.add(lusername);
        panel.add(textFieldUn);
        panel.add(lpassword);
        panel.add(textFieldPw);
        panel.add(b1);
        panel.add(reg);
        this.add(panel);
        this.setBackground(Color.black);
        //init components
        //register form //
        regButton = new JButton();
        regForm = new JPanel();
        regUsername = new JLabel();
        regPassword = new JLabel();
        textFieldU = new javax.swing.JTextField();
        textFieldP = new javax.swing.JTextField();
        textFieldCP = new javax.swing.JTextField();
        loginLabel = new JLabel();
        registerText = new JLabel();
        regConfirmPass = new JLabel();
        ageText = new JLabel();
        age = new JTextField();

        regForm.setLayout(null);
        regForm.setBackground(Color.pink);
        regForm.setSize(400, 400);
        regForm.setLocation(280, 100);
        regForm.setVisible(false);

        //register Text label
        registerText.setForeground(new java.awt.Color(0, 153, 153));
        registerText.setText(" REGISTER! ");
        registerText.setSize(250, 250);
        registerText.setLocation(100, 2);
        registerText.setVisible(true);
        registerText.setFont(new Font("", Font.BOLD, 32));
        //age text
        ageText.setForeground(Color.white);
        ageText.setText("Age : ");
        ageText.setSize(900, 330);
        ageText.setLocation(85, 3);
        ageText.setVisible(true);
        //username text
        regUsername.setForeground(Color.white);
        regUsername.setText("Username : ");
        regUsername.setSize(900, 400);
        regUsername.setLocation(50, 4);
        regUsername.setVisible(true);
        //password text
        regPassword.setForeground(Color.white);
        regPassword.setText("Password : ");
        regPassword.setSize(900, 450);
        regPassword.setLocation(50, 20);
        regPassword.setVisible(true);
        //confirm password text
        regConfirmPass.setForeground(Color.white);
        regConfirmPass.setText("Confirm Pass: ");
        regConfirmPass.setSize(900, 500);
        regConfirmPass.setLocation(50, 36);
        regConfirmPass.setVisible(true);
        //username text field
        textFieldU.setForeground(Color.black);
        textFieldU.setSize(130, 25);
        textFieldU.setLocation(140, 192);
        textFieldU.setVisible(true);
        //age textfield
        age.setForeground(Color.black);
        age.setSize(50, 25);
        age.setLocation(140, 160);
        age.setVisible(true);
        //Password text field
        textFieldP.setForeground(Color.black);
        textFieldP.setSize(130, 25);
        textFieldP.setLocation(140, 235);
        textFieldP.setVisible(true);
        //Confirm Password text field
        textFieldCP.setForeground(Color.black);
        textFieldCP.setSize(130, 25);
        textFieldCP.setLocation(140, 278);
        textFieldCP.setVisible(true);

        //register text
        loginLabel.setForeground(Color.white);
        loginLabel.setText("CLICK to login!");
        loginLabel.setSize(900, 400);
        loginLabel.setLocation(155, 170);
        loginLabel.setVisible(true);

        //add events
        regButton.addMouseListener(
                new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt
            ) {
                regButtonMouseClicked(evt);
            }
        }
        );

        loginLabel.addMouseListener(
                new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt
            ) {
                loginLabelMouseClicked(evt);
            }
        }
        );

        regButton.setSize(100, 30);
        regButton.setText("REGISTER");
        regButton.setLocation(145, 320);
        regButton.setVisible(true);
        regForm.setVisible(false);

        //add components
        regForm.add(regUsername);
        regForm.add(textFieldU);
        regForm.add(textFieldCP);
        regForm.add(regConfirmPass);
        regForm.add(regPassword);
        regForm.add(textFieldP);
        regForm.add(regButton);
        regForm.add(loginLabel);
        regForm.add(registerText);
        regForm.add(ageText);
        regForm.add(age);
        this.add(regForm);
    }

//login account...login button clicked
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println("Mouse clicked to log in");
        String username = textFieldUn.getText();
        String password = textFieldPw.getText();

        if (db.findData(username, password)) {
            MyPharmacy.CurrentUser = username;
            MyPharmacy.CurrentUserAge = db.getAge();
            new main();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Username or password is incorrect");
        }

        textFieldUn.setText("");
        textFieldPw.setText("");
    }
    //register text clicked 

    private void regMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println("Mouse clicked to register form");
        this.regForm.setVisible(true);
        this.panel.setVisible(false);

    }
    // register account...register button clicked

    private void regButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println("Mouse clicked to register");
        String username = textFieldU.getText();
        String password = textFieldP.getText();
        String confirmPass = textFieldCP.getText();
        String Age = age.getText();
        boolean isValid = regValidator.regValidator(username, password, confirmPass, Age);
        if (username != null && password != null && confirmPass != null && Age != null) {
            if (isValid) { //if valid save to db 
                int age1 = Integer.valueOf(Age);
                if (db.saveData(username, password, age1)) {
                    System.out.println("Account is verified!");
                    panel.setVisible(true);
                    regForm.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(this,
                    "Username is already taken!");
                }

            } else {
                JOptionPane.showMessageDialog(this, regValidator.status);
            }
        }

        //textFieldU.setText("");
        textFieldP.setText("");
        textFieldCP.setText("");
        //age.setText("");
    }

    //login text clicked
    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println("Mouse clicked to login form");
        panel.setVisible(true);
        regForm.setVisible(false);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            MyPharmacy m = new MyPharmacy();
        });

    }
}
