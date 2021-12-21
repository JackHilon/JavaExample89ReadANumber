
package javaexample89readanumber;


public class DoubleHelper {
    
    public static double[] StringArray2DoubleArray(String[] array)
    {
        double[] res=new double[array.length];
        
        for (int i = 0; i < array.length; i++) {
            res[i]=Double.parseDouble(array[i]);
        }
        return res;
    }
    
    public static void PrintDoubleArray(double [] a) {
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}
