
package af.gov.anar.hooks.template.handler;

import af.gov.anar.hooks.infrastructure.common.annotation.CommandType;
import af.gov.anar.hooks.infrastructure.common.command.JsonCommand;
import af.gov.anar.hooks.infrastructure.common.command.NewCommandSourceHandler;
import af.gov.anar.hooks.template.service.TemplateDomainService;
import af.gov.anar.lang.data.CommandProcessingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@CommandType(entity = "TEMPLATE", action = "DELETE")
public class DeleteTemplateCommandHandler implements NewCommandSourceHandler {

    private final TemplateDomainService templateService;

    @Autowired
    public DeleteTemplateCommandHandler(final TemplateDomainService templateService) {

        this.templateService = templateService;
    }

    @Transactional
    @Override
    public CommandProcessingResult processCommand(final JsonCommand command) {

        return this.templateService.removeTemplate(command.entityId());
    }
}
