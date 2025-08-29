import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();   
        int day=today.getDayOfMonth();     
        int month=today.getMonthValue(); 
        int year=today.getYear(); 
        System.out.println(day+"-"+month+"-"+year);
    }
}
