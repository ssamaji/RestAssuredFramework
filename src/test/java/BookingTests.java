import com.protos.CreateBookingRequest;
import com.protos.CreateBookingResponse;
import com.protos.CreateEmployeeResponse;
import helpers.bookings.BookingDataManager;
import helpers.bookings.BookingFactory;
import helpers.bookings.BookingValidator;
import org.testng.annotations.Test;
import utils.CommonUtils.TestLogger;

import java.io.IOException;

public class BookingTests extends TestLogger {
    private BookingDataManager bookingDataManager = BookingDataManager.getInstance();
    BookingFactory bookingFactory = BookingFactory.getInstance();
    helpers.bookings.Constants constants = new helpers.bookings.Constants();
    BookingValidator bookingValidator = BookingValidator.getInstance();

    @Test(description = "Test case to create booking and validate data", groups = "regression")
    public void createBookingTest() throws IOException {
        CreateBookingRequest requestPayload = bookingDataManager.createBookingRequest(constants.FIRSTNAME,constants.LAST_NAME,
                constants.TOTAL_PRICE,constants.DEPOSITE_PAID,constants.CHECKIN_DATE,constants.CHECKOUT_DATE,constants.ADDITIONAL_NEEDS);
        CreateBookingResponse createEmployeeResponse = bookingFactory.createBooking(requestPayload);
        CreateEmployeeResponse expectedResponse = CreateEmployeeResponse.newBuilder().setStatus("success")
                .setData(CreateEmployeeResponse.CreateEmployeeResponseData.newBuilder()).setMessage("Successfully! Record has been added.").build();
//        assertThat(createEmployeeResponse, equalTo(expectedResponse));
        bookingValidator.validateCreateBooking(createEmployeeResponse);
    }
}
