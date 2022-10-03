import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        double perimeter;
        double diagonal;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of side A.");
        if(in.hasNextDouble()){
            length = in.nextDouble();
            in.nextLine();

            System.out.println("Enter the width of the rectangle.");
            if(in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();

                diagonal = Math.sqrt((length * length) * (width * width));
                area = length * width;
                perimeter = (2 * width) + (2 * width);

                System.out.printf("The area of the rectangle %.2f%n", area);
                System.out.printf("The perimeter of the rectangle %.2f%n", perimeter);
                System.out.printf("The diagonal of the rectangle %.2f%n", diagonal);
            }else{
                trash = in.nextLine();
                System.out.println("You entered an invalid width: " + trash);
            }
        }else{
            trash = in.nextLine();
            System.out.println("You entered an invalid length: " + trash);
        }
    }
}
