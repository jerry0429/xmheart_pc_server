package com.xmheart.mapper;

import com.xmheart.model.XPWUser;
import com.xmheart.model.XPWUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	long countByExample(XPWUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	int deleteByExample(XPWUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	@Delete({ "delete from xpw_user", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	@Insert({ "insert into xpw_user (username, password, ", "user_type, latest_token, ", "avatar_url)",
			"values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
			"#{userType,jdbcType=BIT}, #{latestToken,jdbcType=VARCHAR}, ", "#{avatarUrl,jdbcType=VARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(XPWUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	int insertSelective(XPWUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	List<XPWUser> selectByExample(XPWUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	@Select({ "select", "id, username, password, user_type, latest_token, avatar_url", "from xpw_user",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.xmheart.mapper.XPWUserMapper.BaseResultMap")
	XPWUser selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	int updateByExampleSelective(@Param("record") XPWUser record, @Param("example") XPWUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	int updateByExample(@Param("record") XPWUser record, @Param("example") XPWUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	int updateByPrimaryKeySelective(XPWUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_user
	 * @mbg.generated  Sat Oct 28 12:41:00 CST 2017
	 */
	@Update({ "update xpw_user", "set username = #{username,jdbcType=VARCHAR},",
			"password = #{password,jdbcType=VARCHAR},", "user_type = #{userType,jdbcType=BIT},",
			"latest_token = #{latestToken,jdbcType=VARCHAR},", "avatar_url = #{avatarUrl,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(XPWUser record);
}