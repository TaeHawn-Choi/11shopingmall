package hotel.domain;

import hotel.domain.*;
import hotel.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliverCompleted extends AbstractEvent {

    private Long id;
    private String orderid;
    private String customerid;
    private String itemid;
    private Integer qty;
    private String address;

    public DeliverCompleted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliverCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
