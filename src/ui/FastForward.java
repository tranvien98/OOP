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

public class FastForward extends JDialog {
	 JPanel pnMain, pnTitle,pnFast;
	 JLabel  lblTitle, lblFast;
	 JComboBox<String> fastLevel;
	 JButton btnDispose, btnOK;
     String[] comboNum = {"1","2","4","6","8","10","60","120","240"};
    
	 public FastForward() {
	      addControls();
	      addEvents();
	     
	    }
	 public void addControls(){
		 Container con = getContentPane();
	     con.setLayout(null);
	     
	     pnMain = new JPanel(null);
	     pnMain.setBounds(0, 20, 600, 300);
	     pnMain.setBackground(new Color(253, 247, 221));
	     
	     pnTitle = new JPanel(null);
	     pnTitle.setBounds(0, 0, 600, 20);
	     pnTitle.setBackground(new Color(215, 172, 116));
	     con.add(pnTitle);
	     lblTitle = new JLabel("FastForward");
	     lblTitle.setBounds(250, 0, 125, 15);
	     pnTitle.add(lblTitle);
	     btnDispose = new JButton(new ImageIcon(getClass().getResource("/Image/xButton.PNG")));
	     btnDispose.setBounds(580, 0, 20, 20);
	     pnTitle.add(btnDispose);
	    
	   
	     pnFast = new JPanel(null);
	     pnFast.setBounds(0, 50, 600, 50);
	     pnFast.setBackground(new Color(251, 232, 193));
	     pnMain.add(pnFast);
	     lblFast = new JLabel("Fast");
	     lblFast.setBounds(50, 15, 90, 20);
	     pnFast.add(lblFast);
	     fastLevel = new JComboBox<String>(comboNum);
	     fastLevel.setBounds(200, 15, 200, 20);
	     fastLevel.setBounds(200, 15, 200, 20);
	     pnFast.add(fastLevel);
	     	     
	     btnOK = new JButton("OK");
	     btnOK.setBounds(250, 210, 110, 30);
	     btnOK.setBackground(new Color(248, 222, 164));
	     pnMain.add(btnOK);
	     
	     con.add(pnMain);
	     
	 }
	 public void addEvents(){
		
		 
		  btnOK.addActionListener(new ActionListener() {
                 
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	String level = fastLevel.getSelectedItem().toString();
	            	int lv;
	            	if(level == "2")
	            	{
	            		lv = 2;
	            	}
	            	else if(level == "4")
	            	{
	            		lv = 4;
	            	}
	            	else if(level == "6")
	            	{
	            		lv = 6;
	            	}
	            	else if(level == "8")
	            	{
	            		lv = 8;
	            	}
	            	else if(level == "10")
	            	{
	            		lv = 10;
	            	}
	            	else if(level == "60")
	            	{
	            		lv = 60;
	            	}
	            	else if(level == "120")
	            	{
	            		lv = 120;
	            	}
	            	else if(level == "240")
	            	{
	            		lv = 240;
	            	}
	            	else
	            	{
	            		lv = 1;
	            	}
	            	 
	                 IsLandUI is = new IsLandUI("Ikariam",lv);
	                 is.showWindow();
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
	        this.setSize(600,300);
	        setUndecorated(true);
	        this.setBackground(new Color(0, 0, 0, 0));
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	   	    this.setLocationRelativeTo(null);
	        this.setModal(true);
	        this.setVisible(true);
	    }

	
//
//	  public static void main(String args[]) {
//	
//	              FastForward ff =  new FastForward();
//	              ff.showWindow();
//	      
//	    }
	
	
}