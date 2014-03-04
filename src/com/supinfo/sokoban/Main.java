package com.supinfo.sokoban;

public class Main {

	public static void main(String[] args) {
	
		if(argv.length>=2){
     	 	--level=argv[0];
      		arg2=argv[1];
   		}
   		
   		//Si --level est égale à 0 alors il n'y a pas d'argument)
		if(--level == 0){
			System.out.println("Il n'y pas d'argument");
		}else if(--level != 0 && arg2==0){ //Ainsi de suite 
			System.out.println("Arg2 égale 0");
		}else{System.out.println("Il y deux arguments");}
   		
   		//faire un if pour vérifier si il y a deux arguments "--level" ---- FAIT 
   		
   		
		Case[][] map = new Case[8][8];
		
		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j] = new Case();
			}
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j].afficherContenu();
			}
		}
		

	}

}
