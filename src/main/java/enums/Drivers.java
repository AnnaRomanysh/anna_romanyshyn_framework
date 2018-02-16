package enums;

public enum Drivers {
    IE("internet explorer"),
    CHROME("chrome"),
    FIREFOX("firefox"),
    OPERA("opera"),
    REMOTE__DRIVER("remote web driver");


    private String driverValue;

    Drivers(String driverValue) {
        this.driverValue = driverValue;
    }

    public static Drivers getDriverType(String driverValue) {
        for (Drivers drivers : Drivers.values()) {
            if (drivers.getDriverValue().equalsIgnoreCase(driverValue)) {
                return drivers;
            }
        }
        return null;
    }

    public String getDriverValue() {
        return driverValue;
    }
}
