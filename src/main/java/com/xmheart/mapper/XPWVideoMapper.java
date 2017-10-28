package com.xmheart.mapper;

import com.xmheart.model.XPWVideo;
import com.xmheart.model.XPWVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWVideoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	long countByExample(XPWVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	int deleteByExample(XPWVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	@Delete({ "delete from xpw_video", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	@Insert({ "insert into xpw_video (title, url, ", "img_url, video_url, ", "brief, is_pinned, ",
			"is_published, publish_time)", "values (#{title,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, ",
			"#{imgUrl,jdbcType=VARCHAR}, #{videoUrl,jdbcType=VARCHAR}, ",
			"#{brief,jdbcType=VARCHAR}, #{isPinned,jdbcType=TINYINT}, ",
			"#{isPublished,jdbcType=TINYINT}, #{publishTime,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(XPWVideo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	int insertSelective(XPWVideo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	List<XPWVideo> selectByExample(XPWVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	@Select({ "select", "id, title, url, img_url, video_url, brief, is_pinned, is_published, publish_time",
			"from xpw_video", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.xmheart.mapper.XPWVideoMapper.BaseResultMap")
	XPWVideo selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	int updateByExampleSelective(@Param("record") XPWVideo record, @Param("example") XPWVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	int updateByExample(@Param("record") XPWVideo record, @Param("example") XPWVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	int updateByPrimaryKeySelective(XPWVideo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_video
	 * @mbg.generated  Sat Oct 28 17:01:43 CST 2017
	 */
	@Update({ "update xpw_video", "set title = #{title,jdbcType=VARCHAR},", "url = #{url,jdbcType=VARCHAR},",
			"img_url = #{imgUrl,jdbcType=VARCHAR},", "video_url = #{videoUrl,jdbcType=VARCHAR},",
			"brief = #{brief,jdbcType=VARCHAR},", "is_pinned = #{isPinned,jdbcType=TINYINT},",
			"is_published = #{isPublished,jdbcType=TINYINT},", "publish_time = #{publishTime,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(XPWVideo record);
}