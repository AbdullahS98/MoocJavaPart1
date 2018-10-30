
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int sum : list) {
            total += sum;
        }
        return total;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (float) sum(list) / list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double variance = 0;
        for (double num : list) {
            variance += (Math.pow(num - average(list), 2) / (list.size() - 1)); 
        }
        return variance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        //list.add(1);
        //list.add(3);
        //list.add(5);

        System.out.println("list size: " + list.size() );
        System.out.println("The variance is: " + variance(list));
        System.out.println("The average: " + average(list));
    }

}
