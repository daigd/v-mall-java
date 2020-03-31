package com.v.project.campaign.model.jpa.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author : DaiGD
 * @createtime :  2019年12月17日 10:22
 * @description : 活动定义模板
 */
@Entity
@Table(name = "t_campaign_template")
public class CampaignTemplate
{
    /**
     * 活动模板Id
     */
    private Long templateId;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动描述
     */
    private String campaignDesc;

    /**
     * 活动类型
     */
    private String type;

    /**
     * 活动开始时间
     */
    private LocalDateTime beginTime;

    /**
     * 活动结束时间
     */
    private LocalDateTime endTime;

    /**
     * 活动状态
     */
    private Byte status;
    
    private LocalDateTime createdTime;
    
    private String createdBy;
    
    private LocalDateTime updatedTime;
    
    private String updatedBy;

    @Id
    @Column(name = "template_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getTemplateId()
    {
        return templateId;
    }

    public void setTemplateId(Long templateId)
    {
        this.templateId = templateId;
    }

    @Column(name = "name")
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Column(name = "campaign_desc")
    public String getCampaignDesc()
    {
        return campaignDesc;
    }

    public void setCampaignDesc(String campaignDesc)
    {
        this.campaignDesc = campaignDesc;
    }

    @Column(name = "type")
    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    @Column(name = "begin_time")
    public LocalDateTime getBeginTime()
    {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime)
    {
        this.beginTime = beginTime;
    }

    @Column(name = "end_time")
    public LocalDateTime getEndTime()
    {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime)
    {
        this.endTime = endTime;
    }

    @Column(name = "status")
    public Byte getStatus()
    {
        return status;
    }

    public void setStatus(Byte status)
    {
        this.status = status;
    }

    @Column(name = "created_time")
    public LocalDateTime getCreatedTime()
    {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime)
    {
        this.createdTime = createdTime;
    }

    @Column(name = "created_by")
    public String getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    @Column(name = "updated_time")
    public LocalDateTime getUpdatedTime()
    {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime)
    {
        this.updatedTime = updatedTime;
    }

    @Column(name = "updated_by")
    public String getUpdatedBy()
    {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }
}
