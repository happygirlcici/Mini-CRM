
package minicrm.entity;


public class Interaction {
     public Interaction(int interactionID , int customerID ,int repID ,String date  , String notes) {
        this.interactionID = interactionID;
        this.customerID = customerID;
        this.repID = repID;
        this.date = date;
        this.notes = notes;
        
    }

    public int interactionID,customerID,repID;
    public String date, notes;

    @Override
    public String toString() {
        return String.format("%s %s %s %s", interactionID, customerID,repID,date,notes);
    }
    
}
