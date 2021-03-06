package com.meeting.meeting.model.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class EditCorporationRequest {
    /**
     * 企业名称
     */
    @ApiModelProperty("企业名称")
    @NotBlank(message = "企业名称不能为空")
    private String name;

    /**
     * 企业联系人
     */
    @ApiModelProperty("企业联系人")
    @NotBlank(message = "企业联系人不能为空")
    private String manager;

    /**
     * 限11位数电话号码
     */
    @ApiModelProperty("电话号码")
    @NotBlank(message = "电话号码不能为空")
    private String phone;

    /**
     * 格式为：xxx@xx.com
     */
    @ApiModelProperty("邮箱")
    @NotBlank(message = "邮箱不能为空")
    private String email;

    /**
     * 详细地址
     */
    @ApiModelProperty("详细地址")
    @NotBlank(message = "详细地址不能为空")
    private String address;

    /**
     * 企业的宣传图片，仅限一张
     */
    @ApiModelProperty("企业的宣传图片")
    private String image;

    /**
     * 对企业的简略介绍，仅限文本，限20字
     */
    @ApiModelProperty("企业的简略介绍")
    @NotBlank(message = "企业的简略介绍不能为空")
    private String intro;

    /**
     * 对企业的详细介绍，可文本+图片等，长度无上限
     */
    @ApiModelProperty("详细介绍")
    @NotBlank(message = "企业的详细介绍不能为空")
    private String detail;

    /**
     * 根据企业在平台申请会议情况对企业有vip之分：0-普通会员，1-vip会员
     */
    @ApiModelProperty("据企业在平台申请会议情况对企业有vip之分：0-普通会员，1-vip会员")
    private String vip;
}
