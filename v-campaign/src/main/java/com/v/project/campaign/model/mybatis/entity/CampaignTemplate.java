package com.v.project.campaign.model.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : DaiGD
 * @createtime :  2020年03月13日 15:55
 * @description :
 */
@Data
@TableName("t_campaign_template")
public class CampaignTemplate implements Serializable
{
    @TableId(value = "template_id", type = IdType.ASSIGN_ID)
    private Long templateId;
    
    private String name;

    private String campaignDesc;

    private Date beginTime;

    private Date endTime;
    
    private String type;
    
    private Byte status;
    
    private String createdBy;
    
    private Date createdTime;
    
    private String updatedBy;
    
    private Date updatedTime;
    
}
