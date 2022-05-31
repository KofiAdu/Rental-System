public class Rental {
    private double price ;
    private String day;

    public Rental(double price, String day) {
        this.price = price;
        this.day = day;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "price=" + price +
                ", day='" + day + '\'' +
                '}';
    }
}
