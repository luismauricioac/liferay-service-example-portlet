package com.mauricio.liferay.service.impl;

import java.util.Iterator;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.mauricio.liferay.service.base.ResourcesLocalServiceBaseImpl;

/**
 * The implementation of the resources local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.mauricio.liferay.service.ResourcesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author luismalamoc
 * @see com.mauricio.liferay.service.base.ResourcesLocalServiceBaseImpl
 * @see com.mauricio.liferay.service.ResourcesLocalServiceUtil
 */
public class ResourcesLocalServiceImpl extends ResourcesLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.mauricio.liferay.service.ResourcesLocalServiceUtil} to access the resources local service.
     */
	
	/**
     * Gets the categories.
     *
     * @return the categories
     * @throws PortalException the portal exception
     * @throws SystemException the system exception
     */
    public JSONArray getCategories() throws PortalException, SystemException {		
		JSONArray jA = JSONFactoryUtil.createJSONArray();	
		int end = AssetCategoryLocalServiceUtil.getAssetCategoriesCount();
		List<AssetCategory> assetList = null;
		assetList = AssetCategoryLocalServiceUtil.getAssetCategories(0, end);
		Iterator<AssetCategory> it = assetList.iterator();
		AssetCategory category = null; 
		while(it.hasNext()){
			category = (AssetCategory) it.next();
			JSONObject jO = JSONFactoryUtil.createJSONObject();					
			jO.put("Id", category.getCategoryId());
			jO.put("Title", category.getName());
			jO.put("Description", category.getDescription());
			jA.put(jO);
		}			
		return jA;						
	}
}
