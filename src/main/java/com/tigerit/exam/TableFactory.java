package com.tigerit.exam;

public class TableFactory {
	
	private String tableNameString;
	private String tableSizeString;
	private String tableColumnNameString;
	private String tableRowString;
	
	
	
	private TableModel table;
	
	
	public TableModel createTable(String tableName){
		this.table = new TableModel(tableName);
		System.out.println("Insert Table size string");
		Integer[] numbers = IO.readLineAsIntegers(IO.readLine());
		try {
			table.setTableSize(numbers[0], numbers[1]);
			System.out.println("Insert table column string");
			table.setTableColumnNames(IO.readLine());
			table.setTableData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return table;
	}
	
	
	
	
	

}
