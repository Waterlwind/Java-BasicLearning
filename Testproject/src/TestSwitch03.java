/**
 * 测试swit语句
 */
public class TestSwitch03 {
    public static void main(String[] args) {
        String computer = "联想";
        switch (computer){
            case "联想":
                System.out.println("人类没有联想，会怎么样？");
                break;
            case "华为":
                System.out.println("支持华为！");
            default:
                System.out.println("其他品牌！");
                break;
        }
    }
}
