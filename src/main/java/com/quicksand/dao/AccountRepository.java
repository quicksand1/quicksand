package com.quicksand.dao;


import org.springframework.stereotype.Repository;

import com.quicksand.entity.SysAccount;

@Repository
public interface AccountRepository extends BaseRepository<SysAccount, Long> {
}
