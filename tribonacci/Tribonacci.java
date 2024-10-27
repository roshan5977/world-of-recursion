public class Tribonacci {
    public static void main(String[] args) {
        //0,1,1,2,4,7,13
    System.out.println(calculateTribonacci(5));
    }

    public static int calculateTribonacci(int num) {
        if(num<=2)return num;

        return calculateTribonacci(num-1)+calculateTribonacci(num-2)+calculateTribonacci(num-3);
    }

}
