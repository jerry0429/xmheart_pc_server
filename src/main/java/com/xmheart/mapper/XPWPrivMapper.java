package com.xmheart.mapper;

import com.xmheart.model.XPWPriv;
import com.xmheart.model.XPWPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWPrivMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	long countByExample(XPWPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	int deleteByExample(XPWPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	@Delete({ "delete from xpw_priv", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	@Insert({ "insert into xpw_priv (table_name, column_id)",
			"values (#{tableName,jdbcType=VARCHAR}, #{columnId,jdbcType=BIGINT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(XPWPriv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	int insertSelective(XPWPriv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	List<XPWPriv> selectByExample(XPWPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	@Select({ "select", "id, table_name, column_id", "from xpw_priv", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.xmheart.mapper.XPWPrivMapper.BaseResultMap")
	XPWPriv selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	int updateByExampleSelective(@Param("record") XPWPriv record, @Param("example") XPWPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	int updateByExample(@Param("record") XPWPriv record, @Param("example") XPWPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	int updateByPrimaryKeySelective(XPWPriv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
	 * @mbg.generated  Sat Oct 28 19:44:12 CST 2017
	 */
	@Update({ "update xpw_priv", "set table_name = #{tableName,jdbcType=VARCHAR},",
			"column_id = #{columnId,jdbcType=BIGINT}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(XPWPriv record);
}