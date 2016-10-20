package com.quicksand.dao;

import org.springframework.stereotype.Repository;

import com.quicksand.entity.SysPerson;

@Repository
public interface SysPersonRepository extends BaseRepository<SysPerson, Long> {

}
