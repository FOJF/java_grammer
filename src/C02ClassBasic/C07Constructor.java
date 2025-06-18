package C02ClassBasic;

public class C07Constructor {
    public static void main(String[] args) {
//        캘린더 객체 생성 : 연도, 월, 일 세팅
        Calendar c = new Calendar("2025", "6", "18");
//        c.setYear("2025");
//        c.setMonth("6");
//        c.setDay("18");
//        캘린더 객체 출력 : "오늘은 xxx연도 xx월 xx일 입니다."
        System.out.println(c.getCalendarToString());

        //    toString()은 특별한 메서드로 객체명을 출력할 때 자동으로 실행 -> .toString() 하지 않아도 됨
        System.out.println(c);
    }
}

// 캘린더 클래스 생성 : year, month, day 모두 String
class Calendar {
    private String year;
    private String month;
    private String day;

//    생성자를 추가할 경우, 기본생성자도 구현해야함 // 생성자가 아예 없으면 기본생성자를 구현없이 사용가능

    public Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

//    public void setYear(String year) {
//        this.year = year;
//    }

    public String getMonth() {
        return month;
    }

//    public void setMonth(String month) {
//        this.month = month;
//    }

    public String getDay() {
        return day;
    }

//    public void setDay(String day) {
//        this.day = day;
//    }

    public String getCalendarToString() {
        return "오늘은 " + this.year + "연도 " + this.month + "월 " + this.day + "일 입니다.";
    }

    //    toString()은 특별한 메서드로 객체명을 출력할 때 자동으로 실행 -> .toString() 하지 않아도 됨
    @Override
    public String toString() {
        return "오늘은 " + this.year + "연도 " + this.month + "월 " + this.day + "일 입니다.";
    }
}