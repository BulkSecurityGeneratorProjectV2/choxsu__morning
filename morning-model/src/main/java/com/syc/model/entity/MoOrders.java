package com.syc.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * null
 * @TableName mo_orders
 */
@Data
public class MoOrders implements Serializable {
    /**
     * 
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer id;

    /**
     * account.id
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer accountId;

    /**
     * 产品id，不同的业务的产品id
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer goodsId;

    /**
     * 订单场景 比如说不同的业务场景，通过此字段来区分
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private String scene;

    /**
     * 订单号
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private String orderSn;

    /**
     * 支付状态 0-待支付 1-已支付
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer payStatus;

    /**
     * 订单状态 0-待付款 1-待发货 2-待收货 3-待评价 6-退款 7-订单取消 8-订单删除 9-·订单完成
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer status;

    /**
     * 退款状态 0-默认 1-申请中 2-审核中 3-已退款 4-退款失败 5-其他
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer refundStatus;

    /**
     * 创建时间
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer created;

    /**
     * 支付时间
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer payTime;

    /**
     * 发货时间
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer sendTime;

    /**
     * 取消时间
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer cancelTime;

    /**
     * 删除时间
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private Integer deleteTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mo_orders
     *
     * @mbg.generated 2021-03-04 14:11:35
     */
    private static final long serialVersionUID = 1L;
}