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
 * 人员角色关系
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table("sys_admin_role")
public class AdminRole extends BaseEntity {

    /**
     * 人员ID
     */
    @Column(comment = "人员ID",name = "admin_id",type = MySqlTypeConstant.INT,isNull = false)
    private Integer adminId;

    /**
     * 角色ID
     */
    @Column(comment = "角色ID",name = "role_id",type = MySqlTypeConstant.INT,isNull = false)
    private Integer roleId;

}