package com.v.project.campaign.model.mybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author : DaiGD
 * @createtime :  2020年03月13日 15:55
 * @description :
 */
@Data
public class CampaignTemplate implements Serializable
{
    private Long templateId;
    
    private String name;

    private String campaignDesc;

    private LocalDateTime beginTime;

    private LocalDateTime endTime;
}
