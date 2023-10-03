import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Optimizationator<T> {
    // totalVP we want to get to
    // If we go over the total, we want to keep into the account of total points we went over buy and add that
    // To the cost times some factor.
    private int totalCost;

    private List<Integer> amountList;

    public Optimizationator(int totalCost, List<Integer> amountList) {
        // THIS WORKS
        this.totalCost = totalCost;
        this.amountList = amountList;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public List<Integer> getAmountList() {
        return amountList;
    }

    //public List<OptNode<T>> createSearchSpace(int n) {
        // This should generate an n-ary tree of all possible combinations to get to the required VP amount.
        // It will return the data structure.

        // n gives us our total amount of VP.

        // Let's generate a starter node, this one has 0 Vp and costs 0, just serves to connect the hole tree
        //OptNode head = new OptNode(0, 0);


        // I want to be able to make a function to determine all combinations to a certain number from a finite list.






   // }

    //public List<List<Integer>> allCombinations(int n, List<Integer> intList) {
        // Generate every way that the numbers in intList can combine to a number equal or greater to n. However,
        // if the number is already greater than n, don't add additional values.

        // Recursive structure, we want to track our current total and the inputs we used to get there.
        // Then at each level, we want to check if we above our n total, if we are, return the input list and merge it
        // to the main, if we are not, then add every item to our input list.

        // To do this, we would first want to make a way to represent our list. Two ways, add items or array of length
        // intList, with slots indicating how many we take. Since combination don't matter, I think this is what to do




    //}
    /*
    This function should return a List of all possible combinations of amounts that can make totalCost from the amounts
    given in amountList
     */

    public List<List<Integer>> allCombinations() {
        // The indea behind all combinations is to create a bunch of branches then collect all the branches at the end

        // We want to add take our smallest cases and add one to what we think is correct then return it

        List<List<Integer>> result = new ArrayList<>();
        allCombinationsHelper(result, new ArrayList<>(), 0, this.totalCost);
        return result;




    }

    public void allCombinationsHelper(List<List<Integer>> result, List<Integer> currentList, int start, int target) {
        if (target <= 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        else {
            for (int i = start; i < this.amountList.size(); i++) {
                currentList.add(this.amountList.get(i));
                allCombinationsHelper(result, currentList, start, target - this.amountList.get(i));
                currentList.remove(currentList.size() - 1);
            }
        }


    }


    public Integer sum(List<Integer> countList) {
        // countList and amountLIst should be the same size.
        // If countLIst is size 0, return 0.

        // TODO: Code not tested
        int j = 0;
        int resl = 0;
        while (j < countList.size()) {
            resl += countList.get(j) * this.amountList.get(j);
            j++;
        }

        return resl;

    }

    public static void main(String[] args) {
        Optimizationator O = new Optimizationator(1500, Arrays.asList(500, 1500));
        System.out.println(O.getTotalCost());
        System.out.println(O.getAmountList());
        System.out.println(O.allCombinations());



    }

}
