package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
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
import javax.swing.JFrame;
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
*
* @author TranVien
*/

public class BattleInformationUI extends JDialog {

	 JPanel pnMain, pnTitle,pnAttack,pnDefense,pnContent1, pnContent2, pnContent3;
	 
	 JLabel lblImgTitle, lblTitle, lblAttack,lblDefense;
	 JLabel lblAttack1, lblDefence1;
	 JLabel lblImg1, lblAttackInfo1, lblDefenceInfo1;
	 JLabel lblImg2, lblAttackInfo2, lblDefenceInfo2;
	 JLabel lblImg3, lblAttackInfo3, lblDefenceInfo3;
	 JLabel lblImg4, lblAttackInfo4, lblDefenceInfo4;
	 JLabel lblAttack2, lblDefence2;
	 JLabel lblImg5, lblAttackInfo5, lblDefenceInfo5;
	 JLabel lblImg6, lblAttackInfo6, lblDefenceInfo6;
	 JLabel lblImg7, lblAttackInfo7, lblDefenceInfo7;
	 JLabel lblImg8, lblAttackInfo8, lblDefenceInfo8;
	 JLabel lblAttack3, lblDefence3;
	 JLabel lblImg9, lblAttackInfo9, lblDefenceInfo9;
	 JLabel lblImg10, lblAttackInfo10, lblDefenceInfo10;
	 JLabel lblImg11, lblAttackInfo11, lblDefenceInfo11;
	 JLabel lblImg12, lblAttackInfo12, lblDefenceInfo12;
	 JButton btnDispose, btnOK;	 
	
