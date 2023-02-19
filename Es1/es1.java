// 19/02/2023
//scrivi un programma in java per calcolare l'area di un poligono
//area= (n*(s^2))/4*(tan(pi/n))  n=numero di lati, s lunghezza di un lato

import java.util.Scanner;
import java.lang.Math; //libreria matematica



public class es1{


    private static final double PI=3.14;

    private static double polygonArea(int n, int lungh)
    {
        double ris= (n*(Math.pow(lungh,2)))/(4*(Math.tan(PI/n)));

        return ris;
    }


    public static void main(String[] args)
    {
        
        //INPUT 

        //prendo numero di lati e lunghezza dei lati in input
        Scanner scanner = new Scanner(System.in);
        int nlati=-1;
        while(nlati<3) //se ha meno di 3 lati non è un poligono
        {
            System.out.println("Inserire il numero di lati ");
            nlati=scanner.nextInt();
        }

        
        int lungh=-1;
        while(lungh<=0)
        {
            System.out.println("Inserire la lunghezza di ogni lato ");
            lungh=scanner.nextInt();
        }

        scanner.close();

        double area=polygonArea(nlati,lungh);

        System.out.println("L'area del poligono di "+nlati+" lati di lunghezza "+lungh+" è di "+area);


    }
}


