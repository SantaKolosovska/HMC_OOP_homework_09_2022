public class Main {

    // --- Demonstration of Invoice class functionality ---

    public static void main(String[] args) {

        // invoice created with all args constructor
        Invoice invoiceAllArgsConstr = new Invoice("1xyz", "part1 description", 3, 16);

        System.out.println("");
        System.out.println("--- Invoice created with all args constructor ---");
        System.out.println(invoiceAllArgsConstr.toString());
        System.out.println("Invoice amount: " + invoiceAllArgsConstr.getInvoiceAmount());


        // test getters
        System.out.println("");
        System.out.println("--- Test getters ---");
        System.out.println(invoiceAllArgsConstr.toString());
        System.out.println("Invoice part number: " + invoiceAllArgsConstr.getPartNumber());
        System.out.println("Invoice part description: " + invoiceAllArgsConstr.getPartDescription());
        System.out.println("Invoice quantity: " + invoiceAllArgsConstr.getQuantity());
        System.out.println("Invoice item price: " + invoiceAllArgsConstr.getItemPrice());


        // invoice created with setters
        Invoice invoiceSetters = new Invoice();
        invoiceSetters.setPartNumber("22xyz");
        invoiceSetters.setPartDescription("part22 description");
        invoiceSetters.setQuantity(12);
        invoiceSetters.setItemPrice(12);

        System.out.println("");
        System.out.println("--- Invoice created with setters ---");
        System.out.println(invoiceSetters.toString());
        System.out.println("Invoice amount: " + invoiceSetters.getInvoiceAmount());


        // invoice with negative quantity
        Invoice invoiceNegQuant = new Invoice("333xyz", "part333 description", -22, 3);

        System.out.println("");
        System.out.println("--- Invoice with negative quantity ---");
        System.out.println(invoiceNegQuant.toString());
        System.out.println("Invoice amount: " + invoiceNegQuant.getInvoiceAmount());


        // invoice with negative price
        Invoice invoiceNegPrice = new Invoice();
        invoiceNegPrice.setQuantity(22);
        invoiceNegPrice.setItemPrice(-3);

        System.out.println("");
        System.out.println("--- Invoice with negative item price ---");
        System.out.println(invoiceNegPrice.toString());
        System.out.println("Invoice amount: " + invoiceNegPrice.getInvoiceAmount());


        // invoice with negative quantity and price
        Invoice invoiceNegQuantAndPrice = new Invoice();
        invoiceNegQuantAndPrice.setQuantity(-22);
        invoiceNegQuantAndPrice.setItemPrice(-3);

        System.out.println("");
        System.out.println("--- Invoice with negative quantity and price ---");
        System.out.println(invoiceNegQuantAndPrice.toString());
        System.out.println("Invoice amount: " + invoiceNegQuantAndPrice.getInvoiceAmount());



    }
}
