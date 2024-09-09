public class Multiples {

    public static void main(String[] args) {
        int count3 = 0;
        int count5 = 0;

        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0){
                count3++;
            }
            if (i % 5 == 0){
                count5++;
            }
        }

        System.out.println("There are " + count3 + " multiples of 3 from 1 to 1000");
        System.out.println("There are " + count5 + " multiples of 5 from 1 to 1000");
    }
}
