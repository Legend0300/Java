public class Food {
    String name;
    static int counter;
    int foodcount;
    public Food(String name) {
        this.name = name;
        foodcount = ++counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Food [name=" + name + "]";
    }
}
