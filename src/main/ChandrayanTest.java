package main;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChandrayanTest {

    @Test
    public void testChandrayan(){
        Chandrayan chandrayan = new Chandrayan();
        chandrayan.finalDirection();

    }
    @Test
    public void testSetInitialPosition(){
        Chandrayan chandrayan = new Chandrayan(0, 0, 0, 'N');
    }
}