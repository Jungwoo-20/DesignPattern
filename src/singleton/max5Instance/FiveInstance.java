package singleton.max5Instance;

import java.util.ArrayList;
import java.util.List;

public class FiveInstance {
    private static volatile List<Integer> map = new ArrayList<>();

    private FiveInstance() {
    }

    public static FiveInstance getInstance(int cnt) {
        if (map.size() >= 5) {
            System.out.println("인스턴스는 5개로 제한됩니다.");
            return null;
        } else {
            synchronized (FiveInstance.class) {
                map.add(cnt);
                System.out.println(cnt + "값 getInstance() 성공입니다.");
                return null;

            }
        }
    }
}
