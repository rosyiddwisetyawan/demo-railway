package nusatrip.demorailway.repository;

import nusatrip.demorailway.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Integer> {
}