package PostOffice;

/**
 *
 * @author Joe
 */
public class noDelivery implements Letter {
    Recipient recipient;
    
    public noDelivery(Recipient recipient){
        this.recipient = recipient;
    }
    
    @Override
    public void execute(){
        recipient.refuse();
    }
    
    @Override
    public void undo(){
        recipient.accept();
    }
    
}