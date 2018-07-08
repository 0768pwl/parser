package com.cz.pwl.parser.dao.app.repo;

import com.cz.pwl.parser.dao.app.entity.DictionaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictionaryRepository extends JpaRepository<DictionaryEntity, Long> {

}
