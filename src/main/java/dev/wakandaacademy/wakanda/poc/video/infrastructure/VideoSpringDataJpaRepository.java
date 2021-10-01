package dev.wakandaacademy.wakanda.poc.video.infrastructure;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.wakandaacademy.wakanda.poc.video.domain.Video;

@Repository
public interface VideoSpringDataJpaRepository extends JpaRepository<Video, UUID> {
	Optional<Video> findById(String idVideo);
}
