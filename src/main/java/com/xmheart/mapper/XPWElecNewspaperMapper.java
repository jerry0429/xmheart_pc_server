package com.xmheart.mapper;

import com.xmheart.model.XPWElecNewspaper;
import com.xmheart.model.XPWElecNewspaperExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWElecNewspaperMapper {

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    long countByExample(XPWElecNewspaperExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    int deleteByExample(XPWElecNewspaperExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    @Delete({ "delete from xpw_electronic_newspaper", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    @Insert({ "insert into xpw_electronic_newspaper (title, years, ", "times, url, page, ",
            "is_published, download_url, ", "image_url, publish_time)",
            "values (#{title,jdbcType=VARCHAR}, #{years,jdbcType=VARCHAR}, ",
            "#{times,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{page,jdbcType=TINYINT}, ",
            "#{isPublished,jdbcType=TINYINT}, #{downloadUrl,jdbcType=VARCHAR}, ",
            "#{imageUrl,jdbcType=VARCHAR}, #{publishTime,jdbcType=TIMESTAMP})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(XPWElecNewspaper record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    int insertSelective(XPWElecNewspaper record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    List<XPWElecNewspaper> selectByExample(XPWElecNewspaperExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    @Select({ "select", "id, title, years, times, url, page, is_published, download_url, image_url, publish_time",
            "from xpw_electronic_newspaper", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.xmheart.mapper.XPWElecNewspaperMapper.BaseResultMap")
    XPWElecNewspaper selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    int updateByExampleSelective(@Param("record") XPWElecNewspaper record,
            @Param("example") XPWElecNewspaperExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    int updateByExample(@Param("record") XPWElecNewspaper record, @Param("example") XPWElecNewspaperExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    int updateByPrimaryKeySelective(XPWElecNewspaper record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_electronic_newspaper
     * @mbg.generated  Thu Nov 02 22:54:40 CST 2017
     */
    @Update({ "update xpw_electronic_newspaper", "set title = #{title,jdbcType=VARCHAR},",
            "years = #{years,jdbcType=VARCHAR},", "times = #{times,jdbcType=VARCHAR},",
            "url = #{url,jdbcType=VARCHAR},", "page = #{page,jdbcType=TINYINT},",
            "is_published = #{isPublished,jdbcType=TINYINT},", "download_url = #{downloadUrl,jdbcType=VARCHAR},",
            "image_url = #{imageUrl,jdbcType=VARCHAR},", "publish_time = #{publishTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(XPWElecNewspaper record);

    @Select("SELECT years FROM xpw_electronic_newspaper where is_published = 1 GROUP BY years ORDER BY years desc")
	List<String> getNewsPaperYears();

	@Select("SELECT times FROM xpw_electronic_newspaper WHERE is_published = 1 and years=#{year} GROUP BY times ORDER BY `years`, times asc")
	List<String> getNewsPaperTimes(@Param("year") String year);

	@Select("SELECT * FROM xpw_electronic_newspaper GROUP BY title")
    List<XPWElecNewspaper> selectByExampleGroup(Object object);
	
    @Select("SELECT * FROM xpw_electronic_newspaper GROUP BY times ORDER BY publish_time")
    List<XPWElecNewspaper> selectLastest();
	
}