package fr.esiea.tetris2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.BorderLayout;
//import java.util.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

 
public class Panneau extends JPanel implements ActionListener, KeyListener{ 
	
	Timer tm =new Timer(5, this);
	 int velx=0;
	 int vely=0;
	 int x =0;
	 int y =0;
	 int rnd=0;
	 int rotation =0;
	 boolean bootom= false;
	 public int dote =20;
	 JLabel Point = new JLabel(" 0");
	 String bestScore;
	 
	 
 	Gestion gest = new Gestion();
 	menu f =new menu();
 	Grille p = new Grille();
		int[][] s = p.Gril();
	Piece1 Pie ; 
		
		
	
	 
	 public Panneau( menu f ){
		 Point =  f.Point;
		 tm.start();
		 addKeyListener(this);
		 setFocusable(true);
		 bestScore=f.bestScore;
		 setFocusTraversalKeysEnabled(false);
		
		 Pie = gest.cree_piece(rnd);
	        tm = new Timer(10, this);
	        tm.start(); 
	       
	 }
	 
	  
	
    public void paintComponent (Graphics g) {
    	super.paintComponent(g); 
    	
    	 Color colors[] = { new Color(0, 0, 0), new Color(204, 102, 102), 
        new Color(102, 204, 102), new Color(102, 102, 204), 
        new Color(204, 204, 102), new Color(204, 102, 204), 
        new Color(102, 204, 204), new Color(218, 170, 0)
    };

    	 int c = Pie.color; 
    	 
	    Color color = Color.BLACK;
	    g.setColor(color);
	    int [][] tabx = Pie.table1;
	    int [][] tabtest = {{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}};
	    
	    for(int i=0; i <s.length; i++) {
			 for (int j = 0; j<s.length ; j++) {	 
				  if(s[i][j] == 1 ){
				 System.out.print(i+"   "+j+"\n");
						  g.fillRect(  dote*i, dote*j, dote,dote);
						  System.out.print("rnd2 "+rnd+"\n");
					   }	
		}		   
	    }
	    color = colors[c];
	    g.setColor(color);
	    
	    for(int i=0; i <tabx.length; i++) {
			 for (int j = 0; j<tabx.length ; j++) {	 
				  if(tabx[i][j] == 1 ){
				
					  Pie.minX=0;
					  Pie.minY=1;
						  g.fillRect( dote*tabx[i][j]*(i-Pie.minX)+x , dote*tabx[i][j]*(j-Pie.minY)+y, dote,dote);
					   }	
		}		   
	    }
	    
	  }
	  
	

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
		
		
		 bootom= y>=450;
		 if ( !limit(Pie,x, y)) {
			 bootom = false;
			 gest.copy(s, Pie,x, y);
			 s=gest.updat(s);
			Point.setText(String.valueOf(gest.NumberPoint)+bestScore);
			 if(rnd<=6){
				 rnd=rnd+1;
				 System.out.print("rnd "+rnd+"\n");
			 }
			 Pie = gest.cree_piece(rnd);
			 x=0;
			 y=0;
	        } else {
	        	Descend();
	        }
		 bouger(Pie,x+velx, y+vely);
		 if(rotation!=0){
		Pie.rotationt(rotation,x, y,s);
		rotation=0;
		}
		 
		if(s[0][0] == 1 ) {
        tm.stop();
        Point.setText("Try again");
			}	
		else{
			repaint();
		}
	}
	   
	 
	 private void Descend()
	    {
		 for(int i=0;i<8000;i++){
			 System.out.print("p");
		 }
		 y=y+1;
		 if(y > 450) { vely=0; y = 450; 
		 
		 }
	      
	    }
	
	   private int [] pieceDropped(){
		   return null;
		   
	   }

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_DOWN){ vely = 1; velx = 0; rotation=0;}
		if (code == KeyEvent.VK_UP){ vely = 0; velx = 0;rotation = 1;} 
		if (code == KeyEvent.VK_LEFT){ rotation = 0;vely = 0; velx = -20; }
		if (code == KeyEvent.VK_RIGHT){ vely = 0; velx = 20; rotation = 0;} } 

	public void keyTyped(KeyEvent e) {} 
	public void keyReleased(KeyEvent e) { velx=0; vely=0;rotation = 0; } 
	
	
	

    public boolean bouger(Piece1 newPiece, int newX, int newY)
    {
    	int [][] tab=newPiece.table1;
        for (int i = 0; i < 4; ++i) {
            int x = newX ;
            int y = newY;
            
            
            for(int k=0;k<4;k++){
            	for(int n=0;n<4;n++){
            		if (tab[k][n]*x < 0 || x+dote*Pie.maxX > 359 || tab[k][n]*y < 0 || y+dote*Pie.maxY  >= 409)
                        return false;
                	
                }
            }
           
           
            
            for(int k=0;k<4;k++){
        		for(int m=0;m<4;m++){
        			if(Pie.table1[k][m]==1)
        				if (s[x/dote+k][y/dote+m] == 1)
        					return false;
        }
        	}
        
        }
        x = newX;
        y = newY;
        repaint();
        return true;
    }
    
    public boolean limit(Piece1 newPiece, int newX, int newY)
    {
    	int [][] tab=newPiece.table1;
        for (int i = 0; i < 4; ++i) {
            if (y+dote*Pie.maxY  >= 409)
                return false;
       
            if(1+y/dote+Pie.maxY<21){
            	for(int k=0;k<4;k++){
            		for(int m=0;m<4;m++){
            			if(Pie.table1[k][m]==1)
          if (s[x/dote+k][1+y/dote+m] == 1)
                return false;
            }
            	}
            }
     
        }

        x = newX;
        y = newY;
        repaint();
        return true;
    }
    
    public boolean Newlimit(Piece1 newPiece, int newX, int newY)
    {
        for (int i = 0; i < 4; ++i) {
            if (y >= 360)
                return true;
           int [][] tab=newPiece.table1;
            if (s[i*tab[i][3]+(x-Math.abs((x)%dote))/dote][newPiece.maxY*tab[i][3]+(y-Math.abs((y)%dote))/dote] == 1)
                return true;
        }

        repaint();
        return false;
    }
}
