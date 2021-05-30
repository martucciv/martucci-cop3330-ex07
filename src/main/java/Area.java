import java.util.Scanner;
import java.lang.Math;

public class Area {
    public static void main(String[] args){

        System.out.print("What is the length of the room in feet? ");
        Scanner lInput = new Scanner(System.in);
        String lenStr = lInput.next();
        int length = Integer.parseInt(lenStr);

        System.out.print("What is the width of the room in feet? ");
        Scanner wInput = new Scanner(System.in);
        String widthStr = wInput.next();
        int width = Integer.parseInt(widthStr);

        int areaFt = length * width;
        double metric = Math.sqrt(Math.pow(areaFt, 2) * 0.09290304);

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);
        System.out.printf("The area is\n%d square feet\n%.3f square meters", areaFt, metric);
    }
}
