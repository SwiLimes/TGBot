package com.example.tgbot.database;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends CrudRepository<User, Long> {
    @Transactional
    @Modifying
    @Query("UPDATE tg_data t SET t.msg_numb = t.msg_numb + 1 WHERE t.id IS NOT NULL AND t.id = :id")
    void updateMsgNumberByUserId(@Param("id") long id);
}
