class OverLoadDemo{
    void area(float x){
        System.out.println(x * x);
    }
    void area(float x, float y){
        System.out.println(x * y);
    }
    void area(double x){
        System.out.println(x*x);
    }
}

public class Overload {
    public static void main(String args[]){
        OverLoadDemo ob = new OverLoadDemo();
        ob.area(12.0);
        ob.area(12.0f, 13.0f);
        ob.area(23.0f);
    }
}