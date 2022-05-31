public class Boots extends Rental{
    private int size;
    private double stiffness;

    public Boots(double price, String day, int size, double stiffness) {
        super(price, day);
        this.size = size;
        this.stiffness = stiffness;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getStiffness() {
        return stiffness;
    }

    public void setStiffness(double stiffness) {
        this.stiffness = stiffness;
    }

    @Override
    public String toString() {
        return "Boots{" +
                " price="+ getPrice()+
                " rentDay="+ getDay()+
                " size=" + size +
                ", stiffness=" + stiffness +
                '}'+"\n";
    }
}
