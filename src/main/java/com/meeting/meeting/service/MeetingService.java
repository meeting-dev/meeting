package com.meeting.meeting.service;

import com.meeting.meeting.model.dbo.Meeting;
import com.meeting.meeting.model.dbo.ResourceInfo;
import com.meeting.meeting.model.dto.request.*;
import com.meeting.meeting.model.dto.response.BaseResponse;
import com.meeting.meeting.model.dto.response.UserInfoResponse;
import org.springframework.data.domain.Page;

import javax.mail.MessagingException;

public interface MeetingService {
    BaseResponse addMeeting(AddMeetingRequest request, Integer meetingId);

    BaseResponse<Page<Meeting>> list(QueryMeetingRequest queryMeetingRequest);

    BaseResponse<Meeting> get(Integer id);

    BaseResponse<Page<Meeting>> listForManager(QueryMeetingRequest queryMeetingRequest);

    BaseResponse audit(AuditRequest request);

    BaseResponse editMeeting(EditMeetingRequest request);

    BaseResponse<Page<Meeting>> listForUser(UserQueryMeetingRequest request);

    BaseResponse takePartIn(TakePartInRequest request);

    BaseResponse cancel(TakePartInRequest request);

    BaseResponse<Page<UserInfoResponse>> getMeetingUserInfos(MeetingUsersRequest request);

    void sendHtmlMail(String to, String subject, String content) throws MessagingException;

    BaseResponse<Page<ResourceInfo>> resourceInfos(MeetingUsersRequest request);
}
