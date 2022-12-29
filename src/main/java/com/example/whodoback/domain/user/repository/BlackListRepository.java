package com.example.whodoback.domain.user.repository;

import com.example.whodoback.domain.user.entity.BlackList;
import org.springframework.data.repository.CrudRepository;

public interface BlackListRepository extends CrudRepository<BlackList, String> {
}
