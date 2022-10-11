/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author Hong Xuan
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public final class MainMenu {

    JFrame Jfmain = new JFrame("Battle Ship");
    JLabel logo;
    JButton btn_Playgame;
    JButton btn_CloseGame;
    
    private InetAddress host;
    private int port;
   
    public MainMenu() {
        this.initcomponent();
        
        
    }
    public void initcomponent()
    {
        Jfmain.setVisible(true);
        Jfmain.setSize(500, 350);
        Jfmain.setLocation(600, 0);
        Jfmain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Jfmain.setLayout(null);
        Jfmain.setBackground(Color.DARK_GRAY);
        this.createComponent();
    }
    public void createClient()
    {
        try {
            Client client = new Client(InetAddress.getLocalHost(), 5432);
             String name;
            do{
                name = JOptionPane.showInputDialog("What's your name?");
                
                client.name = name;
                System.out.println(name);
                
            }
            while(name == null || name.isEmpty() || name.isBlank());
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void createComponent() {
        //create layout
        ImageIcon iconlogo = new ImageIcon("image\\logo_image.jpg");
        logo = new JLabel("", iconlogo, JLabel.CENTER);
        logo.setSize(500, 350);
        logo.setLocation(0, 0);
        this.Jfmain.add(this.logo);
        //create button PlayGame
        this.btn_Playgame = new JButton("Play Game");
        this.btn_Playgame.setBounds(200, 150,100, 40);
        this.btn_Playgame.setVisible(true);
        this.Jfmain.add(this.btn_Playgame);
        btn_Playgame.setBackground(new Color( 173, 216, 230));
        btn_Playgame.setForeground(new Color(25, 25, 112));
        btn_Playgame.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               createClient();
               GUI_BroadGame a = new GUI_BroadGame();
            }
            
        });
        //create button Quit Game
        this.btn_CloseGame = new JButton("Quit");
        this.btn_CloseGame.setBounds(200,200, 100, 40);
        btn_CloseGame.setBackground(new Color( 173, 216, 230));
        btn_CloseGame.setForeground(new Color(25, 25, 112));
        this.Jfmain.add(this.btn_CloseGame);
        btn_CloseGame.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            
        });
        
    }

    public static void main(String[] args) {
        MainMenu a = new MainMenu();
    }
}
