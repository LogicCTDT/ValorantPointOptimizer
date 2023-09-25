import java.util.ArrayList;
import java.util.List;

class OptNode<T> {
    private List<TreeNode<T>> children;
    private int value;
    private double cost;

    public OptNode(int value, double cost) {
        this.value = value;
        this.cost = cost;
        this.children = new ArrayList<>();
    }
    public List<TreeNode<T>> getChildren() {
        return children;
    }
    public void addChild(TreeNode<T> child) {
        children.add(child);
    }
    public int getValue() {
        return value;
    }
    public double getCost() {
        return cost;
    }
}
