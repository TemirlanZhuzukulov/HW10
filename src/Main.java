public class Main {
    public static void main(String[] args) {

        System.out.println( contains(20,50,30,40,45,40,20));

    }static boolean contains (int a, int ... varargs) {
        for (int v:varargs) {
            if(a==v){
                return true;
            }
        }
        return false;
    }
}