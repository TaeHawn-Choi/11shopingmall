package hotel.domain;

import hotel.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class DeliverCompleted extends AbstractEvent {

    private Long id;
    private String orderid;
    private String customerid;
    private String itemid;
    private Integer qty;
    private String address;
}
