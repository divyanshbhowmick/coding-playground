package lld.solidprinciples;

/**
 *
 */
public class SingleResponsibility {
    /**
     * This class is only responsible for handling the calculations without any worry about DB or Printing responsibility.
     */
    class Invoice {
        private Marker marker;
        private int quantity;

        public Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        public int calculateTotal() {
            return (int) ((marker.price) * this.quantity);
        }
    }

    /**
     * This class only handles printing logic.
     */
    class InvoicePrinter {
        private Invoice invoice;

        void print(){
            System.out.println(invoice);
        }
    }

    /**
     * This class handles DB related operations
     */
    class InvoiceDao{
        Invoice invoice;
        public InvoiceDao(Invoice invoice){
            this.invoice = invoice;
        }

        public void saveToDB(){}
    }


    class Marker {
        private float price;

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }
    }
}
