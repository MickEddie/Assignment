// Date.java

public class Date {

    int month;
    int day;
    int year;

    // constructor
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void setMonth() {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setDay() {
        this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void setYear() {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public String displayDate(){
        return month + "/" + day + "/" + year;
    }
}