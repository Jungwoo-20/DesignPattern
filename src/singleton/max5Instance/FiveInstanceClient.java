package singleton.max5Instance;

public class FiveInstanceClient {
    public static void main(String[] args) {
        FiveInstance fiveInstance1 = FiveInstance.getInstance(1);
        FiveInstance fiveInstance2 = FiveInstance.getInstance(2);
        FiveInstance fiveInstance3 = FiveInstance.getInstance(3);
        FiveInstance fiveInstance4 = FiveInstance.getInstance(4);
        FiveInstance fiveInstance5 = FiveInstance.getInstance(5);
        FiveInstance fiveInstance6 = FiveInstance.getInstance(6);
    }
}
