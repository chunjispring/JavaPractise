package hgs.angel;

import java.util.Objects;

/**
 * Created by spring on 3/28/20.
 *
 * @author spring
 */
public class Monkey {
    public static int count;
    char gender;
    private String name;
    private int age;

    /**
     * 当猴子的姓名和年龄都已知时，就调用此构造方法
     */
    public Monkey(String name, int age) {
        count++;
        this.name = name;
        this.age = age;
    }

    /**
     * 当猴子的姓名已知而年龄未知时，就调用此构造方法
     */
    public Monkey(String name) {
        this(name, -1);
        count++;
    }

    /**
     * 当猴子的姓名和年龄都未知时，就调用此构造方法
     */
    public Monkey() {
        this("无名氏", -1);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Monkey.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Monkey)) {
            return false;
        }

        final Monkey other = (Monkey) o;
        return this.name.equals(other.name);
    }

    public void speak() {
        System.out.println("大家好，我是" + name);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, age);
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
