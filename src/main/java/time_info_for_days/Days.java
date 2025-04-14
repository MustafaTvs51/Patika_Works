package time_info_for_days;

public enum Days {

    MONDAY("08:00 - 17:00"),

    TUESDAY("08:30 -17:30"),

    WEDNESDAY("08:30 -18:30"),

    THURSDAY("08:30 -18:30"),

    FRIDAY("08:30 -19:00"),

    SATURDAY("10:00 -13:00"),

    SUNDAY("Off Day");


    private final String workHours;

    public String getWorkHours() {
        return workHours;
    }

    Days(String workHours) {
        this.workHours = workHours;


    }

}
