package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BasedId;

public class OrderItemId extends BasedId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
