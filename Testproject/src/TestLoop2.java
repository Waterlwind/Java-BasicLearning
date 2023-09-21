/**
 * 测试嵌套循环
 */
public class TestLoop2 {
    public static void main(String[] args) {
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(i+"\t");
//            }
//            System.out.println();
//        }
        for (int m = 1; m <=9 ; m++) {
            for (int i = 1; i <=m ; i++) {
                System.out.print(i+"*"+m+"="+(i*m)+"\t");
            }
            System.out.println();
        }
    }
}
