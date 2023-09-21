/**
 * 使用while/for循环，计算1-100之间所有数字的和，所有偶数的和，所有奇数的和。
 */
public class Exercise01 {
    public static void main(String[] args) {
        /*
        int i=1, total=0,even=0,odd=0;
        while (i<=100){
            total = total+i;//计算所有数字和
            if (i%2==0){
                even = even+i;//计算偶数和
            }else {
                odd=odd+i;//计算奇数和
            }
            i++;
        }
*/
        int total= 0,even=0,odd=0;
        for (int i = 1; i <=100; i++) {
            total = total+i;//计算所有数字和
            if (i%2==0){
                even = even+i;//计算偶数和
            }else {
                odd=odd+i;//计算奇数和
            }

        }

        System.out.println("所有数字和："+total);
        System.out.println("所有偶数和："+even);
        System.out.println("所有奇数和："+odd);
    }
}
