public class Exam2 {
    public static void main(String[] args) {
        String str1 = new String();
        str1 = "*";
        String str2 = new String();
        str2 = "";
        for (int i=3; i>0; i--) {
            for (int t=5; t>0; t--){
                System.out.print(str1);
            }
            System.out.println(str2);
        }
        // 높이 : 3

        /*

         *
         ***
         *****

         */
        System.out.println();
        System.out.println();

        for (int i=5; i>0; i--) {
            for (int t=9; t>0; t--){
                System.out.print(str1);
            }
            System.out.println(str2);
        }
        // 높이 : 5

        // 출력

        /*

         *
         ***
         *****
         *******
         *********

         */

        System.out.println();
        for (int i=7; i>0; i--) {
            for (int t=13; t>0; t--){
                System.out.print(str1);
            }
            System.out.println(str2);
        }
        // 높이 : 7

        // 출력

        /*

         *
         ***
         *****
         *******
         *********
         ***********
         *************

         */
    }
}
