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






    }




}
