/**
 * Catherine Zeng 7-7-13
 * 
 * 
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate. It calculated the amount of money a person had after traveling 
 * to countries by converting the currencies spent there to dollars and subtracting
 * this from the initial amount.
 * 
 * This also did calculations for the amount of a souvenir you can buy given a buget
 * and the amount of money left over.
 *
 *
 * �CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 */
public class CurrencyConversionV1
{
    public static void main(String [ ] args)
    {
        double startingUsDollars = 5000.00;     // local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRate = 13.09;          // one dollar is equal to 13.09 pesos
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double yenSpent=99939.75;               //yen spent in japan
        double yenExchangeRate=101.18;          //one dollar is equal to 101.18 yen
        double dollarsSpentInJapan=0.0;          //dollars spent in japan
        double eurosSpent=624.95;                  //euros spent in France
        double eurosExchangeRate=0.78;          //one dollar is equal to 0.78 euros
        double dollarsSpentInFrance=0.0;        //dollars spent in france
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        //remaining variables below here

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // convertion for Mexican pesos
        dollarsSpentInMexico=pesosSpent/pesoExchangeRate;
        remainingUsDollars=startingUsDollars-dollarsSpentInMexico;
        System.out.println("Starting US dollars = "+startingUsDollars);
        System.out.println("Amount spent in Mexico= "+pesosSpent+" pesos = "+dollarsSpentInMexico+" dollars");
        System.out.println("Remaining US dollars ="+remainingUsDollars);
        System.out.println("");
        

        // convertion for Japanese yen
         dollarsSpentInJapan=yenSpent/yenExchangeRate;
        remainingUsDollars-=dollarsSpentInJapan;
        System.out.println("Amount spent in Japan= "+yenSpent+" yen = "+dollarsSpentInJapan+" dollars");
        System.out.println("Remaining US dollars ="+remainingUsDollars);
        System.out.println("");
        

        // convertion for Euros
        dollarsSpentInFrance=eurosSpent/eurosExchangeRate;
        remainingUsDollars-=dollarsSpentInFrance;
        System.out.println("Amount spent in France= "+eurosSpent+" euros = "+dollarsSpentInFrance+" dollars");
        System.out.println("Remaining US dollars ="+remainingUsDollars);
        System.out.println("");
        
        //statement
        System.out.println("Mademoiselle Jacquard returned home with " +remainingUsDollars+" dollars.");


        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 4;                          //cost per item of first souvenir
        int budget1 = 50;                           //budget for first item
        int totalItem1 = budget1/costItem1;         //how many items can be purchased
        double fundsRemaining1 = budget1%costItem1;  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItem1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);

        //Calculations for Souvenir #2
        double costItem2 = 32.55;                       //cost per item of second souvenir
        int budget2 = 713;                              //budget for second item
        int totalItem2 = (int)((double)budget2/costItem2);     //how many items can be purchased
        double fundsRemaining2 = budget2%costItem2;   //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItem2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

