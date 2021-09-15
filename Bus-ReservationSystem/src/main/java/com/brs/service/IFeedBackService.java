package com.brs.service;

import java.util.List;

import com.brs.entity.FeedBack;

public interface IFeedBackService {
	public FeedBack addFeedBack(FeedBack feedBack);
	public FeedBack updateFeedBack(FeedBack feedBack);
	public FeedBack viewFeedBack(int feedBackid);
	public List<FeedBack> viewAllFeedBack();
	

}
