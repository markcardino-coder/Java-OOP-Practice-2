/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package engineeringpoint.java;

/**
 *
 * @author Asus
 */
public class EngineeringPoint {

    /** 
     * @param args the command line arguments
     */
    private double x;
    private double y;

    // Constructor
    public EngineeringPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Setter methods
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Calculate distance
    public double calculateDistance(EngineeringPoint point) {
        double dx = point.getX() - this.x;
        double dy = point.getY() - this.y;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    // Calculate slope
    public double calculateSlope(EngineeringPoint point) {
        double dx = point.getX() - this.x;
        double dy = point.getY() - this.y;

        if (dx == 0) {
            return Double.NaN;
        }

        return dy / dx;
    }

    // Main method
    public static void main(String[] args) {

        EngineeringPoint A = new EngineeringPoint(3, 4);
        EngineeringPoint B = new EngineeringPoint(9, 12);
        EngineeringPoint C = new EngineeringPoint(3, 10);

        System.out.println("ENGINEERING DISTANCE AND SLOPE ANALYZER");

        System.out.printf("%nPoint A: (%.2f, %.2f)%n", A.getX(), A.getY());
        System.out.printf("Point B: (%.2f, %.2f)%n", B.getX(), B.getY());
        System.out.printf("Point C: (%.2f, %.2f)%n", C.getX(), C.getY());

        // A and B
        System.out.println("\n POINT A AND POINT B");
        System.out.printf("Distance: %.2f units%n", A.calculateDistance(B));

        double slopeAB = A.calculateSlope(B);

        if (Double.isNaN(slopeAB)) {
            System.out.println("Slope: Undefined");
        } else {
            System.out.printf("Slope: %.2f%n", slopeAB);
        }

        // A and C
        System.out.println("\n POINT A AND POINT C");
        System.out.printf("Distance: %.2f units%n", A.calculateDistance(C));

        double slopeAC = A.calculateSlope(C);

        if (Double.isNaN(slopeAC)) {
            System.out.println("Slope: Undefined");
        } else {
            System.out.printf("Slope: %.2f%n", slopeAC);
        }

        // B and C
        System.out.println("\n POINT B AND POINT C");
        System.out.printf("Distance: %.2f units%n", B.calculateDistance(C));

        double slopeBC = B.calculateSlope(C);

        if (Double.isNaN(slopeBC)) {
            System.out.println("Slope: Undefined");
        } else {
            System.out.printf("Slope: %.2f%n", slopeBC);
        }

        System.out.println("\n PROGRAM FINISHED");
    }
}
