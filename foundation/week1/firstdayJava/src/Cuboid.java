public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        int a = 5;
        int b = 6;
        int c = 7;

        int V = (a * b * c);
        int s = (2 * ( (a * b) + (a * c) + (b * c)));
        System.out.println("Surface Area: " + s);
        System.out.println("Volume: " + V );
    }
}



