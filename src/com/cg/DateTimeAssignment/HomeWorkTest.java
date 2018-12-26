package com.cg.DateTimeAssignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class HomeWorkTest {
	private HomeWork homeWorkj,homeWorks,homeWorkjs,homeWorkh,homeWorkm;
	@Before
	public void setUp(){
		homeWorkj = new HomeWork("Java",25,12,2018,31,12,2018);
		homeWorks = new HomeWork("Spring",5,2,2018,31,4,2018);
		homeWorkjs = new HomeWork("JavaScript",2,7,2018,31,8,2018);
		homeWorkh = new HomeWork("HTML",25,12,2018,31,1,2019);
		homeWorkm = new HomeWork("MicroServices",25,12,2018,29,12,2018);
		List<Object> homework = new ArrayList<Object>();
		homework.add(homeWorkj);
		homework.add(homeWorks);
		homework.add(homeWorkjs);
		homework.add(homeWorkh);
		homework.add(homeWorkm);
	}

	@Test
	public void test() {
		HomeWork homeWork = new HomeWork();
		homeWork.assignment(homeWork);
	}

}
