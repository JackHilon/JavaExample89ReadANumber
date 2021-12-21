
package javaexample89readanumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaExample89ReadANumber {

    
    public static void main(String[] args) {
        
        
        try{
            // To read one char for-example-> (char) isr.read();
            InputStreamReader isr = new InputStreamReader(System.in);
            
            // BufferedReader:
            // Reads text from a character-input stream, buffering characters so as 
            // to provide for the efficient reading of characters, arrays, and lines.
            // ----
            // In general, each read request made of a Reader causes a corresponding 
            // read request to be made of the underlying character or byte stream. 
            // It is therefore advisable to wrap a BufferedReader around any Reader 
            // whose read() operations may be costly, such as FileReaders and InputStreamReaders.
            BufferedReader br = new BufferedReader(isr);
            // will buffer the input from the specified InputStreamReader. Without buffering, 
            // each invocation of read() or readLine() could cause bytes to be read 
            // from the InputStreamReader, converted into characters, and then returned, 
            // which can be very inefficient.
            
            
            System.out.print("Enter a number: ");
            String str = br.readLine();
            double d = Double.parseDouble(str);
            
            System.out.print("Your number is: "+d);
            System.out.println();
            
            // -----------------------------------------------------------------
            
            // read many numbers
            System.out.println("Enter many numbers in the sam line....");
            String line = br.readLine();
            
            String[] tokens = line.split("\\s");
            
            double[] numbers = DoubleHelper.StringArray2DoubleArray(tokens);
            
            System.out.println("Your doubles....");
            DoubleHelper.PrintDoubleArray(numbers);
            
            br.close();
        }
        
        
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }// end-main
    
}
