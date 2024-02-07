package helpers;

/**
 * Service Name class to have service endpoint
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public enum ServiceName {
    EMPLOYEE_SERVICE("https://dummy.restapiexample.com");
    public final String value;
    private ServiceName(String label) {
        this.value = label;
    }
}
