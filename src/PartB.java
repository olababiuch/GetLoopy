public class PartB {
    public static void main(String[] args) {
        //Task 7
        for(int row=1;row<=5;row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        //Task 5
        for(int row=1;row<=5;row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        //Task 6
        for(int row=1;row<=5;row++) {
            for (int col = 5; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
