package withboard.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import withboard.mvc.domain.GameRating;

public interface GameRatingRepository extends JpaRepository<GameRating, Long> {

}
