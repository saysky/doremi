package com.example.sens.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sens.entity.Comment;
import com.example.sens.entity.Post;
import com.example.sens.mapper.CommentMapper;
import com.example.sens.mapper.UserMapper;
import com.example.sens.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 言曌
 * @date 2021/4/18 6:17 下午
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseMapper getRepository() {
        return commentMapper;
    }

    @Override
    public QueryWrapper getQueryWrapper(Comment comment) {
        QueryWrapper<Post> queryWrapper = new QueryWrapper<>();
        if (comment != null) {
            if (comment.getUserId() != null && comment.getUserId() != -1) {
                queryWrapper.eq("user_id", comment.getUserId());
            }
            if (comment.getPostId() != null && comment.getPostId() != -1) {
                queryWrapper.eq("post_id", comment.getPostId());
            }
        }
        return queryWrapper;
    }

    @Override
    public List<Comment> findByPostId(Long postId) {
        QueryWrapper<Comment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("post_id", postId);
        List<Comment> commentList = commentMapper.selectList(queryWrapper);
        for (Comment comment : commentList) {
            comment.setUser(userMapper.selectById(comment.getUserId()));
        }
        return commentList;
    }
}
