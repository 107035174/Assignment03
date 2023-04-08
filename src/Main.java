public class Main {
    public static void main(String[] args) {
        Address add1 = new Address("South D st", "Fairfield", "Iowa", "52556");
        Address add2 = new Address(" N Western Ave", "Chicago", "IL", "60612");
        Address add3 = new Address("Joslen Blvd", "Hudson", "New York", "12534");

        Customer c1 = new Customer("James", "Smith", "318155763");
        c1.setShippingAddress(add1);
        c1.setBillingAddress(add1);
        Customer c2 = new Customer("Michael", "Garcia", "519289149");
        c2.setShippingAddress(add2);
        c2.setBillingAddress(add2);
        Customer c3 = new Customer("John", "Doe", "773448177");
        c3.setShippingAddress(add3);
        c3.setBillingAddress(add3);

        Customer[] arrCustomer = new Customer[3];
        arrCustomer[0] = c1;
        arrCustomer[1] = c2;
        arrCustomer[2] = c3;

        for (Customer customer : arrCustomer) {
            if (customer.getBillingAddress().city.equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}