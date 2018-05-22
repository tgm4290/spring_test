package com.tgm.spring_test.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgm.spring_test.model.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
	Collection<Bookmark> findByAccountUserName(String userName);

}
