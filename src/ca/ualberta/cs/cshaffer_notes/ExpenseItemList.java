package ca.ualberta.cs.cshaffer_notes;

import java.util.ArrayList;

public class ExpenseItemList {
	protected ArrayList<ExpenseItem> expenseItemList;
	
	
	public ExpenseItemList() {
		expenseItemList = new ArrayList<ExpenseItem>();
	}
	
	public ArrayList<ExpenseItem> getAllExpenseItems() {
		return expenseItemList;
	}

	// Returns ExpenseItem if in EIL; or ExpenseItem with name "-1" if not
	// http://stackoverflow.com/questions/16393709/getting-index-of-an-item-in-an-arraylist  [Jan. 30, 2015]
	public ExpenseItem getExpenseItem(ExpenseItem ei) {
		for(int i = 0; i < expenseItemList.size(); i++) {
			ExpenseItem expenseItem = expenseItemList.get(i);
			if( ei.equals(expenseItem) ) {
				return ei;
			}
		}	
		ExpenseItem defaultEi = new ExpenseItem("-1");
		return defaultEi;
	}

	public void addExpenseItem(ExpenseItem ei) {
		expenseItemList.add(ei);
	}

	public void removeExpenseItem(ExpenseItem ei) {
		expenseItemList.remove(ei);
	}

}
