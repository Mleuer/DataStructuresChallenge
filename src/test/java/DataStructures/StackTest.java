package DataStructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static jdk.jshell.spi.ExecutionControl.NotImplementedException;


public class StackTest {

    @Test
    public void lastInShouldBeFirstOut() throws NotImplementedException {
        var stringStack = new Stack<String>();

        stringStack.push("steal");
        stringStack.push("my");
        stringStack.push("sunshine");

        Assertions.assertEquals("sunshine", stringStack.pop());
    }

    @Test
    public void firstInShouldBeLastOut() throws NotImplementedException {
        var stringStack = new Stack<String>();

        stringStack.push("steal");
        stringStack.push("my");
        stringStack.push("sunshine");

        while (stringStack.size() > 1)
        {
            stringStack.pop();
        }

        Assertions.assertEquals("steal", stringStack.pop());
    }

    @Test
    public void popShouldReversePush() throws NotImplementedException {
        var stringStack = new Stack<String>();

        stringStack.push("steal");
        stringStack.push("my");
        stringStack.push("sunshine");

        Assertions.assertEquals("sunshine", stringStack.pop());
        Assertions.assertEquals("my", stringStack.pop());
        Assertions.assertEquals("steal", stringStack.pop());
    }

    @Test
    public void peekShouldNotMutateStackState() throws NotImplementedException {
        var stringStack = new Stack<String>();

        stringStack.push("my");
        stringStack.push("sunshine");

        Assertions.assertEquals("sunshine", stringStack.peek());
        Assertions.assertEquals("sunshine", stringStack.pop());
        Assertions.assertEquals("my", stringStack.pop());
    }
}