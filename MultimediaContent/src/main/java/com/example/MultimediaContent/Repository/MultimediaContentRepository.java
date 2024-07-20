package com.example.MultimediaContent.Repository;

import com.example.MultimediaContent.Entity.MultimediaContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultimediaContentRepository extends JpaRepository<MultimediaContent, Long> {
}
