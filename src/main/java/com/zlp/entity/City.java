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
 * 城市
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Table("sys_city")
public class City extends BaseEntity {

    /**
     * 城市名称
     */
    @Column(comment = "城市名称",name = "name",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String name;

    /**
     * 城市级别：1省份 2市区 3区县
     */
    @Column(comment = "城市级别：1省份 2市区 3区县",name = "level",type = MySqlTypeConstant.INT)
    private Integer level;

    /**
     * 父级编号
     */
    @Column(comment = "父级编号",name = "pid",type = MySqlTypeConstant.INT)
    private Integer pid;

    /**
     * 城市编号（区号）
     */
    @Column(comment = "城市编号（区号）",name = "citycode",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String citycode;

    /**
     * 父级地理编号
     */
    @Column(comment = "父级地理编号",name = "pAdcode",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String pAdcode;

    /**
     * 地理编号
     */
    @Column(comment = "地理编号",name = "adcode",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String adcode;

    /**
     * 城市坐标中心点经度（* 1e6）如果是中国，此值是 1e7
     */
    @Column(comment = "城市坐标中心点经度（* 1e6）如果是中国，此值是 1e7",name = "lng",type = MySqlTypeConstant.INT)
    private Integer lng;

    /**
     * 城市坐标中心点纬度（* 1e6）
     */
    @Column(comment = "城市坐标中心点纬度（* 1e6）",name = "lat",type = MySqlTypeConstant.INT)
    private Integer lat;

    /**
     * 排序号
     */
    @Column(comment = "排序号",name = "sort",type = MySqlTypeConstant.INT)
    private Integer sort;

}