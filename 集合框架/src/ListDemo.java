import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses=new ArrayList<>();
        courses.add("C 语言");
        courses.add("Java SE");
        courses.add("Java Web");
        courses.add("Java EE");

        // 和数组一样，允许添加重复元素
        courses.add("C 语言");

        // 按照添加顺序打印
        System.out.println(courses);

        // 类似数组下表的方式访问
        System.out.println(courses.get(0));
        System.out.println(courses);
        courses.set(0,"计算机基础");
        System.out.println(courses);

        // 截取部分 [1,3)
        List<String> subCourse=courses.subList(1,3);
        System.out.println(subCourse);

        // 重新构造
        List<String> courses2=new ArrayList<>(courses);
        System.out.println(courses2);

        List<String> courses3=new LinkedList<>(courses);
        System.out.println(courses3);

        // 引用的转换
        ArrayList<String> courses4=(ArrayList<String>)courses2;
        System.out.println(courses4);

        LinkedList<String> courses5=(LinkedList<String>)courses3;
        System.out.println(courses5);

    }
}
