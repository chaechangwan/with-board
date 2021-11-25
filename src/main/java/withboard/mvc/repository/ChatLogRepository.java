package withboard.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import withboard.mvc.domain.ChatLog;

public interface ChatLogRepository extends JpaRepository<ChatLog, Long> {

}
