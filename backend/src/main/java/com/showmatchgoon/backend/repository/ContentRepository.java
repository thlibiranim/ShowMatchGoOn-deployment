package com.showmatchgoon.backend.repository;

import com.showmatchgoon.backend.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Long> {
    List<Content> findByType(String type);
    List<Content> findByGenre(String genre);
}
