import java.util.*;
public class Principal {
    public static void main(String[] args) {
       Principal principal = new Principal();  
    }
    Scanner scanner = new Scanner(System.in);
    Tablero insTablero = new Tablero();
    public Principal(){
        menuInicio();
    }
    public void menuInicio(){
        int opMenuInicio;
        System.out.println("Bienvenido al juego DAMAS IPC1");
        System.out.println("1. EntrarJuego 2.Salir");
        opMenuInicio=scanner.nextInt();

        if(opMenuInicio==1){
            entrarJuego();
        }else if(opMenuInicio==2){
            System.exit(1);
        }else{
            System.out.println("Seleccione una opcion valida por favor...");
        }
    }
    public void entrarJuego(){
        System.out.println("Entrando al juego...");
        scanner.nextLine();
        menuOpcionesJuego();
    }
    public void menuOpcionesJuego(){
        int opMenuOpcionesJuego;
        System.out.println("1.Registrar Jugador 2.Ver Puntuaciones 3.Estadisticas del Juego 4.Iniciar Partida");
        opMenuOpcionesJuego=scanner.nextInt();

        switch(opMenuOpcionesJuego){
            case 1:
                //registrarJugadores();
            break;

            case 2:
                //verPuntuaciones();
            break;

            case 3:
                //estadisticasJuego();
            break;

            case 4:
                iniciarPartida();
            break;

            default:
                System.out.println("Ingrese una opcion valida...");
            break;    
        }
    }
    public void iniciarPartida(){
        System.out.println("Pintando tablero...");
        scanner.nextLine();
        insTablero.pintarTablero();
        insTablero.crearFichas();
    }
    
    

}
