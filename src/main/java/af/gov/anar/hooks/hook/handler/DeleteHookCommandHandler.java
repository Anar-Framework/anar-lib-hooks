
package af.gov.anar.hooks.hook.handler;

import af.gov.anar.hooks.infrastructure.common.annotation.CommandType;
import af.gov.anar.hooks.infrastructure.common.command.JsonCommand;
import af.gov.anar.hooks.infrastructure.common.command.NewCommandSourceHandler;
import af.gov.anar.hooks.hook.service.HookWritePlatformService;
import af.gov.anar.lang.data.CommandProcessingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@CommandType(entity = "HOOK", action = "DELETE")
public class DeleteHookCommandHandler implements NewCommandSourceHandler {

	private final HookWritePlatformService writePlatformService;

	@Autowired
	public DeleteHookCommandHandler(
			final HookWritePlatformService writePlatformService) {
		this.writePlatformService = writePlatformService;
	}

	@Transactional
	@Override
	public CommandProcessingResult processCommand(final JsonCommand command) {

		return this.writePlatformService.deleteHook(command.entityId());
	}

}
