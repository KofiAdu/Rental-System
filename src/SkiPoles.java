public class SkiPoles extends Rental{
    private double length;

    public SkiPoles(double price, String day, double length) {
        super(price, day);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "SkiPoles{" +
                " price="+ getPrice()+
                " rentDay="+ getDay()+
                " length=" + length +
                '}'+"\n";
    }
}
