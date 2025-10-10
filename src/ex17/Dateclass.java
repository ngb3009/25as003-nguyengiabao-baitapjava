package ex17;

public class Dateclass {
    private int month;
    private int day;
    private int year;
    public Dateclass(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int day){
        this.day=day;
    }

    public void setMonth(int month){
        this.month=month;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String toString(){
        return "Ngày"+day+"tháng"+month+"năm"+year+"";
    }
}
