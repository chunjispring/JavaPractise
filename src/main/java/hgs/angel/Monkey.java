package hgs.angel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by spring on 3/28/20.
 *
 * @author spring
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
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
        this("无名氏");
        count++;
    }

    public void speak() {
        System.out.println("大家好，我是" + name);
    }

}
