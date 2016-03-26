package com.tigerit.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class JoinTableFactory {

	private ArrayList<ArrayList<Integer>> reusultSet = new ArrayList<ArrayList<Integer>>();

	private HashMap<Integer, ArrayList<Integer>> mappedRows;

	private TableModel firstTable;
	private TableModel secondTable;
	private int firstTableColumnNumber;
	private int secondTableColumnNumber;

	private boolean isFristTableSmaller = true;

	public void joinTable(TableModel a, TableModel b, int firstTableColumnNumber, int secondTableColumnNumber) {

	}

	private HashMap<Integer, ArrayList<Integer>> mapTowTable() {
		Integer[][] firstTableData = firstTable.getData();
		Integer[][] secondTableData = secondTable.getData();
		this.mappedRows = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> secondTableMappedRows;

		if (isFristTableSmaller) {

			for (int i = 0; i < firstTableData.length; i++) {
				int firstTableCurrentData = firstTableData[i][firstTableColumnNumber];
				secondTableMappedRows = new ArrayList<Integer>();

				for (int j = 0; j < secondTableData.length; j++) {
					if (firstTableCurrentData == secondTableData[j][secondTableColumnNumber]) {
						secondTableMappedRows.add(j);
					}
				}

				if (secondTableMappedRows.size() > 0) {
					mappedRows.put(i, secondTableMappedRows);
				}
			}

		} else {

			for (int i = 0; i < secondTableData.length; i++) {

				int secondTableCurrentData = secondTableData[i][secondTableColumnNumber];
				secondTableMappedRows = new ArrayList<Integer>();

				for (int j = 0; j < firstTableData.length; j++) {
					if (secondTableCurrentData == firstTableData[j][firstTableColumnNumber]) {
						secondTableMappedRows.add(j);
					}
				}

				if (secondTableMappedRows.size() > 0) {
					mappedRows.put(i, secondTableMappedRows);
				}

			}
		}
		return mappedRows;
	}

	private void createResultSet(HashMap<Integer, ArrayList<Integer>> mappedRows) {
		int index = 0;
		for (Integer k : mappedRows.keySet()) {
			Integer[] firstTablerow = firstTable.getData()[k];
			reusultSet.add((ArrayList<Integer>) Arrays.asList(firstTablerow));
			index = firstTablerow.length;
			ArrayList<Integer> secondTableRowNumbers = mappedRows.get(k);
			for (Integer z : secondTableRowNumbers) {
				Integer[] secondTablerow = secondTable.getData()[z];

			}
		}

	}

	private void cheackTablesSize() {
		if (firstTable.getNumberOfrows() > secondTable.getNumberOfrows()) {
			isFristTableSmaller = false;
		}

	}

}
