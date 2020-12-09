/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author alder
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        
        String elecionRep;
        
        do {
        String [] palabraSec;
        palabraSec= new String [3];
        palabraSec[0]="cafe";
        palabraSec[1]="juego";
        palabraSec[2]="validar";
        boolean igual=false;
        
        String letraIn;
        int vidasM;
        vidasM=6;
        
        int nSecret;
        nSecret=(int) (Math.random() * 3);
        
        String contenedor;

        
        
        String palabraSeg;
        palabraSeg=palabraSec[nSecret];
        
        
        
        
        String [] palabra;
        palabra= new String [palabraSeg.length()];
        
        
          for (int i=0; i<palabraSeg.length(); i++){
            palabra[i]="-";
            
        }
        
        int aciertos;
        
        
        //// inicio///////
        
        
        do {
            System.out.println("Tu contador de vida es:"+vidasM);
         contenedor="";
         
        
            
            dibujar(vidasM);
       aciertos=0;
            
            
        
        
        for (int p=0; p<palabraSeg.length(); p++){
            contenedor=contenedor+palabra[p];
        }       
       
        
        System.out.println(contenedor);
            
        
        System.out.println("Escribe una letra");
        letraIn=teclado.next();
       
        
        char letraIn2;
        letraIn2=letraIn.charAt(0);
        

        
        
        
        
        
        for (int j=0; j<palabraSeg.length();j++){
        
        char palabraSeg2;
        palabraSeg2=palabraSeg.charAt(j);
        
        
        
        int compare=Character.compare(palabraSeg2, letraIn2);
        if (compare==0){ 
            
            
            palabra[j]=letraIn;
            
            
        }else{
            
            aciertos=aciertos+1;
        }
                
        }
        if(aciertos==palabraSeg.length()) {
            vidasM=vidasM-1;
        }else {
        
        }
        

        if (contenedor.equals(palabraSeg)){

            igual=true;
        }
        
        }while (vidasM>0 && igual==false );
        
        
        
        if (igual==true){
            System.out.println("Has ganado Quieres jugar de nuevo");
            System.out.println("S/N");
        }else{
        
            System.out.println("has perdido quieres volver a jugar");
            System.out.println("S/N");
        }
        
         elecionRep=teclado.next();
        
 
        
        
        
        
        
        
        }while("s".equals(elecionRep));
          
        
        
        
        
    }
    
    private static void dibujar(int i) {
 switch (i) {
 case 6:
 System.out.println(" ---------------------");
 for (int j = 0; j < 15; j++) {
 System.out.println(" |");
 }
 System.out.println("__________");
 break;
 case 5:
 System.out.println(" ---------------------");
 System.out.println(" | |");
 System.out.println(" | |");
 System.out.println(" | -------");
 System.out.println(" | | - - |");
 System.out.println(" | | o |");
 System.out.println(" | -------");
 for (int j = 0; j < 10; j++) {
 System.out.println(" |");
 }
 System.out.println("__________");
 break;
 case 4:
 System.out.println(" ---------------------");
 System.out.println(" | |");
 System.out.println(" | |");
 System.out.println(" | -------");
 System.out.println(" | | - - |");
 System.out.println(" | | o |");
 System.out.println(" | -------");
 System.out.println(" | | ");
 System.out.println(" | | ");
 System.out.println(" | | ");
 System.out.println(" | | ");
 System.out.println(" | | ");
 for (int j = 0; j < 5; j++) {
 System.out.println(" |");
 }
 System.out.println("__________");
 break;
 case 3:
 System.out.println(" ---------------------");
 System.out.println(" | |");
 System.out.println(" | |");
 System.out.println(" | -------");
 System.out.println(" | | - - |");
 System.out.println(" | | o |");
 System.out.println(" | -------");
 System.out.println(" | | ");
 System.out.println(" | / | ");
 System.out.println(" | / | ");
 System.out.println(" | / | ");
 System.out.println(" | | ");
 for (int j = 0; j < 5; j++) {
 System.out.println(" |");
 }
 System.out.println("__________");
 break;
 case 2:
 System.out.println(" ---------------------");
 System.out.println(" | |");
 System.out.println(" | |");
 System.out.println(" | -------");
 System.out.println(" | | - - |");
 System.out.println(" | | o |");
 System.out.println(" | -------");
 System.out.println(" | | ");
 System.out.println(" | / | \\ ");
 System.out.println(" | / | \\ ");
 System.out.println(" | / | \\ ");
 System.out.println(" | | ");
 for (int j = 0; j < 5; j++) {
 System.out.println(" |");
 }
 System.out.println("__________");
 break;
 case 1:
 System.out.println(" ---------------------");
 System.out.println(" | |");
 System.out.println(" | |");
 System.out.println(" | -------");
 System.out.println(" | | - - |");
 System.out.println(" | | o |");
 System.out.println(" | -------");
 System.out.println(" | | ");
 System.out.println(" | / | \\ ");
 System.out.println(" | / | \\ ");
 System.out.println(" | / | \\ ");
 System.out.println(" | | ");
 System.out.println(" | / ");
 System.out.println(" | / ");
 System.out.println(" | / ");
 for (int j = 0; j < 2; j++) {
 System.out.println(" |");
 }
 System.out.println("__________");
 break;
 case 0:
 System.out.println(" ---------------------");
 System.out.println(" | |");
 System.out.println(" | |");
 System.out.println(" | -------");
 System.out.println(" | | X X |");
 System.out.println(" | | o |");
 System.out.println(" | -------");
 System.out.println(" | | ");
 System.out.println(" | / | \\ ");
 System.out.println(" | / | \\ ");
 System.out.println(" | / | \\ ");
 System.out.println(" | | ");
 System.out.println(" | / \\");
 System.out.println(" | / \\ ");
 System.out.println(" | / \\ ");
 for (int j = 0; j < 2; j++) {
 System.out.println(" |");
 }
 System.out.println("__________");
 System.out.println("GAME OVER");
 break;
 }
 }
}
