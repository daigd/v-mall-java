package com.v.project.campaign.controller;

import com.v.project.campaign.model.api.CampaignTemplateIndexModel;
import com.v.project.campaign.model.api.CampaignTemplateReq;
import com.v.project.campaign.model.mybatis.entity.CampaignTemplate;
import com.v.project.campaign.service.biz.CampaignTemplateService;
import com.v.project.common.model.api.ResultVO;
import com.v.project.common.util.LocalDateTimeUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ResultVO<Long> saveTemplate(@RequestBody @Valid CampaignTemplateReq req)
    {
        if(req.getEndTime().before(req.getBeginTime()))
        {
            throw new RuntimeException("活动结束时间应晚于开始时间");
        }

        CampaignTemplate template = new CampaignTemplate();
        LocalDateTime now = LocalDateTime.now();
        template.setName(req.getName());
        template.setCampaignDesc(req.getCampaignDesc());
        template.setBeginTime(req.getBeginTime());
        template.setEndTime(req.getEndTime());
        template.setType(req.getType());
        template.setStatus((byte) 0);
        template.setCreatedBy("sys");
        template.setCreatedTime(LocalDateTimeUtils.toDate(now));
        template.setUpdatedBy("sys");
        template.setUpdatedTime(LocalDateTimeUtils.toDate(now));
        return new ResultVO<>(service.save(template));
    }
    
    @GetMapping("/{templateId}")
    public ResultVO<CampaignTemplateIndexModel> index(@PathVariable Long templateId)
    {
        CampaignTemplateIndexModel model = new CampaignTemplateIndexModel();
        CampaignTemplate template = service.queryById(templateId);
        BeanUtils.copyProperties(template, model);
        return new ResultVO<>(model);
    }
    
}
