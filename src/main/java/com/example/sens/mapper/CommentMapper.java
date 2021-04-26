package com.example.sens.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sens.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 言曌
 * @date 2021/4/18 6:15 下午
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
}
