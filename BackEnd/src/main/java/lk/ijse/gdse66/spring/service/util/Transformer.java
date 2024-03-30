package lk.ijse.gdse66.spring.service.util;

import lk.ijse.gdse66.spring.dto.CustomerDTO;
import lk.ijse.gdse66.spring.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : L.H.J
 * @File: Transformer
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-03-30, Saturday
 **/

@Component
public class Transformer {
    private final ModelMapper mapper;
    public Transformer(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public <D, E> D fromEntity(E entity, Class<D> dtoClass) {
        return mapper.map(entity, dtoClass);
    }

    public <D, E> E toEntity(D dto, Class<E> entityClass) {
        return mapper.map(dto, entityClass);
    }

    public <D, E> List<D> fromEntityList(List<E> entityList, Class<D> dtoClass) {
        return entityList.stream()
                .map(entity -> fromEntity(entity, dtoClass))
                .collect(Collectors.toList());
    }

    public <D, E> List<E> toEntityList(List<D> dtoList, Class<E> entityClass) {
        return dtoList.stream()
                .map(dto -> toEntity(dto, entityClass))
                .collect(Collectors.toList());
    }
}
