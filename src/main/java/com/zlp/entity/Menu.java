package com.zlp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * 菜单
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table("sys_menu")
public class Menu extends BaseEntity {

    /**
     * 菜单名称
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String name;

    /**
     * 图标
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String icon;

    /**
     * URL地址
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String url;

    /**
     * 参数
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String param;

    /**
     * 上级ID
     */
    @Column(type = MySqlTypeConstant.INT)
    private Integer pid;

    /**
     * 类型：1模块 2导航 3菜单 4节点
     */
    @Column(type = MySqlTypeConstant.INT)
    private Integer type;

    /**
     * 权限标识
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 200)
    private String permission;

    /**
     * 是否显示：1显示 2不显示
     */
    @Column(type = MySqlTypeConstant.INT)
    private Integer status;

    /**
     * 是否公共：1是 2否
     */
    @Column(type = MySqlTypeConstant.INT)
    private Integer isPublic;

    /**
     * 菜单备注
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String note;

    /**
     * 显示顺序
     */
    @Column(type = MySqlTypeConstant.INT)
    private Integer sort;

    /**
     * 菜单节点
     */
    @TableField(exist = false)
    private String funcIds;

}