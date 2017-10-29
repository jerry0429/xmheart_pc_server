package com.xmheart.model;

public class XPWUser {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_user.id
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_user.username
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_user.password
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_user.user_type
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	private Boolean userType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_user.latest_token
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	private String latestToken;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_user.avatar_url
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	private String avatarUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column xpw_user.role_id
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	private Long roleId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_user.id
	 * @return  the value of xpw_user.id
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_user.id
	 * @param id  the value for xpw_user.id
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_user.username
	 * @return  the value of xpw_user.username
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_user.username
	 * @param username  the value for xpw_user.username
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_user.password
	 * @return  the value of xpw_user.password
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_user.password
	 * @param password  the value for xpw_user.password
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_user.user_type
	 * @return  the value of xpw_user.user_type
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public Boolean getUserType() {
		return userType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_user.user_type
	 * @param userType  the value for xpw_user.user_type
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public void setUserType(Boolean userType) {
		this.userType = userType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_user.latest_token
	 * @return  the value of xpw_user.latest_token
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public String getLatestToken() {
		return latestToken;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_user.latest_token
	 * @param latestToken  the value for xpw_user.latest_token
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public void setLatestToken(String latestToken) {
		this.latestToken = latestToken;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_user.avatar_url
	 * @return  the value of xpw_user.avatar_url
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public String getAvatarUrl() {
		return avatarUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_user.avatar_url
	 * @param avatarUrl  the value for xpw_user.avatar_url
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column xpw_user.role_id
	 * @return  the value of xpw_user.role_id
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column xpw_user.role_id
	 * @param roleId  the value for xpw_user.role_id
	 * @mbg.generated  Sun Oct 29 11:28:57 CST 2017
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
}