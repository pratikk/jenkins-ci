package com.springtest.app.eclipsemaventest;
import java.util.List;
 

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
 
@SuppressWarnings("deprecation")
public class StoryReader {
 
	public static void main(String args[]) {
		XmlBeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("StoryList.xml"));
 
		StoryList storyList = (StoryList) beanFactory.getBean("StoryList");
 
		List myStories = storyList.getStories();
 
		for (int i = 0; i < myStories.size(); i++) {
			Story currentStory = (Story) myStories.get(i);
			System.out.println("\"" + currentStory.getTitle() + "\" by "
					+ currentStory.getAuthor().getName() + " (" + currentStory.getAuthor().getPubs() + ")" + ":");
			System.out.println(currentStory.getContent());
			System.out.println("Published: " + currentStory.getPubDate());
			System.out.println();
		}
	}//end main
 
}//end StoryReader
