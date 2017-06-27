package com.mauricio.liferay.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.mauricio.liferay.service.ResourcesServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.mauricio.liferay.service.ResourcesServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author luismalamoc
 * @see ResourcesServiceHttp
 * @see com.mauricio.liferay.service.ResourcesServiceUtil
 * @generated
 */
public class ResourcesServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(ResourcesServiceSoap.class);

    /**
    * Gets the categories.
    *
    * @return the categories
    * @throws PortalException the portal exception
    * @throws SystemException the system exception
    */
    public static java.lang.String getCategories() throws RemoteException {
        try {
            com.liferay.portal.kernel.json.JSONArray returnValue = ResourcesServiceUtil.getCategories();

            return returnValue.toString();
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
