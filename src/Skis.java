public class Skis extends Rental{
    private double length;
    private String mark;

    public Skis(double price, String day, double length, String mark) {
        super(price, day);
        this.length = length;
        this.mark = mark;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Skis{" +
                " price="+ getPrice()+
                " rentDay="+ getDay()+
                " length=" + length +
                ", mark='" + mark + '\'' +
                '}'+"\n";
    }
}
