package com.v.mall.campaign.model.api;

import lombok.Data;

import java.util.Date;

/**
 * @author : DaiGD
 * @createtime :  2019年12月19日 10:33
 * @description : 活动模板首页展示模型
 */
@Data
public class CampaignTemplateIndexModel
{
    private String name;
    
    private String campaignDesc;
    
    private Date beginTime;
    
    private Date endTime;
    
}
