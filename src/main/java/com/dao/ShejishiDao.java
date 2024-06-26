package com.dao;

import com.entity.ShejishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShejishiView;

/**
 * 设计师 Dao 接口
 *
 * @author 
 * @since 2021-04-28
 */
public interface ShejishiDao extends BaseMapper<ShejishiEntity> {

   List<ShejishiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
