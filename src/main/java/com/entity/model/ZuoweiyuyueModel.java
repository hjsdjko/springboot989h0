package com.entity.model;

import com.entity.ZuoweiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 座位预约
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-15 17:11:37
 */
public class ZuoweiyuyueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 餐桌号
	 */
	
	private Integer canzhuohao;
		
	/**
	 * 排
	 */
	
	private String pai;
		
	/**
	 * 列
	 */
	
	private String lie;
		
	/**
	 * 就餐类型
	 */
	
	private String jiucanleixing;
		
	/**
	 * 食堂名称
	 */
	
	private String shitangmingcheng;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：餐桌号
	 */
	 
	public void setCanzhuohao(Integer canzhuohao) {
		this.canzhuohao = canzhuohao;
	}
	
	/**
	 * 获取：餐桌号
	 */
	public Integer getCanzhuohao() {
		return canzhuohao;
	}
				
	
	/**
	 * 设置：排
	 */
	 
	public void setPai(String pai) {
		this.pai = pai;
	}
	
	/**
	 * 获取：排
	 */
	public String getPai() {
		return pai;
	}
				
	
	/**
	 * 设置：列
	 */
	 
	public void setLie(String lie) {
		this.lie = lie;
	}
	
	/**
	 * 获取：列
	 */
	public String getLie() {
		return lie;
	}
				
	
	/**
	 * 设置：就餐类型
	 */
	 
	public void setJiucanleixing(String jiucanleixing) {
		this.jiucanleixing = jiucanleixing;
	}
	
	/**
	 * 获取：就餐类型
	 */
	public String getJiucanleixing() {
		return jiucanleixing;
	}
				
	
	/**
	 * 设置：食堂名称
	 */
	 
	public void setShitangmingcheng(String shitangmingcheng) {
		this.shitangmingcheng = shitangmingcheng;
	}
	
	/**
	 * 获取：食堂名称
	 */
	public String getShitangmingcheng() {
		return shitangmingcheng;
	}
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
