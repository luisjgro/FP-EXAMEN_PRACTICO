package examen_practico_2;

import java.util.Scanner;

public class EXAMEN_PRACTICO_2 {

    public static void main(String[] args) {
        //Examen Practico
        //Luis Javier Guerrero Arellano
        //24550278
        int eleccion;
        double compuSelec;
        int ppt = 0;
        int fin;
        int marcah = 0, marcac = 0, empate = 0;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("BIENVENIDO/A A PIEDRA, PAPEL, TIJERAS");
        System.out.println("INSTRUCCIONES: ");
        System.out.println("EL JUEGO TERMINA HASTA QUE USTED LO INDIQUE");
        
        do{
            compuSelec = 0;
            System.out.println("Ingrese en base a su eleccion: ");
        System.out.println("Piedra = 1");
        System.out.println("Papel = 2");
        System.out.println("Tijeras = 3");
            System.out.println("Empieza: ");
             
            eleccion = captu.nextInt();
            captu.nextLine();
            compuSelec = Math.random() * 100;
            if (compuSelec >= 0 && compuSelec <=33)
                ppt = 1;
            else if(compuSelec >=34 && compuSelec <=66)
                ppt = 2;
            else if(compuSelec >= 67 && compuSelec <=100)
                ppt = 3;
            
            if(ppt == eleccion){
                empate++;
            System.out.println("Empate!!");
            }else if(ppt == 1 && eleccion == 2){
                marcah++;
                System.out.println("Ganas!!");
            }else if(ppt == 1 && eleccion == 3){
                marcac++;
                System.out.println("Pierdes!!");
            }else if(ppt == 2 && eleccion ==1){
                marcac++;
                System.out.println("Pierdes!!");
            }else if(ppt == 2 && eleccion == 3){
                marcah++;
                System.out.println("Ganas!!");
            }else if(ppt == 3 && eleccion == 1){
                marcah++;
                System.out.println("Ganas!!");
            }else if(ppt == 3 && eleccion == 2){
                marcac++;
                System.out.println("Pierdes!!");
            }
            System.out.println("MARCADOR: ");
            System.out.println("EMPATE = " + empate);
            System.out.println("TU = " + marcah);
            System.out.println("COMPUTADORA = " + marcac);
                System.out.println("Deseas terminar el juego? SI = 1, NO = 2");
                fin = captu.nextInt();
                captu.nextLine();
            }while (fin != 1);
            System.out.println("CONTADOR FINAL: Empate = " + empate + " Tu = " + marcah + " Computadora = " + marcac);
        }
    }
