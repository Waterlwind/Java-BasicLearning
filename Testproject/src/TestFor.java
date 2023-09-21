/**
 * 测试for循环
 */
public class TestFor {
    public static void main(String[] args) {
 /*       int a = 0;      //初始化部分
        while(a<3){     //布尔表达式
            System.out.println("I Love You!------"+a);//循环体
            a++;//迭代因子
        }
   */

        for (int a=0;a<3;a++){
            System.out.println("I Love You!------"+a);
        }

        //累加：0+1+2+3+4...+100
        int sum = 0;
        for (int i=0;i<=100;i++){
            sum += i;   //sum = sum +i;
        }
        System.out.println("1累加到100的和："+sum);

        //输出9-1之间的数
        for (int i=9;i>0;i--){
            System.out.println(i+"\t");
        }

        //输出90-1之间能被3整除的数
        for (int i=90;i>0;i-=3){
            System.out.println(i+"\t");
        }
    }

}
