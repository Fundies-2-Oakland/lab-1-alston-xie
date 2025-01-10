public class Vector3D {

    public double x;
    public double y;
    public double z;

    /*/
    Question 1
     */
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Question 2
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public static void main(String[] args) {

        Vector3D vector = new Vector3D(100.0, 200.0, 300.0);

        System.out.println("x is equal to " + vector.getX());

        System.out.print("y is equal to " + vector.getY());

        System.out.println("z is equal to " + vector.getZ());
    }
}
