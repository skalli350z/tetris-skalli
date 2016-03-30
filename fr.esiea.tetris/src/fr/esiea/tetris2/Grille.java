package fr.esiea.tetris2;

public class Grille {

 public int[][] Gril(){
	
	 int[][] matrice=new int[40][40];

	 
	 int i, j;
	 for(i=0; i<matrice.length; i++) {
	 	for(j=0; j<matrice[i].length; j++) {
	 		if(j==0 || j== matrice.length-1 || i == matrice.length-1){
	 			matrice[i][j] = 0;
	 		}
	 	}
	 }
   return matrice;	
	}
 
 
 public void Gril1(int[][] tableau){
	 
	 int i, j;	 
	 for(i=0; i<tableau.length; i++) {
	 	for(j=0; j<tableau[i].length; j++){
	 	 
	 		if(tableau[i][j] == 1 ){
	 			 System.out.print("$");	 		
	 	  }else{ System.out.print(" ");} 		
	 	}	 	
	 	System.out.print("\n");
	
 }
	
 
 
 }
 
}
