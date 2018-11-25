/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import model.House;

/**
 *
 * @author Dat Ngo
 */
public class IsLandUI extends JFrame{
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btnWaveAttack ,btnFast;
    JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, txt17, txtfast;
    JLabel lblIsLand;
    public static JButton currentButton;
    public static House currentHouse;
    public static JTextField currentTextField;
    public HouseInfoUI houseInfoUI;
    public static House[] house;
    public static House myHouse;
    public static BattleFieldFightingUI bffUI;   
    public static int fast;
    
    public IsLandUI(String title, int fast){
        super(title);
        IsLandUI.fast = fast;
        house = new House[18];
        currentHouse = new House();
        currentButton = new JButton();
        for(int i=1; i<18; i++){
            house[i] = new House();
            house[i].setName("Ikariam"+i);
            house[i].setId(i);
        }
            
        houseInfoUI = new HouseInfoUI();
        addControls();
        addEvents();
    }
    
    public void addControls(){
        Container con = getContentPane();
        
        JPanel pnMain = new JPanel();
        JPanel pnWave = new JPanel();
        pnMain.setLayout(null);
        con.add(pnMain);
        
        btn1 = new MyJButtonFlag();
        btn1.setBounds(195, 245, 80, 70);
        txt1 = new JTextField();
        txt1.setBounds(195, 315, 80, 15);
        txt1.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt1.setHorizontalAlignment(JTextField.CENTER);
        txt1.setEditable(false);
        txt1.setVisible(false);
        pnMain.add(btn1);
        pnMain.add(txt1);
        
        btn2 = new MyJButtonFlag();
        btn2.setBounds(310, 260, 80 ,70);
        txt2 = new JTextField();
        txt2.setBounds(310, 320, 80, 15);
        txt2.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt2.setHorizontalAlignment(JTextField.CENTER);
        txt2.setEditable(false);
        txt2.setVisible(false);
        pnMain.add(txt2);
        pnMain.add(btn2);
        
        btn3 = new MyJButtonFlag();
        btn3.setBounds(410, 220, 80 ,70);
        txt3 = new JTextField();
        txt3.setBounds(410, 290, 80, 15);
        txt3.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt3.setHorizontalAlignment(JTextField.CENTER);
        txt3.setEditable(false);
        txt3.setVisible(false);
        pnMain.add(txt3);
        pnMain.add(btn3);
        
        btn4 = new MyJButtonFlag();
        btn4.setBounds(520, 135, 80 ,70);
        txt4 = new JTextField();
        txt4.setBounds(520, 208, 80, 15);
        txt4.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt4.setHorizontalAlignment(JTextField.CENTER);
        txt4.setEditable(false);
        txt4.setVisible(false);
        pnMain.add(txt4);
        pnMain.add(btn4);
        
        btn5 = new MyJButtonFlag();
        btn5.setBounds(880, 175, 80 ,70);
        txt5 = new JTextField();
        txt5.setBounds(880, 245, 80, 15);
        txt5.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt5.setHorizontalAlignment(JTextField.CENTER);
        txt5.setEditable(false);
        txt5.setVisible(false);
        pnMain.add(txt5);
        pnMain.add(btn5);
        
        btn6 = new MyJButtonFlag();
        btn6.setBounds(750, 125, 80 ,70);
        txt6 = new JTextField();
        txt6.setBounds(750, 195, 80, 15);
        txt6.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt6.setHorizontalAlignment(JTextField.CENTER);
        txt6.setEditable(false);
        txt6.setVisible(false);
        pnMain.add(txt6);
        pnMain.add(btn6);
        
        btn7 = new MyJButtonFlag();
        btn7.setBounds(145, 350, 80 ,70);
        txt7 = new JTextField();
        txt7.setBounds(145, 420, 80, 15);
        txt7.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt7.setHorizontalAlignment(JTextField.CENTER);
        txt7.setEditable(false);
        txt7.setVisible(false);
        pnMain.add(txt7);
        pnMain.add(btn7);
        
        btn8 = new MyJButtonFlag();
        btn8.setBounds(125, 500, 80 ,70);
        txt8 = new JTextField();
        txt8.setBounds(125, 570, 80, 15);
        txt8.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt8.setHorizontalAlignment(JTextField.CENTER);
        txt8.setEditable(false);
        txt8.setVisible(false);
        pnMain.add(txt8);
        pnMain.add(btn8);
        
        btn9 = new MyJButtonFlag();
        btn9.setBounds(365, 555, 80 ,70);
        txt9 = new JTextField();
        txt9.setBounds(365, 525, 80, 15);
        txt9.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt9.setHorizontalAlignment(JTextField.CENTER);
        txt9.setEditable(false);
        txt9.setVisible(false);
        pnMain.add(txt9);
        pnMain.add(btn9);
        
        btn10 = new MyJButtonFlag();
        btn10.setBounds(245, 580, 80 ,70);
        txt10 = new JTextField();
        txt10.setBounds(245, 650, 80, 15);
        txt10.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt10.setHorizontalAlignment(JTextField.CENTER);
        txt10.setEditable(false);
        txt10.setVisible(false);
        pnMain.add(txt10);
        pnMain.add(btn10);
        
        btn11 = new MyJButtonFlag();
        btn11.setBounds(450, 650, 80 ,70);
        txt11 = new JTextField();
        txt11.setBounds(450, 720, 80, 15);
        txt11.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt11.setHorizontalAlignment(JTextField.CENTER);
        txt11.setEditable(false);
        txt11.setVisible(false);
        pnMain.add(txt11);
        pnMain.add(btn11);
        
        btn12 = new MyJButtonFlag();
        btn12.setBounds(690, 600, 80 ,70);
        txt12 = new JTextField();
        txt12.setBounds(690, 670, 80, 15);
        txt12.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt12.setHorizontalAlignment(JTextField.CENTER);
        txt12.setEditable(false);
        txt12.setVisible(false);
        pnMain.add(txt12);
        pnMain.add(btn12);
        
        btn13 = new MyJButtonFlag();
        btn13.setBounds(820, 560, 80 ,70);
        txt13 = new JTextField();
        txt13.setBounds(820, 630, 80, 15);
        txt13.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt13.setHorizontalAlignment(JTextField.CENTER);
        txt13.setEditable(false);
        txt13.setVisible(false);
        pnMain.add(txt13);
        pnMain.add(btn13);
        
        btn14 = new MyJButtonFlag();
        btn14.setBounds(955, 520, 80 ,80);
        txt14 = new JTextField();
        txt14.setBounds(955, 590, 80, 15);
        txt14.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt14.setHorizontalAlignment(JTextField.CENTER);
        txt14.setEditable(false);
        txt14.setVisible(false);
        pnMain.add(txt14);
        pnMain.add(btn14);
        
        btn15 = new MyJButtonFlag();
        btn15.setBounds(955, 380, 80 ,80);
        txt15 = new JTextField();
        txt15.setBounds(955, 450, 80, 15);
        txt15.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt15.setHorizontalAlignment(JTextField.CENTER);
        txt15.setEditable(false);
        txt15.setVisible(false);
        pnMain.add(txt15);
        pnMain.add(btn15);
        
        btn16 = new MyJButtonFlag();
        btn16.setBounds(805, 295, 80 ,70);
        txt16 = new JTextField();
        txt16.setBounds(805, 365, 80, 15);
        txt16.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt16.setHorizontalAlignment(JTextField.CENTER);
        txt16.setEditable(false);
        txt16.setVisible(false);
        pnMain.add(txt16);
        pnMain.add(btn16);
        
        btn17 = new MyJButtonFlag();
        btn17.setBounds(630, 295, 80 ,70);
        txt17 = new JTextField();
        txt17.setBounds(630, 365, 80, 15);
        txt17.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        txt17.setHorizontalAlignment(JTextField.CENTER);
        txt17.setEditable(false);
        txt17.setVisible(false);
        pnMain.add(txt17);
        pnMain.add(btn17);
        

        btnWaveAttack = new JButton("");
        btnWaveAttack.setBounds(980, 40, 70, 100);
        btnWaveAttack.setOpaque(false);
        btnWaveAttack.setContentAreaFilled(false);
        btnWaveAttack.setBorder(null);
        
        btnFast = new JButton();
        btnFast.setBounds(0, 10, 60, 60);
        btnFast.setIcon(new ImageIcon(getClass().getResource("/image/fast.png")));
        
        txtfast = new JTextField();
        txtfast.setBounds(0, 70, 60,30);
        txtfast.setEditable(false);
        txtfast.setHorizontalAlignment(JTextField.CENTER);
        pnMain.add( txtfast);
        pnMain.add(btnFast);
        pnMain.add(btnWaveAttack);
        
        pnMain.add(pnWave);
        lblIsLand = new JLabel();
        lblIsLand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/island.jpg")));
        pnMain.add(lblIsLand);
        lblIsLand.setBounds(0, 10, 1200, 800);
        
    }
    
