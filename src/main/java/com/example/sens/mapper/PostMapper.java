package com.example.sens.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sens.common.constant.CommonConstant;
import com.example.sens.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liuyanzhao
 */
@Mapper
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 获得最新
     *
     * @param limit
     * @return
     */
    List<Post> getLatestPost(@Param("limit") Integer limit);

    /**
     * 根据状态统计
     *
     * @param postStatus 状态
     * @return
     */
    Integer countByStatus(Integer postStatus);


}

