package ca.ualberta.cs.cshaffer_notes;

import java.util.ArrayList;

public class ExpenseItemList {
	protected ArrayList<ExpenseItem> expenseItemList;
	
	public ExpenseItemList() {
		expenseItemList = new ArrayList<ExpenseItem>();
	}

	// Gets a specific ExpenseItem from an ExpenseItemList
	// http://stackoverflow.com/questions/16393709/getting-index-of-an-item-in-an-arraylist  [2015]
	public ExpenseItem getExpenseItem(ExpenseItem ei) {
		for(int i = 0; i < expenseItemList.size(); i++) {
			ExpenseItem expenseItem = expenseItemList.get(i);
			if( ei.equals(expenseItem.getName()) ) {
				return ei;
			}
		}
		
		return null;
	}
	
	// Gets all ExpenseItems from an ExpenseItemList
	public ArrayList<ExpenseItem> getAllExpenseItems() {
		return expenseItemList;
	}

	public void addExpenseItem(ExpenseItem ei) {
		expenseItemList.add(ei);
	}

	public void removeExpenseItem(ExpenseItem ei) {
		expenseItemList.remove(ei);
	}

}
