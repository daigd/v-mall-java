package com.v.project.campaign.model.mybatis.generator;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.springframework.stereotype.Component;

/**
 * @author : DaiGD
 * @createtime :  2020年04月10日 21:01
 * @description : 用shardingSphere的分布式主键生成器生成主键
 */
@Slf4j
@Component
public class PrimaryIdGenerator implements IdentifierGenerator
{
    private final SnowflakeShardingKeyGenerator generator = new SnowflakeShardingKeyGenerator();

    @Override
    public Long nextId(Object entity) {
        //可以将当前传入的class全类名来作为bizKey,或者提取参数来生成bizKey进行分布式Id调用生成.
        String bizKey = entity.getClass().getName();
        log.info("bizKey:{}", bizKey);
        MetaObject metaObject = SystemMetaObject.forObject(entity);
        String name = (String) metaObject.getValue("name");
        final Long id = (Long) generator.generateKey();
        log.info("为{}生成主键值->:{}", name, id);
        return id;
    }

}
