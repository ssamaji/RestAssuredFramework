package helpers.bookings;

import com.protos.*;

import java.io.IOException;

/**
 * factory which will http requests helpers
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class BookingFactory {
    private static final BookingFactory instance = new BookingFactory();

    // private constructor to avoid client applications using the constructor
    private BookingFactory(){}

    public static BookingFactory getInstance() {
        return instance;
    }
    private final BookingHelper bookingHelper = new BookingHelper();

    /**
     * helper to create employee
     */

    public CreateBookingResponse createBooking(CreateBookingRequest requestPayload) throws IOException {
       return bookingHelper.createBooking(requestPayload);
    }

    /**
     * Helper to get employee data
     * @return
     * @throws IOException
     */
    public CreateBookingResponse getBookingById(String bookingId) throws IOException {
       return bookingHelper.getBookingById(bookingId);
    }

    public GetBooking getAllBookings() throws IOException {
        return bookingHelper.getAllBookings();
    }
}
