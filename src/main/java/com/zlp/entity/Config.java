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
 * 系统配置
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table("sys_config")
public class Config extends BaseEntity {

    /**
     * 配置标题
     */
    @Column(comment = "配置标题",name = "title",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String title;

    /**
     * 配置标签符
     */
    @Column(comment = "配置标签符",name = "tag",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String tag;

    /**
     * 配置值
     */
    @Column(comment = "配置值",name = "value",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String value;

    /**
     * 配置项
     */
    @Column(comment = "配置项",name = "options",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String options;

    /**
     * 配置分组ID
     */
    @Column(comment = "配置分组ID",name = "group_id",type = MySqlTypeConstant.INT)
    private Integer groupId;

    /**
     * 配置类型：hidden=隐藏 readonly=只读文本 number=数字 text=单行文本 textarea=多行文本 array=数组 password=密码 radio=单选框 checkbox=复选框 select=下拉框 icon=字体图标 date=日期 datetime=时间 image=单张图片 images=多张图片 file=单个文件 files=多个文件 ueditor=富文本编辑器 json=JSON
     */
    @Column(comment = "配置类型：hidden=隐藏 readonly=只读文本 number=数字 text=单行文本 textarea=多行文本 array=数组 password=密码 radio=单选框 checkbox=复选框 select=下拉框 icon=字体图标 date=日期 datetime=时间 image=单张图片 images=多张图片 file=单个文件 files=多个文件 ueditor=富文本编辑器 json=JSON",name = "type",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String type;

    /**
     * 状态：1正常 2停用
     */
    @Column(comment = "态：1正常 2停用",name = "status",type = MySqlTypeConstant.INT,defaultValue = "1")
    private Integer status;

    /**
     * 排序
     */
    @Column(comment = "排序",name = "sort",type = MySqlTypeConstant.INT)
    private Integer sort;

    /**
     * 配置说明
     */
    @Column(comment = "配置说明",name = "note",type = MySqlTypeConstant.VARCHAR,defaultValue = "50")
    private String note;

}