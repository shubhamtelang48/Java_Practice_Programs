package JavaPrograms;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int raduis, int height){
        this.radius=raduis;
        this.height=height;
    }

    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
    /*
    public void setRadius(int radius) {
        this.radius = radius;
    }



    public void setHeight(int height) {
        this.height = height;
    }

 */

    public double volumn(){
        return Math.PI* radius*radius*height;
    }
    public double surface_area(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius*height;
    }
}


public class ST_OOP_Cylinder_area {
    public static void main(String[] args) {
        Cylinder cylinder= new Cylinder(6,12);
        //cylinder.setRadius(8);
        //cylinder.setHeight(12);

        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println("Surface Area of Cylinder is :" + cylinder.surface_area() +" m^2" );
        System.out.println("Volumn of Cylinder is :" + cylinder.volumn() + "  m^3");

    }
}
