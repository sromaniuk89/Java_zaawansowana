public class Circle extends Shape{
    double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void area(){
        this.area=Math.PI*Math.pow(diameter, 2.0)/4.0;
    }
}
