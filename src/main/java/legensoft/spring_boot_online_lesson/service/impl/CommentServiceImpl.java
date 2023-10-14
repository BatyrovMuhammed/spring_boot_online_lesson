package legensoft.spring_boot_online_lesson.service.impl;

import legensoft.spring_boot_online_lesson.model.Comment;
import legensoft.spring_boot_online_lesson.repository.CommentRepository;
import legensoft.spring_boot_online_lesson.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;


    @Override
    public List<Comment> getCommentByHouseId(Long id) {
        return commentRepository.getAllComments(id);
    }
}
