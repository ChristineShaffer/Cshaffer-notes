package ca.ualberta.cs.cshaffer_notes.test;

import java.util.ArrayList;

import ca.ualberta.cs.cshaffer_notes.ExpenseItem;
import ca.ualberta.cs.cshaffer_notes.ExpenseItemList;
import junit.framework.TestCase;

public class ExpenseItemListTest extends TestCase {
	
	public void testExpenseItemListEmpty() {
		ExpenseItemList eiList = new ExpenseItemList();
		ArrayList<ExpenseItem> expenseItems = eiList.getAllExpenseItems();
		assertTrue("Expense item list is nonempty", expenseItems.size() == 0);
	}
	
	public void testExpenseItemListAdd() {
		// Create a new ExpenseItemList
		ExpenseItemList createdList = new ExpenseItemList();
		
		// Create a new ExpenseItem
		String eiName = "ei1";
		ExpenseItem ei1 = new ExpenseItem(eiName);
		
		// Add the new ExpenseItem to the new ExpenseItemList
		createdList.addExpenseItem(ei1);
		
		// Create a new ArrayList using the getAllExpenseItems method
		ArrayList<ExpenseItem> actualList = createdList.getAllExpenseItems();
		
		// Assert the size is 1
		assertTrue("Size of EIList is not 1", actualList.size() == 1);
		// Assert the ExpenseItemList contains our ExpenseItem
		assertTrue("The student was not added to the EIList", actualList.contains(ei1));
	}
	
	public void testExpenseItemListDelete() {
		// All of the stuff we did in the previous test
		ExpenseItemList createdList = new ExpenseItemList();
		String eiName = "ei1";
		ExpenseItem ei1 = new ExpenseItem(eiName);
		createdList.addExpenseItem(ei1);
		
		// Delete the ExpenseItem
		createdList.removeExpenseItem(ei1);
		
		// Get contents of ExpenseItemList
		ArrayList<ExpenseItem> actualList = createdList.getAllExpenseItems();
		
		// Assert that the ExpenseItemList is empty and that ei1 is not in it
		assertTrue("The list is not empty", actualList.size() == 0);
		assertFalse("The expense item is still in the list", actualList.contains(ei1));
	}

}
