package chap8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SayHello1 extends JFrame implements MouseListener {
    JLabel lblHello;
    public  SayHello1() {
        JPanel panel = new JPanel();
        Font fnt = new Font("Chakra petch", Font.BOLD, 30);
        JLabel lblHello = new JLabel("meet someone");
        panel.add(lblHello);
        lblHello.setFont(fnt);
        this.add(panel, BorderLayout.CENTER);
        lblHello.addMouseListener(this);
    }
    public static void main(String[] args) {
        JFrame frame = new SayHello1();
        frame.setTitle("By Solahudeen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {



    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
} // end
