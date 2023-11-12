package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class OrderId extends BasedId<UUID> {

    public OrderId(UUID value) {
        super(value);
    }
}
