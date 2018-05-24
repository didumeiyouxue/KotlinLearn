package xyd.demo.chapter7;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * ----------------------------------
 * Created by xyd on 2018/5/21.
 * <p/>
 * 描  述：
 * <p/>
 * 修订历史:
 * ----------------------------------
 */
public class MathUtil {
    public static void main(String[] args){
        String a = "1.62560";
        String b = "1.62540";
        String c = "1.6260";
        String d = "1.6350";



        System.out.println(getNum(a));
        System.out.println(getNum(b));
        System.out.println(getNum(c));
        System.out.println(getNum(d));


    }

    public static String getNum(String arg){
        BigDecimal bigDecimal = new BigDecimal(arg).setScale(2, RoundingMode.HALF_EVEN);
        return bigDecimal.toString();
    }
}
