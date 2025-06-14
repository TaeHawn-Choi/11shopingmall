package hotel.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "Mypage_table")
@Data
public class Mypage {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String orderid;
    private String custormerid;
    private Integer itemid;
    private String qty;
    private String address;
    private String orderStatus;
    private String deliveryStatus;
}
