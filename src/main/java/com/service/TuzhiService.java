package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuzhiEntity;
import java.util.Map;

/**
 * 图纸信息 服务类
 * @author 
 * @since 2021-04-28
 */
public interface TuzhiService extends IService<TuzhiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}