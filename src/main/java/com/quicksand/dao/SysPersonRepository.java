package com.quicksand.dao;

import org.springframework.stereotype.Repository;

import com.quicksand.core.IBaseRepository;
import com.quicksand.entity.SysPerson;

@Repository
public interface SysPersonRepository extends IBaseRepository<SysPerson, Long> {
}
