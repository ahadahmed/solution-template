package com.tigerit.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Faisal Ahmed
 * This is a helper class for input/output in java.
 * Your don't need to use it if you want. This is
 * just for your convenience. Don't use Scanner or
 * System.console() stuff for input.
 */
public class IO {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    IO() {}

    public static String readLine() {
        String value;
        try {
            value = reader.readLine();
        } catch (IOException ex) {
            value = null;
        }
        return value;
    }

    public static Integer readLineAsInteger() {
        return Integer.parseInt(readLine());
    }

    public static void printLine(Object value) {
        System.out.println(readLine());
    }
    
    public static Integer[] readLineAsIntegers(String lineOfIntegers){
    	Integer[] values;
    	String[] numbers = lineOfIntegers.split(" ");
    	values = new Integer[numbers.length];
    	for(int i = 0; i< numbers.length; i++){
    		try{
    			
    			values[i] = Integer.valueOf(numbers[i]);
    		}catch(NumberFormatException e){
    			System.err.println("The number is not valid integer");
    		}
    	}
    	return values;
    }
}
