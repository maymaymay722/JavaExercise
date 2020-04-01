import java.util.Arrays;

class Student implements Comparable{
    private String name;
    private int score;

    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }

    public String toString(){
        return "["+this.name+":"+this.score+"]";
    }

    @Override
    public int compareTo(Object o){
        Student s=(Student)o;
        if(this.score>s.score){
            return -1;
        }else if(this.score<s.score){
            return 1;
        }else{
            return 0;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Student[] students=new Student[]{
                new Student("张三",95),
                new Student("李四",96),
                new Student("王五",87),
                new Student("赵柳",92)
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }


    public static void sort(Comparable[] array){
        for (int bound = 0; bound < array.length; bound++) {
            for (int cur = array.length-1; cur > bound ; cur--) {
                if(array[cur-1].compareTo(array[cur])>0){
                    Comparable tmp=array[cur-1];
                    array[cur-1]=array[cur];
                    array[cur]=tmp;
                }
            }
        }
    }
}
