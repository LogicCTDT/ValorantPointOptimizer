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

    public List<Integer> addItem(List<Integer> resList, int n) {

        // Creates a list res with amountList.size() 0s.
        // TODO: Figure out why it gives me a problem. Think of cases where things don't work out
        List<Integer> res = Collections.nCopies(this.amountList.size(), 0);
        if (sum(resList, this.amountList).compareTo(n) >= 0) {
            return res;
        }
        else {
            //Need to do this once for every amount value. Then we return addItem(res, n), which will keep calling
            // addItem until it reaches the base case, returning all the combinations.
            for (int i : this.amountList) {
                int ind = this.amountList.get(i);
                res.add(ind, 1);
                return addItem(res, n);
            }
        }
        return res;
    }

    public static Integer sum(List<Integer> countList, List<Integer> amountList) {
        // countList and amountLIst should be the same size.
        // If countLIst is size 0, return 0.

        // TODO: Code not tested
        int i = 0;
        int res = 0;
        while (i < countList.size()) {
            res += countList.get(i) * amountList.get(i);
            i++;
        }

        return res;

    }

    public static void main(String[] args) {
        Optimizationator O = new Optimizationator(1500, Arrays.asList(500, 1500));
        System.out.println(O.getTotalCost());
        System.out.println(O.getAmountList());
    }

}
