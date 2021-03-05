package useCases.project;

import model.projects.Project;
import model.projects.ProjectsFeed;
import useCases.project.helper.Projectsfilter.ProjectFilterer;
import useCases.project.helper.Projectsfilter.ProjectFiltererData;

import java.util.List;
import java.util.Optional;

public class ProjectsFeedUseCase {
    private final ProjectsFeed projectsFeed;
    private final ProjectFilterer projectFilterer;

    public ProjectsFeedUseCase(ProjectsFeed projectsFeed, ProjectFilterer filterer) {
        this.projectFilterer = filterer;
        this.projectsFeed = projectsFeed;
    }

    public void addNewProject(Project project) {
        projectsFeed.addNewProject(project);
    }

    public Optional<Project> getProjectWithId(String projectId) {
        return projectsFeed.getProjectWithIdOf(projectId);
    }

    public List<Project> getAllProjects() {
        return projectsFeed.getAllProjects();
    }

    public List<Project> filterProjects(ProjectFiltererData projectFiltererData){
            return projectFilterer.filter(projectsFeed.getProjects(), projectFiltererData);
    }
}
