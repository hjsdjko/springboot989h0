package com.dao;

import com.entity.ZuoweiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoweiyuyueVO;
import com.entity.view.ZuoweiyuyueView;


/**
 * 座位预约
 * 
 * @author 
 * @email 
 * @date 2022-05-15 17:11:37
 */
public interface ZuoweiyuyueDao extends BaseMapper<ZuoweiyuyueEntity> {
	
	List<ZuoweiyuyueVO> selectListVO(@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);
	
	ZuoweiyuyueVO selectVO(@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);
	
	List<ZuoweiyuyueView> selectListView(@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);

	List<ZuoweiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);
	
	ZuoweiyuyueView selectView(@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);
	

}
