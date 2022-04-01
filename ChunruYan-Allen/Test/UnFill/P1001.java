import java.util.Scanner;
class test {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        String[] number = a.nextLine().split(" "); // ["n","n"]
        int a = Integer.parseInt(number[0]);
        int b = Integer.parseInt(number[1]);
        System.out.println(a+b);
    }
}