package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javafx.scene.AmbientLight;
import model.Army;
import model.BattleField;
import model.BattleFieldFighting;
import model.RealArmy;
import model.Wall;

/**
*
* @author TranVien
*/

public class ForgeUI extends JDialog {
	 JPanel pnMain, pnTitle,pnAttack,pnDefense;
	 JLabel lblImgTitle, lblTitle, lblAttack,lblDefense;
	 JComboBox<String> forgeLevel;
	 JButton btnDispose, btnOK;
     String[] comboNum = {"0","1","2","3","4","5"};
	 public ForgeUI() {
	      addControls();
	      addEvents();
	      // khi xet su kien thi xoa di
//	     setSize(600,300);
//        setLocationRelativeTo(null);
//          setModal(true);
//          setVisible(true);
	    }
	 public void addControls(){
		 Container con = getContentPane();
	     con.setLayout(null);
	     lblImgTitle = new JLabel();
	     lblImgTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/forge.PNG")));
	     lblImgTitle.setBounds(70, 0, 60, 60);
	     con.add(lblImgTitle);
	     
	     pnMain = new JPanel(null);
	     pnMain.setBounds(0, 20, 600, 300);
	     pnMain.setBackground(new Color(253, 247, 221));
	     
	     pnTitle = new JPanel(null);
	     pnTitle.setBounds(0, 0, 600, 20);
	     pnTitle.setBackground(new Color(215, 172, 116));
	     con.add(pnTitle);
	     lblTitle = new JLabel("Hephaistos' Forge");
	     lblTitle.setBounds(250, 0, 125, 15);
	     pnTitle.add(lblTitle);
	     btnDispose = new JButton(new ImageIcon(getClass().getResource("/Image/xButton.PNG")));
	     btnDispose.setBounds(580, 0, 20, 20);
	     pnTitle.add(btnDispose);
	    
	   
	     pnAttack = new JPanel(null);
	     pnAttack.setBounds(0, 50, 600, 50);
	     pnAttack.setBackground(new Color(251, 232, 193));
	     pnMain.add(pnAttack);
	     lblAttack = new JLabel("Level");
	     lblAttack.setBounds(50, 15, 90, 20);
	     pnAttack.add(lblAttack);
	     forgeLevel = new JComboBox<String>(comboNum);
	     forgeLevel.setBounds(200, 15, 200, 20);
	     forgeLevel.setBounds(200, 15, 200, 20);
	     pnAttack.add(forgeLevel);
	     	     
	     btnOK = new JButton("OK");
	     btnOK.setBounds(250, 210, 110, 30);
	     btnOK.setBackground(new Color(248, 222, 164));
	     pnMain.add(btnOK);
	     
	     con.add(pnMain);
	     
	 }
	 public void addEvents(){
		  this.addComponentListener(new ComponentAdapter() {
	            public void componentShown(ComponentEvent evt) {
	            
	                forgeLevel.setSelectedIndex(IsLandUI.currentHouse.getLevelForge());
	            }
	        });
		 
		  btnOK.addActionListener(new ActionListener() {
                 
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	int damage = 100;
	            	int armour = 0;
	            	int level = 0;
	                String fg = forgeLevel.getSelectedItem().toString();
	            	 if(fg == "0") {
	            		
	            		 damage = 100;
	            		 armour = 0;
	            		 level = 0;
	            	 }
	            	 else if(fg == "1")
	            	 {
	            		
	            		 damage = 110;
	            	     armour = 0;
	            	     level = 1;
	            	 }
	            	 else if(fg == "2")
	            	 {
	            		
	            		 damage = 110;
	            		 armour = 1;
	            		 level = 2;
	            		 
	            	 }
	            	 else if(fg == "3")
	            	 {
	            		
	            		 damage = 115;
	            		 armour = 1;
	            		 level = 3;
	            	 }
	                 else if(fg == "4")
	                 {
	            	
	            		 damage = 115;
	            		 armour = 2;
	            		 level = 4;
	            	 }
	            	 else 
	            	 {
	            	
	            		 damage = 120;
	            		 armour = 2;
	            		 level = 5;
	            	 }
	            	 IsLandUI.currentHouse.getArmy().setDamageForge(damage);
	            	 IsLandUI.currentHouse.getArmy().setArmourForge(armour);
//	            	 System.out.println("test" +IsLandUI.currentHouse.getArmy().getDamageForge());
	            	 IsLandUI.currentHouse.setLevelForge(level);
	            	 if(IsLandUI.currentHouse.getLevelForge() != 0) {
	            		 IsLandUI.currentHouse.getArmy().setStartTime(System.currentTimeMillis());
	            		 IsLandUI.currentHouse.getArmy().setFinishTime(IsLandUI.currentHouse.getArmy().getStartTime()+IsLandUI.currentHouse.getArmy().getTimeForge(IsLandUI.fast));
	            	 }
	            	 dispose();
	                 IsLandUI.bffUI = new BattleFieldFightingUI(IsLandUI.currentHouse.getBattleFieldFighting());
	                    IsLandUI.bffUI.dispose();
	            	 HouseInfoUI house = new HouseInfoUI();
	            	 house.dispose();
	            }
	        });
		  btnDispose.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                dispose();
	            }
	        });
	 }
	 // hiển thị
	 public void showWindow() {
	        this.setSize(600,300);
	        setUndecorated(true);
	        this.setBackground(new Color(0, 0, 0, 0));
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	   	    this.setLocationRelativeTo(null);
	        this.setModal(true);
	        this.setVisible(true);
	    }

//	  public static void main(String args[]) {
//	
//	                new ForgeUI();
//	      
//	    }
	
	
}