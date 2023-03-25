package com.sh.numble.mybox.mapstruct;

import org.mapstruct.MappingTarget;

import java.util.List;

public interface GenericMapper<D, E> {
    D toDto(E e);
    List<D> toDto(List<E> e);
    void updateFromDto(D dto, @MappingTarget E entity);
}
