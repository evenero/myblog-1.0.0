package com.blog.model;

public class Comments {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.id
     *
     * @mbggenerated Thu Apr 27 09:42:47 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.art_id
     *
     * @mbggenerated Thu Apr 27 09:42:47 CST 2017
     */
    private Integer artId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment
     *
     * @mbggenerated Thu Apr 27 09:42:47 CST 2017
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.id
     *
     * @return the value of comment.id
     *
     * @mbggenerated Thu Apr 27 09:42:47 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.id
     *
     * @param id the value for comment.id
     *
     * @mbggenerated Thu Apr 27 09:42:47 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.art_id
     *
     * @return the value of comment.art_id
     *
     * @mbggenerated Thu Apr 27 09:42:47 CST 2017
     */
    public Integer getArtId() {
        return artId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.art_id
     *
     * @param artId the value for comment.art_id
     *
     * @mbggenerated Thu Apr 27 09:42:47 CST 2017
     */
    public void setArtId(Integer artId) {
        this.artId = artId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment
     *
     * @return the value of comment.comment
     *
     * @mbggenerated Thu Apr 27 09:42:47 CST 2017
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment
     *
     * @param comment the value for comment.comment
     *
     * @mbggenerated Thu Apr 27 09:42:47 CST 2017
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

	@Override
	public String toString() {
		return "Comments [id=" + id + ", artId=" + artId + ", comment=" + comment + "]";
	}
}