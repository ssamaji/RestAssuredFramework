package helpers;

/**
 *
 */
public enum ServiceName {
    EMPLOYEE_SERVICE("https://dummy.restapiexample.com");
    public final String value;
    private ServiceName(String label) {
        this.value = label;
    }
}
