package com.xmheart.mapper;

import com.xmheart.model.XPWOnlineVideo;
import com.xmheart.model.XPWOnlineVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWOnlineVideoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	long countByExample(XPWOnlineVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	int deleteByExample(XPWOnlineVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	@Delete({ "delete from xpw_online_video", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	@Insert({ "insert into xpw_online_video (title, url, ", "img_url, video_url, ", "brief, is_pinned, ",
			"is_published, publish_time)", "values (#{title,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, ",
			"#{imgUrl,jdbcType=VARCHAR}, #{videoUrl,jdbcType=VARCHAR}, ",
			"#{brief,jdbcType=VARCHAR}, #{isPinned,jdbcType=TINYINT}, ",
			"#{isPublished,jdbcType=TINYINT}, #{publishTime,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(XPWOnlineVideo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	int insertSelective(XPWOnlineVideo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	List<XPWOnlineVideo> selectByExample(XPWOnlineVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	@Select({ "select", "id, title, url, img_url, video_url, brief, is_pinned, is_published, publish_time",
			"from xpw_online_video", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.xmheart.mapper.XPWOnlineVideoMapper.BaseResultMap")
	XPWOnlineVideo selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	int updateByExampleSelective(@Param("record") XPWOnlineVideo record,
			@Param("example") XPWOnlineVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	int updateByExample(@Param("record") XPWOnlineVideo record, @Param("example") XPWOnlineVideoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	int updateByPrimaryKeySelective(XPWOnlineVideo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_online_video
	 * @mbg.generated  Fri Mar 09 10:51:33 CST 2018
	 */
	@Update({ "update xpw_online_video", "set title = #{title,jdbcType=VARCHAR},", "url = #{url,jdbcType=VARCHAR},",
			"img_url = #{imgUrl,jdbcType=VARCHAR},", "video_url = #{videoUrl,jdbcType=VARCHAR},",
			"brief = #{brief,jdbcType=VARCHAR},", "is_pinned = #{isPinned,jdbcType=TINYINT},",
			"is_published = #{isPublished,jdbcType=TINYINT},", "publish_time = #{publishTime,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(XPWOnlineVideo record);
}