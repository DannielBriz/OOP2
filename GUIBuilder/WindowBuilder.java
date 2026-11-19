import helper_classes.*;
import java.awt.Color;
import javax.swing.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(1217, 658);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JLabel element1 = new JLabel("Enter ID#:");
     element1.setBounds(134, 121, 210, 36);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 26));
     element1.setForeground(Color.decode("#D9D9D9"));
     panel.add(element1);

     JTextField element2 = new JTextField("");
     element2.setBounds(261, 119, 245, 36);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 26));
     element2.setBackground(Color.decode("#B2B2B2"));
     element2.setForeground(Color.decode("#656565"));
     element2.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element2, "ID", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element2);

     JLabel element3 = new JLabel("Enter Name:");
     element3.setBounds(109, 175, 156, 36);
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 26));
     element3.setForeground(Color.decode("#D9D9D9"));
     panel.add(element3);

     JTextField element4 = new JTextField("");
     element4.setBounds(262, 175, 244, 21);
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 26));
     element4.setBackground(Color.decode("#B2B2B2"));
     element4.setForeground(Color.decode("#656565"));
     element4.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element4, "Name", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element4);

     JLabel element5 = new JLabel("Enter Email:");
     element5.setBounds(116, 231, 145, 34);
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 26));
     element5.setForeground(Color.decode("#D9D9D9"));
     panel.add(element5);

     JTextField element6 = new JTextField("");
     element6.setBounds(262, 233, 243, 21);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 26));
     element6.setBackground(Color.decode("#B2B2B2"));
     element6.setForeground(Color.decode("#656565"));
     element6.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element6, "Your Input!", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element6);

     JButton element7 = new JButton("Log in");
     element7.setBounds(508, 400, 194, 61);
     element7.setBackground(Color.decode("#2e2e2e"));
     element7.setForeground(Color.decode("#D9D9D9"));
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
     element7.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element7.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element7, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element7);

     JLabel element8 = new JLabel("Kaishū Suru");
     element8.setBounds(479, 6, 356, 63);
     element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 50));
     element8.setForeground(Color.decode("#D9D9D9"));
     panel.add(element8);

     JLabel element9 = new JLabel("Test");
     element9.setBounds(709, 104, 298, 222);
     element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 28));
     element9.setForeground(Color.decode("#D9D9D9"));
     panel.add(element9);

     frame.add(panel);
     frame.setVisible(true);

  }
}