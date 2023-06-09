package lang.print.gaps.task3;

public class ReassigningValues {
    /**
     * Declare another 3 variables: first, second, third (1,10,100).
     * Make console output of 3 initial vars (first, second, third) each on new line.
     * Initialize vars linkToFirst, linkToSecond, linkToThird with the variables first, second, third.
     * Reassign (first, second, third) with the : 15, 6, 4. And write to console all
     */
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;
        first = 15;
        second = 6;
        third = 4;
        System.out.println(first+"\n"+second+"\n"+third+"\n"+linkToFirst+"\n"+linkToSecond+"\n"+linkToThird);
    }
}
