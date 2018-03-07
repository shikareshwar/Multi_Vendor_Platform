package com.vendor.demo.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.vendor.demo.beans.UserBean;
import com.vendor.demo.services.UserService;
import com.vendor.demo.services.UtilService;

@RestController
public class HomeController {

	@Autowired
	UserService userService;
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping(value = "/", consumes = MediaType.ALL_VALUE)
	public String home(Model model) {

		Map<String, String> customers = UtilService.getCustomerList();
		Map<String, String> courses = UtilService.getCourses();
		Map<String, String> standards = UtilService.getStandards();

		model.addAttribute("customerList", customers);
		model.addAttribute("courseList", courses);
		model.addAttribute("standardList", standards);

		model.addAttribute("userBean", new UserBean());
		return "lrSearch";
	}

	@RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
	public String save(@ModelAttribute("userBean") UserBean userBean, BindingResult result, Model model) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		
		try {
			UserBean resultBean = userService.findUserMobileNo(userBean.getMobileNo());
			model.addAttribute("lrResult", resultBean);
			jsonInString = mapper.writeValueAsString(resultBean);
			System.out.println(jsonInString);
		} catch (Exception e) {
			model.addAttribute("ErrorMsg", "Error occured while searching Learning Resources");
			e.printStackTrace();
		}
		
		return jsonInString;
	}

	

}
