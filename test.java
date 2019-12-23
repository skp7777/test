public class test {
    public static void main(String[] args) {
//        int i = 20;
            System.out.println(f(20));
//        for (int i = 0; i < 20; i++) {
//        }

    }

    /**
     * 斐波那契数列
     * @param x
     * @return
     */
    public static int f (int x){
        if (x == 1 || x == 2){
            return 1;
        }else {
            return f(x-1)+f(x-2);
        }
    }

}
