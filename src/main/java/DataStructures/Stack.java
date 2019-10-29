package DataStructures;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack <T> {
    private ArrayList<T> data = new ArrayList<>();

    /**
     * Places the element at the top of the stack
     * @param element The object to add to the stack
     */
    public void push(T element) {
        data.add(element);
    }

    /**
     * Removes the most recently added element from the top of the stack
     * @return The removed element
     */
    public T pop() {
        if (data.isEmpty()) {
            throw new EmptyStackException();
        } else {
            T obj = data.get(data.size() - 1);
            data.remove(data.size() - 1);
            return obj;
        }
    }

    /**
     * Returns but does not remove the most recently added element
     * @return The most recently added element
     */
    public T peek() {
        if (data.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return data.get(data.size() - 1);
        }
    }

    /**
     * @return The number of elements contained in the stack
     */
    public long size() {
        return data.size() - 1;
    }
}























