package com.v.project.campaign.controller;

import com.v.project.campaign.model.api.CampaignTemplateIndexModel;
import com.v.project.campaign.model.mybatis.entity.CampaignTemplate;
import com.v.project.campaign.service.biz.CampaignTemplateService;
import com.v.project.common.util.LocalDateTimeUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * @author : DaiGD
 * @createtime :  2019年12月18日 10:05
 * @description :
 */
@RestController
@RequestMapping("/campaign/template")
public class CampaignTemplateController
{
    @Autowired
    private CampaignTemplateService service;

    @PostMapping("")
    public Long saveTemplate()
    {
        CampaignTemplate template = new CampaignTemplate();
        LocalDateTime now = LocalDateTime.now();
        template.setName("签到活动");
        template.setCampaignDesc("首次签到活动");
        template.setBeginTime(LocalDateTimeUtils.toDate(now));
        template.setEndTime(LocalDateTimeUtils.toDate(now.plusDays(10)));
        template.setType("1001");
        template.setStatus((byte) 0);
        template.setCreatedBy("sys");
        template.setCreatedTime(LocalDateTimeUtils.toDate(now));
        template.setUpdatedBy("sys");
        template.setUpdatedTime(LocalDateTimeUtils.toDate(now));
        return service.save(template);
    }
    
    @GetMapping("/{templateId}")
    public String index(@PathVariable Long templateId)
    {
        CampaignTemplateIndexModel model = new CampaignTemplateIndexModel();
        CampaignTemplate template = service.queryById(templateId);
        BeanUtils.copyProperties(template, model);
        return model.toString();
    }
    
}
