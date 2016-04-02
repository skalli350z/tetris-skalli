package fr.esiea.tetris2;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.InputEvent;



//import java.util.Scanner;

public class menu extends JFrame  {
	JLabel Point= new JLabel(" 0"+bestScore);
	static String bestScore;
	
	public void menu(){
			
			Point.setText(String.valueOf(0));
			 
	}
	
public static void main (String arge[]){ 
	
	try{
    	InputStream Fichier=new FileInputStream("test.txt"); 
    	InputStreamReader INFO=new InputStreamReader(Fichier);
    	BufferedReader BINFO=new BufferedReader(INFO);
    	String ligne;
    	while ((ligne=BINFO.readLine())!=null){
    		System.out.println(ligne);
    		bestScore=ligne;
    	}
    	BINFO.close(); 
    	}		
    	catch (Exception e){
    	System.out.println(e.toString());
    	}
		
		menu f = new menu(); 
		Panneau s = new Panneau(f); 
		f.add(s); 
		
		
		JLabel Point = f.Point;
		f.add(Point, BorderLayout.NORTH);
      
		 	Grille p = new Grille();
				int[][] ss = p.Gril();
				Gestion gest = new Gestion();
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 f.setSize(390,485); 
				 f.setVisible(true);
				 
				
		 }

}
