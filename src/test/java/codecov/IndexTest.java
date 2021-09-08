package codecov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndexTest {

    Index index = new Index();

    @Test
    public void testUncoveredIf() {
        assertEquals(false, index.uncovered_if(true));
        assertEquals(true, index.uncovered_if(false));
    }

    @Test
    public void TestFullyCovered() {
        assertEquals(true, index.fully_covered());
    }
    
    @Test 
    public void alwaysFail() {
        assertEquals(true, false);
    }
}
