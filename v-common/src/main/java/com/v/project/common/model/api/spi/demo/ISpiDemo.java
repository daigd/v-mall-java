package com.v.project.common.model.api.spi.demo;

import com.v.project.common.model.api.spi.ITypeBasedSpi;

/**
 * @author : daiguodong@viomi.com.cn
 * @createtime :  2020年01月13日 11:37
 * @description :
 */
public interface ISpiDemo extends ITypeBasedSpi
{
    String hello(long id);
}
