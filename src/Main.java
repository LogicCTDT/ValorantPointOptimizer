import java.util.*;

public class Main {

    //static List<Double> costList = Arrays.asList(6.99, 13.99, 27.99, 47.99, 69.99, 139.99);
    static List<Double> costList = Arrays.asList(7.00, 14.00, 28.00, 48.00, 70.00, 140.0012);
    static List<Integer> amountList = Arrays.asList(475, 1000, 2050, 3650, 5350, 11000);
    public static void main(String[] args) {



        Scanner VPhave = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How much VP do you have:");
        String currVP = VPhave.nextLine().replaceAll("\\s+","");  // Read user input
        Scanner VPtotal = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How much VP do you need:");
        String totalVP = VPtotal.nextLine().replaceAll("\\s+","");  // Read user input

        Optimizationator O = new Optimizationator(Integer.parseInt(totalVP), amountList, costList);
        System.out.println(O.getCheapestCombination(O.allCombinations()));







    }

}