package com.v.project.campaign.model.api;

import com.v.project.common.model.api.IDisplayModel;
import lombok.Data;

import java.util.Date;

/**
 * @author : DaiGD
 * @createtime :  2019年12月19日 10:33
 * @description : 活动模板首页展示模型
 */
@Data
public class CampaignTemplateIndexModel implements IDisplayModel
{
    private String name;
    
    private String campaignDesc;
    
    private Date beginTime;
    
    private Date endTime;
    
}
