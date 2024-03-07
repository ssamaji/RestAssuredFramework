package helpers.bookings;

import com.google.protobuf.util.JsonFormat;
import com.protos.*;
import helpers.ServiceName;
import io.restassured.http.Method;
import utils.CommonUtils.TestLogger;
import utils.httpRequests.HttpRequestUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Helper class which will have actual http request implementation
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
class BookingHelper extends TestLogger {
    private HttpRequestUtil httpRequestUtil = HttpRequestUtil.getInstance();

    /**
     * Helper to make create booking request
     * @param requestPayload
     * @return
     * @throws IOException
     */
    CreateBookingResponse createBooking(CreateBookingRequest requestPayload) throws IOException {
        String request = JsonFormat.printer().print(requestPayload);
        String responseString = httpRequestUtil.makeRequest(ServiceName.BOOKING_SERVICE.value,
                Method.POST, BookingEndpoints.CREATE_BOOKING,new HashMap<>(),new HashMap<>(),request,new HashMap<>());
        logInfo(" response "+responseString);
        CreateBookingResponse.Builder createBookingResponse = CreateBookingResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(responseString, createBookingResponse);

        return  createBookingResponse.build();
    }

    /**
     * Helper to get employee data
     * @param bookingId
     * @return
     * @throws IOException
     */
    CreateBookingResponse getBookingById(String bookingId) throws IOException {
        Map<String,Object> pathParam = new HashMap<>();
        pathParam.put("{booking_id}",bookingId);
        String responseString = httpRequestUtil.makeRequest(ServiceName.BOOKING_SERVICE.value,
                Method.GET, BookingEndpoints.GET_BOOKING_BY_ID,pathParam,new HashMap<>(),null,new HashMap<>());

        CreateBookingResponse.Builder getBookingByIdResponse = CreateBookingResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(responseString, getBookingByIdResponse);
        return getBookingByIdResponse.build();
    }

    /**
     * Helper to get employee data
     * @return
     * @throws IOException
     */
    GetBooking getAllBookings() throws IOException {
        String responseString = httpRequestUtil.makeRequest(ServiceName.BOOKING_SERVICE.value,
                Method.GET, BookingEndpoints.GET_BOOKINGS,new HashMap<>(),new HashMap<>(),null,new HashMap<>());

        GetBooking.Builder getAllBookingResponse = GetBooking.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(responseString, getAllBookingResponse);
        return getAllBookingResponse.build();
    }
}
