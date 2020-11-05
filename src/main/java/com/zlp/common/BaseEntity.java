package com.zlp.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 基类实体对象
 *
 * @author 牧羊人
 * @date 2019/11/28
 */
@Data
public class BaseEntity{

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)//mybatis-plus主键注解
    @IsAutoIncrement   //自增
    @IsKey
    @Column(comment = "主键",name = "id",type = MySqlTypeConstant.BIGINT,length = 20)
    private Integer id;

    /**
     * 添加人
     */
    @Column(comment = "添加人",name = "create_user",type = MySqlTypeConstant.INT,length = 11,isNull = false,defaultValue = "1")
    private Integer createUser;

    /**
     * 创建时间
     */
    @Column(comment = "创建时间",type = MySqlTypeConstant.TIMESTAMP,name = "create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createTime;

    /**
     * 更新人
     */
    @Column(comment = "更新人",type = MySqlTypeConstant.INT,length = 11,name = "update_user",isNull = false,defaultValue = "1")
    private Integer updateUser;

    /**
     * 更新时间
     */
    @Column(comment = "更新时间",type = MySqlTypeConstant.TIMESTAMP,name = "update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date updateTime;

    /**
     * 有效标识
     */
    @Column(comment = "有效标识0:无效，1：有效",type = MySqlTypeConstant.INT,length = 11,name = "mark",isNull = false,defaultValue = "1")
    private Integer mark;

}
