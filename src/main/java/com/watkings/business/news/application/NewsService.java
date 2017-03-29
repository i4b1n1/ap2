package com.watkings.business.news.application;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.News;
import com.watkings.domain.NewsRepository;

@Component
public class NewsService {
	
	@Autowired
	NewsRepository newsRepository;

	public void addNews(NewsAddDto newsAddDto) {
		News news = new News();
		prepareNewsByDto(news, newsAddDto);
		newsRepository.save(news);
	}

	private void prepareNewsByDto(News news, NewsAddDto newsAddDto) {
		if(newsAddDto.getTitle()!=null)
			news.setTitle(newsAddDto.getTitle());
		if(newsAddDto.getBody()!=null)
			news.setBody(newsAddDto.getBody());		
		news.setDate(new Date());
	}

	public List<News> getNewsList(int number) {
		return newsRepository.getNumberOfNewses(number);
		
	}

}
