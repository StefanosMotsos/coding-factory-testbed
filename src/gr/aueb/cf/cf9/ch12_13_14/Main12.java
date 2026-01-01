package gr.aueb.cf.cf9.ch12_13_14;

public class Main12 {
    public static void main(String[] args) {
        PointXYZ p = new PointXYZ(3, 4, 5);

        System.out.println("XY distance is: " + p.getXYDistance());
        System.out.println("YZ distance is: " + p.getYZDistance());
        System.out.println("XZ distance is: " + p.getXZDistance());
        System.out.println("XYZ distance is: " + p.getXYZDistance());
    }
}
