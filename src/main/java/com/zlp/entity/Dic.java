package com.zlp.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import com.zlp.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * <p>
 * 字典
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_dic")
public class Dic extends BaseEntity {

    /**
     * 字典名称
     */
    private String title;

    /**
     * 内部标签
     */
    private String tag;

    /**
     * 字典值
     */
    private String value;

    /**
     * 字典类型ID
     */
    private Integer typeId;

    /**
     * 状态：1在用 2停用
     */
    private Integer status;

    /**
     * 备注
     */
    private String note;

    /**
     * 显示顺序
     */
    private Integer sort;

}