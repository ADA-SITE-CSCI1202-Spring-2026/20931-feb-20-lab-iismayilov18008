package week03.invoice;

public class test {
    public static void main(String[] args) {

        Invoice inv = new Invoice("A2", "Salam", 5, 10.5);

        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price Per Item: " + inv.getPricePerItem());
    }
}
