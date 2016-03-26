package com.tigerit.exam;


import static com.tigerit.exam.IO.*;

/**
 * All of your application logic should be placed inside this class.
 * Remember we will load your application from our custom container.
 * You may add private method inside this class but, make sure your
 * application's execution points start from inside run method.
 */
public class Solution implements Runnable {
	
	private TableFactory factory;
    @Override
    public void run() {
        // your application entry point

        // sample input process
    	System.out.println("Insert Number of test");
    	int numberOfTest= IO.readLineAsInteger();
        factory = new TableFactory();
        System.out.println("Insert Number of Table");
        Integer numberOfTable = IO.readLineAsInteger();
        for(int test = 1; test <= numberOfTest ; test++){
        	System.out.println("Test: "+ test );
			for (int i = 0; i < numberOfTable; i++) {
				System.out.println("Insert Table Name");
				TableModel table = factory.createTable(IO.readLine());

				System.out.println(table.toString());
			}
        }

        //Integer integer = readLineAsInteger();

        // sample output process
        //printLine(string);
        //printLine(integer);
    }
}
