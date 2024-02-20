package com.demo.LearningPortal.mappers;

import java.util.List;
import org.mapstruct.Mapper;

public interface EntityMapper<D,E> {
	D toDto(E e);
	E toEntity(D d);
	List<D> toDto(List<E> elist);
	List<E> toEntity(List<D> dlist);

}
