package com.v.project.campaign.service.biz;

import com.v.project.campaign.model.mybatis.entity.CampaignTemplate;
import com.v.project.campaign.model.mybatis.mapper.ICampaignTemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : DaiGD
 * @createtime :  2020年04月08日 11:45
 * @description :
 */
@Service
public class CampaignTemplateService
{
    @Autowired
    private ICampaignTemplateMapper mapper;

    public Long save(CampaignTemplate campaignTemplate)
    {
        mapper.insert(campaignTemplate);
        return campaignTemplate.getTemplateId();
    }

    public CampaignTemplate queryById(long id)
    {
       return mapper.selectById(id);
    }
}
