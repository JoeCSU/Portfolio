package PostOffice;

/**
 *
 * @author Joe Antonacci
 */
public class PostOffice {


    public static void main(String[] args) {
        MailPerson mailPerson = new MailPerson();
        Recipient recipient = new Recipient();
        
        DeliverLetter letter = new DeliverLetter(recipient);
        noDelivery wrongLetter = new noDelivery(recipient);
        
        mailPerson.setLetter(0, letter, wrongLetter);
        mailPerson.setLetter(1, letter, wrongLetter);
        mailPerson.letterAccepted(0);
        mailPerson.letterRefused(1);
        mailPerson.addressIsWrong();
    
        System.out.println(mailPerson);
    }
    
}
