package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserInfo;
import com.resitory.UserInfoResitory;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "/api", tags = "Api接口")
@RestController
@RequestMapping("/szxyh")
public class UserInfoController {
	@Autowired
	private UserInfoResitory userInfoResitory;

	@InitBinder
	protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@ApiOperation(value = "取得所有用户信息", notes = "展示所有信息")
	@GetMapping(value = "/listAll")
	public List<UserInfo> getUserInfoList() {
		return userInfoResitory.findAll();
	}

	@ApiOperation(value = "添加一个用户", notes = "添加一个用户")
	@PostMapping(value = "/add")
	public UserInfo addUser(@RequestParam("realName") String realName, @RequestParam("sex") Integer sex,
			@RequestParam("phoneNum") Long phoneNum, @RequestParam("entranceTime") Date entranceTime,
			@RequestParam("graduationTime") Date graduationTime, @RequestParam("college") String college,
			@RequestParam("major") String major, @RequestParam("currLocation") String currLocation,
			String industrySkill, String hobby, String personalProfile, @RequestParam("wechatImage") String wechatImage,
			String openId) {
		UserInfo userInfo = new UserInfo();
		userInfo.setRealName(realName);
		userInfo.setSex(sex);
		userInfo.setPhoneNum(phoneNum);
		userInfo.setEntranceTime(entranceTime);
		userInfo.setGraduationTime(graduationTime);
		userInfo.setCollege(college);
		userInfo.setMajor(major);
		userInfo.setCurrLocation(currLocation);
		userInfo.setIndustrySkill(industrySkill);
		userInfo.setHobby(hobby);
		userInfo.setPersonalProfile(personalProfile);
		userInfo.setWechatImage(wechatImage);
		if (openId == "" || openId == null) {
			openId = " ";
		}
		userInfo.setOpenId(openId);
		Date dateNow = new Date();
		userInfo.setCreateTime(dateNow);
		userInfo.setUpdateTime(dateNow);
		return userInfoResitory.save(userInfo);
	}

	@ApiOperation(value = "更新一个用户", notes = "更新一个用户")
	@PutMapping(value = "/update/{id}")
	public UserInfo updateUser(@PathVariable("id") Integer id, @RequestParam("realName") String realName,
			@RequestParam("sex") Integer sex, @RequestParam("phoneNum") Long phoneNum,
			@RequestParam("entranceTime") Date entranceTime, @RequestParam("graduationTime") Date graduationTime,
			@RequestParam("college") String college, @RequestParam("major") String major,
			@RequestParam("currLocation") String currLocation, String industrySkill, String hobby,
			String personalProfile, @RequestParam("wechatImage") String wechatImage, String openId) {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(id);
		userInfo.setRealName(realName);
		userInfo.setSex(sex);
		userInfo.setPhoneNum(phoneNum);
		userInfo.setEntranceTime(entranceTime);
		userInfo.setGraduationTime(graduationTime);
		userInfo.setCollege(college);
		userInfo.setMajor(major);
		userInfo.setCurrLocation(currLocation);
		userInfo.setHobby(hobby);
		userInfo.setPersonalProfile(personalProfile);
		userInfo.setWechatImage(wechatImage);
		userInfo.setOpenId(openId);
		userInfo.setUpdateTime(new Date());
		return userInfoResitory.save(userInfo);
	}

	@ApiOperation(value = "根据字段id查询记录", notes = "根据字段id查询记录")
	@GetMapping(value = "/find/{id}")
	public UserInfo getUserInfo(@PathVariable("id") Integer id) {
		return userInfoResitory.findOne(id);
	}

	@ApiOperation(value = "删除指定数据", notes = "删除指定数据")
	@DeleteMapping(value = "/delete/{id}")
	public void deleteStu(@PathVariable("id") Integer id) {
		userInfoResitory.delete(id);
	}

}
