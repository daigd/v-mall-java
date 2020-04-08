package com.v.project.campaign.model.mybatis;

import com.v.project.campaign.model.mybatis.entity.CampaignTemplate;
import com.v.project.campaign.model.mybatis.mapper.ICampaignTemplateMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author : daiguodong@viomi.com.cn
 * @createtime :  2020年04月08日 11:27
 * @description : 活动模板mybatis测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CampaignTemplate4MybatisTest
{
    @Autowired
    ICampaignTemplateMapper campaignTemplateMapper;

    @Test
    public void test()
    {
        List<CampaignTemplate> list = campaignTemplateMapper.selectList(null);
        Assert.assertNotNull(list);
        Assert.assertEquals(12, list.size());
    }
}
