/********************************************
   *   AUTHORS:   <Jackson Loeffler, Keyan Zokaie, Qaseem Yousag, Michael Forbes>
   * COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
   *   LAST MODIFIED: <date of last change>
   ********************************************/


  /********************************************
   *   <Avg>
   *********************************************
   *   PROGRAM DESCRIPTION:
   *   <Wealthy disparity calculator>
   *********************************************
   *   ALGORITHM:
   *   <Pseudocode here>
   *********************************************
   *   STATIC METHODS:
   * <UML style list of static methods>
   *********************************************/

/**This code was made as a wealth disparity calculator.
   made to show the difference in wealth status and poverty
   status in different countries around the world using the US dollar as a baseline.
   I then calculate the different poverty rates and wealth rates of each country.

 */

public class Main
  {
    /***** CONSTANT SECTION *****/
    static final String CURRENCY = "USD";
    static final String PROGRAM_NAME = "Wealth disparity Analyzer"
    public static void main(String[] args)
    {

      {
    /***** DECLARATION SECTION *****/
    String countryName;
    double averageWealth;
    double medianWealth;
    double topOnePercentShare;
    double povertyRate;
    double calculateTopOnePercentPovertyRatio;


    int population;
    int unemployedPopulation;


    double ratio;
    double unemploymentRate;


    String cCountryName;
    double cAverageWealth;
    double cMedianWealth;
    double cTopOnePercentShare;
    double cPovertyRate;

    int cPopulation;
    int cUnemployedPopulation;


    String jCountryName;
    double jAverageWealth;
    double jMedianWealth;
    double jTopOnePercentShare;
    double jPovertyRate;

    int jPopulation;
    double jUnemployedPopulation;




    /***** INITIALIZATION SECTION *****/
    countryName = "Germany";
    averageWealth = 256000.0;
    medianWealth = 106000.0;
    topOnePercentShare = 28.0;
    povertyRate = 16.6;




    population = 84000000;
    unemployedPopulation = 4800000;


    cCountryName = "Canada";
    cAverageWealth = 520000;
    cMedianWealth = 338000;
    cTopOnePercentShare = 28.0;
    cPovertyRate = 10.6;


    cPopulation = 41400000;
    cUnemployedPopulation = 1482400;


    jCountryName = "Japan";
    jAverageWealth = 211846;
    jMedianWealth = 83843;
    jTopOnePercentShare = 30.0;
    jPovertyRate = 15.4;

    jPopulation = 122400000;
    jUnemployedPopulation = 25.0;







    double gRatio = calculateTopOnePercentToPovertyRatio(topOnePercentShare, povertyRate);
    double gUnemployment = calculateUnemploymentRate(population, unemployedPopulation);

    double cRatio = calculateTopOnePercentToPovertyRatio(cTopOnePercentShare, cPovertyRate);
    double cUnemployment = calculateUnemploymentRate(cPopulation, cUnemployedPopulation);

    double jRatio = calculateTopOnePercentToPovertyRatio(jTopOnePercentShare, jPovertyRate);
    double jUnemployment = calculateUnemploymentRate(jPopulation, jUnemployedPopulation);
    /***** OUTPUT SECTION *****/
    System.out.println("Country: " + countryName);
    System.out.println("---------------------------------------");




    System.out.println("Average Wealth: " + cAverageWealth + " " + CURRENCY);
    System.out.println("Median Wealth: " + cMedianWealth + " " + CURRENCY);
    System.out.println("Population: " + cPopulation);




    System.out.println("Top 1% Wealth Share: " + cTopOnePercentShare + "%");
    System.out.println("Poverty Rate: " + cPovertyRate + "%");
    System.out.println("Unemployed Population: " + cUnemployedPopulation);




    System.out.println("\n--- Calculated Results ---");




    System.out.println("Unemployment Rate: " + unemploymentRate + "%");
    System.out.println("Top 1% to Poverty Ratio: " + ratio);


    System.out.println("Country: " + cCountryName);
    System.out.println("---------------------------------------");




    System.out.println("Average Wealth: " + cAverageWealth + " " + CURRENCY);
    System.out.println("Median Wealth: " + cMedianWealth + " " + CURRENCY);
    System.out.println("Population: " + cPopulation);




    System.out.println("Top 1% Wealth Share: " + cTopOnePercentShare + "%");
    System.out.println("Poverty Rate: " + cPovertyRate + "%");
    System.out.println("Unemployed Population: " + cUnemployedPopulation);




    System.out.println("\n--- Calculated Results ---");




    System.out.println("Unemployment Rate: " + unemploymentRate + "%");
    System.out.println("Top 1% to Poverty Ratio: " + ratio);


    System.out.println("Country: " + countryName);
    System.out.println("---------------------------------------");




    System.out.println("Average Wealth: " + jAverageWealth + " " + CURRENCY);
    System.out.println("Median Wealth: " + jMedianWealth + " " + CURRENCY);
    System.out.println("Population: " + jPopulation);




    System.out.println("Top 1% Wealth Share: " + jTopOnePercentShare + "%");
    System.out.println("Poverty Rate: " + jPovertyRate + "%");
    System.out.println("Unemployed Population: " + jUnemployedPopulation);




    System.out.println("\n--- Calculated Results ---");




    System.out.println("Unemployment Rate: " + unemploymentRate + "%");
    System.out.println("Top 1% to Poverty Ratio: " + ratio);



  } }

    private static double calculateUnemploymentRate(int population, int unemployedPopulation) {
    }

    private static double calculateTopOnePercentToPovertyRatio(double topOnePercentShare, double povertyRate) {
    }
