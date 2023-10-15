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

    private List<Double> costList;
    public Optimizationator(int totalCost, List<Integer> amountList, List<Double> costList) {
        // THIS WORKS
        this.totalCost = totalCost;
        this.amountList = amountList;
        this.costList = costList;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public List<Integer> getAmountList() {
        return amountList;
    }

    /*
    Find the cheapest price in our list and return it.

     */

    public List<Object> getCheapestCombination(List<List<Integer>> combinations) {
        List<Object> res = new ArrayList<Object>();
        double globalCost = Double.POSITIVE_INFINITY;
        double oldSum = 0;
        for (List<Integer> listNum : combinations) {
            double cost = 0;
            for (Integer num : listNum) {
                int ind = this.amountList.indexOf(num);
                cost += this.costList.get(ind);
            }
            if (cost < globalCost) {
                res = new ArrayList<>(listNum);
                globalCost = cost;
                oldSum = listNum.stream().mapToInt(Integer::intValue).sum();
            }
            else if (cost == globalCost) {
                double newSum = listNum.stream().mapToInt(Integer::intValue).sum();
                if (newSum > oldSum) {
                    res = new ArrayList<>(listNum);
                    globalCost = cost;
                    oldSum = listNum.stream().mapToInt(Integer::intValue).sum();
                }

            }


        }
        res.add(globalCost);
        return res;
    }

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
            System.out.println(currentList);
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
        Optimizationator O = new Optimizationator(1500, Arrays.asList(500, 1500), Arrays.asList(5.00, 15.00));
        System.out.println(O.getTotalCost());
        System.out.println(O.getAmountList());
        System.out.println(O.allCombinations());
        List<List<Integer>> allCombos = O.allCombinations();
        System.out.println(O.getCheapestCombination(allCombos));


    }

}
