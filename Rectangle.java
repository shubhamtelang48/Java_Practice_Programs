

    class Rectangle1{
        int length;
        int breadth;

        public int area(){
            return length * breadth;
        }
        public int perimeter(){
            return 2 *(length+breadth);
        }

    }
    public class Rectangle {

    public static void main(String[] args) {

        Rectangle1 rect= new Rectangle1();
        rect.length=8;
        rect.breadth=5;

        System.out.println(rect.area());
        System.out.println(rect.perimeter());

    }
}
