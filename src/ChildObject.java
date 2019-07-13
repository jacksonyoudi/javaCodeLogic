/**
 * 类的加载顺序
 *  1. 父类的静态代码块
 *  2.
 * 基类静态代码块 s:0
 * 子类静态代码块 s:0
 * ----- new child()
 * 基类实例代码块， a:0
 * 基类构造方法,a:0
 * 子类实例代码块， a:0
 * 子类构造方法,a:10
 *
 *  ----c.action()
 * start
 * child s:10,a:20
 * end
 *
 * ---- b.action
 * start
 * child s:10,a:20
 * end
 *
 * ---b.s: 1
 *
 * ---c.s: 10
 *
 */


public class ChildObject extends BaseObject {
    public static int s;
    private int a;


    static {
        System.out.println("子类静态代码块 s:" + s);
        s = 10;
    }

    {
        System.out.println("子类实例代码块， a:" + a);
        a = 10;
    }

    public ChildObject() {
        System.out.println("子类构造方法,a:" + a);
        a = 20;
    }

    protected void step() {
        System.out.println("child s:" + s + ",a:" + a);
    }


    public static void main(String[] args) {
        System.out.println("----- new child()");
        ChildObject c = new ChildObject();
        System.out.println("\n ----c.action()");
        c.action();

        BaseObject b = c;
        System.out.println("\n---- b.action");
        b.action();
        System.out.println("\n---b.s: " + b.s);
        System.out.println("\n---c.s: " + c.s);
    }
}

/**
 * 类：
 *  类变量 （静态变量）
 *  类初始化代码
 *  类方法
 *  实例变量
 *  实例初始化代码
 *  实例方法
 *  父类信息引用
 *
 *
 * 类初始化代码
 *  定义静态变量时的赋值语句
 *  静态初始化代码块
 *
 * 实例初始化代码块
 *  定义实例变量时的赋值语句
 *  实例化初始化代码块
 *  构造方法
 *
 *
 * 类加载过程
 *  分配内存保存类的信息
 *  给类变量赋值默认值
 *  加载父类
 *  设置父子关系
 *  执行类的初始化代码
 *
 *
 *  存放类的信息
 *      方法区
 *
 *
 */
