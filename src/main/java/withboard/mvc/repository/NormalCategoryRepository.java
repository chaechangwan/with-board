package withboard.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import withboard.mvc.domain.Normal;

public interface NormalCategoryRepository extends JpaRepository<Normal, Long> {

}
