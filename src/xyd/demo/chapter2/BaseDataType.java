package xyd.demo.chapter2;

/**
 * ----------------------------------
 * Created by xyd on 2018/5/9.
 * <p/>
 * 描  述：
 * <p/>
 * 修订历史:
 * ----------------------------------
 */
public class BaseDataType {

    public static void main(String[] args){
        String str = "www.itcast.com.cn";
        String[] split = str.split("\\.");
        for (int i = 0; i<split.length;i++){
            System.out.println(split[i]);
        }
    }
}
