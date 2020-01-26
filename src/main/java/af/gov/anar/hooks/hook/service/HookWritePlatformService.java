
package af.gov.anar.hooks.hook.service;


import af.gov.anar.hooks.command.JsonCommand;
import af.gov.anar.lang.data.CommandProcessingResult;

public interface HookWritePlatformService {

	CommandProcessingResult createHook(JsonCommand command);

	CommandProcessingResult updateHook(Long hookId, JsonCommand command);

	CommandProcessingResult deleteHook(Long hookId);

}