    public void addEvents(){
        btnWaveAttack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(myHouse!=null)
                    new WaveAttackUI("WaveAttack", myHouse.getSentRealArmy(), myHouse.getSendingArmy()).setVisible(true);
            }
        });
        
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[1];
                currentButton = btn1;
                currentTextField = txt1;
                houseInfoUI.showWindow();
            }
        });
        
        
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[2];
                currentButton = btn2;
                currentTextField = txt2;
                houseInfoUI.showWindow();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[3];
                currentButton = btn3;
                currentTextField = txt3;
                houseInfoUI.showWindow();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[4];
                currentButton = btn4;
                currentTextField = txt4;
                houseInfoUI.showWindow();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[5];
                currentButton = btn5;
                currentTextField = txt5;
                houseInfoUI.showWindow();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[6];
                currentButton = btn6;
                currentTextField = txt6;
                houseInfoUI.showWindow();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[7];
                currentButton = btn7;
                currentTextField = txt7;
                houseInfoUI.showWindow();
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[8];
                currentButton = btn8;
                currentTextField = txt8;
                houseInfoUI.showWindow();
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[9];
                currentButton = btn9;
                currentTextField = txt9;
                houseInfoUI.showWindow();
            }
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[10];
                currentButton = btn10;
                currentTextField = txt10;
                houseInfoUI.showWindow();
            }
        });
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[11];
                currentButton = btn11;
                currentTextField = txt11;
                houseInfoUI.showWindow();
            }
        });
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[12];
                currentButton = btn12;
                currentTextField = txt12;
                houseInfoUI.showWindow();
            }
        });
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[13];
                currentButton = btn13;
                currentTextField = txt13;
                houseInfoUI.showWindow();
            }
        });
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[14];
                currentButton = btn14;
                currentTextField = txt14;
                houseInfoUI.showWindow();
            }
        });
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[15];
                currentButton = btn15;
                currentTextField = txt15;
                houseInfoUI.showWindow();
            }
        });
        btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[16];
                currentButton = btn16;
                currentTextField = txt16;
                houseInfoUI.showWindow();
            }
        });
        btn17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[17];
                currentButton = btn17;
                currentTextField = txt17;
                houseInfoUI.showWindow();
            }
        });
        this.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
   
            	
                 	txtfast.setText("X"+fast);
               
           
        }});
        btnFast.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				FastForward fast = new FastForward();
				dispose();
				fast.showWindow();
				
			}
		});
    }
    
    public void showWindow(){
        setSize(1200, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

	         
}
