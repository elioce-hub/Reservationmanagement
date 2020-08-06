package hrs;

import org.springframework.web.bind.annotation.*;

@RestController
 public class HotelReservationManagementController {

    @RequestMapping(method= RequestMethod.POST, path="/hotelReservationManagements/{email}")
    void setCouponPin(@RequestBody HotelReservationManagement hotelReservationManagement) {

        System.out.println("### HotelReservationManagementController IN ###");
        System.out.println(hotelReservationManagement.getCouponPin());
        //여기서 호텔 쿠폰정보에 셋
     }
 }
