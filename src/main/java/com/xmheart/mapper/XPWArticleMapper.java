package com.xmheart.mapper;

import com.xmheart.model.XPWArticle;
import com.xmheart.model.XPWArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWArticleMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    long countByExample(XPWArticleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int deleteByExample(XPWArticleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    @Delete({ "delete from xpw_article", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    @Insert({ "insert into xpw_article (column_id, column_name, ", "title, url, img_url, ", "brief, is_pinned, ",
            "pin_order, tags, ", "is_published, publish_time, ", "content)",
            "values (#{columnId,jdbcType=BIGINT}, #{columnName,jdbcType=VARCHAR}, ",
            "#{title,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{imgUrl,jdbcType=VARCHAR}, ",
            "#{brief,jdbcType=VARCHAR}, #{isPinned,jdbcType=TINYINT}, ",
            "#{pinOrder,jdbcType=TINYINT}, #{tags,jdbcType=VARCHAR}, ",
            "#{isPublished,jdbcType=TINYINT}, #{publishTime,jdbcType=TIMESTAMP}, ",
            "#{content,jdbcType=LONGVARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(XPWArticle record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int insertSelective(XPWArticle record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    List<XPWArticle> selectByExampleWithBLOBs(XPWArticleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    List<XPWArticle> selectByExample(XPWArticleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    @Select({ "select", "id, column_id, column_name, title, url, img_url, brief, is_pinned, pin_order, ",
            "tags, is_published, publish_time, content", "from xpw_article", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.xmheart.mapper.XPWArticleMapper.ResultMapWithBLOBs")
    XPWArticle selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int updateByExampleSelective(@Param("record") XPWArticle record, @Param("example") XPWArticleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") XPWArticle record, @Param("example") XPWArticleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int updateByExample(@Param("record") XPWArticle record, @Param("example") XPWArticleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int updateByPrimaryKeySelective(XPWArticle record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    @Update({ "update xpw_article", "set column_id = #{columnId,jdbcType=BIGINT},",
            "column_name = #{columnName,jdbcType=VARCHAR},", "title = #{title,jdbcType=VARCHAR},",
            "url = #{url,jdbcType=VARCHAR},", "img_url = #{imgUrl,jdbcType=VARCHAR},",
            "brief = #{brief,jdbcType=VARCHAR},", "is_pinned = #{isPinned,jdbcType=TINYINT},",
            "pin_order = #{pinOrder,jdbcType=TINYINT},", "tags = #{tags,jdbcType=VARCHAR},",
            "is_published = #{isPublished,jdbcType=TINYINT},", "publish_time = #{publishTime,jdbcType=TIMESTAMP},",
            "content = #{content,jdbcType=LONGVARCHAR}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKeyWithBLOBs(XPWArticle record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_article
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    @Update({ "update xpw_article", "set column_id = #{columnId,jdbcType=BIGINT},",
            "column_name = #{columnName,jdbcType=VARCHAR},", "title = #{title,jdbcType=VARCHAR},",
            "url = #{url,jdbcType=VARCHAR},", "img_url = #{imgUrl,jdbcType=VARCHAR},",
            "brief = #{brief,jdbcType=VARCHAR},", "is_pinned = #{isPinned,jdbcType=TINYINT},",
            "pin_order = #{pinOrder,jdbcType=TINYINT},", "tags = #{tags,jdbcType=VARCHAR},",
            "is_published = #{isPublished,jdbcType=TINYINT},", "publish_time = #{publishTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(XPWArticle record);

    @Select({ "select", "a.id, a.column_id, a.column_name, a.title, a.url, a.img_url, a.brief, a.is_pinned, a.pin_order, ",
        "a.tags, a.is_published, a.publish_time, a.content, b.id as first_column_id, b.column_name as first_column_name", "from xpw_article a, xpw_column b", 
        "where a.column_id = b.id and a.id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.xmheart.mapper.XPWArticleMapper.ResultMapWithBLOBsAndFirstColumn")
    XPWArticle selectWithFirstColumnByPrimaryKey(Long id);
    
    @Select({"SELECT a.id, a.url, a.title, a.publish_time, a.pin_order, a.is_pinned, a.img_url, a.column_name, a.brief\n" + 
//            "from xpw_article as a where is_published = 1 and title like '%${keywords}%'   \n" +
            "from xpw_article as a where is_published = 1 and title like concat('%', #{keywords, jdbcType=VARCHAR}, '%')   \n" +
            "order by is_pinned desc, pin_order asc, publish_time desc"}) 
    @ResultMap("com.xmheart.mapper.XPWArticleMapper.BaseResultMap")
    List<XPWArticle> selectArticleByTitle(@Param("keywords") String keywords);
}