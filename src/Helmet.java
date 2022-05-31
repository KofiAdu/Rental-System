public class Helmet extends Rental{
    private double size;
    private String color;

    public Helmet(double price, String day, double size, String color) {
        super(price, day);
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                " price="+ getPrice()+
                " rentDay="+ getDay()+
                " size=" + size +
                ", color='" + color + '\'' +
                '}'+"\n";
    }
}
