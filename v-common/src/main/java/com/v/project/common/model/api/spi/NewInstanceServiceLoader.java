package com.v.project.common.model.api.spi;

/**
 * @author : daiguodong@viomi.com.cn
 * @createtime :  2020年01月07日 11:24
 * @description : Spring SPI与Spring容器进行整合。
 */
//@Component
public class NewInstanceServiceLoader// implements ApplicationContextAware
{
//    private static final Map<Class, Map<String, Object>> SERVICE_MAP = new ConcurrentReferenceHashMap<>();
//
//    private ApplicationContext context;
//    /**
//     * Register SPI service into map for new instance.
//     *
//     * @param service service type
//     */
//    public void register(final Class<? extends ITypeBasedSpi> service)
//    {
//        for(Object each : SpringFactoriesLoader.loadFactories(service, null))
//        {
//            registerServiceClass(service, (ITypeBasedSpi) each);
//        }
//    }
//
//    /**
//     * @author : daiguodong@viomi.com.cn
//     * @createtime :  2020年01月13日 11:13
//     * @description : 
//     * @param 
//     * @return
//     */
//    private void registerServiceClass(final Class<? extends ITypeBasedSpi> service, final ITypeBasedSpi instance)
//    {
//        String beanName = instance.getType();
//        SERVICE_MAP.putIfAbsent(service, parseClassToSpringBean(beanName, service));
//    }
//    
//    /**
//     * @author : daiguodong@viomi.com.cn
//     * @createtime :  2020年01月13日 11:00
//     * @description : 将类实例交由spring容器管理
//     * @param 
//     * @return
//     */
//    private  Map<String, Object> parseClassToSpringBean(String beanName, Class<?> clazz)
//    {
//        Map<String, Object> beanMap = SERVICE_MAP.get(clazz);
//        if(beanMap == null)
//        {
//            beanMap = new HashMap<>(5);
//        }
//        if(CollectionUtils.isEmpty(beanMap) || beanMap.get(beanName) == null)
//        {
//            BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(clazz);
//            GenericBeanDefinition definition = (GenericBeanDefinition) builder.getRawBeanDefinition();
//            definition.setAutowireMode(GenericBeanDefinition.AUTOWIRE_BY_NAME);
//            getRegistry().registerBeanDefinition(beanName, definition);
//            beanMap.put(beanName, context.getBean(beanName));
//        }
//        return beanMap;
//    }
//
//    private BeanDefinitionRegistry getRegistry() {
//        ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) context;
//        return (DefaultListableBeanFactory) configurableApplicationContext.getBeanFactory();
//    }
//
//    /**
//     * Load service instances.
//     *
//     * @param service service class
//     * @return service instances
//     */
//    public Map<String, Object> loadServiceInstances(final Class<?> service)
//    {
//        if(null == SERVICE_MAP.get(service))
//        {
//            return new HashMap<>(5);
//        }
//        return SERVICE_MAP.get(service);
//    }
//
//    @Override 
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
//    {
//        this.context = applicationContext;
//    }
}
