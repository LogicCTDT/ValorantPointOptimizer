import java.util.*;

public class Main {

    static Map<Integer, Double> VP_money = new HashMap<>();
    static List<Integer> amount = new ArrayList<Integer>();
    public static void main(String[] args) {
        initalizeMoneyMap();
        intitalizeAmounts();
        Scanner VPhave = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How much VP do you have:");
        String currVP = VPhave.nextLine().replaceAll("\\s+","");  // Read user input
        Scanner VPtotal = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How much VP do you need:");
        String totalVP = VPtotal.nextLine().replaceAll("\\s+","");  // Read user input

        int needVP = Integer.parseInt(totalVP) -Integer.parseInt(currVP);

        List<Integer> ans = computeBest(needVP);
        double money = computeBestmoney(needVP);
        System.out.println(ans);
        print(ans);
        System.out.println(money);
    }


    private static void initalizeMoneyMap() {
        VP_money.put(475, 6.99);
        VP_money.put(1000, 13.99);
        VP_money.put(2050, 27.99);
        VP_money.put(3650, 47.99);
        VP_money.put(5350, 69.99);
        VP_money.put(11000, 139.99);
    }

    private static void intitalizeAmounts() {
        amount.add(475);
        amount.add(1000);
        amount.add(2050);
        amount.add(3650);
        amount.add(5350);
        amount.add(11000);
    }
    private static List<Integer> computeBest(int n) {
        // Always pick from the larger VP category, basically do the highest ammount, then if that doesn't work, do the
        // second highest,etc
        // TODO: FIX THIS SHIT, IT LITERALLY DOESN"T WORK, FIGURE OUT W HY YOU SUCK AT PROGRAMMING ADWAOKDAOSK


        // Okay, so we will be using the Breach an d Bound Algorithm, using the Greedy Heuristic to bind the upper bound
        // and relaxation for lower bound. These two are related to knapsack problem.


        // This function will be the dfs elements. The idea is visit nodes in bfs style.

        best_value = 0;







    }


    private static void print(List<Integer> numlist) {


        int i = 0;
        for (Integer num : numlist) {
            System.out.println("You need to purchase " + num.toString() + " packs of " + amount.get(i).toString() + " VP");
            i = i + 1;
        }



    }


}