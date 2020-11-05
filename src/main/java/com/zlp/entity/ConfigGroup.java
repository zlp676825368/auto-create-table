package com.zlp.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import com.zlp.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * <p>
 * 配置分组
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table("sys_config_group")
public class ConfigGroup extends BaseEntity {

    /**
     * 分组名称
     */
    @Column(comment = "分组名称",name = "name",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String name;

    /**
     * 排序
     */
    @Column(comment = "排序",name = "sort",type = MySqlTypeConstant.INT)
    private Integer sort;

}