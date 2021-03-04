package com.syc.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * null
 * @TableName blog
 */
@Data
public class Blog implements Serializable {
    /**
     * 主键id
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Integer id;

    /**
     * 博客主id
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Integer accountid;

    /**
     * 标题
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private String title;

    /**
     * 内容
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private String content;

    /**
     * 待解析内容
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private String markedcontent;

    /**
     * 创建时间
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Date createat;

    /**
     * 修改时间
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Date updateat;

    /**
     * 点击次数
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Integer clickcount;

    /**
     * 喜欢次数
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Integer likecount;

    /**
     * 收藏次数
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Integer favoritecount;

    /**
     * 类型 note（笔记）favorite(收藏）code(代码）about(关于）
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private String category;

    /**
     * 是否删除 0否1是
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Integer isdelete;

    /**
     * tag_id
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Integer tagId;

    /**
     * 代码分类id，如果category为code时候，这个值才会生效
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table blog
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private static final long serialVersionUID = 1L;
}