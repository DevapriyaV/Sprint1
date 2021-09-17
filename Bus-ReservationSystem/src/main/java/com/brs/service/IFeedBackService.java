package com.brs.service;

import java.util.List;

import com.brs.entity.FeedBack;

public interface IFeedBackService {

	FeedBack addFeedBack(FeedBack feedback);

	FeedBack updateFeedBack(FeedBack feedback);

	FeedBack viewFeedBack(int feedbackId);

	List<FeedBack> viewAllFeedBack();

}