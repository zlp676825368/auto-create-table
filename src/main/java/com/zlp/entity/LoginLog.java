package com.zlp.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

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
 * 登录日志
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table("sys_login_log")
public class LoginLog extends BaseEntity {

    /**
     * 日志标题
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String title;

    /**
     * 登录账号
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String loginName;

    /**
     * 登录时间
     */
    @Column(type = MySqlTypeConstant.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date loginTime;

    /**
     * 登录IP地址
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String loginIp;

    /**
     * 登录地区
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String loginLocation;

    /**
     * 浏览器类型
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String browser;

    /**
     * 操作系统
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String os;

    /**
     * 登录状态：1成功 2失败
     */
    @Column(type = MySqlTypeConstant.INT)
    private Integer status;

    /**
     * 类型：1登录系统 2退出系统
     */
    @Column(type = MySqlTypeConstant.INT)
    private Integer type;

    /**
     * 提示消息
     */
    @Column(type = MySqlTypeConstant.VARCHAR,length = 20)
    private String msg;

}