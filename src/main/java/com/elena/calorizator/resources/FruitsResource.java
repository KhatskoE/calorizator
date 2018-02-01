package com.elena.calorizator.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elena.calorizator.dto.Fruit;

@Controller
@RequestMapping(path="/fruits")
public class FruitsResource {
	
	
	public List<Fruit> getAllFruilsWithSupplementFact() {
		return new ArrayList<Fruit>();
	}

}
