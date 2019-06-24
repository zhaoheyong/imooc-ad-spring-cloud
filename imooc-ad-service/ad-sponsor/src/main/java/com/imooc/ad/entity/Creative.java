package com.imooc.ad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * Created by Qinyi.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Creative {

    private Long id;

    private String name;

    private Integer type;

    /** 物料的类型, 比如图片可以是 bmp, jpg等等 */
    private Integer materialType;

    private Integer height;

    private Integer width;

    /** 物料大小 */
    private Long size;

    /** 持续时长, 只有视频不为0 */
    private Integer duration;

    /** 审核状态 */
    private Integer auditStatus;

    private Long userId;

    private String url;

    private Date createTime;

    private Date updateTime;
}
