import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Card {
    public static void main( String [ ] args) {
        //Size of virtual Business card
        JFrame card = new JFrame("Business Card");
        card.setSize(500,300);
        card.setResizable(false);
        card.setLayout(null);
        //Color of Background
        card.getContentPane().setBackground(Color.lightGray);
        //Icon Image
        card.add(new JLabel(new ImageIcon("polisheagle.jpg")));


        card.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//The Name at the top that wont change of owner of business card
        JLabel heading = new JLabel("Nicholas WERNICKI");
        heading.setBounds(105,0,400,100);
        heading.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
        card.add(heading);
//Centers the bottom when button pressed
        JLabel below = new JLabel("", SwingConstants.CENTER);
        below.setBounds(0,175,495,100);
        below.setFont(new Font("Copperplate Gothic", Font.BOLD, 30));
        card.add(below);
//phone number button
        JButton Phone = new JButton("Phone Number");
        Phone.setBounds(75,100,150,30);
        card.add(Phone);
//email button
        JButton Email = new JButton("Email");
        Email.setBounds(75,130,150,30);
        card.add(Email);
//school button
        JButton Edu = new JButton("Current Position");
        Edu.setBounds(75,160,150,30);
        card.add(Edu);
//field button
        JButton Resume = new JButton("Field");
        Resume.setBounds(275,100,150,30);
        card.add(Resume);
//Linkedin button
        JButton link = new JButton("LinkedIn");
        link.setBounds(275,130,150,30);
        card.add(link);
//phone number action
        Phone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                below.setText("(773)-732-9735");
            }
        });
//email action
        Email.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                below.setText("Wernickin@gmail.com");
            }
        });
//position action
        Edu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                below.setText("Geek Squad Consultant");
            }
        });
//field action
        Resume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                below.setText("Computer Science");
            }
        });
//Linkedin action
        link.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/nicholas-wernicki/"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        card.setVisible(true);
    }
}