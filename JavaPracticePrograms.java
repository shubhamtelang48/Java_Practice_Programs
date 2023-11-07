public class JavaPracticePrograms {
    public static void main(String[] args) {
        float [] marks={45.6f,90.8f,88.5f,76.5f,68.0f};
        float sum=0;
        for(float elements:marks){
            sum = sum + elements;
        }
        System.out.print("Average marks is :  ");
        System.out.println(sum/marks.length);
    }
}
