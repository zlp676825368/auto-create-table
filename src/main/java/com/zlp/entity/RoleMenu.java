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
 * 角色菜单关系
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table("sys_role_menu")
public class RoleMenu extends BaseEntity {

    /**
     * 角色ID
     */
    @Column(type = MySqlTypeConstant.INT)
    private Integer roleId;

    /**
     * 菜单ID
     */
    @Column(type = MySqlTypeConstant.INT)
    private Integer menuId;

}