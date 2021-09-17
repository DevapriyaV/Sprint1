package com.brs.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brs.entity.FeedBack;
import com.brs.exceptions.FeedBackNotFoundException;
import com.brs.repository.IFeedBackRepository;

@Service
@Transactional
public class FeedBackService implements IFeedBackService {
	@Autowired
	private IFeedBackRepository feedbackRepository;

	@Override
	public FeedBack addFeedBack(FeedBack feedback) {
		feedbackRepository.save(feedback);

		return feedback;

	}

	@Override
	public FeedBack updateFeedBack(FeedBack feedback) {
		feedbackRepository.save(feedback);

		return feedback;

	}

	@Override
	public FeedBack viewFeedBack(int feedbackId) {
		FeedBack fb=null;
		try {
			fb = feedbackRepository.findById(feedbackId).orElseThrow(FeedBackNotFoundException::new);
		} catch (FeedBackNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return fb;

	}

	@Override
	public List<FeedBack> viewAllFeedBack() {

		return feedbackRepository.findAll();

	}

}