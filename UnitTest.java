package cz.packaroo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class UnitTest {

    @Test
    public void iReallyHateUnitTestingFloatsBecauseRoundingIsFun(){
        float float1 = 1.027f;
        float1*=float1;
        //assertEquals(1.054729f,float1);
        assertEquals(1.054729f, float1, 0.00001);
    }

    @Test
    public void doesLifoReturnInsertedValuesInCorrectOrder(){
        LIFO lifo = new LIFO(5);
        assertEquals(5,lifo.pop());
        assertNull(lifo.pop());
        lifo.push("job.");
        lifo.push("a ");
        lifo.push("need ");
        lifo.push("really ");
        lifo.push("I ");
        assertEquals("I ",lifo.pop());
        assertEquals("really ",lifo.pop());
        assertEquals("need ",lifo.pop());
        assertEquals("a ",lifo.pop());
        assertEquals("job.",lifo.pop());
    }

    @Test
    public void doesFifoReturnInsertedValuesInCorrectOrder(){
        FIFO fifo = new FIFO(6);
        assertEquals(6,fifo.dequeue());
        assertNull(fifo.dequeue());
        fifo.enqueue("Living ");
        fifo.enqueue("is ");
        fifo.enqueue("expensive.");
        assertEquals("Living ",fifo.dequeue());
        assertEquals("is ",fifo.dequeue());
        assertEquals("expensive.",fifo.dequeue());
    }

}
