import hgs.angel.Monkey;
import learn.helloworld.Dependency;
import learn.helloworld.HelloWorld;
import mypack.Sub;


/**
 * Created by spring on 3/28/20.
 *
 * @author spring
 */
public class AppMain {
    public static void main(String[] args) {
        Monkey m = new Monkey("孙悟空");
        m.speak();

        Dependency de = new Dependency();
        HelloWorld he = new HelloWorld(de);

        System.out.println(he.beenCalled());

        Sub sb = new Sub();
        Sub sub = new Sub(1, 2);
        System.out.println("a=" + sub.getA() + " b=" + sub.getB());
    }
}
