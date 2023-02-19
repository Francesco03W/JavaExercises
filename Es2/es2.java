package Es2;
// 19/02/2023

// scrivere un programma in java per sostituire ad ogni elemento int di un array, il prodotto degli altri elementi dello stesso

import java.util.Scanner;

public class es2 {

    private static void printArray(int[] array,int l_index)
    {
        for(int i=0;i<l_index;i++)
        {
            System.out.println(" "+array[i]+" ");
        }
    }
    private static void replaceProduct(int[] array,int[] new_arr,int l_index)
    {
        for(int i=0;i<l_index;i++)
        {
            int prodotto=1;
            for(int j=0;j<l_index;j++)
            {
                //scorro l'array tranne il valore preso in considerazione per il rimpiazzo
                if(j!=i)
                {
                    prodotto=prodotto*array[j];
                }
            }
            new_arr[i]=prodotto;
        }

    }
    public static void main(String[] args)
    {
        
        int l_index = 0;
        //inserire valori nell'array
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti valori si vogliono inserire?");
        l_index=scanner.nextInt();
        int array[] = new int[l_index];
        int new_arr[]= new int[l_index];
        for(int i=0;i<l_index;i++)
        {
            System.out.println("Inserire valore");
            array[i]=scanner.nextInt();
        }

        scanner.close();

        replaceProduct(array,new_arr,l_index);
        printArray(new_arr,l_index);

    }



}
