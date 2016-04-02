package fr.esiea.tetris2;


public class Piece1  {
	    public int orientation;
	    public int[][][] tableG;
	    public int[][] table1;
	    int [][] maxG;
	    int [][] minG;
	    public int maxX;
	    public int maxY;
	    public int minX;
	    public int minY;
	    public int color;
	    public int dote=20;
	    
	    // Cette calsee décrit la géometrie d'une piece avec des 0 ou 1, les cordonée ne sont pas prises en compte
	    
	    public Piece1(int orientat , int [][][] tabl, int [][] max, int[][] min) {
			this.orientation = orientat;
			this.tableG = tabl;;
			maxX=max[orientation][0];
			maxY=max[orientation][1];
			minX=min[orientation][0];
			minY=min[orientation][1];
			maxG=max;
			minG=min;
			int s = (int) (Math.random()*7);
			color=s;
			
			int[][] table = {{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0}};
			for (int i = 0; i < 4 ; i++) {
	            for (int j = 0; j < 4; ++j) {
	            	table[i][j] =tabl[orientat][i][j];
	            }
	        }
			this.table1=table;
			
		
		}
	    
	    
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
	    
		// Selon l'indice "rotate" la pice changera de forme
	   public int [][] rotationt(int rotate, int x, int y , int [][] s){
	    	
	    	int[][] tab;
	    	int [][] var=null;
	    	boolean allow =true;
	    	int orientationv=Math.abs((rotate+orientation)%4);
	    	
	    	maxX=maxG[orientationv][0];
			maxY=maxG[orientationv][1];
			minX=minG[orientationv][0];
			minY=minG[orientationv][1];
	   
			var= tableG[orientationv];
	    		table1=var;
	    		
	    		for(int k=0;k<4;k++){
	            	for(int n=0;n<4;n++){
	            		
	            		if (table1[k][n]*x < 0 || x+dote*maxX > 359 || table1[k][n]*y < 0 || y+dote*maxY  >= 409)
	            			allow = false;
	                	
	                }
	            }
	    		 if(1+y/dote+maxY<21){
	             	for(int k=0;k<4;k++){
	             		for(int m=0;m<4;m++){
	             			if(table1[k][m]==1)
	           if (s[x/dote+k][1+y/dote+m] == 1)
	        	   allow =  false;
	             }
	             	}
	             }
	    		 
	    			if(!allow){
	    				maxX=maxG[orientation][0];
	    				maxY=maxG[orientation][1];
	    				minX=minG[orientation][0];
	    				minY=minG[orientation][1];
	    				
	    				var= tableG[orientation];
	    	    		table1=var;	
	    			}
	    			else {
	    				orientation=orientationv;
	    			}
			
			return table1;	    
      }


	    

		
}
