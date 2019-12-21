package com.company;

import com.company.View.Register;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Register frame = new Register();
                frame.setVisible(true);
            }

        });

        //ArrayList<String> Declaration
        //ArrayList<String> al = new ArrayList<String>();


        Person p = new Person("Felipe", "Nerd", "Low");
        Person pone = new Person("Bruno", "Laranja", "High");
        LinkedQueue q = new LinkedQueue();
        System.out.println(p.getFirstName());

        q.addPerson(p);
        q.addPerson(pone);
        // add method for String ArrayList
        // use add() method to initially
        //al.add("Felipe");
        //al.add("Bruno");
    }



}



