import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * Laptop
 */
public class Laptop {
    String name;
    String brand;
    Integer ram;
    Integer ssd;
    String os;
    String colour;

    public Laptop(String name, String brand, Integer ram, Integer ssd, String os,
            String colour) {
        this.name = name;
        this.brand = brand;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "\nLaptop [brand: " + brand + ", name: " + name + ", RAM (GB): " + ram
                + ", SSD (GB): " + ssd + ", os: " + os + ", colour: " + colour + "]\n";
    }

    public int hashCode() {
        return (int) (this.name.hashCode() + this.brand.hashCode() + this.ram + this.ssd + this.os.hashCode()
                + this.colour.hashCode());
    }

    public boolean equals(Object laptop) {
        Laptop newLaptop = (Laptop) laptop;
        return this.name.equals(newLaptop.name) && this.brand.equals(newLaptop.brand) && this.ram.equals(newLaptop.ram)
                && this.ssd.equals(newLaptop.ssd) && this.os.equals(newLaptop.os) && this.colour.equals(newLaptop.colour);
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Mac Book Air 13", "Apple", 16, 512, "macOS", "midnight");
        Laptop laptop2 = new Laptop("MacBook Pro 13", "Apple", 8, 256, "macOS", "grey space");
        Laptop laptop3 = new Laptop("MacBook Pro 15 Mid", "Apple", 16, 512, "macOS", "metal");
        Laptop laptop4 = new Laptop("Aspire 7 A715-51G 1920x1080", "Acer", 32, 512, "Windows 11 Home", "black");
        Laptop laptop5 = new Laptop("IdeaPad Gaming 3 15IHU6 (82K1010KRK)", "LENOVO", 8, 256, "Windows 10 Home",
                "shadow black");
        Laptop laptop6 = new Laptop("G5 KF Intel", "GIGABYTE", 16, 512, "Windows 11 Home", "shadow black");
        Laptop laptop7 = new Laptop("G5 KF Intel", "GIGABYTE", 16, 512, "Windows 11 Home", "shadow black");
        Laptop laptop8 = new Laptop("G5 KF Intel", "GIGABYTE", 16, 512, "Windows 11 Home", "shadow black");

        HashSet<Laptop> data = new HashSet<>(List.of(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7,laptop8));
        System.out.println(data);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n0 - фильтр по SSD\n1 - фильтр по RAM \n2 - фильтр по Brand");
        System.out.print("Введите параметр фильтра: " );
        int num = scanner.nextInt();
        switch (num) {
            case 0:
                System.out.print("Введите параметр SSD: ");
                int volumeSSD = scanner.nextInt();
                for (Laptop laptop : data) {
                    if (laptop.ssd == volumeSSD)
                        System.out.println(laptop);
                        
                }
                break;
            case 1:
                System.out.print("Введите параметр RAM: ");
                int volumeRAM = scanner.nextInt();
                for (Laptop laptop : data) {
                    if (laptop.ram == volumeRAM)
                        System.out.println(laptop);
                        
                }
                break;
            case 2:
                System.out.print("Введите параметр Brand: ");
                String volumeBrand = scanner.next();
                for (Laptop laptop : data) {
                    if (laptop.brand.equals(volumeBrand))
                        System.out.println(laptop);
                        
                }
                break;
            default:
                System.out.print("Вы что то не то ввели ");

        }
    }
}