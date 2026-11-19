// import javax.swing.*;
// import java.awt.Color;
// import helper_classes.*;
 
// public class KaishuGUI {
 
//     public static void main(String[] args) {
 
//         JFrame frame = new JFrame("Kaishū Suru");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(1217, 658);
 
//         JPanel panel = new JPanel();
//         panel.setLayout(null);
//         panel.setBackground(Color.decode("#1e1e1e"));
 
//         // =========================
//         // TITLE
//         // =========================
 
//         JLabel title = new JLabel("Kaishū Suru");
//         title.setBounds(479, 6, 356, 63);
//         title.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 50));
//         title.setForeground(Color.decode("#D9D9D9"));
//         panel.add(title);
 
 
//         // =========================
//         // WELCOME
//         // =========================
 
//         JLabel welcome = new JLabel("Welcome!");
//         welcome.setBounds(100, 105, 250, 40);
//         welcome.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 28));
//         welcome.setForeground(Color.decode("#D9D9D9"));
//         panel.add(welcome);
 
 
//         // =========================
//         // BROWSE ITEMS
//         // =========================
 
//         JButton browseButton = new JButton("Browse Items");
//         browseButton.setBounds(100, 165, 240, 55);
//         browseButton.setBackground(Color.decode("#2e2e2e"));
//         browseButton.setForeground(Color.decode("#D9D9D9"));
//         browseButton.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 24));
//         browseButton.setBorder(new RoundedBorder(
//                 4, Color.decode("#979797"), 1));
//         browseButton.setFocusPainted(false);
 
//         OnClickEventHelper.setOnClickColor(
//                 browseButton,
//                 Color.decode("#232323"),
//                 Color.decode("#2e2e2e"));
 
//         panel.add(browseButton);
 
 
//         // =========================
//         // SEARCH ITEM
//         // =========================
 
//         JButton searchButton = new JButton("Search Item");
//         searchButton.setBounds(100, 235, 240, 55);
//         searchButton.setBackground(Color.decode("#2e2e2e"));
//         searchButton.setForeground(Color.decode("#D9D9D9"));
//         searchButton.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 24));
//         searchButton.setBorder(new RoundedBorder(
//                 4, Color.decode("#979797"), 1));
//         searchButton.setFocusPainted(false);
 
//         OnClickEventHelper.setOnClickColor(
//                 searchButton,
//                 Color.decode("#232323"),
//                 Color.decode("#2e2e2e"));
 
//         panel.add(searchButton);
 
 
//         // =========================
//         // UPLOAD ITEM
//         // =========================
 
//         JButton uploadButton = new JButton("Upload Item");
//         uploadButton.setBounds(100, 305, 240, 55);
//         uploadButton.setBackground(Color.decode("#2e2e2e"));
//         uploadButton.setForeground(Color.decode("#D9D9D9"));
//         uploadButton.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 24));
//         uploadButton.setBorder(new RoundedBorder(
//                 4, Color.decode("#979797"), 1));
//         uploadButton.setFocusPainted(false);
 
//         OnClickEventHelper.setOnClickColor(
//                 uploadButton,
//                 Color.decode("#232323"),
//                 Color.decode("#2e2e2e"));
 
//         panel.add(uploadButton);
 
 
//         // =========================
//         // MY CLAIMS
//         // =========================
 
//         JButton claimsButton = new JButton("My Claims");
//         claimsButton.setBounds(100, 375, 240, 55);
//         claimsButton.setBackground(Color.decode("#2e2e2e"));
//         claimsButton.setForeground(Color.decode("#D9D9D9"));
//         claimsButton.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 24));
//         claimsButton.setBorder(new RoundedBorder(
//                 4, Color.decode("#979797"), 1));
//         claimsButton.setFocusPainted(false);
 
//         OnClickEventHelper.setOnClickColor(
//                 claimsButton,
//                 Color.decode("#232323"),
//                 Color.decode("#2e2e2e"));
 
//         panel.add(claimsButton);
 
 
//         // =========================
//         // RECENT ITEMS
//         // =========================
 
//         JLabel recentItems = new JLabel("Recent Items");
//         recentItems.setBounds(460, 105, 250, 40);
//         recentItems.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 28));
//         recentItems.setForeground(Color.decode("#D9D9D9"));
//         panel.add(recentItems);
 
 
//         // =========================
//         // ITEM 1
//         // =========================
 
//         JLabel item1 = new JLabel(
//                 "<html>" +
//                 "<b>Black Wallet</b><br>" +
//                 "Category: Wallet<br>" +
//                 "Location: Library<br>" +
//                 "Status: Lost" +
//                 "</html>"
//         );
 
//         item1.setBounds(460, 160, 280, 120);
//         item1.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 20));
//         item1.setForeground(Color.decode("#D9D9D9"));
//         panel.add(item1);
 
 
//         JButton viewButton1 = new JButton("View");
//         viewButton1.setBounds(760, 175, 105, 45);
//         viewButton1.setBackground(Color.decode("#2e2e2e"));
//         viewButton1.setForeground(Color.decode("#D9D9D9"));
//         viewButton1.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 20));
//         viewButton1.setBorder(new RoundedBorder(
//                 4, Color.decode("#979797"), 1));
//         viewButton1.setFocusPainted(false);
 
//         OnClickEventHelper.setOnClickColor(
//                 viewButton1,
//                 Color.decode("#232323"),
//                 Color.decode("#2e2e2e"));
 
