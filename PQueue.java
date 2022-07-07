
/**
 * A priority queue class.
 *
 * @author Rowan McDougall
 * @version 08/04/2022
 */
public class PQueue
{
    private Queue lowP;
    private Queue highP;

    public PQueue(){
        lowP = new Queue();
        highP = new Queue();
    }

    boolean queueEmpty(){
        if(highP.queueEmpty() && lowP.queueEmpty())
            return true;
        else
            return false;
    }

    public void enqueue(Element addFollower, boolean high){
        if (high){
            highP.enqueue(addFollower);
        }
        else 
            lowP.enqueue(addFollower);
    }

    Element dequeue(){
        if (highP.queueEmpty()){
            return lowP.dequeue();
        }
        else
            return highP.dequeue();
    }
}
