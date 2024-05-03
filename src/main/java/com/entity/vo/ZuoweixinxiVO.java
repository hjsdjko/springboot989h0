package com.entity.vo;

import com.entity.ZuoweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 座位信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-15 17:11:37
 */
public class ZuoweixinxiVO  implements Serializable {
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
	 * 座位状态
	 */
	
	private String zuoweizhuangtai;
		
	/**
	 * 排
	 */
	
	private String pai;
		
	/**
	 * 列
	 */
	
	private String lie;
		
	/**
	 * 食堂名称
	 */
	
	private String shitangmingcheng;
				
	
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
	 * 设置：座位状态
	 */
	 
	public void setZuoweizhuangtai(String zuoweizhuangtai) {
		this.zuoweizhuangtai = zuoweizhuangtai;
	}
	
	/**
	 * 获取：座位状态
	 */
	public String getZuoweizhuangtai() {
		return zuoweizhuangtai;
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
			
}
