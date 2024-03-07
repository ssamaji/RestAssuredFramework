package helpers.bookings;

import com.protos.CreateBookingRequest;

/**
 * Data Manager class which will have helpers (retrieval of data)
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class BookingDataManager {
    private static final BookingDataManager instance = new BookingDataManager();

    // private constructor to avoid client applications using the constructor
    private BookingDataManager(){}

    public static BookingDataManager getInstance() {
        return instance;
    }

    private BookingEntity entity = new BookingEntity();


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
    public CreateBookingRequest createBookingRequest(String name, String lastname, int totalPrice, boolean isDeposite,
                                                     String checkinDate,String checkoutDate, String additionalNeeds) {
        return entity.createBookingRequest(name,lastname,totalPrice,isDeposite,checkinDate,checkoutDate,additionalNeeds);
    }

    /**
     *
     * @return
     */
    public CreateBookingRequest createBookingDefaultRequest(){
        return entity.createBookingDefaultRequest();
    }

}
