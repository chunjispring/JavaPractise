package mypack;


import lombok.Getter;

/**
 * @author wangchunji
 */
@Getter
public class Base {
    private int a;

    public Base() {
        System.out.println("call Base()");
    }

    public Base(int a) {
        this.a = a;
        System.out.println("call Base(int i)");
    }
}
