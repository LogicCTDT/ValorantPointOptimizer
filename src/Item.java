class Item {
    int value;
    double cost;
    double ratio;

    public Item(int value, int cost) {
        this.value = value;
        this.cost = cost;
        this.ratio = (double) value/cost;
    }
}
