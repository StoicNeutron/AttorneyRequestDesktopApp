package Java;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Thierry Manapsal
 * Workflow Object class
 */
public class WorkFlow<T> {

    /**
     * Queue of generic type
     */
    private Queue<T> queue;
    
    /**
     * Workflow constructor
     */
    public WorkFlow(){              //constructor
        queue = new LinkedList<T>();
    }

    /**
     * Adds next object to the workflow
     * @param object the obj we want to add
     */
    public void addNext(T object){  
        queue.add(object);
    }

    /**
     * Takes the next object off of the queue.
     * @return the object to be worked on.
     */
    public T getNext(){
        return queue.remove();
    }
    
    /**
     *Gives the size of the workflow.
     * @return the number of elements in the queue.
     */
    public int size(){
        return queue.size();
    }

    /**
     * Checks if there are any objects in the queue
     * @return whether there are objects present or not.
     */
    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
