/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.text.StyleConstants;

/**
 *
 * @author Hong Xuan
 */
public class GUI_BroadGame {

    JFrame jf_broadgame;
    JPanel Jp_BroadGame;
    JButton[][] buttonPanel;
    JButton btn_Optopn1;//8x8
    JButton btn_Optopn2;
    JButton btn_Optopn3;
    JButton btn_quit;
    int status =0;
    public GUI_BroadGame() {
        jf_broadgame = new JFrame("Broad Game");
        jf_broadgame.setVisible(true);
        jf_broadgame.setBounds(200, 20, 1080, 800);
        jf_broadgame.setLayout(null);
        Container c = jf_broadgame.getContentPane();
        c.setBackground(Color.DARK_GRAY); 
        jf_broadgame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        jf_broadgame.add(this.createbroad(10));
        this.createbroad(8);
        this.createOption();
    }

    public void createbroad(int n) {
        this.Jp_BroadGame = new JPanel();
        this.Jp_BroadGame.removeAll();
        
        this.Jp_BroadGame.setLayout(new GridLayout(n, n));
        this.Jp_BroadGame.setSize(new Dimension(600, 600));
        this.buttonPanel = new JButton[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                final JButton jb = new JButton();
                this.buttonPanel[i][j] = new JButton();
                jb.setBackground(Color.WHITE);
                jb.setPreferredSize(new Dimension(100, 100));
                jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jb.setBackground(Color.RED);
                    }

                });
                this.buttonPanel[i][j] = jb;
//				button[i][j].addActionListener(new HitAndMissController(i, j));
                this.Jp_BroadGame.add(this.buttonPanel[i][j]);
            }
        }
        this.Jp_BroadGame.setLocation(20, 20);
        this.jf_broadgame.add(this.Jp_BroadGame);
//        return this.Jp_BroadGame;
    }
    
    public void createOption() {
        
        btn_Optopn1 = new JButton("8 x 8");
        btn_Optopn1.setBounds(800, 300, 160, 60);
        jf_broadgame.add(btn_Optopn1);
        btn_Optopn1.setBackground(new Color( 173, 216, 230));
        btn_Optopn1.setForeground(new Color(25, 25, 112));
        JPanel jb_op1 = new JPanel();
        btn_Optopn1.addActionListener((ActionEvent e) -> {
            Jp_BroadGame.setVisible(false);
           this.createbroad(8);
           status = 0;
        });
        
        btn_Optopn2 = new JButton("10 x 10");
        btn_Optopn2.setBounds(800, 400, 160, 60);
        jf_broadgame.add(btn_Optopn2);
        btn_Optopn2.setBackground(new Color( 173, 216, 230));
        btn_Optopn2.setForeground(new Color(25, 25, 112));
        btn_Optopn2.addActionListener((ActionEvent e) -> {
            Jp_BroadGame.setVisible(false);
           this.createbroad(10);
           status = 1;
        });
        
        btn_Optopn3 = new JButton("12 x 12");
        btn_Optopn3.setBounds(800, 500, 160, 60);
        jf_broadgame.add(btn_Optopn3);
        btn_Optopn3.setBackground(new Color( 173, 216, 230));
        btn_Optopn3.setForeground(new Color(25, 25, 112));
        btn_Optopn3.addActionListener((ActionEvent e) -> {
            Jp_BroadGame.setVisible(false);
           this.createbroad(12);
           status = 2;
        });
        
        btn_quit = new JButton("QUIT");
        btn_quit.setBounds(800, 600, 160, 60);
        jf_broadgame.add(btn_quit);
        btn_quit.setBackground(new Color( 173, 216, 230));
        btn_quit.setForeground(new Color(25, 25, 112));
        btn_quit.addActionListener((ActionEvent e) -> {
           System.exit(0);
        });
    }
    public void createShip()
    {
        if(status ==0)
        {
            
        }
        else if(status == 1)
        {
            
        }
        else if(status == 2)
        {
            
        }
    }
    public static void main(String[] args) {
        GUI_BroadGame a = new GUI_BroadGame();
    }
}
