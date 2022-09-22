package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10100);
        customerLee.setcusomerName("Lee");

        VipCustomer customerKim = new VipCustomer();
        customerKim.setCustomerID(10101);
        customerKim.setcusomerName("Kim");
        customerKim.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo()); 
    }
}
