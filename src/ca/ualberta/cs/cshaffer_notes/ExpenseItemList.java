package ca.ualberta.cs.cshaffer_notes;

import java.util.ArrayList;

public class ExpenseItemList {
	protected ArrayList<ExpenseItem> expenseItemList;
	
	public ExpenseItemList() {
		expenseItemList = new ArrayList<ExpenseItem>();
	}

	// Gets a specific ExpenseItem from an ExpenseItemList
	public ExpenseItem getExpenseItem(ExpenseItem ei) {
		return null;
	}
	
	// Gets all ExpenseItems from an ExpenseItemList
	public ArrayList<ExpenseItem> getAllExpenseItems() {
		return expenseItemList;
	}

	public void addExpenseItem(ExpenseItem ei) {
		expenseItemList.add(ei);
	}

}