	 private int id1,id2;
	 public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public int getId2() {
		return id2;
	}
	public void setId2(int id2) {
		this.id2 = id2;
	}
	public void myHouse()
	{
		for(int i=1;i<18;i++)
			if(IsLandUI.house[i].getTypeOfHouse()==0) {
//				System.out.println("myh"+i);
				setId1(i);
			}
	}
	public void defenceHouse()
	{
		for(int i=1;i<18;i++)
			if(IsLandUI.house[i].getTypeOfHouse()==2) {
//				System.out.println("myh"+IsLandUI.house[i].getTypeOfHouse());
				setId2(i);
			}
	}
	public BattleInformationUI() {
		  myHouse();
		  defenceHouse();
	      addControls();
	      addEvents();
	      // khi xet su kien thi xoa di
//	     setSize(800,530);
//        setLocationRelativeTo(null);
//          setModal(true);
//          setVisible(true);
	    }
	 public void addControls(){
		 Container con = getContentPane();
//		 con.setLayout(null);
		 int[] aliveAtt = IsLandUI.house[getId1()].getArmy().getNumberAliveAtt();
		 int[] deathAtt = IsLandUI.house[getId1()].getArmy().getNumberDeathArmyAtt();
		 int[] aliveDef = IsLandUI.house[getId2()].getArmy().getNumberAliveAtt();
		 int[] deathDef = IsLandUI.house[getId2()].getArmy().getNumberDeathArmyAtt();
	     pnMain = new JPanel(null);
	     pnMain.setBounds(0, 20, 800, 500);
	     pnMain.setBackground(new Color(251,232,193));
	     
	     pnTitle = new JPanel(null);
	     pnTitle.setBounds(0, 0, 800, 20);
	     pnTitle.setBackground(new Color(215, 172, 116));
	     con.add(pnTitle);
	     lblTitle = new JLabel("BattleInformation");
	     lblTitle.setBounds(338, 0, 125, 15);
	     pnTitle.add(lblTitle);
	     btnDispose = new JButton(new ImageIcon(getClass().getResource("/Image/xButton.PNG")));
	     btnDispose.setBounds(770, 0, 20, 20);
	     pnTitle.add(btnDispose);
	    
	     pnContent1 = new JPanel(null);
	     pnContent1.setBounds(0, 30, 800, 135);
	     pnContent1.setBackground(new Color(248,222,164));
	     
	     lblAttack1 = new JLabel();
	     lblAttack1.setBounds(0, 91, 160, 15);  
	     lblAttack1.setText("Attack");
	     lblAttack1.setHorizontalAlignment(JLabel.CENTER);
	     pnContent1.add(lblAttack1);
	     
	     lblDefence1 = new JLabel();
	     lblDefence1.setBounds(0, 110, 160, 15);
	     lblDefence1.setText("Defence");
	     lblDefence1.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent1.add( lblDefence1);
	     //
	     
	     lblImg1 = new JLabel();
	     lblImg1.setIcon(new ImageIcon(getClass().getResource("/Image/Archer.png/")));
	     lblImg1.setBounds(160, 20, 160, 70);  
	     lblImg1.setHorizontalAlignment(JLabel.CENTER);
	     pnContent1.add(lblImg1);
	    
	     lblAttackInfo1 = new JLabel();
	     lblAttackInfo1.setBounds(160, 91, 160, 15);  
	     lblAttackInfo1.setText(aliveAtt[0]+"(-"+deathAtt[0]+")");
	     lblAttackInfo1.setHorizontalAlignment(JLabel.CENTER);
	     pnContent1.add(lblAttackInfo1);
	     
	     lblDefenceInfo1 = new JLabel();
	     lblDefenceInfo1.setBounds(160, 110, 160, 15);
	     lblDefenceInfo1.setText(aliveDef[0]+"(-"+deathDef[0]+")");
	     lblDefenceInfo1.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent1.add( lblDefenceInfo1);
	     //
	     //
	     lblImg2 = new JLabel();
	     lblImg2.setIcon(new ImageIcon(getClass().getResource("/Image/Balloon.png/")));
	     lblImg2.setBounds(320, 20, 160, 70);  
	     lblImg2.setHorizontalAlignment(JLabel.CENTER);
	     pnContent1.add(lblImg2);
	    
	     lblAttackInfo2 = new JLabel();
	     lblAttackInfo2.setBounds(320, 91, 160, 15);  
	     lblAttackInfo2.setText(aliveAtt[1]+"(-"+deathAtt[1]+")");
	     lblAttackInfo2.setHorizontalAlignment(JLabel.CENTER);
	     pnContent1.add(lblAttackInfo2);
	     
	     lblDefenceInfo2 = new JLabel();
	     lblDefenceInfo2.setBounds(320, 110, 160, 15);
	     lblDefenceInfo2.setText(aliveDef[1]+"(-"+deathDef[1]+")");
	     lblDefenceInfo2.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent1.add( lblDefenceInfo2);
	     //
	     //
	     lblImg3 = new JLabel();
	     lblImg3.setIcon(new ImageIcon(getClass().getResource("/Image/Catapult.png/")));
	     lblImg3.setBounds(480, 20, 160, 70);  
	     lblImg3.setHorizontalAlignment(JLabel.CENTER);
	     pnContent1.add(lblImg3);
	    
	     lblAttackInfo3 = new JLabel();
	     lblAttackInfo3.setBounds(480, 91, 160, 15);  
	     lblAttackInfo3.setText(aliveAtt[2]+"(-"+deathAtt[2]+")");
	     lblAttackInfo3.setHorizontalAlignment(JLabel.CENTER);
	     pnContent1.add(lblAttackInfo3);
	     
	     lblDefenceInfo3 = new JLabel();
	     lblDefenceInfo3.setBounds(480, 110, 160, 15);
	     lblDefenceInfo3.setText(aliveDef[2]+"(-"+deathDef[2]+")");
	     lblDefenceInfo3.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent1.add( lblDefenceInfo3);
	     //
	     //
	     lblImg4 = new JLabel();
	     lblImg4.setIcon(new ImageIcon(getClass().getResource("/Image/Gyrocopter.png/")));
	     lblImg4.setBounds(640, 20, 160, 70);  
	     lblImg4.setHorizontalAlignment(JLabel.CENTER);
	     pnContent1.add(lblImg4);
	    
	     lblAttackInfo4 = new JLabel();
	     lblAttackInfo4.setBounds(640, 91, 160, 15);  
	     lblAttackInfo4.setText(aliveAtt[3]+"(-"+deathAtt[3]+")");
	     lblAttackInfo4.setHorizontalAlignment(JLabel.CENTER);
	     pnContent1.add(lblAttackInfo4);
	     
	     lblDefenceInfo4 = new JLabel();
	     lblDefenceInfo4.setBounds(640, 110, 160, 15);
	     lblDefenceInfo4.setText(aliveDef[3]+"(-"+deathDef[3]+")");
	     lblDefenceInfo4.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent1.add( lblDefenceInfo4);
	     //
	     pnMain.add(pnContent1);
	   // 2-----------------------------------
	     pnContent2 = new JPanel(null);
	     pnContent2.setBounds(0, 175, 800, 135);
	     pnContent2.setBackground(new Color(248,222,164));
	     pnMain.add(pnContent2);
	     lblAttack2 = new JLabel();
	     lblAttack2.setBounds(0, 91, 160, 15);  
	     lblAttack2.setText("Attack");
	     lblAttack2.setHorizontalAlignment(JLabel.CENTER);
	     pnContent2.add(lblAttack2);
	     lblDefence2 = new JLabel();
	     lblDefence2.setBounds(0, 110, 160, 15);
	     lblDefence2.setText("Defence");
	     lblDefence2.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent2.add( lblDefence2);
	     //
	     
	     lblImg5 = new JLabel();
	     lblImg5.setIcon(new ImageIcon(getClass().getResource("/Image/Hoplite.png/")));
	     lblImg5.setBounds(160, 20, 160, 70);  
	     lblImg5.setHorizontalAlignment(JLabel.CENTER);
	     pnContent2.add(lblImg5);
	    
	     lblAttackInfo5 = new JLabel();
	     lblAttackInfo5.setBounds(160, 91, 160, 15);  
	     lblAttackInfo5.setText(aliveAtt[4]+"(-"+deathAtt[4]+")");
	     lblAttackInfo5.setHorizontalAlignment(JLabel.CENTER);
	     pnContent2.add(lblAttackInfo5);
	     
	     lblDefenceInfo5 = new JLabel();
	     lblDefenceInfo5.setBounds(160, 110, 160, 15);
	     lblDefenceInfo5.setText(aliveDef[4]+"(-"+deathDef[4]+")");
	     lblDefenceInfo5.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent2.add( lblDefenceInfo5);
	     //
	     //
	     lblImg6 = new JLabel();
	     lblImg6.setIcon(new ImageIcon(getClass().getResource("/Image/Mortar.png/")));
	     lblImg6.setBounds(320, 20, 160, 70);  
	     lblImg6.setHorizontalAlignment(JLabel.CENTER);
	     pnContent2.add(lblImg6);
	    
	     lblAttackInfo6 = new JLabel();
	     lblAttackInfo6.setBounds(320, 91, 160, 15);  
	     lblAttackInfo6.setText(aliveAtt[5]+"(-"+deathAtt[5]+")");
	     lblAttackInfo6.setHorizontalAlignment(JLabel.CENTER);
	     pnContent2.add(lblAttackInfo6);
	     
	     lblDefenceInfo6 = new JLabel();
	     lblDefenceInfo6.setBounds(320, 110, 160, 15);
	     lblDefenceInfo6.setText(aliveDef[5]+"(-"+deathDef[5]+")");
	     lblDefenceInfo6.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent2.add( lblDefenceInfo6);
	     //
	     //
	     lblImg7 = new JLabel();
	     lblImg7.setIcon(new ImageIcon(getClass().getResource("/Image/Ram.png/")));
	     lblImg7.setBounds(480, 20, 160, 70);  
	     lblImg7.setHorizontalAlignment(JLabel.CENTER);
	     pnContent2.add(lblImg7);
	    
	     lblAttackInfo7 = new JLabel();
	     lblAttackInfo7.setBounds(480, 91, 160, 15);  
	     lblAttackInfo7.setText(aliveAtt[6]+"(-"+deathAtt[6]+")");
	     lblAttackInfo7.setHorizontalAlignment(JLabel.CENTER);
	     pnContent2.add(lblAttackInfo7);
	     
	     lblDefenceInfo7 = new JLabel();
	     lblDefenceInfo7.setBounds(480, 110, 160, 15);
	     lblDefenceInfo7.setText(aliveDef[6]+"(-"+deathDef[6]+")");
	     lblDefenceInfo7.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent2.add( lblDefenceInfo7);
	     //
	     //
	     lblImg8 = new JLabel();
	     lblImg8.setIcon(new ImageIcon(getClass().getResource("/Image/Slinger.png/")));
	     lblImg8.setBounds(640, 20, 160, 70);  
	     lblImg8.setHorizontalAlignment(JLabel.CENTER);
	     pnContent2.add(lblImg8);
	    
	     lblAttackInfo8 = new JLabel();
	     lblAttackInfo8.setBounds(640, 91, 160, 15);  
	     lblAttackInfo8.setText(aliveAtt[7]+"(-"+deathAtt[7]+")");
	     lblAttackInfo8.setHorizontalAlignment(JLabel.CENTER);
	     pnContent2.add(lblAttackInfo8);
	     
	     lblDefenceInfo8 = new JLabel();
	     lblDefenceInfo8.setBounds(640, 110, 160, 15);
	     lblDefenceInfo8.setText(aliveDef[7]+"(-"+deathDef[7]+")");
	     lblDefenceInfo8.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent2.add( lblDefenceInfo8);
	     //
//	     3-------------------------------------------
	     pnContent3 = new JPanel(null);
	     pnContent3.setBounds(0, 320, 800, 135);
	     pnContent3.setBackground(new Color(248,222,164));
	     pnMain.add(pnContent3);
	     lblAttack3 = new JLabel();
	     lblAttack3.setBounds(0, 91, 160, 15);  
	     lblAttack3.setText("Attack");
	     lblAttack3.setHorizontalAlignment(JLabel.CENTER);
	     pnContent3.add(lblAttack3);
	     lblDefence3 = new JLabel();
	     lblDefence3.setBounds(0, 110, 160, 15);
	     lblDefence3.setText("Defence");
	     lblDefence3.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent3.add( lblDefence3);
	     //
	     
	     lblImg9 = new JLabel();
	     lblImg9.setIcon(new ImageIcon(getClass().getResource("/Image/Spearman.png/")));
	     lblImg9.setBounds(160, 20, 160, 70);  
	     lblImg9.setHorizontalAlignment(JLabel.CENTER);
	     pnContent3.add(lblImg9);
	    
	     lblAttackInfo9 = new JLabel();
	     lblAttackInfo9.setBounds(160, 91, 160, 15);  
	     lblAttackInfo9.setText(aliveAtt[8]+"(-"+deathAtt[8]+")");
	     lblAttackInfo9.setHorizontalAlignment(JLabel.CENTER);
	     pnContent3.add(lblAttackInfo9);
	     
	     lblDefenceInfo9 = new JLabel();
	     lblDefenceInfo9.setBounds(160, 110, 160, 15);
	     lblDefenceInfo9.setText(aliveDef[8]+"(-"+deathDef[8]+")");
	     lblDefenceInfo9.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent3.add( lblDefenceInfo9);
	     //
	     //
	     lblImg10 = new JLabel();
	     lblImg10.setIcon(new ImageIcon(getClass().getResource("/Image/SteamGiant.png/")));
	     lblImg10.setBounds(320, 20, 160, 70);  
	     lblImg10.setHorizontalAlignment(JLabel.CENTER);
	     pnContent3.add(lblImg10);
	    
	     lblAttackInfo10 = new JLabel();
	     lblAttackInfo10.setBounds(320, 91, 160, 15);  
	     lblAttackInfo10.setText(aliveAtt[9]+"(-"+deathAtt[9]+")");
	     lblAttackInfo10.setHorizontalAlignment(JLabel.CENTER);
	     pnContent3.add(lblAttackInfo10);
	     
	     lblDefenceInfo10 = new JLabel();
	     lblDefenceInfo10.setBounds(320, 110, 160, 15);
	     lblDefenceInfo10.setText(aliveDef[9]+"(-"+deathDef[9]+")");
	     lblDefenceInfo10.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent3.add( lblDefenceInfo10);
	     //
	     //
	     lblImg11 = new JLabel();
	     lblImg11.setIcon(new ImageIcon(getClass().getResource("/Image/Sulfur.png/")));
	     lblImg11.setBounds(480, 20, 160, 70);  
	     lblImg11.setHorizontalAlignment(JLabel.CENTER);
	     pnContent3.add(lblImg11);
	    
	     lblAttackInfo11 = new JLabel();
	     lblAttackInfo11.setBounds(480, 91, 160, 15);  
	     lblAttackInfo11.setText(aliveAtt[10]+"(-"+deathAtt[10]+")");
	     lblAttackInfo11.setHorizontalAlignment(JLabel.CENTER);
	     pnContent3.add(lblAttackInfo11);
	     
	     lblDefenceInfo11 = new JLabel();
	     lblDefenceInfo11.setBounds(480, 110, 160, 15);
	     lblDefenceInfo11.setText(aliveDef[10]+"(-"+deathDef[10]+")");
	     lblDefenceInfo11.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent3.add( lblDefenceInfo11);
	     //
	     //
	     lblImg12 = new JLabel();
	     lblImg12.setIcon(new ImageIcon(getClass().getResource("/Image/Swordsman.png/")));
	     lblImg12.setBounds(640, 20, 160, 70);  
	     lblImg12.setHorizontalAlignment(JLabel.CENTER);
	     pnContent3.add(lblImg12);
	    
	     lblAttackInfo12 = new JLabel();
	     lblAttackInfo12.setBounds(640, 91, 160, 15);  
	     lblAttackInfo12.setText(aliveAtt[11]+"(-"+deathAtt[11]+")");
	     lblAttackInfo12.setHorizontalAlignment(JLabel.CENTER);
	     pnContent3.add(lblAttackInfo12);
	     
	     lblDefenceInfo12 = new JLabel();
	     lblDefenceInfo12.setBounds(640, 110, 160, 15);
	     lblDefenceInfo12.setText(aliveDef[11]+"(-"+deathDef[11]+")");
	     lblDefenceInfo12.setHorizontalAlignment(JLabel.CENTER);	     
	     pnContent3.add( lblDefenceInfo12);
	     
	     //-------------- end-----------
	     btnOK = new JButton("OK");
	     btnOK.setBounds(345, 455, 110, 30);
	     btnOK.setBackground(new Color(248, 222, 164));
	     pnMain.add(btnOK); 	     
	     con.add(pnMain);
	    
	     
	 }
	 public void addEvents(){
		
		 
		  btnOK.addActionListener(new ActionListener() {
                 
	            @Override
	            public void actionPerformed(ActionEvent e) {
	           
	            	dispose();
	            	
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
	        this.setSize(800,530);
	        setUndecorated(true);
	        this.setBackground(new Color(0, 0, 0, 0));
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	   	    this.setLocationRelativeTo(null);
	        this.setModal(true);
	        this.setVisible(true);
//	        
//	      int d[] = IsLandUI.house[getId2()].getArmy().getNumberArmyAtt();
//	      for(int i=0 ;i<12;i++)
//	      {
//	    	  System.out.println("vvvv"+d[i]);
//	      }
	 }
//	    }
//
//	  public static void main(String args[]) {
//	
//	                new BattleInformationUI();
//	      
//	    }
	
	
}