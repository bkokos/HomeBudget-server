
package tdd.ai_generated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeneratedUnitTest {

    @Test
    void testAddOtherExpense() {
        GeneratedCode generatedCode = new GeneratedCode();
        generatedCode.addOtherExpense("Groceries");
        assertEquals("Groceries", generatedCode.otherExpenses.get(0)); 
    }

    @Test
    void testAddMultipleOtherExpenses() {
        GeneratedCode generatedCode = new GeneratedCode();
        generatedCode.addOtherExpense("Rent");
        generatedCode.addOtherExpense("Utilities");
        assertEquals(2, generatedCode.otherExpenses.size());
    }
}
