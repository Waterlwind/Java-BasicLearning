 /**
  * 测试字符串连接符的用法
  */
public class TestOperator05 {
    public static void main(String[] args){
        String a = "3";
        int b =4;
        System.out.println(a+b);

        //条件是String,不是 char。 若是char，仍然是加法
        char c1 = 'h';
        char c2 = 'i';
        System.out.println(c1+c2);
        //通过加空字符串，让整个+都变成连接符
        System.out.println(""+c1+c2);
        
    }
}
