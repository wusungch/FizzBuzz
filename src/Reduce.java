public class Reduce {
    public static void main(String[] args) {
        int initial = 100;
        int steps = 0;

        while (initial > 0){
            if (initial % 2 == 0) {
                initial = initial / 2;
            }else{
                initial--;
            }
            steps++;
        }
        System.out.println("Steps: " + steps);
    }
}