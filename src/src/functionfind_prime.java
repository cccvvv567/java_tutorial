public class functionfind_prime {

    public static void main(String[] args) {
        for(int i =2; i<=100; i++){
            boolean result = calc(i);
            if(result){
                System.out.println(i);
            }else {
                System.out.println(i + "不是質數");
            }
        }

    }

    static boolean calc(int inputNum) {
        boolean result = true;
        for (int i = 2; i < inputNum ; i++) {
            if (inputNum % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}