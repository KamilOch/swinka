package KJS2018_2_6;

public class Test {
    public static void main(String[] args) {

        Punkt2D punkt2D = new Punkt2D ();
        System.out.println(punkt2D.x+" "+punkt2D.y);

        Punkt2D punkt2D2 = new Punkt2D (10,10);
        System.out.println(punkt2D2.x+" "+punkt2D2.y);

        Punkt3D punkt3D = new Punkt3D(1,2,3);
        System.out.println(punkt3D.x+" "+punkt3D.y+" "+punkt3D.y);
    }
}
