package PostOffice;

/**
 *
 * @author Joe
 */
public class MailPerson {
    Letter[] accepted;
    Letter[] refused;
    Letter wrongAddress;
    
    
    public MailPerson(){
        accepted = new Letter[3];
        refused = new Letter[3];
        
        Letter noAddress = new NoAddress();
        for(int i = 0; i<3; i++){
            accepted[i] = noAddress;
            refused[i] = noAddress;
        }
        wrongAddress = noAddress;
    }
    
    public void setLetter(int mailSlot, Letter deliverLetter, Letter noDelivery){
        accepted[mailSlot] = deliverLetter;
        refused[mailSlot] = noDelivery;
    }
    
    public void letterAccepted(int mailSlot){
        accepted[mailSlot].execute();
        wrongAddress = accepted[mailSlot];
    }

    public void letterRefused(int mailSlot){
        refused[mailSlot].execute();
        wrongAddress = refused[mailSlot];
    }

    public void addressIsWrong(){
        wrongAddress.undo();
    }
    
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Mail Bag -------\n");
        for (int i = 0; i < accepted.length; i++) {
            stringBuff.append("[mailSlot " + i + "] " + accepted[i].getClass().getName()
                        + "    " + refused[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
