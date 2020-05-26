class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {}     // 생성자를 private으로 둠으로써 접근 제한

    public static synchronized LazyInitialization getInstance() {   // synchronized 키워드로 동기화
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }

    public static LazyInitialization getInstance2() {   // synchronized 키워드는 성능 저하를 유발하므로 이를 완화
        if (instance == null) {
            synchronized (LazyInitialization.class) {
                if (instance == null) {
                    instance = new LazyInitialization();
                }
            }
        }
        return instance;
    }
}

// 가장 많이 사용되는 방식
class Holder {  // 내부 클래스(holder)를 두어 JVM 클래스 로더를 이용해 동기화 해결
    private Holder() {}

    private static class LazyHolder {
        public static final Holder INSTANCE = new Holder();   // final 키워드로 다시 생성 불가하도록
    }

    public static Holder getInstance() {
        return LazyHolder.INSTANCE;
    }
}

public class Singleton {
    public static void main(String[] args) {}
}
