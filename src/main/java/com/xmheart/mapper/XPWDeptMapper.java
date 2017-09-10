package com.xmheart.mapper;

import com.xmheart.model.XPWDept;
import com.xmheart.model.XPWDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWDeptMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	long countByExample(XPWDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	int deleteByExample(XPWDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	@Delete({ "delete from xpw_dept", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	@Insert({ "insert into xpw_dept (name, image_url, ", "url, dept_doctor_url, ", "admin_expert_id, intro)",
			"values (#{name,jdbcType=VARCHAR}, #{imageUrl,jdbcType=VARCHAR}, ",
			"#{url,jdbcType=VARCHAR}, #{deptDoctorUrl,jdbcType=VARCHAR}, ",
			"#{adminExpertId,jdbcType=BIGINT}, #{intro,jdbcType=LONGVARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(XPWDept record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	int insertSelective(XPWDept record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	List<XPWDept> selectByExampleWithBLOBs(XPWDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	List<XPWDept> selectByExample(XPWDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	@Select({ "select", "id, name, image_url, url, dept_doctor_url, admin_expert_id, intro", "from xpw_dept",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.xmheart.mapper.XPWDeptMapper.ResultMapWithBLOBs")
	XPWDept selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	int updateByExampleSelective(@Param("record") XPWDept record, @Param("example") XPWDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	int updateByExampleWithBLOBs(@Param("record") XPWDept record, @Param("example") XPWDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	int updateByExample(@Param("record") XPWDept record, @Param("example") XPWDeptExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	int updateByPrimaryKeySelective(XPWDept record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	@Update({ "update xpw_dept", "set name = #{name,jdbcType=VARCHAR},", "image_url = #{imageUrl,jdbcType=VARCHAR},",
			"url = #{url,jdbcType=VARCHAR},", "dept_doctor_url = #{deptDoctorUrl,jdbcType=VARCHAR},",
			"admin_expert_id = #{adminExpertId,jdbcType=BIGINT},", "intro = #{intro,jdbcType=LONGVARCHAR}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKeyWithBLOBs(XPWDept record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_dept
	 * @mbg.generated  Sun Sep 10 20:48:01 CST 2017
	 */
	@Update({ "update xpw_dept", "set name = #{name,jdbcType=VARCHAR},", "image_url = #{imageUrl,jdbcType=VARCHAR},",
			"url = #{url,jdbcType=VARCHAR},", "dept_doctor_url = #{deptDoctorUrl,jdbcType=VARCHAR},",
			"admin_expert_id = #{adminExpertId,jdbcType=BIGINT}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(XPWDept record);

	@Select("SELECT d.id as id, d.name as name, d.image_url as image_url, d.intro as intro, d.dept_doctor_url as dept_doctor_url, "
			+ "d.url as url, " +
		    "t.name as doctor_name, t.url as doctor_url, t.image_url as doctor_image_url, t.dept_name as doctor_dept_name,"
		    + "t.duty as doctor_duty, t.professional_title as doctor_professional_title " +
		    "FROM xpw_dept as d " +
		    "LEFT JOIN xpw_doctor AS t " +
    	    "ON " +  
    		"t.dept_id = d.id where d.id = #{id, jdbcType = BIGINT}")
	@ResultMap(value = { "deptWithDoctorsMap" })
	XPWDept selectDeptWithDoctorsByPrimaryKey(@Param("id") long id);
}