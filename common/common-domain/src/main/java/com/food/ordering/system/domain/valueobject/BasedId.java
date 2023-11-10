package com.food.ordering.system.domain.valueobject;

import java.util.Objects;

public  abstract class BasedId<T> {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasedId<?> basedId = (BasedId<?>) o;
        return Objects.equals(value, basedId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    protected BasedId(T value) {
        this.value = value;
    }

    private final T value;


    public T getValue() {
        return value;
    }


}
