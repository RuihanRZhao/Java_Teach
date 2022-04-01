public class P1001 {
    public static void main(String args[]) {
         int a = getint();
         int b = getint();
         System.out.println(a+b);
    }
    public static int getint(){
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();
        return number;
    }
}