/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Briana Berger
 * @version 09/10/17
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        
        double yenSpent = 99939.75;            // Japanese Yen spent
        double yenExchangeRate = 107.8506;     // 1 US dollar = 107.8506 Yen
        double dollarsSpentInJapan = 0.0;      // US dollars spent in Japan
        double dollarsAfterJapan = 0.0;        // US dollars remaining after Japan

        double eurosSpent = 624.95;            // French Euros spent
        double eurosExchangeRate = .829681;     // 1 US dollar = .829681 Euro
        double dollarsSpentInFrance = 0.0;      // US dollars spent in France
        double dollarsAfterFrance = 0.0;        // US dollars remaining after France
        
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        System.out.println("Starting US Dollars:            " + startingUsDollars);
        System.out.println();
        
        // Conversion
        System.out.println("Mexico:");
        System.out.println("  Pesos spent:                  " + pesosSpent);
        dollarsSpentInMexico = (pesosSpent/pesoExchangeRate);
        System.out.println("  US dollars equivalent:        " + dollarsSpentInMexico);
        dollarsAfterMexico = (startingUsDollars - dollarsSpentInMexico);
        System.out.println("  US dollars remaining:         " + dollarsAfterMexico);
        System.out.println();
        
        System.out.println("Japan:");
        System.out.println("  Yen spent:                    " + yenSpent);
        dollarsSpentInJapan = (yenSpent/yenExchangeRate);
        System.out.println("  US dollars equivalent:        " + dollarsSpentInJapan);
        dollarsAfterJapan = (dollarsAfterMexico - dollarsSpentInJapan);
        System.out.println("  US dollars remaining:         " + dollarsAfterJapan);
        System.out.println();
        
        System.out.println("France:");
        System.out.println("  Euros spent:                  " + eurosSpent);
        dollarsSpentInFrance = (eurosSpent/eurosExchangeRate);
        System.out.println("  US dollars equivalent:        " + dollarsSpentInFrance);
        dollarsAfterFrance = (dollarsAfterJapan - dollarsSpentInFrance);
        System.out.println("  US dollars remaining:         " + dollarsAfterFrance);
        System.out.println();
        
        System.out.println("==============================================================");
        System.out.print("Total US dollars remaining:     " + dollarsAfterFrance);
        System.out.println();
        System.out.println();
        System.out.println();
        
        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                         //cost per item of first souvenir
        int budget1 = 100;                          //budget for first item
        int totalItems1 = 8;        //how many items can be purchased
        int fundsRemaining1 = 0;  //how much of the budget is left
        int totalCostOfItems1 = 0; //total cost of all items bought

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        totalCostOfItems1 = (costItem1 * totalItems1);
        fundsRemaining1 = (budget1 - totalCostOfItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;                              //budget for second item
        int totalItems2 = 16;    //how many items can be purchased
        double fundsRemaining2 = 0.0;   //how much of the budget is left
        double totalCostOfItems2 = 0; //total cost of all items bought

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        totalCostOfItems2 = (costItem2 * totalItems2);
        fundsRemaining2 = (budget2 - totalCostOfItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class