//         panel.add(viewButton1);
 
 
//         JButton claimButton1 = new JButton("Claim");
//         claimButton1.setBounds(880, 175, 105, 45);
//         claimButton1.setBackground(Color.decode("#2e2e2e"));
//         claimButton1.setForeground(Color.decode("#D9D9D9"));
//         claimButton1.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 20));
//         claimButton1.setBorder(new RoundedBorder(
//                 4, Color.decode("#979797"), 1));
//         claimButton1.setFocusPainted(false);
 
//         OnClickEventHelper.setOnClickColor(
//                 claimButton1,
//                 Color.decode("#232323"),
//                 Color.decode("#2e2e2e"));
 
//         panel.add(claimButton1);
 
 
//         // =========================
//         // ITEM 2
//         // =========================
 
//         JLabel item2 = new JLabel(
//                 "<html>" +
//                 "<b>Blue Umbrella</b><br>" +
//                 "Category: Umbrella<br>" +
//                 "Location: Room 204<br>" +
//                 "Status: Found" +
//                 "</html>"
//         );
 
//         item2.setBounds(460, 305, 280, 120);
//         item2.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 20));
//         item2.setForeground(Color.decode("#D9D9D9"));
//         panel.add(item2);
 
 
//         JButton viewButton2 = new JButton("View");
//         viewButton2.setBounds(760, 320, 105, 45);
//         viewButton2.setBackground(Color.decode("#2e2e2e"));
//         viewButton2.setForeground(Color.decode("#D9D9D9"));
//         viewButton2.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 20));
//         viewButton2.setBorder(new RoundedBorder(
//                 4, Color.decode("#979797"), 1));
//         viewButton2.setFocusPainted(false);
 
//         OnClickEventHelper.setOnClickColor(
//                 viewButton2,
//                 Color.decode("#232323"),
//                 Color.decode("#2e2e2e"));
 
//         panel.add(viewButton2);
 
 
//         JButton claimButton2 = new JButton("Claim");
//         claimButton2.setBounds(880, 320, 105, 45);
//         claimButton2.setBackground(Color.decode("#2e2e2e"));
//         claimButton2.setForeground(Color.decode("#D9D9D9"));
//         claimButton2.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 20));
//         claimButton2.setBorder(new RoundedBorder(
//                 4, Color.decode("#979797"), 1));
//         claimButton2.setFocusPainted(false);
 
//         OnClickEventHelper.setOnClickColor(
//                 claimButton2,
//                 Color.decode("#232323"),
//                 Color.decode("#2e2e2e"));
 
//         panel.add(claimButton2);
 
 
//         // =========================
//         // INFORMATION
//         // =========================
 
//         JLabel info = new JLabel(
//                 "<html>" +
//                 "Find lost items.<br>" +
//                 "Report items you've found.<br>" +
//                 "Submit a claim." +
//                 "</html>"
//         );
 
//         info.setBounds(880, 420, 250, 100);
//         info.setFont(CustomFontLoader.loadFont(
//                 "./resources/fonts/Lato.ttf", 22));
//         info.setForeground(Color.decode("#D9D9D9"));
//         panel.add(info);
 
 
//         // =========================
//         // BUTTON ACTIONS
//         // =========================
 
//         browseButton.addActionListener(e -> {
//             JOptionPane.showMessageDialog(
//                     frame,
//                     "Browse Lost & Found Items"
//             );
//         });
 
 
//         searchButton.addActionListener(e -> {
 
//             String search = JOptionPane.showInputDialog(
//                     frame,
//                     "Enter item to search:"
//             );
 
//             if (search != null && !search.isEmpty()) {
//                 JOptionPane.showMessageDialog(
//                         frame,
//                         "Searching for: " + search
//                 );
//             }
//         });
 
 
//         uploadButton.addActionListener(e -> {
 
//             JOptionPane.showMessageDialog(
//                     frame,
//                     "Upload Item"
//             );
//         });
 
 
//         claimsButton.addActionListener(e -> {
 
//             JOptionPane.showMessageDialog(
//                     frame,
//                     "My Claims"
//             );
//         });
 
 
//         viewButton1.addActionListener(e -> {
 
//             JOptionPane.showMessageDialog(
//                     frame,
//                     "Black Wallet\n\n" +
//                     "Category: Wallet\n" +
//                     "Location: Library\n" +
//                     "Status: Lost"
//             );
//         });
 
 
//         claimButton1.addActionListener(e -> {
 
//             JOptionPane.showMessageDialog(
//                     frame,
//                     "Claim request submitted for Black Wallet."
//             );
//         });
 
 
//         viewButton2.addActionListener(e -> {
 
//             JOptionPane.showMessageDialog(
//                     frame,
//                     "Blue Umbrella\n\n" +
//                     "Category: Umbrella\n" +
//                     "Location: Room 204\n" +
//                     "Status: Found"
//             );
//         });
 
 
//         claimButton2.addActionListener(e -> {
 
//             JOptionPane.showMessageDialog(
//                     frame,
//                     "Claim request submitted for Blue Umbrella."
//             );
//         });
 
 
//         // =========================
//         // SHOW WINDOW
//         // =========================
//           frame.add(panel);
//         frame.setLocationRelativeTo(null);
//         frame.setVisible(true);
//     }
// }