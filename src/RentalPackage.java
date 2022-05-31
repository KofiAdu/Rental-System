import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalPackage {
    private List<Rental> rentalPackage = new ArrayList<>();

    public static Skis SkiData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ski price");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter rent day");
        String day = scanner.nextLine();

        System.out.println("Enter ski length");
        double skiLength = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter ski mark");
        String skiMark = scanner.nextLine();

        return new Skis(price,day,skiLength,skiMark);
    }

    public static Boots BootsData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter boot price");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter rent day");
        String day = scanner.nextLine();

        System.out.println("Enter boot size");
        int size = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter boot stiffness");
        double stiffness = Double.parseDouble(scanner.nextLine());

        return new Boots(price,day,size,stiffness);
    }

    public static SkiPoles SkiPoleData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ski pole price");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter rent day");
        String day = scanner.nextLine();

        System.out.println("Enter ski pole length");
        double length = Double.parseDouble(scanner.nextLine());

        return new SkiPoles(price,day,length);
    }

    public static Helmet HelmetData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter helmet price");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter rent day");
        String day = scanner.nextLine();

        System.out.println("Enter helmet size");
        double size = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter helmet color");
        String color = scanner.nextLine();

        return new Helmet(price,day,size,color);
    }

    RentalPackage(){
        rentalPackage.add(SkiData());
        rentalPackage.add(BootsData());
        rentalPackage.add(SkiPoleData());
        rentalPackage.add(HelmetData()) ;
    }

    public void printTotal(){
        double total = 0.0;
        for( Rental rent: rentalPackage){

            System.out.print(rent.toString()) ;
            total += rent.getPrice() ;
        }
        System.out.println("Total Price: " + total) ;
}

}
