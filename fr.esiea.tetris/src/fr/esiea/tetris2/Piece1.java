package fr.esiea.tetris2;


public class Piece1  {
	    public int orientation;
	    public int[][][] tableG;
	    public int[][] table1;
	    
	    public Piece1(int orientat , int [][][] tabl) {
			this.orientation = orientat;
			this.tableG = tabl;
			int[][] table = {{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}};
			for (int i = 0; i < 4 ; i++) {
	            for (int j = 0; j < 4; ++j) {
	            	table[i][j] =tabl[orientat][i][j];
	            }
	        }
			this.table1=table;
			//System.out.print(table1[4][1]);
		
		}
	    
	        
	   /* public Piece1(int [][] table) {
	    	this.table1 = table;
		}*/
	    
	    public void setOrientation(int orientation) {
			this.orientation = orientation;
		}
        
		public int getOrientation() {
	        return orientation;
	    }
		
		public void setTable(int [][] table) {
		       this.table1 = table;
		    }
		 
		public int [][] getTable() {
			return table1;
	    }
	    
	   public int [][] rotationt(int rotate ){
	    	//System.out.print(tab[0][1]);
	    	int[][] tab;
	    	int [][] var=null;	    				    		
	    	orientation=Math.abs((rotate+orientation)%4);
	    	if(orientation==0 || orientation==2 ){
	    	 var = tableG[1];
	    		//var = new int[][] {{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}};
	    		}
	    	else if(orientation==1|| orientation==3 ){
	    		var = tableG[2];
	    		//var = new int[][] {{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,0,0}};
	    	}
	   	else{
	    		System.out.print(orientation+"\n");
	    		var= tableG[3];
	    	
	    	}
	    		table1=var;
	    			
	    		//	this.setTable({{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,0,0}});
	       
	    	
	        	

			
			return table1;	    
      }


	    
	    public int Testret(int test[][],int i , int j) {
		
	    	if(test[i][j] == 1){
	    		return 1;    		
	    	}
	    	
	    	return 0;
	    }

		
}
