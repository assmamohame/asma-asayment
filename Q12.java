public class Q12 {
    public class oddsumCaulato{
        public static int calculateoddsum (int n ){
            int sum =0;
            for (int i=1 ;i <= n; i +=2){
                sum+= i;


            }
            return sum;

        }
        public static void main(String[]args ){
            int number = 10 ;
            int sum= calculateoddsum(number);
            System.out.println("the sum of odd positive intgers less than or equal to " + number+" is "
            sum);

        }
    }
}
