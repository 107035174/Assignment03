public class Customer {
    private String fName;
    private String lName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String fName, String lName, String socSecurityNum) {
        this.fName = fName;
        this.lName = lName;
        this.socSecurityNum = socSecurityNum;
    }

    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }

    public String getSocSercurityNum() {
        return socSecurityNum;
    }

    public void setSocSercurityNum(String socSercurityNum) {
        this.socSecurityNum = socSercurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String toString() {
        return "[" + fName + ", " + lName + ", " + "ssn: " + socSecurityNum + "]";
    }
}
