package com.syc.model.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 类别表
 * @TableName blog_category
 */
@Data
public class BlogCategory implements Serializable {
    /**
     * 主键id
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Integer id;

    /**
     * 名称
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private String name;

    /**
     * 是否有效；0是1否
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table blog_category
     *
     * @mbg.generated 2021-03-04 12:07:31
     */
    private static final long serialVersionUID = 1L;
}