package com.zlp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * 广告
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table("sys_ad")
public class Ad extends BaseEntity {

    /**
     * 广告标题
     */
    @Column(comment = "广告标题",name = "title",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String title;

    /**
     * 广告位ID
     */
    @Column(comment = "广告位ID",name = "sort_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer sortId;

    /**
     * 广告图片
     */
    @Column(comment = "广告图片",name = "cover",type = MySqlTypeConstant.VARCHAR,length = 100)
    private String cover;

    /**
     * 广告格式：1图片 2文字 3视频 4推荐
     */
    @Column(comment = "1图片 2文字 3视频 4推荐",name = "type",type = MySqlTypeConstant.INT,length = 11,isNull = false)
    private Integer type;

    /**
     * 广告描述
     */
    @Column(comment = "广告描述",name = "description",type = MySqlTypeConstant.VARCHAR,length = 100)
    private String description;

    /**
     * 广告内容
     */
    @Column(comment = "广告内容",name = "content",type = MySqlTypeConstant.VARCHAR,length = 100)
    private String content;

    /**
     * 广告链接
     */
    @Column(comment = "广告链接",name = "url",type = MySqlTypeConstant.VARCHAR,length = 100,isNull = false)
    private String url;

    /**
     * 广告宽度
     */
    @Column(comment = "广告宽度",name = "width",type = MySqlTypeConstant.INT,length = 11)
    private Integer width;

    /**
     * 广告高度
     */
    @Column(comment = "广告高度",name = "height",type = MySqlTypeConstant.INT,length = 11)
    private Integer height;

    /**
     * 开始时间
     */
    @Column(comment = "开始时间",name = "start_time",type = MySqlTypeConstant.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(comment = "广告位ID",name = "end_time",type = MySqlTypeConstant.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date endTime;

    /**
     * 广告点击次数
     */
    @Column(comment = "广告点击次数",name = "view_num",type = MySqlTypeConstant.INT,length = 11,defaultValue = "0")
    private Integer viewNum;

    /**
     * 状态：1在用 2停用
     */
    @Column(comment = "状态：1在用 2停用",name = "status",type = MySqlTypeConstant.INT,length = 11,defaultValue = "1")
    private Integer status;

    /**
     * 排序
     */
    @Column(comment = "排序",name = "sort",type = MySqlTypeConstant.INT,length = 11,isNull = false)
    private Integer sort;

}