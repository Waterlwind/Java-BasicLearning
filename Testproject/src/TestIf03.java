/**
 * 测试多分支结构
 */
public class TestIf03 {
    public static void main(String[] args) {

        int age = (int)(120*Math.random());
        System.out.println("年龄是："+age);
        //15以下：儿童， 15-24青年，25-44中年，45-64中老年，65-84老年，85-99老寿星
        //100-109百岁老人，110以上，申请国家记录
        if(age<15){
            System.out.println("儿童，好好玩！");
        } else if (age<25) {
            System.out.println("青年，好好学！还来得及！不然会被社会毒打！");
        } else if (age<45) {
            System.out.println("中年，好好工作！被社会毒打了吗？");
        } else if (age<65) {
            System.out.println("中老年，不服老！继续干！");
        } else if (age<85) {
            System.out.println("老年，好好休息！跳跳广场舞！");
        } else if (age<100) {
            System.out.println("老寿星，好好休息！看看广场舞！");
        } else if (age<110) {
            System.out.println("百岁老人，不容易！继续加油！");
        } else {
            System.out.println("申请国家记录吧！太牛啦！");
        }
        /*
        int i = (int)(Math.random()*6+1);
        int j = (int)(Math.random()*6+1);
        int k = (int)(Math.random()*6+1);

        int count = i+j+k;
        System.out.println("第一次掷骰子："+i);
        System.out.println("第一次掷骰子："+j);
        System.out.println("第一次掷骰子："+k);
        if (count>15){
            System.out.println("手气不错！");
        } else if (count>=10&&count<15) {
            System.out.println("手气一般！再来两把！");
        } else if (count<10) {
            System.out.println("今天得分："+count);
        }

        System.out.println("今天得分："+count);
    */

    }
}
