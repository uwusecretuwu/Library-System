package project_0;

import javax.swing.RowFilter;

public class customTableSorter extends RowFilter{
	private String entry= "";
	
	customTableSorter(String query){
		this.entry = query;
	}
	@Override
	public boolean include(Entry entry) {
		return entry.getStringValue(0).toLowerCase().indexOf(this.entry) >= 0;
	}

}
