// ExpenseItem is done

package ca.ualberta.cs.cshaffer_notes.test;

import ca.ualberta.cs.cshaffer_notes.ExpenseItem;
import junit.framework.TestCase;

public class ExpenseItemTest extends TestCase {
	
	public void testExpenseItemName() {
		String expenseItemName = "An EI";
		ExpenseItem expenseItem = new ExpenseItem(expenseItemName);
		assertTrue("Names are not equal", expenseItemName.equals(expenseItem.getExpenseItemName()));
	}

}
