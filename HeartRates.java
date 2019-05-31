// HeartRate.java

public class HeartRates {

    private String firstName;
    private String lastName;
    private int age;
    private int month;
    private int day;
    private int year;
    private double maxHeartRate;
    private double targetHeartRateRange1;
    private double targetHeartRateRange2;

    public HeartRates(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName= lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public int getAge() {
        age = 2019 - year;
        return age;
    }
    public double calculateMaxHeartRate() {
        maxHeartRate = 220 - age;
        return maxHeartRate;
    }
    public double calculateTargetHeartRateRange1() {
        targetHeartRateRange1 = 0.5 * maxHeartRate;
        return targetHeartRateRange1;
        }

        public double calculateTargetHeartRateRange2() {
            targetHeartRateRange2 = 0.85 * maxHeartRate;
            return targetHeartRateRange2;
        }

    }
