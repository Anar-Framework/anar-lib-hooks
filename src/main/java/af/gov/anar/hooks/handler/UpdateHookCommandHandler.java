
package af.gov.anar.hooks.handler;

import af.gov.anar.hooks.annotation.CommandType;
import af.gov.anar.hooks.command.JsonCommand;
import af.gov.anar.hooks.command.NewCommandSourceHandler;
import af.gov.anar.hooks.service.HookWritePlatformService;
import af.gov.anar.lang.data.CommandProcessingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@CommandType(entity = "HOOK", action = "UPDATE")
public class UpdateHookCommandHandler implements NewCommandSourceHandler {

	private final HookWritePlatformService writePlatformService;

	@Autowired
	public UpdateHookCommandHandler(
			final HookWritePlatformService writePlatformService) {
		this.writePlatformService = writePlatformService;
	}

	@Transactional
	@Override
	public CommandProcessingResult processCommand(final JsonCommand command) {

		return this.writePlatformService
				.updateHook(command.entityId(), command);
	}

}
