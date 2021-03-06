package web.requester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import services.projectsServices.projectsFeedAdditorService.ProjectFeedAdditorService;
import web.dto.ProjectDto;
import web.utils.MappingUtils;

@RestController
public class ProjectsAdditorController {

    private final ProjectFeedAdditorService projectFeedAdditorService;

    @Autowired
    public ProjectsAdditorController(ProjectFeedAdditorService projectFeedAdditorService) {
        this.projectFeedAdditorService = projectFeedAdditorService;
    }

    @PostMapping("/api/projects")
    public void addNewProject(@RequestBody ProjectDto projectDto){
        projectFeedAdditorService.addProject(MappingUtils.projectFromProjectDto(projectDto));
    }
}
