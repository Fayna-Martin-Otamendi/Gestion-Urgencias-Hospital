import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nuss, sintoma, exploracionInicial = 0, nivelPrioridad = 0, temperaturaActual = 0;
        String exploracionTexto = "", sintomaTexto = "";

        
        do {
         System.out.println("Ingrese su NUSS: ");
         while (!scanner.hasNextInt()) {
           System.out.println("Su NUSS es incorrecto. Ingrese su NUSS de nuevo: ");
           scanner.next();
         } 
         nuss = scanner.nextInt();
        } while (nuss < 100000 || nuss > 999999);
       
        do{
        System.out.println("¿Cuál es el síntoma del paciente? Elija opción:\nDolor: 0\nLesión traumática: 1\nFiebre alta: 2\nConfusión o desorientación: 3");
        while(!scanner.hasNextInt()) {
            System.out.println("Síntoma incorrecto. Ingrese síntoma de nuevo: ");
            scanner.next();
        }
        
        sintoma = scanner.nextInt();

        switch (sintoma) {
            case 0:
            sintomaTexto = "Confusión o desorientación";
            System.out.println("¿Cuál es su exploración? Elija opción:\nIntoxicacion por drogas: 0\nDeshidratación severa: 1\nAccidente cerebrovascular: 2\nHipoglucemia severa: 3");
            break;
            case 1:
            sintomaTexto = "Lesión traumática";
            System.out.println("¿Cuál es su exploración? Elija opción:\nFractura Ósea: 0\nHerida de bala: 1\nQuemadura: 2\nLesión cerebral traumática: 3");
            break;
            case 2:
            sintomaTexto = "Fiebre alta";
            System.out.println("¿Cuál es su exploración? Elija opción:\nNeumonía: 0\nMeningitis: 1\nInfección viral: 2\nReacción alérgica: 3");
            break;
            case 3:
            sintomaTexto = "Confusión o desorientación";
            System.out.println("¿Cuál es su exploración? Elija opción:\nIntoxicacion por drogas: 0\nDeshidratación severa: 1\nAccidente cerebrovascular: 2\nHipoglucemia severa: 3");
            break;  
            default:  
            System.out.println("Valor no valido");
        }
    } while (sintoma < 0 || sintoma > 3);
    
    do{
        while(!scanner.hasNextInt()) {
            System.out.println("Síntoma incorrecto. Ingrese síntoma de nuevo: ");
            scanner.next();
        }
    exploracionInicial = scanner.nextInt();
      
        switch (sintoma) {
            case 0:
             switch(exploracionInicial){
                case 0:
                exploracionTexto = "Dolor torácico";
                break;
                case 1:
                exploracionTexto = "Dolor abdominal";
                break;
                case 2:
                exploracionTexto = "Dolor de cabeza";
                break;
                case 3:
                exploracionTexto = "Migraña";
                break;
                default:
                System.out.println("Valor incorrecto");
             }
             break;
            case 1:
             switch(exploracionInicial){
                case 0:
                exploracionTexto = "Fractura ósea";
                break;
                case 1:
                exploracionTexto = "Herida de bala";
                break;
                case 2:
                exploracionTexto = "Quemadura";
                break;
                case 3:
                exploracionTexto = "Lesión cerebral traumática";
                break;
                default:
                System.out.println("Valor incorrecto");
             }
             break;
            case 2:
             switch(exploracionInicial){
                case 0:
                exploracionTexto = "Neumonía";
                break;
                case 1:
                exploracionTexto = "Meningitis";
                break;
                case 2:
                exploracionTexto = "Infección viral";
                break;
                case 3:
                exploracionTexto = "Reacción alérgica";
                break;
                default:
                System.out.println("Valor incorrecto");
             }
             break;
            case 3:
             switch(exploracionInicial){
                case 0:
                exploracionTexto = "Intoxicación por drogas o alcohol";
                break;
                case 1:
                exploracionTexto = "Deshidratación severa";
                break;
                case 2:
                exploracionTexto = "Accidente cerebrovascular";
                break;
                case 3:
                exploracionTexto = "Hipoglucemia severa";
                break;
                default:
                System.out.println("Valor incorrecto");
             }
             break;
            default:  
            System.out.println("Exploracion no válida");
        }
    } while (exploracionInicial < 0 || exploracionInicial > 3);
  


        do {
            System.out.println("¿Cuál es el nivel de prioridad del 0 al 5?");
            while (!scanner.hasNextInt()) {
                System.out.println("Valor no válido. Ingrese de nuevo: ");
                scanner.next();
            } 
            nivelPrioridad = scanner.nextInt();
           } while (nivelPrioridad < 0 || nivelPrioridad > 5);


        do {
            System.out.println("¿Cuál es la temperatura actual?");
            while (!scanner.hasNextInt()) {
                System.out.println("Valor no válido. Ingrese de nuevo: ");
                scanner.next();
            } 
            temperaturaActual = scanner.nextInt();
           } while (temperaturaActual < 27 || temperaturaActual > 45);

        System.out.println("El sintoma del paciente es: " + sintoma);
        System.out.println("La exploración inicial es: " + exploracionInicial);
        System.out.println("Nivel de prioridad: " + nivelPrioridad);
        System.out.println("Temperaruta actual: " + temperaturaActual);
        System.out.printf("NUSS: %d | Síntoma: %s | Exploración: %s | Prioridad: %d | Temperatura: %d°C\n",nuss, sintomaTexto, exploracionTexto, nivelPrioridad, temperaturaActual);


    
    }
}    