package legensoft.spring_boot_online_lesson.repository;

import legensoft.spring_boot_online_lesson.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query("select c from Comment c where c.house.id = :id")
    List<Comment> getAllComments(Long id);

}
