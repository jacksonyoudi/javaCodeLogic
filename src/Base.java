public class Base {
    protected int currentStep;

    protected void step1() {
    }

    protected void step2() {
    }

    public void action(){
        this.currentStep = 1;
        step1();
        this.currentStep = 2;
        step2();
    }
}

/**
 * 模版方法
 *
 * 可见性重写 is-a
 *
 * 加上final就不能被继承了
 * final方法和
 */
class Child extends Base {
    protected void step1() {
        System.out.println("child step" + this.currentStep);
    }
    protected void step2() {
        System.out.println("child step" + this.currentStep);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.action();
    }
}


final class NotBase {

}

