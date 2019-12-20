package com.meeting.meeting.model.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class QueryMeetingRequest extends Page {

    @ApiModelProperty( "会议主标题")
    private String title;

    @ApiModelProperty( "会议副标题")
    private String subtitle;

    @ApiModelProperty( "会议资源主键")
    private Integer resId;


}