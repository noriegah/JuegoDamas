import java.util.*;
public class Tablero{
    public static void main(String[] args) {
     Tablero tablero = new Tablero();
    }
     int filas;
     int columnas;

    String[][] tableros = new String[8][8];
    Scanner scanner = new Scanner(System.in);

    public Tablero(){

    }


    public void pintarTablero(){
        int filas;
        int columnas;
        tableros[0][0]="";tableros[0][1]=" x ";tableros[0][2]="  ";tableros[0][3]=" x ";tableros[0][4]="  ";tableros[0][5]=" x";tableros[0][6]="  ";tableros[0][7]=" x";
        
          for (columnas=1; columnas<=4; columnas++) {
        
          for (filas=1; filas<=4; filas++) {
   
          System.out.print("██");
          System.out.print("  ");
        }
            
          System.out.println("");
          for (filas=1; filas<=4; filas++) {
                
            System.out.print("  ");
            System.out.print("██");
        }
            System.out.println("");
            
    
    }
}
  public void crearFichas(){
    int opCrearFichas;

    System.out.println("¿Desea ingresar las fichas al tablero? PRESIONE 1");
    for (columnas=1; columnas<=3; columnas++) {
        
      for (filas=1; filas<=4; filas++) {

      System.out.print("☻ ");
      System.out.print("  ");
      }
        
      System.out.println("");
    }
    for (columnas=1; columnas<=3; columnas++) {
        
      for (filas=1; filas<=4; filas++) {

      System.out.print(" ☺");
      System.out.print("  ");
      }
        
      System.out.println("");
    }
    //opCrearFichas=scanner.nextInt();
  
  }
    
}    