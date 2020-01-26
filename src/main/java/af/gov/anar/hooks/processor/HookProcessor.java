
package af.gov.anar.hooks.processor;


import af.gov.anar.hooks.domain.Hook;

public interface HookProcessor {

	void process(Hook hook,  String payload, String entityName,
				 String actionName, String tenantIdentifier, String authToken);

}
