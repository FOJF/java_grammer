package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C02Calendar {
    public static void main(String[] args) {
//        java.util 패키지의 Calendar 클래스
//        Calendar myCalendar = Calendar.getInstance();
//        System.out.println(myCalendar.getTime());
//        System.out.println(myCalendar.get(Calendar.YEAR));
//        System.out.println(myCalendar.get(Calendar.MONTH) + 1 + "월");
//        String[] arr = {"일", "월", "화", "수", "목", "금", "토"};
//        System.out.println(arr[myCalendar.get(Calendar.DAY_OF_WEEK)-1] + "요일"); // 요일
//        System.out.println(myCalendar.get(Calendar.DAY_OF_MONTH) + "일"); // 날짜
//        System.out.println(myCalendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//        System.out.println(myCalendar.get(Calendar.HOUR_OF_DAY)); // 24시간 체계
//        System.out.println(myCalendar.get(Calendar.HOUR));
//        System.out.println(myCalendar.get(Calendar.MINUTE));
//        System.out.println(myCalendar.get(Calendar.SECOND));

//        java.time 패키지의 LocalDateTime, LocalDate, LocalTime 클래스
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());
//        get메서드와 ChronoField 매개변수로 다양한 형식의 날짜/시간 정보 조회
        System.out.println(localDateTime.get(ChronoField.YEAR));
        System.out.println(localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(localDateTime.get(ChronoField.AMPM_OF_DAY)); // 0:오전, 1:오후
        System.out.println(localDateTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(localDateTime.get(ChronoField.HOUR_OF_DAY));

//        .of : 임의의 특정시간정보객체를 만들어 내고 싶을 때 사용
        LocalDate birthDay = LocalDate.of(1998,2,3);
        System.out.println(birthDay);

        LocalDateTime birthDayTime = LocalDateTime.of(1998,2,3,14,28);
        System.out.println(birthDayTime);
        System.out.println(birthDayTime.get(ChronoField.HOUR_OF_AMPM));
        System.out.println(birthDayTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));

//        Object 클래스 : 모든 클래스들의 최고 조상
        Object o1 = "hello";
        Object o2 = 1;
        Object o3 = new String[10]; // o3가 String배열을 받아버린 것
        Object[] o4 = new String[10]; // o4[0]이 String[0] .... 이런식으로 한칸에 하나씩 받아버린 것
    }
}
