package com.mauricio.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Resources. This utility wraps
 * {@link com.mauricio.liferay.service.impl.ResourcesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author luismalamoc
 * @see ResourcesLocalService
 * @see com.mauricio.liferay.service.base.ResourcesLocalServiceBaseImpl
 * @see com.mauricio.liferay.service.impl.ResourcesLocalServiceImpl
 * @generated
 */
public class ResourcesLocalServiceUtil {
    private static ResourcesLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.mauricio.liferay.service.impl.ResourcesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static ResourcesLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ResourcesLocalService.class.getName());

            if (invokableLocalService instanceof ResourcesLocalService) {
                _service = (ResourcesLocalService) invokableLocalService;
            } else {
                _service = new ResourcesLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(ResourcesLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ResourcesLocalService service) {
    }
}
