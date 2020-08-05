package hrs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
 public class HotelReservationManagementController {

    @PutMapping("/hotelReservationManagements/{email}")
    String getCouponPin() {

      System.out.println("getCouponPin call");

      String couponPin = "hrm1234";

      return couponPin;
     }
 }
