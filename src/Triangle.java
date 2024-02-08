public class Triangle {
    static int numOfSides = 3;
    double base;
    double height;
    double sideLen1;
    double sidelen2;
    double sidelen3;

    public Triangle(double base, double height, double sideLen1, double sidelen2, double sidelen3) {
        this.base = base;
        this.height = height;
        this.sideLen1 = sideLen1;
        this.sidelen2 = sidelen2;
        this.sidelen3 = sidelen3;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
