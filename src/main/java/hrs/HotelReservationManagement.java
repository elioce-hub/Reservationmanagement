package hrs;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="HotelReservationManagement_table")
public class HotelReservationManagement {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long reservationId;
    private String status;
    private String couponPin;

    @PostPersist
    public void onPostPersist(){

        if(getCouponPin() == null || getCouponPin().isEmpty()){

            ReservationConfirmed reservationConfirmed = new ReservationConfirmed();
            BeanUtils.copyProperties(this, reservationConfirmed);
            reservationConfirmed.publishAfterCommit();
        }

        //쿠폰발행 req 호출 시
        try {
            Thread.currentThread().sleep((long) (400 + Math.random() * 220));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @PostUpdate
    public void onPostUpdate(){
        if(getCouponPin() == null || getCouponPin().isEmpty()){

            ReservationConfirmedCanceled reservationConfirmedCanceled = new ReservationConfirmedCanceled();
            BeanUtils.copyProperties(this, reservationConfirmedCanceled);
            reservationConfirmedCanceled.publishAfterCommit();
        }
        
        //쿠폰발행 req 호출 시
        try {
            Thread.currentThread().sleep((long) (400 + Math.random() * 220));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getCouponPin() {
        return couponPin;
    }

    public void setCouponPin(String couponPin) {
        this.couponPin = couponPin;
    }


}
