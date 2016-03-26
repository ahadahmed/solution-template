package com.tigerit.exam;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JTable;

/**
 * Do not change this class file.
 * this file is for your application testing.
 */
public class CommandLineApp {
	public static Map<String, TableModel> tableMap = new HashMap<String, TableModel>();
    public static void main(String... args) {
        System.out.println("Running Solution ...");
        new Solution().run();
        //System.out.println(IO.readLineAsInteger());
       /* TableFactory factory = new TableFactory();
        System.out.println("Insert Number of Table");
        Integer numberOfTable = IO.readLineAsInteger();
        
        for(int i = 0; i< numberOfTable; i++){
        	System.out.println("Insert Table Name");
        	TableModel table = factory.createTable(IO.readLine());
        	tableMap.put(table.getTableName(), table);
        	
        	System.out.println(table.toString());
        }*/
        
        System.out.println("Ending Process ...");
        
        
    }
}
