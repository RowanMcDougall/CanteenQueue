
/**
 * A simple queue class.
 *
 * @author Rowan McDougall
 * @version 08/04/2022
 */
public class Queue
{
    private Element head; // the value at the front of the queue
    private Element tail; // the value at the back of the queue

    boolean queueEmpty(){
        if(head == null)
            return true;
        return false; // if head has a value queueEmpty is not true
    }

    public void enqueue(Element addFollower){
        if (queueEmpty()){
            this.head = addFollower;
            this.tail = addFollower;
        }
        else{
            this.tail.setFollower(addFollower);
            this.tail = addFollower;
        }
    }

    Element dequeue(){
        if (queueEmpty())
            return null;
        Element frontElement = this.head;
        Element nextFront = frontElement.follower;
        this.head = nextFront;
        return frontElement;
    }

    public int numBehind(Element p){
        if (p.follower == null)
            return 0;
        return 1 + numBehind(p.follower);
    }

    public int queueLength(){
        if(queueEmpty()) 
            return 0;
        return 1 + numBehind(this.head);
    }
}
