
/**
 * A basic generic element class.
 *
 * @author Rowan McDougall
 * @version 08/04/2022
 */
public class Element<E>
{
    boolean student;
    int arrivalTime;
    Element follower;
    
    private readCSV valuesCSV;

    public Element(boolean student){
        this.student = true;
    }
    
    public Element(int arrivalTime){
        
       
    }
    

    public void setFollower(Element follower){
        this.follower=follower;
    }
}
