package PostOffice;

/**
 *
 * @author Joe
 */
public class DeliverLetter implements Letter {
    Recipient recipient;
    
    public DeliverLetter(Recipient recipient){
        this.recipient = recipient;
    }
    
    @Override
    public void execute(){
        recipient.accept();
    }
    
    @Override
    public void undo(){
        recipient.refuse();
    }    
}
