
package af.gov.anar.hooks.service;

import af.gov.anar.hooks.data.HookData;
import af.gov.anar.hooks.domain.Hook;

import java.util.Collection;
import java.util.List;


public interface HookReadPlatformService {

	Collection<HookData> retrieveAllHooks();

	HookData retrieveHook(Long hookId);

    List<Hook> retrieveHooksByEvent(final String actionName, final String entityName);

    HookData retrieveNewHookDetails(String templateName);
}
