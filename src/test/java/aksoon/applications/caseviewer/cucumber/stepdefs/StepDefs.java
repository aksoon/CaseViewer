package aksoon.applications.caseviewer.cucumber.stepdefs;

import aksoon.applications.caseviewer.CaseViewerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CaseViewerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
