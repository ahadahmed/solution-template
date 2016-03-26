package com.tigerit.exam;

import java.util.Arrays;

public class TableModel {

	private String tableName;
	private String aliasName;
	private String[] columnNames;
	private Integer[][] data;

	private int numberOfrows;
	private int numberOfColumns;
	private int rowCount = 0;

	public TableModel() {

	}

	public TableModel(String tableName) {
		this();
		this.tableName = tableName;

	}

	public void setTableSize(Integer coulumnNumber, Integer rowNumber) throws Exception {
		if (coulumnNumber < 2) {
			throw new Exception(" Number of Column can not be less than 2");
		}

		if (rowNumber > 100) {
			throw new Exception(" Number of Column can not be greater than 100");
		}
		this.columnNames = new String[coulumnNumber];
		this.data = new Integer[rowNumber][coulumnNumber];
		this.numberOfrows = rowNumber;
		this.numberOfColumns = coulumnNumber;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public int getNumberOfrows() {
		return numberOfrows;
	}

	public void setNumberOfrows(int numberOfrows) {
		this.numberOfrows = numberOfrows;
	}

	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	public void setNumberOfColumns(int numberOfColumns) {
		this.numberOfColumns = numberOfColumns;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public String[] getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(String[] columnNames) {
		this.columnNames = columnNames;
	}

	public Integer[][] getData() {
		return data;
	}

	public void setData(Integer[][] data) {
		this.data = data;
	}

	public void setTableColumnNames(String columnString) throws Exception {
		String[] columnNames = columnString.split(" ");
		if (columnNames.length > this.columnNames.length) {
			throw new Exception("Number of column names is greater than the number of column provided");
		} else {
			for (int i = 0; i < columnNames.length; i++) {
				this.columnNames[i] = columnNames[i];
			}
		}

	}

	public void setTableData() throws Exception {

		while (rowCount < numberOfrows) {
			System.out.println("Insert row data");
			Integer[] values = IO.readLineAsIntegers(IO.readLine());
			if (values.length > data[0].length) {
				throw new Exception("Number of column names is greater than the number of column provided");
			}
			data[rowCount] = values;
			rowCount++;
		}

	}

	@Override
	public String toString() {
		System.out.println("Table Name---" + this.tableName);
		for (String s : this.columnNames) {
			System.out.print(s + "\t");
		}
		System.out.println();
		System.out.println("---------------");
		for (int i = 0; i < numberOfrows; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		return "";
	}

}
