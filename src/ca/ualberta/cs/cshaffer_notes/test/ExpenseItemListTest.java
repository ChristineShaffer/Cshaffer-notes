package ca.ualberta.cs.cshaffer_notes.test;

import java.util.ArrayList;

import ca.ualberta.cs.cshaffer_notes.ExpenseItem;
import ca.ualberta.cs.cshaffer_notes.ExpenseItemList;
import junit.framework.TestCase;

public class ExpenseItemListTest extends TestCase {
	
	// Test for getAllExpenseItems() with size zero
	public void testExpenseItemListEmpty() {
		// Create new ExpenseItemList
		ExpenseItemList eiList = new ExpenseItemList();
		// Use "getAllExpenseItems()" to get copy of the EIL
		ArrayList<ExpenseItem> expenseItems = eiList.getAllExpenseItems();
		// Assure correctness of getAllExpenseItems()
		assertTrue("Expense item list is nonempty", expenseItems.size() == 0);
	}

	// Test for addExpenseItem()
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
	
	// Test for getAllExpenseItems() with size >= 2
	public void testgetAllExpenseItemsMoreThan1() {
		ExpenseItemList createdList = new ExpenseItemList();
		
		String ei1Name = "ei1";
		String ei2Name = "ei2";
		ExpenseItem ei1 = new ExpenseItem(ei1Name);
		ExpenseItem ei2 = new ExpenseItem(ei2Name);
		createdList.addExpenseItem(ei1);
		createdList.addExpenseItem(ei2);
		
		ArrayList<ExpenseItem> actualList = createdList.getAllExpenseItems();
		
		assertTrue("Returned ExpenseItemList size is not 2", actualList.size() == 2);
		assertTrue("Returned EIL does not contain all EIs", actualList.contains(ei1) && actualList.contains(ei2));
	}
	
	// Test removeExpenseItem() from EIL
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

	// Test getExpenseItem( ExpenseItem )
	public void testExpenseItemListgetEI() {
		ExpenseItemList createdList = new ExpenseItemList();
		
		String ei1Name = "ei1";
		String ei2Name = "ei2";
		ExpenseItem ei1 = new ExpenseItem(ei1Name);
		ExpenseItem ei2 = new ExpenseItem(ei2Name);
		createdList.addExpenseItem(ei1);
		createdList.addExpenseItem(ei2);
		
		ExpenseItem retEI = createdList.getExpenseItem(ei1);
		assertTrue("Returned expense item not the same as ei1", retEI.equals(ei1));
		
		retEI = createdList.getExpenseItem(ei2);
		assertTrue("Returned expense item not the same as ei2", retEI.equals(ei2));
		
		String ei3Name = "ei3";
		ExpenseItem ei3 = new ExpenseItem(ei3Name);
		retEI = createdList.getExpenseItem(ei3);
		assertTrue("Didn't return default expense item", retEI.getExpenseItemName() == "-1");
		
		createdList.removeExpenseItem(ei1);
		createdList.removeExpenseItem(ei2);
		assertTrue("Didn't return default expense item on empty EIL", retEI.getExpenseItemName() == "-1");
	}
	
}
