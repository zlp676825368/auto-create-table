package com.zlp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * <p>
 * 系统人员
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
@Data
@TableName("sys_admin")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)//mybatis-plus主键注解
    @IsAutoIncrement   //自增
    @IsKey
    @Column(comment = "主键",name = "id",type = MySqlTypeConstant.BIGINT,length = 20)
    private Integer id;

    /**
     * 真实姓名
     */
    @Column(comment = "真实姓名",name = "realname",type = MySqlTypeConstant.VARCHAR,length = 20,isNull = false)
    private String realname;

    /**
     * 昵称
     */
    @Column(comment = "昵称",name = "nickname",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String nickname;

    /**
     * 性别:1男 2女 3保密
     */
    @Column(comment = "性别:1男 2女 3保密",name = "gender",type = MySqlTypeConstant.INT,length = 11,defaultValue = "1")
    private Integer gender;

    /**
     * 头像
     */
    @Column(comment = "头像",name = "avatar",type = MySqlTypeConstant.VARCHAR,length = 100)
    private String avatar;

    /**
     * 手机号码
     */
    @Column(comment = "手机号码",name = "mobile",type = MySqlTypeConstant.VARCHAR,length = 11,isNull = false)
    private String mobile;

    /**
     * 邮箱地址
     */
    @Column(comment = "邮箱地址",name = "email",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String email;

    /**
     * 出生日期
     */
    @Column(comment = "主键",name = "birthday",type = MySqlTypeConstant.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 公司ID
     */
    @Column(comment = "公司ID",name = "company_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer companyId;

    /**
     * 部门ID
     */
    @Column(comment = "部门ID",name = "dept_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer deptId;

    /**
     * 职级ID
     */
    @Column(comment = "职级ID",name = "level_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer levelId;

    /**
     * 岗位ID
     */
    @Column(comment = "岗位ID",name = "position_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer positionId;

    /**
     * 省份ID
     */
    @Column(comment = "省份ID",name = "province_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer provinceId;

    /**
     * 市区ID
     */
    @Column(comment = "市区ID",name = "city_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer cityId;

    /**
     * 区县ID
     */
    @Column(comment = "区县ID",name = "district_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer districtId;

    /**
     * 详细地址
     */
    @Column(comment = "详细地址",name = "address",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String address;

    /**
     * 登录用户名
     */
    @Column(comment = "登录用户名",name = "username",type = MySqlTypeConstant.VARCHAR,length = 20,isNull = false)
    private String username;

    /**
     * 登录密码
     */
    @Column(comment = "登录密码",name = "password",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String password;

    /**
     * 盐加密
     */
    @Column(comment = "盐加密",name = "salt",type = MySqlTypeConstant.VARCHAR,length = 20,defaultValue = "hjkj")
    private String salt;

    /**
     * 个性标签
     */
    @Column(comment = "个性标签",name = "tags",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String tags;

    /**
     * 个人简介
     */
    @Column(comment = "个人简介",name = "intro",type = MySqlTypeConstant.VARCHAR,length = 100)
    private String intro;

    /**
     * 状态：1正常 2禁用
     */
    @Column(comment = "状态：1正常 2禁用",name = "status",type = MySqlTypeConstant.INT,length = 11,defaultValue = "1")
    private Integer status;

    /**
     * 人员独立权限的菜单ID，多个规则逗号“,”隔开
     */
    @Column(comment = "人员独立权限的菜单ID，多个规则逗号“,”隔开",name = "rules",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String rules;

    /**
     * 用户角色ID(多个规则逗号“,”隔开)
     */
    @Column(comment = "用户角色ID(多个规则逗号“,”隔开)",name = "role_ids",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String roleIds;

    /**
     * 备注
     */
    @Column(comment = "备注",name = "note",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String note;

    /**
     * 显示顺序
     */
    @Column(comment = "显示顺序",name = "sort",type = MySqlTypeConstant.INT,length = 11)
    private Integer sort;

    /**
     * 登录次数
     */
    @Column(comment = "登录次数",name = "login_num",type = MySqlTypeConstant.INT,length = 11)
    private Integer loginNum;

    /**
     * 最近登录IP
     */
    @Column(comment = "最近登录IP",name = "login_ip",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String loginIp;

    /**
     * 最近登录时间
     */
    @Column(comment = "最近登录时间",name = "login_time",type = MySqlTypeConstant.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date loginTime;

    /**
     * 添加人
     */
    @Column(comment = "添加人",name = "create_user",type = MySqlTypeConstant.INT,length = 11,isNull = false)
    private Integer createUser;

    /**
     * 创建时间
     */
    @Column(comment = "创建时间",name = "create_time",type = MySqlTypeConstant.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 更新人
     */
    @Column(comment = "更新人",name = "update_user",type = MySqlTypeConstant.INT,length = 11,isNull = false)
    private Integer updateUser;

    /**
     * 更新时间
     */
    @Column(comment = "更新时间",name = "update_time",type = MySqlTypeConstant.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    /**
     * 有效标识
     */
    @Column(comment = "有效标识",name = "mark",type = MySqlTypeConstant.INT,length = 11,defaultValue = "1")
    private Integer mark;

}