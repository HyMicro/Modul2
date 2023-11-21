public class Lingkaran {
    public double r;
    
    public MessyCode(double radius){
        this.r = radius;
    }
    
    //Main method

    public static void Main(String[] args){
        MessyCode circle = new MessyCode(2.5);
        double area;
        area = 3.14 * circle.r * circle.r;
        System.out.println("Radiu : " + circle.r);
        System.out.println("Area : " + area);
    
    }

}

