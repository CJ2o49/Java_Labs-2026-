interface Payable {

    void makePayment(double amount);
}

interface Printable {

    void printDocument();
}

class Invoice implements Payable, Printable {

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment made: Rs. " + amount);
    }

    @Override
    public void printDocument() {
        System.out.println("Invoice printed successfully.");
    }

    public static void main(String[] args) {

        Invoice invoice = new Invoice();

        // Direct calls
        invoice.makePayment(1500);
        invoice.printDocument();

        // Interface reference
        Payable payable = invoice;
        payable.makePayment(2000);
    }
}