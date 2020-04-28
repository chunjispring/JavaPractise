package mypack;

import lombok.Getter;

/**
 * @author wangchunji
 */
@Getter
public class Sub extends Base {
    private int b;

    public Sub() {
        //this(0);
        System.out.println("call Sub()");
    }

    public Sub(int i) {
        super(i);
        System.out.println("call Sub(int i)");
    }

    public Sub(int a, int b) {
        super(a);
        this.b = b;
    }
}
