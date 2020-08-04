import mypack.Md2;
import mypack.ShapeDrawer;

import java.security.NoSuchAlgorithmException;

/**
 * Created by spring on 3/28/20.
 *
 * @author spring
 */
public class AppMain {
    public static void main(String[] args) {
/*        Monkey m = new Monkey("孙悟空");
        m.speak();

        Dependency de = new Dependency();
        HelloWorld he = new HelloWorld(de);

        System.out.println(he.beenCalled());

        //Sub sb = new Sub();
        Sub sub = new Sub(1, 2);
        System.out.println("a=" + sub.getA() + " b=" + sub.getB());*/

//        int n = 9;
//        if (args.length > 0) {
//            try {
//                n = Integer.parseInt(args[0]);
//            } catch (NumberFormatException e) {
//                System.out.println("请输入正确的形状大小");
//                return;
//            }
//        }
//        ShapeDrawer.draw(n);

        try {
            Md2.MD2();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }
}
