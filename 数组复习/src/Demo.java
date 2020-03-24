class Person{
    private String name="张三";
    private int age=18;

    public Person(){
        this.name="haha";
        this.age=23;
    }


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("我叫"+name+"，今年"+age+"岁");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Demo {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("莹莹");
        person.setAge(18);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
