package com.mauricio.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ResourcesLocalService}.
 *
 * @author luismalamoc
 * @see ResourcesLocalService
 * @generated
 */
public class ResourcesLocalServiceWrapper implements ResourcesLocalService,
    ServiceWrapper<ResourcesLocalService> {
    private ResourcesLocalService _resourcesLocalService;

    public ResourcesLocalServiceWrapper(
        ResourcesLocalService resourcesLocalService) {
        _resourcesLocalService = resourcesLocalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _resourcesLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _resourcesLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _resourcesLocalService.invokeMethod(name, parameterTypes,
            arguments);
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
        return _resourcesLocalService.getCategories();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ResourcesLocalService getWrappedResourcesLocalService() {
        return _resourcesLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedResourcesLocalService(
        ResourcesLocalService resourcesLocalService) {
        _resourcesLocalService = resourcesLocalService;
    }

    @Override
    public ResourcesLocalService getWrappedService() {
        return _resourcesLocalService;
    }

    @Override
    public void setWrappedService(ResourcesLocalService resourcesLocalService) {
        _resourcesLocalService = resourcesLocalService;
    }
}
