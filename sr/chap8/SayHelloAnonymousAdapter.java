package chap8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class SayHelloAnonymousAdapter extends JFrame {
        JLabel lblHello;

    public  SayHelloAnonymousAdapter() {
        Random rd = new Random(999);
        JPanel panel = new JPanel();
        Font fnt = new Font("Chakra petch", Font.BOLD, 30);
        lblHello = new JLabel("Lucky Number");
        panel.add(lblHello);
        lblHello.setFont(fnt);
        this.add(panel, BorderLayout.CENTER);
        lblHello.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {;
//            lblHello.setText(String.valueOf(rd.nextInt(999)));
            lblHello.setText(""+rd.nextInt(999));

            }

            @Override
            public void mouseExited(MouseEvent e) {
            lblHello.setText("You are Lucky");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new SayHelloAnonymousAdapter();
        frame.setTitle("By Solahudeen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
