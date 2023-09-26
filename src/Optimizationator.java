import java.util.ArrayList;
import java.util.List;

public class Optimizationator<T> {
    // totalVP we want to get to
    // If we go over the total, we want to keep into the account of total points we went over buy and add that
    // To the cost times some factor.
    int totalCost;
    // Items we have placed into the Optimizationator
    ArrayList<Item> Items;


    public Optimizationator(int totalCost) {
        this.totalCost = totalCost;
        this.Items = new ArrayList<Item>();
    }


    public List<OptNode<T>> createSearchSpace(int n) {
        // This should generate an n-ary tree of all possible combinations to get to the required VP amount.
        // It will return the data structure.

        // n gives us our total amount of VP.

        // Let's generate a starter node, this one has 0 Vp and costs 0, just serves to connect the hole tree
        OptNode head = new OptNode(0, 0);


        // I want to be able to make a function to determine all combinations to a certain number from a finite list.






    }

    public List<List<Integer>> allCombinations(int n, List<Integer> intList) {
        // Generate every way that the numbers in intList can combine to a number equal or greater to n. However,
        // if the number is already greater than n, don't add additional values.

        // Recursive structure, we want to track our current total and the inputs we used to get there.
        // Then at each level, we want to check if we above our n total, if we are, return the input list and merge it
        // to the main, if we are not, then add every item to our input list.

        // To do this, we would first want to make a way to represent our list. Two ways, add items or array of length
        // intList, with slots indicating how many we take. Since combination don't matter, I think this is what to do




    }

    public List<Integer> addItem(List<Integer> resList, int add) {

    }




}
