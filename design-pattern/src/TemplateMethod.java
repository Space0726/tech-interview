abstract class Pizza {
    protected void 반죽() { System.out.println("반죽"); }   // 외부 사용을 막는 protected
    abstract void 토핑();    // 수정이 필요한 단계는 abstract로
    protected void 굽기() { System.out.println("굽기"); }

    final void makePizza() {    // 단계 수행 메소드는 수정이 불가능하도록 final로
        this.반죽();
        this.토핑();
        this.굽기();
    }
}

class PotatoPizza extends Pizza {
    @Override
    void 토핑() {
        System.out.println("Potato");
    }
}

class TomatoPizza extends Pizza {
    @Override
    void 토핑() {
        System.out.println("Tomato");
    }
}

public class TemplateMethod {
    public static void main(String[] args) {
        Pizza potatopizza = new PotatoPizza();
        Pizza tomatopizza = new TomatoPizza();

        System.out.println("Potato Pizza:");
        potatopizza.makePizza();
        System.out.println();

        System.out.println("Tomato Pizza:");
        tomatopizza.makePizza();
        System.out.println();
    }
}
