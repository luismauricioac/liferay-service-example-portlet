package com.mauricio.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Resources. This utility wraps
 * {@link com.mauricio.liferay.service.impl.ResourcesServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author luismalamoc
 * @see ResourcesService
 * @see com.mauricio.liferay.service.base.ResourcesServiceBaseImpl
 * @see com.mauricio.liferay.service.impl.ResourcesServiceImpl
 * @generated
 */
public class ResourcesServiceUtil {
    private static ResourcesService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.mauricio.liferay.service.impl.ResourcesServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Gets the categories.
    *
    * @return the categories
    * @throws PortalException the portal exception
    * @throws SystemException the system exception
    */
    public static com.liferay.portal.kernel.json.JSONArray getCategories()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getCategories();
    }

    public static void clearService() {
        _service = null;
    }

    public static ResourcesService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ResourcesService.class.getName());

            if (invokableService instanceof ResourcesService) {
                _service = (ResourcesService) invokableService;
            } else {
                _service = new ResourcesServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(ResourcesServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ResourcesService service) {
    }
}
