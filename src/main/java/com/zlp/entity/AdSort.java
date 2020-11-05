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
 * 广告位描述
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table("sys_ad_sort")
public class AdSort extends BaseEntity {

    /**
     * 广告位名称
     */
    @Column(comment = "广告位名称",name = "name",type = MySqlTypeConstant.VARCHAR)
    private String name;

    /**
     * 广告位描述
     */
    @Column(comment = "广告位描述",name = "note",type = MySqlTypeConstant.VARCHAR)
    private String note;

    /**
     * 站点ID
     */
    @Column(comment = "站点ID",name = "item_id",type = MySqlTypeConstant.INT)
    private Integer itemId;

    /**
     * 栏目ID
     */
    @Column(comment = "栏目ID",name = "cate_id",type = MySqlTypeConstant.INT)
    private Integer cateId;

    /**
     * 广告页面位置
     */
    @Column(comment = "广告页面位置",name = "loc_id",type = MySqlTypeConstant.INT)
    private Integer locId;

    /**
     * 站点类型：1PC网站 2WAP手机站 3小程序 4APP移动端
     */
    @Column(comment = "站点类型：1PC网站 2WAP手机站 3小程序 4APP移动端",name = "platform",type = MySqlTypeConstant.INT)
    private Integer platform;

    /**
     * 广告位排序
     */
    @Column(comment = "广告位排序",name = "sort",type = MySqlTypeConstant.INT)
    private Integer sort;

}