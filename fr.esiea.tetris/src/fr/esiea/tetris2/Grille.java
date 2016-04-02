package fr.esiea.tetris2;

public class Grille {

	
	// cette contient les points du panneau qui sont dejas occupés
 public int[][] Gril(){
	int dote =20;
	 int[][] matrice=new int[21][21];

	 
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
 
}
