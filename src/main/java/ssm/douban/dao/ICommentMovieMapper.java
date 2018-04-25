package ssm.douban.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import ssm.douban.pojo.CommentMovie;
import ssm.douban.pojo.CommentMovieExample;

@Mapper
public interface ICommentMovieMapper {
    long countByExample(CommentMovieExample example);

    int deleteByExample(CommentMovieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommentMovie record);

    int insertSelective(CommentMovie record);

    List<CommentMovie> selectByExample(CommentMovieExample example);

    CommentMovie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommentMovie record, @Param("example") CommentMovieExample example);

    int updateByExample(@Param("record") CommentMovie record, @Param("example") CommentMovieExample example);

    int updateByPrimaryKeySelective(CommentMovie record);

    int updateByPrimaryKey(CommentMovie record);
}