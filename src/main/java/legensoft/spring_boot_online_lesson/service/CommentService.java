package legensoft.spring_boot_online_lesson.service;

import legensoft.spring_boot_online_lesson.model.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getCommentByHouseId(Long id);
}
