package hotel.domain;

import hotel.domain.*;
import hotel.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String orderid;
    private String customerid;
    private String itemid;
    private Integer qty;
    private String address;
}
