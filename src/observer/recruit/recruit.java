package observer.recruit;

public class recruit {
    public static void main(String[] args) {
        RecruitData recruitData = new RecruitData();
        ObserverOneDisplay observerOneDisplay = new ObserverOneDisplay(recruitData);
        ObserverTwoDisplay observerTwoDisplay = new ObserverTwoDisplay(recruitData);

        recruitData.setRecruitments("홍길동", 25, "JAVA 백엔드 개발자");
        recruitData.setRecruitments("강감찬", 27, "데이터 분석가(언어처리)");
    }
}
