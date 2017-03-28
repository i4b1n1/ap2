package com.watkings.business.news;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.business.news.application.NewsAddDto;
import com.watkings.business.news.application.NewsService;
import com.watkings.business.player.PlayerController;
import com.watkings.domain.News;


@RestController
@RequestMapping(value="/news")
public class NewsController {
	
	@Autowired
	NewsService newsService;
	
	Log log = LogFactory.getLog(NewsController.class);
	//jest
	@RequestMapping(value="/add")
	public void addNews(@RequestBody NewsAddDto newsAddDto){
		log.info(" news/add  --------" + newsAddDto.getTitle() + newsAddDto.getBody() );
		newsService.addNews(newsAddDto);
	}
	//jest
	@RequestMapping(value="/get/{number}")
	public List<News> getNewsList(@PathVariable int number){
		return newsService.getNewsList(number);
	}
}
