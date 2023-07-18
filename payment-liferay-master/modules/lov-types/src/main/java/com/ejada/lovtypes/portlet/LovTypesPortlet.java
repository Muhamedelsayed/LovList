package com.ejada.lovtypes.portlet;

import com.ejada.LOVList.model.LOVLIST;
import com.ejada.LOVList.service.LOVLISTLocalService;
import com.ejada.LOVList.service.LOVLISTLocalServiceUtil;
import com.ejada.LOVList.service.impl.LOVLISTLocalServiceImpl;
import com.ejada.lovtypes.constants.LovTypesPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author m.elsayed
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=LovTypes",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LovTypesPortletKeys.LOVTYPES,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LovTypesPortlet extends MVCPortlet {
	@Override
		public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
		String myview = "view";
		List<LOVLIST> records=_LovlistLocalService.getLOVLISTs(0, _LovlistLocalService.getLOVLISTsCount());
		renderRequest.setAttribute("records",records);
		String view = "/" + myview + ".jsp";
		PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher(view);
		dispatcher.forward(renderRequest, renderResponse);
		}
	public void addLov(ActionRequest actionRequest, ActionResponse actionResponse) {
		String EnName= ParamUtil.getString(actionRequest, "EnName")!=null?ParamUtil.getString(actionRequest, "EnName"):"";
		String ArName= ParamUtil.getString(actionRequest, "ArName")!=null?ParamUtil.getString(actionRequest, "ArName"):"";
		_LovlistLocalService.lovlistcreate(EnName, ArName);
	}
	@Reference
	private LOVLISTLocalService _LovlistLocalService;
	


	

}