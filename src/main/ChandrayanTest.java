package main;
import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class ChandrayanTest {

    Chandrayan chandrayan = new Chandrayan(0, 0, 0, 'N');

    @Test
    public void testSetInitialPosition(){
        Chandrayan chandrayan = new Chandrayan(0, 0, 0, 'N');
    }

    @Test
    public void testPassingDirectionCommands(){
        char[] commands = new char[] {'f', 'r', 'u', 'b', 'l'};
        chandrayan.finalDirection(commands);
    }
}