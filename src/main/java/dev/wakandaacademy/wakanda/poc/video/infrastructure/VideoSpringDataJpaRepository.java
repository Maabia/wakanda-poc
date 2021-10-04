package dev.wakandaacademy.wakanda.poc.video.infrastructure;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.wakandaacademy.wakanda.poc.video.domain.Video;

@Repository
public interface VideoSpringDataJpaRepository extends JpaRepository<Video, Long> {
	Optional<Video> findById(String idVideo);
}
