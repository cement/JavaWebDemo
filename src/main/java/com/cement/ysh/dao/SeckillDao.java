package com.cement.ysh.dao;

import com.cement.ysh.entity.Seckill;
import com.cement.ysh.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: iamycx
 * @Date: Created in 12:02 2017/11/29
 */
public interface SeckillDao {

    //减库存 return如果影响的行数>1，表示更新的记录行数
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);
    //根据id查询秒杀对象
    Seckill queryById(long seckillId);
    //根据偏移量查询秒杀商品列表
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
    //测试list<map>mybais 是否能识别
    List<Map> selectAll(@Param("params")List params);
    List<Map> selectByMap(@Param("params")Map params);
    //使用存储过程执行秒杀
    void killByProcedure(Map<String,Object> paramMap);
}
