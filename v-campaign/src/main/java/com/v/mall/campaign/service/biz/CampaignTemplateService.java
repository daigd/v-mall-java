package com.v.mall.campaign.service.biz;

import com.v.mall.campaign.model.mybatis.entity.CampaignTemplate;
import com.v.mall.campaign.model.mybatis.mapper.ICampaignTemplateMapper;
import org.springframework.stereotype.Service;

/**
 * @author : DaiGD
 * @createtime :  2020年04月08日 11:45
 * @description :
 */
@Service
public class CampaignTemplateService
{
    private final ICampaignTemplateMapper mapper;

    public CampaignTemplateService(ICampaignTemplateMapper mapper)
    {
        this.mapper = mapper;
    }

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
