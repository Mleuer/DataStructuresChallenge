package DataStructures;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void lastInShouldBeFirstOut() {
        var stringStack = new Stack<String>();

        stringStack.push("steal");
        stringStack.push("my");
        stringStack.push("sunshine");

        Assertions.assertEquals("sunshine", stringStack.pop());
    }

    @Test
    public void firstInShouldBeLastOut() {
        var stringStack = new Stack<String>();

        stringStack.push("steal");
        stringStack.push("my");
        stringStack.push("sunshine");

        while (stringStack.size() > 0)
        {
            stringStack.pop();
        }

        Assertions.assertEquals("steal", stringStack.pop());
    }

    @Test
    public void popShouldReversePush() {
        var stringStack = new Stack<String>();

        stringStack.push("steal");
        stringStack.push("my");
        stringStack.push("sunshine");

        Assertions.assertEquals("sunshine", stringStack.pop());
        Assertions.assertEquals("my", stringStack.pop());
        Assertions.assertEquals("steal", stringStack.pop());
    }

    @Test
    public void peekShouldNotMutateStackState() {
        var stringStack = new Stack<String>();

        stringStack.push("my");
        stringStack.push("sunshine");

        Assertions.assertEquals("sunshine", stringStack.peek());
        Assertions.assertEquals("sunshine", stringStack.pop());
        Assertions.assertEquals("my", stringStack.pop());
    }
}