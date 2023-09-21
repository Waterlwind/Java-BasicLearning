/**
 * 使用while/for循环0-130之间的数字，每行显示5个数字
 */
public class Exercise02 {
    public static void main(String[] args) {
        int i=1;
        int count=0;
        while (i<=130){
            System.out.print(i+",");


    /*
//5的倍数换行
            if (i%5==0){
                System.out.println();
            }

     */

//计数满5换行
            count++;
            if (count==5){
                System.out.println();
                count=0;
            }

            i++;
        }
    }
}
