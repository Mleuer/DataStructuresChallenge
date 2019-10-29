package DataStructures;

import java.util.ArrayList;

import static jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Stack <T> {
    private ArrayList<T> data = new ArrayList<>();

    /**
     * Places the element at the top of the stack
     * @param element The object to add to the stack
     */
    public void push(T element) throws NotImplementedException {
        throw new NotImplementedException("Implement me!");
    }

    /**
     * Removes the most recently added element from the top of the stack
     * @return The removed element
     */
    public T pop() throws NotImplementedException {
        throw new NotImplementedException("Implement me!");
    }


    /**
     * Returns but does not remove the most recently added element
     * @return The most recently added element
     */
    public T peek() throws NotImplementedException {
        throw new NotImplementedException("Implement me!");
    }

    /**
     * @return The number of elements contained in the stack
     */
    public long size() throws NotImplementedException {
        throw new NotImplementedException("Implement me!");
    }
}
