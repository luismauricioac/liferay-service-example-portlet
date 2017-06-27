package com.mauricio.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ResourcesService}.
 *
 * @author luismalamoc
 * @see ResourcesService
 * @generated
 */
public class ResourcesServiceWrapper implements ResourcesService,
    ServiceWrapper<ResourcesService> {
    private ResourcesService _resourcesService;

    public ResourcesServiceWrapper(ResourcesService resourcesService) {
        _resourcesService = resourcesService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _resourcesService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _resourcesService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _resourcesService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Gets the categories.
    *
    * @return the categories
    * @throws PortalException the portal exception
    * @throws SystemException the system exception
    */
    @Override
    public com.liferay.portal.kernel.json.JSONArray getCategories()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _resourcesService.getCategories();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ResourcesService getWrappedResourcesService() {
        return _resourcesService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedResourcesService(ResourcesService resourcesService) {
        _resourcesService = resourcesService;
    }

    @Override
    public ResourcesService getWrappedService() {
        return _resourcesService;
    }

    @Override
    public void setWrappedService(ResourcesService resourcesService) {
        _resourcesService = resourcesService;
    }
}
