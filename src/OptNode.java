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


    //Let's make 6 methods for our static classes

    public OptNode<T> OptNode475() {
        OptNode<T> res = new OptNode(475, 6.99);
        return res;
    }

    public OptNode<T> OptNode1000() {
        OptNode<T> res = new OptNode(1000, 13.99);
        return res;
    }

    public OptNode<T> OptNode2050() {
        OptNode<T> res = new OptNode(2050, 27.99);
        return res;
    }

    public OptNode<T> OptNode3650() {
        OptNode<T> res = new OptNode(3650, 47.99);
        return res;
    }
    public OptNode<T> OptNode5350() {
        OptNode<T> res = new OptNode(5350, 69.99);
        return res;
    }
    public OptNode<T> OptNode11000() {
        OptNode<T> res = new OptNode(11000, 139.99);
        return res;
    }

    public static void main(String[] args) {
    }
}

