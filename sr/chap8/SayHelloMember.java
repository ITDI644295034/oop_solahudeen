package chap8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SayHelloMember extends JFrame {
    JLabel lblHello;


    class Say implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            lblHello.setText("Hello World");
            System.out.println("Hello World");

        }

        @Override
        public void mousePressed(MouseEvent e) {
            lblHello.setText("Hello World");
            System.out.println("Hello World");

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            lblHello.setText("Hello World");
            System.out.println("Hello World");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            lblHello.setText("Bye .........");
            System.out.println("Bye....");
        }
    }

    public SayHelloMember() {
        JPanel panel = new JPanel();
        Font fnt = new Font("Chakra petch", Font.BOLD, 30);
        lblHello = new JLabel("meet someone");
        panel.add(lblHello);
        lblHello.setFont(fnt);
        this.add(panel, BorderLayout.CENTER);
        lblHello.addMouseListener(new Say());
    }

    public static void main(String[] args) {
        JFrame frame = new SayHelloMember();
        frame.setTitle("By Solahudeen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
