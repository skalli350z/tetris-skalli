package fr.esiea.tetris2;

import java.util.Random;

public class Gestion {

	
	public int [][] Droite(int[][] tableau ,  int[][] tableur){
		 		
		return tableau;
		 	 
	}
	
	public int [][] copy(int [][]s, int [][]tabx, int posix, int posiy ){
	 
	 for( int i =0;i<4; i++){
			for( int j =0;j<4; j++){
				if(tabx[i][j]==1){
				//	System.out.print(posix+"qqqx "+(posix-Math.abs((posix)%38))/38+"s\n");
				if(s[i+(posix-Math.abs((posix)%10))/10][j+(posiy-Math.abs((posiy)%10))/38]==0){
				 s[i+(posix-Math.abs((posix)%10))/10][-10+j+(posiy-Math.abs((posiy)%10))/10]=1;
				}
				}
			}
		}	 
		//System.out.print(tabx[0][2]);
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
    	
    	
    	int s = (int) (Math.random()*7); 
    	
    	//Random rnd = new Random();
    	//int s = rnd.nextInt()%8;
    	
    	//int s = 2;//rnd;
       int[][][] tab1 = new int[][][] {{{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}},
    	   							   {{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,0,0}},
    	   							{{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}},
    	   							{{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,0,0}}};
    	 // System.out.print(tab1[4][2][3]);
 	   int[][][] tab2 =  new int[][][] {{{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}},
			   {{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}},
			   {{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}},
			 {{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}}};
			
 	   int[][][] tab3 =  new int[][][] {{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}},
 		  {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}},
 		 {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}},
 		{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}};
			
 	   int[][][] tab4 =  new int[][][] {{{0,0,1,0},{0,1,1,0},{0,1,0,0},{0,0,0,0}},
 		   								{{0,0,0,0},{0,1,1,0},{0,0,1,1},{0,0,0,0}},
 		   								{{0,0,1,0},{0,1,1,0},{0,1,0,0},{0,0,0,0}},
 		   							  {{0,0,0,0},{0,1,1,0},{0,0,1,1},{0,0,0,0}}};
			
 	   int[][][] tab5 =  new int[][][] {{{0,0,1,0},{0,1,1,0},{0,1,0,0},{0,0,0,0}},
				{{0,0,0,0},{0,1,1,0},{0,0,1,1},{0,0,0,0}},
				{{0,0,1,0},{0,1,1,0},{0,1,0,0},{0,0,0,0}},
			  {{0,0,0,0},{0,1,1,0},{0,0,1,1},{0,0,0,0}}};
			
       int[][][] tab6 =  new int[][][] {{{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}},
			   {{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,0,0}},
			{{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}},
			{{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,0,0}}};
			
 	   int[][][] tab7 = new int[][][] {{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}},
 	 		  {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}},
 	 		 {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}},
 	 		{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}} ;
 	 		
			System.out.print("sss :"+s+"\n");
		if ( s ==0 ){
			Piece1 A = new Piece1(1,tab1);
			return A;
			}
		if ( s ==1 ){Piece1 A = new Piece1(1,tab1); 
		return A;}
		if ( s ==2 ){Piece1 A = new Piece1(1,tab2); 
		return A;}
		if ( s ==3 ){Piece1 A = new Piece1(1,tab3); 
		return A;}
		if ( s ==4 ){Piece1 A = new Piece1(1,tab4); 
		return A;}
		if ( s ==5 ){Piece1 A = new Piece1(1,tab5);  
		return A;}
		else {Piece1 A = new Piece1(1,tab6);  
		return A;}
		
				
		
	}

    
    
    



	
	
}