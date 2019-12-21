package com.company.View;

import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Register extends JFrame {

    private JTextField tFirstName;
    private JTextField tLastName;
    private JTextField tPassportNumber;
    private JTextField tID;
    private JTextField tDateOfArrival;

    public Register(){

        // Creating Object P1 of JPanel class
        JPanel p1 = new JPanel();

        // set the layout
        p1.setLayout(new GridLayout(4,2));

        // Creating Object of "FlowLayout" class
        FlowLayout layout = new FlowLayout();

        // Creating Object P2 of JPanel class
        JPanel p2 = new JPanel();

        // Set the layout
        p2.setLayout(layout);

        // Declaration of objects of JLabel class.
        JLabel one, two, three, four, five;

        // Declaration of objects of JTextField class.
        JTextField tFirstName, jLastName, JPassportNumber, jID, jDateOfArrival;

        // Declaration of objects of JButton class.
        JButton buttonRegister, buttonExit;

        // Initialization of object
        // "one" of JLabel class.
        one = new JLabel("FIRST NAME");

        // Initialization of object
        // "tFirstName" of JTextField class.
        tFirstName = new JTextField(20);

        // Initialization of object
        // "two" of JLabel class.
        two = new JLabel("LAST NAME");

        // Initialization of object
        // "tLastName" of JTextField class.
        tLastName = new JTextField(20);

        // Initialization of object
        // "three" of JLabel class.
        three = new JLabel("PASSPORT NUMBER");

        // Initialization of object
        // "tPassportNumber" of JTextField class.
        tPassportNumber = new JTextField(20);

        // Initialization of object
        // "four" of JLabel class.
        four = new JLabel("ID");

        // Initialization of object
        // "tID" of JTextField class.
        tID = new JTextField(20);

        // Initialization of object
        // "five" of JLabel class.
        five = new JLabel("DATE OF ARRIVAL");

        // Initialization of object
        // "tDateOfArrival" of JTextField class.
        tDateOfArrival = new JTextField(20);

        // Initialization of object
        // "buttonRegister" of JButton class.
        buttonRegister = new JButton("REGISTER");


        // Adding Jlabel "one" on JFrame.
        p1.add(one);

        // Adding JTextField "tFirstName" on JFrame.
        p1.add(tFirstName);

        // Adding Jlabel "two" on JFrame.
        p1.add(two);

        // Adding JTextField "tLastName" on JFrame.
        p1.add(tLastName);

        // Adding Jlabel "three" on JFrame.
        p1.add(three);

        // Adding JTextField "tPassportNumber" on JFrame.
        p1.add(tPassportNumber);

        // Adding Jlabel "four" on JFrame.
        p1.add(four);

        // Adding JTextField "tID" on JFrame.
        p1.add(tID);

        // Adding Jlabel "five" on JFrame.
        p1.add(four);

        // Adding JTextField "tDateOfArrival" on JFrame.
        p1.add(tDateOfArrival);

        // Adding JButton "buttonRegister" on JFrame.
        p2.add(buttonRegister);


        // add the p1 object which
        // refer to the Jpanel
        add(p1, "North");

        // add the p2 object which
        // refer to the Jpanel
        add(p2, "South");

        // Function to set visible
        setVisible(true);


        // This Keyword refers to current object.
        // Function to set size of JFrame.
        this.setSize(400, 180);

        // calling the constructor
        new Register();
    }
}