package helpers.bookings;

import com.protos.CreateBookingRequest;

/**
 * Entity class to create request payloads
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
class BookingEntity {

    /**
     *
     * @param name
     * @param lastname
     * @param totalPrice
     * @param isDeposite
     * @param checkinDate
     * @param checkoutDate
     * @param additionalNeeds
     * @return
     */
    CreateBookingRequest createBookingRequest(String name, String lastname, int totalPrice, boolean isDeposite,
                                              String checkinDate,String checkoutDate, String additionalNeeds) {
        return CreateBookingRequest.newBuilder().setFirstname(name)
                .setLastname(lastname)
                .setTotalprice(totalPrice)
                .setDepositpaid(isDeposite)
                .setBookingdates(CreateBookingRequest.CreateBookingRequestDates.newBuilder()
                        .setCheckin(checkinDate).setCheckout(checkoutDate).build())
                .setAdditionalneeds(additionalNeeds).build();
    }

    CreateBookingRequest createBookingDefaultRequest() {
        return CreateBookingRequest.newBuilder().setFirstname("Test")
                .setLastname("Test")
                .setTotalprice(111)
                .setDepositpaid(false)
                .setBookingdates(CreateBookingRequest.CreateBookingRequestDates.newBuilder()
                        .setCheckin("2018-01-01").setCheckout("2018-01-01").build())
                .setAdditionalneeds("breakfast").build();
    }
}
