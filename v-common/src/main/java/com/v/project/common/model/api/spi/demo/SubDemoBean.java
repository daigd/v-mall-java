package com.v.project.common.model.api.spi.demo;

import com.v.project.common.model.api.spi.ITypeBasedSpi;
import com.v.project.common.model.api.spi.bean.DemoBean;

/**
 * @author : daiguodong@viomi.com.cn
 * @createtime :  2020年01月14日 11:33
 * @description :
 */
public class SubDemoBean extends DemoBean implements ITypeBasedSpi
{
    public String getType()
    {
        return null;
    }
}
