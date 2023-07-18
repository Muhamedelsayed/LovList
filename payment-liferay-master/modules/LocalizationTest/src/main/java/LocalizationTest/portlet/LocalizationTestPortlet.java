package LocalizationTest.portlet;

import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.LocaleThreadLocal;
import com.liferay.portal.kernel.util.ResourceBundleUtil;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import LocalizationTest.constants.LocalizationTestPortletKeys;


import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;



/**
 * @author m.elsayed
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=LocalizationTest",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LocalizationTestPortletKeys.LOCALIZATIONTEST,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LocalizationTestPortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		Locale locale = new Locale("en", "US");
		Locale frenchLocale = new Locale("fr", "FR");
		Locale arabicLocale = new Locale("ar", "SA");

//		/*
//		 * ResourceBundle resourceBundle_en = ResourceBundleUtil.getBundle(
//		 * "/LocalizationTest/src/main/resources/content/Language.properties", locale,
//		 * getClass()); ResourceBundle resourceBundle_fr = ResourceBundleUtil.getBundle(
//		 * "/LocalizationTest/src/main/resources/content/Language_fr.properties",
//		 * frenchLocale, getClass()); ResourceBundle resourceBundle_ar =
//		 * ResourceBundleUtil.getBundle(
//		 * "/LocalizationTest/src/main/resources/content/Language_ar.properties",
//		 * arabicLocale, getClass());
//		 */
		String greeting_en = LanguageUtil.get(new Locale("en", "US"), "greeting");
		String greeting_fr = LanguageUtil.get(new Locale("fr", "FR"), "greeting");
		String greeting_ar = LanguageUtil.get(new Locale("ar", "SA"), "greeting");

        renderRequest.setAttribute("greeting_en", greeting_en);
        renderRequest.setAttribute("greeting_fr", greeting_fr);
        renderRequest.setAttribute("greeting_ar", greeting_ar);

		super.doView(renderRequest, renderResponse);
		
	}
	
}