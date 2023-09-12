public class Multiples {

    public static void main(String[] args) {

        int total = 0;
        int count = 0;
        for (int i = 1; i < 1000; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 == true) {
                total += 1;
            }
            if (divisibleBy5 == true) {
                total += 1;
            }
            count +=1;
        }

        System.out.println(total);
        //System.out.println(count);
        //work done
    }
}
