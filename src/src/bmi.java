public class bmi {

    public static void main(String[] args) {
        float h =1.75f ;
        int w = 70;
        float i =calc(h,w);
        System.out.println(i);
    }
    static float calc(float h, int w){
        return w/(h*h);
    }

}