package fr.esiea.tetris2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.util.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

 
public class Panneau extends JPanel implements ActionListener, KeyListener{ 
	// private static final boolean True = false;
	Timer tm =new Timer(5, this);
	 int velx=0;
	 int vely=0;
	 int x =0;
	 int y =0;
	 int rnd=0;
	 int rotation =0;
	 boolean bootom= false;
	 
 	Gestion gest = new Gestion();
 	Grille p = new Grille();
		int[][] s = p.Gril();
		Piece1 Pie = gest.cree_piece(rnd);
		//int[][] tabx=Pie.rotationt(2);
		//int[][] tabx=Pie.table1;
		
	
	 
	 public Panneau(){
		 tm.start();
		 addKeyListener(this);
		 setFocusable(true);
		 setFocusTraversalKeysEnabled(false);
	 }
	 
	  
	
    public void paintComponent (Graphics g) {
    	super.paintComponent(g); 

	    Color color = Color.BLUE;
	    g.setColor(color);
	    //gest.copy(s, tabx,x, y);
	 /*  int  i=10;
	  int   j=10;*/
	    int [][] tabx = Pie.table1;
	    
	    for(int i=0; i <s.length; i++) {
			 for (int j = 0; j<s.length ; j++) {	 
				  if(s[i][j] == 1 ){
				 System.out.print(i+"   "+j+"\n");
						  g.fillRect(  10*i, 10*j, 10,10);
						 // g.fillRect(  370, 20, 10,10);
						 // g.fillRect(  80, 20, 10,10);
						  System.out.print("rnd2 "+rnd+"\n");
					   }	
		}		   
	    }
	    
	    for(int i=0; i <tabx.length; i++) {
			 for (int j = 0; j<tabx.length ; j++) {	 
				  if(tabx[i][j] == 1 ){
				// System.out.print(tabx[i][j]);
						  g.fillRect( 10*tabx[i][j]*i+x+i , 10*tabx[i][j]*j+y, 10,10);
					   }	
		}		   
	    }
	    
	   // g.fillRect(x , y, 10, 10);
	    
	    //g.fillRect(10+x , 10+y, 10, 10);
	  }
	  
	/*  @Override
	  public void paint(Graphics g) {
	    super.paint(g);
	    Dimension size = getSize();
	    Grille p = new Grille();
		int[][] s = p.Gril();	      
		//int[][] tab3 = new int[][] { {1,0},{1,0},{1,0},{1,0} }; 
		Gestion gest = new Gestion();
		Piece1 Pie = gest.cree_piece();
		int[][] tabx=Pie.rotationt(2);
		print(tabx);
		 int px=30;
		 int py=50;	 
          
		    Gestion f = new Gestion();
		    f.copy(s, tabx,posix, posiy);
			int[][] test = new int[12][12];
            f.debuttest(test);		
		     for(int i=0; i <s.length; i++) {
				 for (int j = 0; j<s.length ; j++) {	  
						  if(s[i][j] == 1 ){						    		 					    	
						      draw(g, 10*j+px , 10*i+py, 8,8);
						   }	
				}		     
			}
		     
		     
	     }*/

	private void print(int[][] tabx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	/* public void actionPerformed(ActionEvent arg0) {
		
		posix=posix+velx;
		posiy=posiy+vely;
		repaint();
	}*/
	
	public void actionPerformed(ActionEvent e) { 
		 bootom= y>=400;
		 //sSystem.out.print(bootom+"\n");
		 if (bootom) {
			 bootom = false;
			 gest.copy(s, Pie.table1,x, 400);
			/* for(int i=0;i<400000;i++){
		System.out.print(x+"qqqx "+(x-Math.abs((x)%10))/10+"s\n");
			 }*/
			 if(rnd<=6){
				 rnd=rnd+1;
				 System.out.print("rnd "+rnd+"\n");
			 }
			 Pie = gest.cree_piece(rnd);
			 
			 /*System.out.println(x);
			 System.out.println(y);*/
			 x=0;
			 y=0;
	        } else {
	            oneLineDown();
	        }
		if(x < 0) { velx=0; x = 0; } 
		if(x > 400) { velx=0; x = 400; } 
		if(y < 0) { vely=0; y = 0; } 
		if(y > 400) { vely=0; y = 400; 
		} 
		x += velx; 
		y += vely; 
		Pie.rotationt(rotation);
		repaint(); 
		}
	   
	/* public void actionPerformed(ActionEvent e) {
		 boolean isFallingFinished=false;
	        if (isFallingFinished) {
	            isFallingFinished = false;
	           // newPiece();
	        } else {
	            oneLineDown();
	        }
	    }*/
	 
	 private void oneLineDown()
	    {
		 for(int i=0;i<8000;i++){
			 System.out.print("p");
		 }
		 y=y+1;
		 if(y > 400) { vely=0; y = 400; 
		 
		 }
	      /*  if (!tryMove(Pie, 1, 1))
	            pieceDropped();*/
	    }
	   private boolean tryMove(Piece1 newPiece, int newX, int newY)
	    {
	     /*   for (int i = 0; i < 4; ++i) {
	            int x = newX + newPiece.x(i);
	            int y = newY - newPiece.y(i);
	            if (x < 0 || x >= BoardWidth || y < 0 || y >= BoardHeight)
	                return false;
	            if (shapeAt(x, y) != Tetrominoes.NoShape)
	                return false;
	        }

	        curPiece = newPiece;
	        curX = newX;
	        curY = newY;
	        repaint();*/
	        return true;
	    }
	   private int [] pieceDropped(){
		   return null;
		   
	   }

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_DOWN){ vely = 1; velx = 0; rotation=0;}
		if (code == KeyEvent.VK_UP){ vely = 0; velx = 0;rotation = 1;} 
		if (code == KeyEvent.VK_LEFT){ rotation = 0;vely = 0; velx = -10; }
		if (code == KeyEvent.VK_RIGHT){ vely = 0; velx = 10; rotation = 0;} } 

	public void keyTyped(KeyEvent e) {} 
	public void keyReleased(KeyEvent e) { velx=0; vely=0;rotation = 0; } 
	
	
	public static void main (String arge[]){ 
		JFrame f = new JFrame(); 
		Panneau s = new Panneau(); 
		f.add(s); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setSize(400,400); f.setVisible(true);
		 Gestion gest = new Gestion();
		 	Grille p = new Grille();
				int[][] ss = p.Gril();
			/*	Piece1 Pie = gest.cree_piece(1);
				//int[][] tabx=Pie.rotationt(2);
				int[][] tabx=Pie.table1;
				
				for(int i=0; i <tabx.length; i++) {
					 for (int j = 0; j<tabx.length ; j++) {	 
						  //if(tabx[i][j] == 1 ){
						 System.out.print(tabx[i][j]);
						 }
					 }*/
		 }
}
