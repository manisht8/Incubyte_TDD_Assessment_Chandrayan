package main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

    @Test
    public void testForwardFromNorthIncrementsYBy1(){
        char[] commands = new char[] {'f'};
        String result = "(0,1,0,N)";
        assertEquals(result, chandrayan.finalDirection(commands));
    }

    @Test
    public void testRightFromNorthChangesDirectionToEast(){
        char[] commands = new char[] {'r'};
        String result = "(0,0,0,E)";
        assertEquals(result, chandrayan.finalDirection(commands));
    }

    @Test
    public void testBackwardFromUpDecrementsZBy1(){
        char[] commands = new char[] {'b'};
        String result = "(0,0,-1,U)";
        assertEquals(result, chandrayan.finalDirection(commands));
    }

}