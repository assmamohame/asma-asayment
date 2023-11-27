public class Q13 {
    public class SumofSquares {
        public static int sumofsquares (int n ){
            int sum =0 ;
            for (int i = 1; i <=n; i++){
                sum += i*i;

            }
            return sum;

        }
        public static void main(String[] args ){
            int n=5 ;
            int result = sumofsquares(n);
            System. out.println("sum of squares "+result );
        }
    }
}
