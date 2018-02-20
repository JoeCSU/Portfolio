package smalltermprojectmvc;

/**
 *
 * @author Joe Antonacci
 */
public interface RentalObservableInterface {
    
    public void updateObservers();
    
    public void registerObserver(RentalObserver o);
    
    public void removeObserver(RentalObserver o);
    
}
