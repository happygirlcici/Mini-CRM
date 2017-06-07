
package minicrm.entity;


public class Customer {
    
    public Customer(int id, String nameFirst, String nameLast, String address, String postalCode, String phoneNumber ,String SIN) {
        this.id = id;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber  = phoneNumber ;
        this.SIN = SIN;
    }

    public int id;
    public String nameFirst, nameLast, address,postalCode,phoneNumber ,SIN;

    @Override
    public String toString() {
        return String.format("%s %s ", nameFirst, nameLast,address,postalCode,phoneNumber ,SIN);
    }
    
}
