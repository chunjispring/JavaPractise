package hgs.angel;

/**
 * Created by spring on 3/28/20.
 *
 * @author spring
 */
public class Monkey {
    public static int count;
    public String name;
    int age;
    char gender;

    public Monkey() {

    }

    public Monkey(String name) {
        count++;
        this.name = name;
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
}
