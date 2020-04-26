import learn.helloworld.Dependency;
import learn.helloworld.HelloWorld;
import hgs.angel.Monkey;


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
    }
}
