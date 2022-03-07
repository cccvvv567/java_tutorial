public class test {
    public class method {
        static void calc(){
            int sum = 0;
            for(int i=0;i<=10;i++){
                sum+=i;
            }
            System.out.println("calc>>>"+sum);
        }
        static int calc2(){
            int sum = 0;
            for(int i=0;i<=10;i++){
                sum+=i;
            }
            return sum;
        }
        static int calc3(int initialNum){
            int sum = initialNum;
            for(int i=0;i<=10;i++){
                sum+=i;
            }
            return sum;
        }
        static void calc4(int initialNum){
            int sum = initialNum;
            for(int i=0;i<=10;i++){
                sum+=i;
            }
            System.out.println("sum>>"+sum);
        }


        public static void main(String[] args) {
            calc();
            calc2();
            int sum = calc3(100);
            System.out.println("sum>>"+sum);
            calc4(200);

        }
    }
}
