package com.mauricio.liferay.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.mauricio.liferay.service.base.ResourcesServiceBaseImpl;

/**
 * The implementation of the resources remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.mauricio.liferay.service.ResourcesService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author luismalamoc
 * @see com.mauricio.liferay.service.base.ResourcesServiceBaseImpl
 * @see com.mauricio.liferay.service.ResourcesServiceUtil
 */
public class ResourcesServiceImpl extends ResourcesServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.mauricio.liferay.service.ResourcesServiceUtil} to access the resources remote service.
     */
	/** The log. */
	private static Log _log = LogFactoryUtil.getLog(ResourcesServiceImpl.class);
	
	/** The local, donde se instancia la implementación del service local. */
	private static ResourcesLocalServiceImpl _local = new ResourcesLocalServiceImpl();
	
	/**
	 * Gets the categories.
	 *
	 * @return the categories
	 * @throws PortalException the portal exception
	 * @throws SystemException the system exception
	 */
	public JSONArray getCategories() throws PortalException, SystemException {
		try {
			return _local.getCategories();
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
	}
	
}
