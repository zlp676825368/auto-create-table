package com.zlp.entity;

import com.baomidou.mybatisplus.annotation.TableName;


import com.zlp.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * <p>
 * 字典类型
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_dic_type")
public class DicType extends BaseEntity {

    /**
     * 字典名称
     */
    private String name;

    /**
     * 标识符
     */
    private String tag;

    /**
     * 显示顺序
     */
    private Integer sort;

}