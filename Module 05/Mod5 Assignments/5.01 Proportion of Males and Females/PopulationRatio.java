
/**
 * catherine zeng 9-2-13
 * simulations of the population of Nauru according to ratio
 */

import java.util.Scanner;

public class PopulationRatio
{
    public static void main(String[]args)
    {
        int males =0;
        int females =0;
        int counter=1;
        double randNum= 0.0;
        Scanner in = new Scanner (System.in);
        
        System.out.println("Number of trials: ");
        int trials=in.nextInt();
        
        while (counter<=trials)
        {
            randNum = Math.random();
            System.out.print (counter+"\t" +randNum);
            
            if(randNum <0.4757)
            {
                males++;
                System.out.println("\t males");
            }
            else
            {
                females++;
                System.out.println("\t females");
            }
            counter++;
    }
    System.out.println();
    System.out.println("Number of Males= "+males);
    System.out.println("Number of Females=" +females);
    
}
}
