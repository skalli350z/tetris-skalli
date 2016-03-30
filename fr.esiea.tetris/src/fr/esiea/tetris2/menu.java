package fr.esiea.tetris2;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.InputEvent;



//import java.util.Scanner;

public class menu extends JFrame  {
	//public Panneau pano;
	//public static void main(String[] args)  {
		/*public menu() throws InterruptedException{	
		Grille p = new Grille();
		int[][] s = p.Gril();
   
		p.Gril1(s);
		int s1 = (int) (Math.random()*4);
		int s2 = (int) (Math.random()*7);
		System.out.println(s1 + "+" + s2);
       
			
		/*
		while( 1==1){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez taper un chiffre :");
		int str = sc.nextInt();
		*/
/*
	    
	  int[][] tab3 = new int[][] { {1,1,1,1},{0,1,1,1},{1,1,1,0},{1,1,1,1} };

	   //  int[][] s = p.Gril();
		
	  // p.Gril1(s);
	  Gestion gest = new Gestion();
		Piece1 Pie = gest.cree_piece();
         // tab3 = Pie.rotationt(1 ,Pie.getTable());
		
	     final int[][] mat = p.Gril();
		int[][] tabs = Pie.getTable();
		
		
		JFrame fenetre = new JFrame();	
	    //Définit un titre pour notre fenêtre
	    fenetre.setTitle("Ma première fenêtre Java");
	    //Définit sa taille : 400 pixels de large et 100 pixels de haut
	    fenetre.setSize(400, 400);
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    fenetre.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Panneau pano = new Panneau();
	    fenetre.add(pano);
	    fenetre.getContentPane().add(new JButton("DROITE"), BorderLayout.WEST);
	    //À l'est
	    fenetre.getContentPane().add(new JButton("GAUCHE"), BorderLayout.EAST);
	    //Et enfin, la rendre visible        
	    fenetre.setVisible(true);
	    //paneau.start();
		
	    */
	  /*  public void start()
	    {
	        if (isPaused)
	            return;

	        isStarted = true;
	        isFallingFinished = false;
	        numLinesRemoved = 0;
	        clearBoard();

	        newPiece();
	        timer.start();
	    }*/
	    
		
	/*    int[][] test = new int[12][12];
	    for( int x =10 ;x>=0; x--){
			for( int j =11 ;j>1; j--){
				if( test[x+1][j] == 0 ){
												
					mat[x+1][j] =  mat[x][j];
					mat[x][j]= 0;
								

				}//else {    return; }
			}			
		}*/
	    
	   /* 
	        fenetre.addKeyListener(
	    		new KeyListener(){

	    		public void keyPressed(KeyEvent e){
	    		System.out.println(e.getKeyCode() );
	    		if (e.getKeyCode() == KeyEvent.VK_UP){
	    		     System.out.print("ddddd");
	    		  }
	    		
	    		if (e.getKeyCode() == KeyEvent.VK_DOWN){
	    		     System.out.print("ffff");
	    		  }
	    		}
                
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
	    		
	    		}//keyListener 

	    		);
	
	
	}*/
	/*public static void main(String[] args) throws InterruptedException{
		new menu();
	}*/


}
