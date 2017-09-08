package com.xmheart.mapper;

import com.xmheart.model.XPWDoctor;
import com.xmheart.model.XPWDoctorExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWDoctorMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	long countByExample(XPWDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	int deleteByExample(XPWDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	@Delete({ "delete from xpw_doctor", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	@Insert({ "insert into xpw_doctor (name, dept_id, ", "duty, professional_title, ", "grade, url, image_url, ",
			"intro)", "values (#{name,jdbcType=VARCHAR}, #{deptId,jdbcType=BIGINT}, ",
			"#{duty,jdbcType=VARCHAR}, #{professionalTitle,jdbcType=VARCHAR}, ",
			"#{grade,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{imageUrl,jdbcType=VARCHAR}, ",
			"#{intro,jdbcType=LONGVARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(XPWDoctor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	int insertSelective(XPWDoctor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	List<XPWDoctor> selectByExampleWithBLOBs(XPWDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	List<XPWDoctor> selectByExample(XPWDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	@Select({ "select", "id, name, dept_id, duty, professional_title, grade, url, image_url, intro", "from xpw_doctor",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.xmheart.mapper.XPWDoctorMapper.ResultMapWithBLOBs")
	XPWDoctor selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	int updateByExampleSelective(@Param("record") XPWDoctor record, @Param("example") XPWDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	int updateByExampleWithBLOBs(@Param("record") XPWDoctor record, @Param("example") XPWDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	int updateByExample(@Param("record") XPWDoctor record, @Param("example") XPWDoctorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	int updateByPrimaryKeySelective(XPWDoctor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	@Update({ "update xpw_doctor", "set name = #{name,jdbcType=VARCHAR},", "dept_id = #{deptId,jdbcType=BIGINT},",
			"duty = #{duty,jdbcType=VARCHAR},", "professional_title = #{professionalTitle,jdbcType=VARCHAR},",
			"grade = #{grade,jdbcType=VARCHAR},", "url = #{url,jdbcType=VARCHAR},",
			"image_url = #{imageUrl,jdbcType=VARCHAR},", "intro = #{intro,jdbcType=LONGVARCHAR}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKeyWithBLOBs(XPWDoctor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_doctor
	 * @mbg.generated  Thu Sep 07 22:34:59 CST 2017
	 */
	@Update({ "update xpw_doctor", "set name = #{name,jdbcType=VARCHAR},", "dept_id = #{deptId,jdbcType=BIGINT},",
			"duty = #{duty,jdbcType=VARCHAR},", "professional_title = #{professionalTitle,jdbcType=VARCHAR},",
			"grade = #{grade,jdbcType=VARCHAR},", "url = #{url,jdbcType=VARCHAR},",
			"image_url = #{imageUrl,jdbcType=VARCHAR}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(XPWDoctor record);
	
	@Select("SELECT d.id as id, d.name as name, d.duty as duty, d.professional_title as professional_title, "
			+ "d.grade as grade, d.url as url, d.image_url as image_url, d.intro as intro, " +
		    "t.name as dept_name, t.url as dept_url " +
		    "FROM xpw_doctor as d " +
		    "LEFT JOIN xpw_dept AS t " +
    	    "ON " +  
    		"d.dept_id = t.id where d.id = #{id, jdbcType = BIGINT}")
	@ResultMap(value = { "doctorWithDeptMap" })
    XPWDoctor selectDoctorWithDeptByPrimaryKey(@Param("id") long id);
}