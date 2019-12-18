package com.v.project.campaign.model.jpa.service;

import com.v.project.campaign.model.jpa.entity.CampaignTemplate;
import com.v.project.campaign.model.jpa.repository.CampaignTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : DaiGD
 * @createtime :  2019年12月17日 11:45
 * @description : 活动模板服务方法
 */
@Service
public class CampaignTemplateService
{
    @Autowired
    private CampaignTemplateRepository repository;

    public Long save(CampaignTemplate campaignTemplate)
    {
        CampaignTemplate c = repository.save(campaignTemplate);
        return c.getTemplateId();
    }
}
