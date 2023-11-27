public class Q14 {
    public class Vowelcounter{
        public static int contvowels(System str ){
            int count = 0;
            String vowels =" aeiouAEIOU";
            for (int i= 0 ;i <str.length() i++){
                char ch =str. charAt(i);
                if (vowels.contains(String.valueOf(ch))){
                    count++;
                }

            }
            return count;
        }
        public static void main(String[] args ){
            String input ="Hello world ";
            int vowelcount =contvowels(input);
            System.out.println("Number of vomels "+ vowelcount);
        }
    }
}
