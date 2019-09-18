import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈自己用来测试方法〉
 *
 * @author sunxu
 * @create 2019-09-18
 * @since 1.0.0
 */
public class JavaTest {
    public static void main(String[] args) {
        //1.问题描述：数组排序？
        //升序排序数组
        int[] a= {1,4,3,5,2};
        Arrays.sort(a);//Arrays.sort(a)实现了用快速排序，来升序排序数组
        System.out.println(Arrays.toString(a));

        //将数组逆序排序
        Integer[] b= {1,4,3,5,2};
        Arrays.sort(b, Collections.reverseOrder());//这里的参数b必须是包装类Integers数组，不能是原始数据类型int数组
        System.out.println(Arrays.toString(b));

        //填充数组
        int[] c=new int[5];
        Arrays.fill(c, 0);//将数组的所有元素填充为0
        System.out.println(Arrays.toString(c));



        //2.问题描述：对于给定的如下数组，如何转换成List集合？
        String[] array = {"a","b","c"};
        //参考stackoverflow总结如下几种写法：
       // 1.使用原生方式，拆分数组，添加到List

        List<String> resultList = new ArrayList<>(array.length);
        for (String s : array) {
            resultList.add(s);
        }
        //2.使用Arrays.asList()

        List<String> resultList2= new ArrayList<>(Arrays.asList(array));
       // 注意：调用Arrays.asList()时，其返回值类型是ArrayList，但此ArrayList是Array的内部类，调用add()时，会报错：java.lang.UnsupportedOperationException，并且结果会因为array的某个值的改变而改变，故需要再次构造一个新的ArrayList。
//        3.使用Collections.addAll()

        List<String> resultList3 = new ArrayList<>(array.length);
        Collections.addAll(resultList3,array);
//        4.使用List.of()

//        此方法为 Java9新增方法，定义在List接口内，并且为静态方法，故可以由类名直接调用。
        //List<String> resultList4 = List.of(array);


    }
}
