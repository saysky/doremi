package com.example.sens.service;

import com.example.sens.common.base.BaseService;
import com.example.sens.entity.Comment;

import java.util.List;

/**
 * @author 言曌
 * @date 2021/4/18 6:15 下午
 */
public interface CommentService extends BaseService<Comment, Long> {

    List<Comment> findByPostId(Long postId);
}
