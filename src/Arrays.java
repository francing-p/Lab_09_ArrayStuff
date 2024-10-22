import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);

        // ---------------- PART ONE ---------------

        // task one
        int [] dataPoints = new int[100];

        // task two
        for(int i=0; i< dataPoints.length; i++){
            dataPoints[i]=gen.nextInt(1,101); // 1-100
        }

        // task three
        for(int i=0; i< dataPoints.length; i++){
            System.out.print(dataPoints[i] + " | ");

        }

        // task four
        int sum = 0;
        for(int i=0; i< dataPoints.length; i++){
            sum+=dataPoints[i]; // sum = sum + dataPoints[i]

        }
        double avg=(double)sum/ dataPoints.length; // added (double) so division would actually work
        System.out.println(" "); // add line so sum print after the list of values, not at the end of it
        System.out.println("The sum of all values is: " + sum);
        System.out.printf("The average is: %.2f", avg);

        // ---------------- PART TWO ---------------
        System.out.println();
        int num = 0;
        int count = 0;

        // task five
        num=SafeInput.getRangedInt(in,"Enter a number between 1-100",1,100);

        // task six
        for(int i=0; i< dataPoints.length; i++){
            if (num==dataPoints[i]){
                count+=1;
            }
        }
        System.out.println("The number " + num + " was found " + count + " time(s) in the dataPoints array.");

        // task seven
        boolean inArray = false;
        num=SafeInput.getRangedInt(in,"Enter a number between 1-100",1,100);
        for(int i=0; i< dataPoints.length; i++){
            if (num==dataPoints[i]){
                System.out.println("Your value " + num + " was first found at array index " + i);
                inArray=true;
                break;
            }
        }
        if (!inArray){
            System.out.println("Your value could not be found in the array.");
        }


        // task eight
        int min = dataPoints[0]; // set both to first value
        int max = dataPoints[0];
        for(int i=1; i< dataPoints.length; i++){ // start at [1] since we already have the [0] value (from min/max assignments)
            if(dataPoints[i]>max){ // if the current value is greater than the maximum
                max = dataPoints[i]; // maximum becomes the current value
            }
            if (min>dataPoints[i]){ // if the minimum is greater than the current value
                min = dataPoints[i]; // minimum becomes the current value
            }
            if(i==99){ // if at the end of the array
                System.out.println("The minimum is: " + min);
                System.out.println("The maximum is: " + max);
            }

        }


        // task nine -- output
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }
    // task nine -- method
    public static double getAverage(int values[]){
        int sum = 0;
        for(int i=0; i< values.length; i++){
            sum+=values[i]; // sum = sum + dataPoints[i]
        }

        return (double)sum/values.length;
    }

}
