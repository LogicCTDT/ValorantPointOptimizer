import java.util.List;

class OptNode {
    List<Integer> items;
    int value;
    double cost;

    public OptNode(List<Integer> items, int value, double cost) {
        this.items = items;
        this.value = value;
        this.cost = cost;
    }
}
