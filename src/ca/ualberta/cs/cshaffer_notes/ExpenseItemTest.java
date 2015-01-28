// At 18:54

package ca.ualberta.cs.cshaffer_notes;

import junit.framework.TestCase;

public class ExpenseItemTest extends TestCase {
	public void testExpenseItem() {
		String expenseItemName = "An expense item";
		ExpenseItem expenseItem = new ExpenseItem(expenseItemName);
		assertTrue("Expense item name is not equal", expenseItemName.equals(expenseItem.getName()));
		
		/*ExpenseItem expenseItem = new ExpenseItem();
		Collection<> expenses = expenseItem.getItem();
		assertTrue("Empty expense item", expenses.size() == 0);*/
	}

}
