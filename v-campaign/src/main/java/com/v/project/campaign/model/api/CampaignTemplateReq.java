package com.v.project.campaign.model.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.v.project.common.model.api.IRequestParam;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @author : DaiGD
 * @createtime :  2020年04月18日 11:22
 * @description :
 */
@Data
public class CampaignTemplateReq implements IRequestParam
{
    @NotNull(message = "活动名称不能为空")
    @Size(min = 3, max = 10, message = "活动名称必须是3-6个字符")
    private String name;

    @NotNull(message = "活动描述不能为空")
    @Size(min = 5, max = 100, message = "活动描述必须是5-100个字符")
    private String campaignDesc;

    @NotBlank(message = "活动类型不能为空")
    private String type;

    @NotNull(message = "开始时间不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date beginTime;

    @NotNull(message = "结束时间不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Future(message = "活动结束时间应晚于当前时间")
    private Date endTime;
    
}
