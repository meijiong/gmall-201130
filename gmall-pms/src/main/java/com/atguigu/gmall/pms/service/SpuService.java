package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SpuEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2021-05-13 18:58:46
 */
public interface SpuService extends IService<SpuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);

    PageResultVo querySpuByCidOrPage(Long categoryId, PageParamVo pageParamVo);
}

