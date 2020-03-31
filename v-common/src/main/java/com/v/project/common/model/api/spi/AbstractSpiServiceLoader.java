package com.v.project.common.model.api.spi;

/**
 * @author : daiguodong@viomi.com.cn
 * @createtime :  2020年01月07日 13:48
 * @description :
 */
public abstract class AbstractSpiServiceLoader<T extends ITypeBasedSpi>
{
    
//    private final Class<T> classType;
//
//    protected AbstractSpiServiceLoader(Class<T> classType)
//    {
//        this.classType = classType;
//    }
//    
//    private NewInstanceServiceLoader loader;
//
//    /**
//     * @author : daiguodong@viomi.com.cn
//     * @createtime :  2020年01月13日 11:22
//     * @description : 返回SPI实例
//     * @param type SPI type
//     * @return
//     */
//    public final Object newService(final String type) {
//        Object bean = loader.loadServiceInstances(classType).get(type);
////        AssertUtils.isTrue(bean != null,String.format("Invalid %s SPI type %s", classType.getName(), type));
//        return bean;
//    }
}
