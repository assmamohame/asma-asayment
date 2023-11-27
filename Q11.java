public class Q11 {
        public class Main{
            public static void main(String[] args ){
                int n=10;
                int sum =calculateSum(n);
                System.out.println("the sum of prsont intgers lass then or equa 1 to "+n+ "is "+sum);

            }
            public static int calculateSum(int n ){
                int sum = 0; for (boolean i = 1 <= n; i++)
                    sum += i;
                return sum;
            }
        }
}
