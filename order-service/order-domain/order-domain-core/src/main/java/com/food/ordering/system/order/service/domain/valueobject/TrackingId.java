package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BasedId;

import java.util.UUID;

public class TrackingId extends BasedId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
