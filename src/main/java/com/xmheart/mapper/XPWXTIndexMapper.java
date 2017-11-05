package com.xmheart.mapper;

import com.xmheart.model.XPWXTIndex;
import com.xmheart.model.XPWXTIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWXTIndexMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    long countByExample(XPWXTIndexExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int deleteByExample(XPWXTIndexExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    @Delete({ "delete from xpw_xtindex", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    @Insert({ "insert into xpw_xtindex (banner_image_1_url, banner_image_1_action_url, ",
            "banner_image_2_url, banner_image_2_action_url, ", "banner_image_3_url, banner_image_3_action_url)",
            "values (#{bannerImage1Url,jdbcType=VARCHAR}, #{bannerImage1ActionUrl,jdbcType=VARCHAR}, ",
            "#{bannerImage2Url,jdbcType=VARCHAR}, #{bannerImage2ActionUrl,jdbcType=VARCHAR}, ",
            "#{bannerImage3Url,jdbcType=VARCHAR}, #{bannerImage3ActionUrl,jdbcType=VARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(XPWXTIndex record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int insertSelective(XPWXTIndex record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    List<XPWXTIndex> selectByExample(XPWXTIndexExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    @Select({ "select",
            "id, banner_image_1_url, banner_image_1_action_url, banner_image_2_url, banner_image_2_action_url, ",
            "banner_image_3_url, banner_image_3_action_url", "from xpw_xtindex", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.xmheart.mapper.XPWXTIndexMapper.BaseResultMap")
    XPWXTIndex selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int updateByExampleSelective(@Param("record") XPWXTIndex record, @Param("example") XPWXTIndexExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int updateByExample(@Param("record") XPWXTIndex record, @Param("example") XPWXTIndexExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    int updateByPrimaryKeySelective(XPWXTIndex record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_xtindex
     * @mbg.generated  Sun Nov 05 23:13:08 CST 2017
     */
    @Update({ "update xpw_xtindex", "set banner_image_1_url = #{bannerImage1Url,jdbcType=VARCHAR},",
            "banner_image_1_action_url = #{bannerImage1ActionUrl,jdbcType=VARCHAR},",
            "banner_image_2_url = #{bannerImage2Url,jdbcType=VARCHAR},",
            "banner_image_2_action_url = #{bannerImage2ActionUrl,jdbcType=VARCHAR},",
            "banner_image_3_url = #{bannerImage3Url,jdbcType=VARCHAR},",
            "banner_image_3_action_url = #{bannerImage3ActionUrl,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(XPWXTIndex record);
}