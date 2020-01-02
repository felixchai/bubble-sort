/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble;
import java.util.Scanner;
/**
 *
 * @author Felix
 */
public class Bubble {

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int i,p,t,first;
                 p = input.nextInt();
                int array []=new int[p];
                i = 0;
                while (i<p)
                {
                 array[i] = input.nextInt();
                 i++;
                }
                for(i=0; i< array.length -1 ; i++)
                        {
                            if(array[i] > array[i+1])
                            {
                                first = array[i];
                                array[i] = array[i+1];
                                array[i+1] = first;
                            }
                        }
                        
                        for(i=0 ; i< array.length; i++)
                        {
                            System.out.println(array[i]);
                        }
    }
    
}
