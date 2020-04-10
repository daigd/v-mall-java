package com.v.project.campaign.service.biz;

import com.v.project.campaign.model.mybatis.entity.CampaignTemplate;
import com.v.project.campaign.model.mybatis.mapper.ICampaignTemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional(rollbackFor = Exception.class)
    public Long save(CampaignTemplate campaignTemplate)
    {
        mapper.insert(campaignTemplate);
        Long id = campaignTemplate.getTemplateId();
//        testBizException();
        return id;
    }

    public CampaignTemplate queryById(long id)
    {
       return mapper.selectById(id);
    }

    private void testBizException()
    {
        throw new RuntimeException("抛出业务异常");
    }
}
