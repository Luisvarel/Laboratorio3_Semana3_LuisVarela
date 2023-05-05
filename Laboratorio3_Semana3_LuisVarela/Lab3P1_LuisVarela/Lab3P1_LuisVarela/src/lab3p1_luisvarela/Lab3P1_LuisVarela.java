/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_luisvarela;
import java.util.Scanner;
/**
 *
 * @author Luis Andres Varela
 */
public class Lab3P1_LuisVarela {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        boolean fin_del_menu=true;
        while(fin_del_menu){
            System.out.println("1.Serie Euclidiana");
            System.out.println("2.Pokebola");
            System.out.println("3.¡OK Boomer!");
            System.out.println("4.Salir");
            int opcion=lea.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("Puntos a ingresar:");
                    int cantidad=lea.nextInt();
                    while(cantidad<=1){
                        System.out.println("Puntos a ingresar:");
                        cantidad=lea.nextInt();
                    }
                    double contador=0;
                    for(int i=1;i<=cantidad;i++){
                        System.out.println("X:");
                        double x=lea.nextDouble();
                        System.out.println("Y:");
                        double y=lea.nextDouble();
                        double resta=(x-y);
                        double potencia=Math.pow(resta, 2);
                        contador+=potencia;
                    }
                    double respuesta=Math.pow(contador, 0.5);
                    System.out.println("La distancia euclidiana es:"+respuesta);
                }
                break;
                case 2:{
                    System.out.println("Ingrese su cantidad de columnas");
                    int columnas=lea.nextInt();
                    int filas=(columnas*2)-1;
                    int mitad=(columnas/2)+1;
                    boolean mitad1=true;
                    for(int i=1;i<=columnas;i++){
                        for(int j=1;j<=filas;j++){
                                if(j==1){
                                    System.out.print("*");
                                }
                                if(mitad==i){
                                    mitad1=false;
                                    System.out.print("#");
                                }if(mitad1){
                            System.out.print("*");
                            }
                            }
                        if(i>mitad){
                            if(i!=columnas){
                                for(int c=1;c<filas;c++){
                                    System.out.print(" ");
                                }
                                    System.out.print("*");
                                }
                        }
                        
                        if(i==columnas)
                            for(int a=1;a<=filas;a++){
                                System.out.print("*");   
                            }
                        System.out.println("");
                        }
                    }
                        
                break;
                case 3:{
                    System.out.println("Ingrese su año de nacimiento:");
                    int nac=lea.nextInt();
                    while (nac<=1945){
                        System.out.println("Ingrese un año despues de 1945:");
                        nac=lea.nextInt();
                    }
                    if(nac<1960){
                        if(nac>1945){
                            System.out.println("¡Felicidades usted es de la Baby Boom Gen!");
                        }
                    }
                    if(nac<1974){
                        if(nac>=1960){
                            System.out.println("¡Felicidades usted es de la Generación X!");
                        }
                    }
                    if(nac<1980){
                        if(nac>=1975){
                            System.out.println("¡Felicidades usted es de la Xennials!");
                        }
                    }
                    if(nac<1990){
                        if(nac>=1980){
                            System.out.println("¡Felicidades usted es de la Millenials!");
                        }
                    }
                    if(nac<=2012){
                        if(nac>=1990){
                            System.out.println("¡Felicidades usted es de la Gen Z!");
                        }
                    }    
                    if(nac<=2025){
                        if(nac>=2013){
                            System.out.println("¡Felicidades usted es de la Gen Alpha!");
                        }
                    }    
                }
                break;
                case 4:{
                    fin_del_menu=false;
                }
                break;
                default:
                    System.out.println("error");
            }
        }
        // TODO code application logic here
    }
    
}
