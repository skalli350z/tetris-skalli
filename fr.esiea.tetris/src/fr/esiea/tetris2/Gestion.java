package fr.esiea.tetris2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class Gestion {
 int dote =20;
 int taille=0;
 public int NumberPoint=0;
	
	public int [][] Droite(int[][] tableau ,  int[][] tableur){
		 		
		return tableau;
		 	 
	}
	
	public int [][] copy(int [][]s, Piece1 pie, int posix, int posiy ){
	 
		int [][] tabx=pie.table1;
	 for( int i =0;i<4; i++){
			for( int j =0;j<4; j++){
				if(tabx[i][j]==1){
					/*for(int k=0;k<40000;k++){
					}*/
				if(s[i+posix/dote][j+posiy/dote]==0){
				 s[i+posix/dote][j+posiy/dote]=1;
				}
				}
			}
		}	 
      return s;     
	} 
	
	public int [][] updat(int [][] s){
		
		boolean to_updat=true;
		int lignetoremove=0;
		for(int h=20;h>0;h--){
			to_updat=true; 
		for(int l=0;l<18;l++){
			if(s[l][h]==0)
				to_updat=false; 
		 }
		if(to_updat){
			NumberPoint=NumberPoint+1;
			lignetoremove=h;
			break;
		}
			
		}
		if(to_updat){
			for(int l=0;l<21;l++){
				s[l][lignetoremove]=0; 
			 }
			for(int i=0;i<21;i++){
				for(int j=lignetoremove;j>1;j--){
				s[i][j]=s[i][j-1]; 
				}
			 }
		}
		return s;
	}
	
	public int [][] debuttest(int [][] test){

			for( int i =1;i<11; i++){
				for( int j =1;j<11; j++){						
					test[i][j]=0;
				}
			}		
	   return test;	 
	 }
	
	

    public Piece1 cree_piece(int rnd){  	 	
    	
    	
    	int s = (int) (Math.random()*4); 
    	
    	
    	
    	//int s = 2;//rnd;
       int[][][] tab1 = new int[][][] {{{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}},
    	   							   {{0,0,1,1},{0,1,1,0},{0,0,0,0},{0,0,0,0}},
    	   							{{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}},
    	   							{{0,0,1,1},{0,1,1,0},{0,0,0,0},{0,0,0,0}}};
    	   							
    	   	int [][] max1= new int[][] {{2,2},{1,3},{2,2},{1,3}};
    	   	int [][] min1= new int[][] {{0,1},{0,1},{0,1},{0,1}};
    	   		
    	   								
 	   int[][][] tab2 =  new int[][][] {{{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}},
			   {{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}},
			   {{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}},
			 {{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}}};
			 
				int [][] max2= new int[][] {{0,3},{3,1},{0,3},{3,1}};
				int [][] min2= new int[][] {{0,0},{0,1},{0,0},{0,1}};
			
 	   int[][][] tab3 =  new int[][][] {{{1,1,0,0},{1,1,0,0},{0,0,0,0},{0,0,0,0}},
 		  {{1,1,0,0},{1,1,0,0},{0,0,0,0},{0,0,0,0}},
 		  {{1,1,0,0},{1,1,0,0},{0,0,0,0},{0,0,0,0}},
 		 {{1,1,0,0},{1,1,0,0},{0,0,0,0},{0,0,0,0}}};
 		
 		int [][] max3= new int[][] {{1,1},{1,1},{1,1},{1,1}};
 		int [][] min3= new int[][] {{0,0},{0,0},{0,0},{0,0}};

			
 	   int[][][] tab4 =  new int[][][] {{{0,0,1,0},{0,1,1,0},{0,1,0,0},{0,0,0,0}},
 		   								{{0,0,0,0},{0,1,1,0},{0,0,1,1},{0,0,0,0}},
 		   								{{0,0,1,0},{0,1,1,0},{0,1,0,0},{0,0,0,0}},
 		   							  {{0,0,0,0},{0,1,1,0},{0,0,1,1},{0,0,0,0}}};
 		   							  
 	   int [][] max4= new int[][] {{2,2},{2,3},{2,2},{2,3}};
 	  int [][] min4= new int[][] {{0,1},{0,1},{0,1},{0,1}};
			
 	   int[][][] tab5 =  new int[][][] {{{0,0,1,0},{0,1,1,0},{0,1,0,0},{0,0,0,0}},
				{{0,0,0,0},{0,1,1,0},{0,0,1,1},{0,0,0,0}},
				{{0,0,1,0},{0,1,1,0},{0,1,0,0},{0,0,0,0}},
			  {{0,0,0,0},{0,1,1,0},{0,0,1,1},{0,0,0,0}}};
			  
	 int [][] max5= new int[][] {{2,2},{2,3},{2,2},{2,3}};
	 int [][] min5=new int[][] {{0,1},{0,1},{0,1},{0,1}};
			
       int[][][] tab6 =  new int[][][] {{{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}},
			   {{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,0,0}},
			{{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}},
			{{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,0,0}}};
			
			int [][] max6= new int[][] {{2,2},{3,2},{2,2},{3,2}};
			int [][] min6= new int[][] {{0,0},{1,1},{1,0},{1,1}};

			
 	   int[][][] tab7 = new int[][][] {{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}},
 	 		  {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}},
 	 		 {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}},
 	 		{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}} ;
 	 int [][] max7= new int[][] {{3,3},{3,3},{3,3},{3,3}};
 	int [][] min7= new int[][] {{0,0},{0,0},{0,0},{0,0}};
 	 		
			System.out.print("sss :"+s+"\n");
		if ( s ==0 ){
			Piece1 A = new Piece1(1,tab1,max1,min1);
			return A;
			}
		if ( s ==1 ){Piece1 A = new Piece1(0,tab1,max1,min1); 
		return A;}
		if ( s ==2 ){Piece1 A = new Piece1(0,tab2,max2,min2); 
		return A;}
		if ( s ==3 ){Piece1 A = new Piece1(0,tab3,max3,min3); 
		return A;}
		if ( s ==4 ){Piece1 A = new Piece1(0,tab4,max4,min4); 
		return A;}
		if ( s ==5 ){Piece1 A = new Piece1(0,tab5,max5,min5);  
		return A;}
		else {Piece1 A = new Piece1(1,tab6,max6,min6);  
		return A;}
		
				
		
	}
    
    

    
    
    



	
	
}