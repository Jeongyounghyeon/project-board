package dev.be.projectboard.service;

import dev.be.projectboard.dto.ArticleCommentDto;
import dev.be.projectboard.repository.ArticleCommentRepository;
import dev.be.projectboard.repository.ArticleRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComment(long l) {
        return List.of();
    }

    public void saveArticleComment(ArticleCommentDto of) {
    }
}
