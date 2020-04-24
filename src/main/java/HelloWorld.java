/**
 * Created by spring on 3/28/20.
 *
 * @author spring
 */
public class HelloWorld {
    private Dependency dependency;

    public HelloWorld(Dependency dependency) {

        this.dependency = dependency;
    }

    public static void main(String[] args) {
        Dependency de = new Dependency();
        HelloWorld he = new HelloWorld(de);

        System.out.println(he.beenCalled());
    }

    public String beenCalled() {
        return dependency.say();
    }
}
