package xxxhaotian.test5;

import java.util.ArrayList;
import java.util.Random;

public class Multiton {
	private static int maxNum = 2;
	private static ArrayList array = new ArrayList(maxNum);
	private static ArrayList arrayInfo = new ArrayList(maxNum);
	private static int count = 1; // 正在被人尊称的是那个皇帝
	
    static {
        // 把所有的皇帝都产生出来
        for (int i = 0; i < maxNum; i++) {
            array.add(new Multiton("实例"+(i+1)+"号"));
        }
    }
    
    Multiton(){}
    Multiton(String info){
    	arrayInfo.add(info);
    }
    
    public static Multiton getInstance() {
        Random random = new Random();
        count = random.nextInt(maxNum); // 随机拉出一个皇帝，只要是个精神领袖就成
        return (Multiton) array.get(count);
    }
    
    public static void multitonInfo() {
        System.out.println(arrayInfo.get(count));
    }

}
