package gov.loc.repository.transfer.ui.commands;

import javax.servlet.http.HttpServletRequest;

import gov.loc.repository.transfer.ui.dao.WorkflowDao;
import gov.loc.repository.transfer.ui.model.TaskInstanceBean;
import gov.loc.repository.transfer.ui.model.WorkflowBeanFactory;
import gov.loc.repository.transfer.ui.springframework.ModelAndView;
import gov.loc.repository.transfer.ui.utilities.PermissionsHelper;

public interface TaskInstanceUpdateCommand {
	public void prepareForm() throws Exception;
	
	public void prepareInstruction() throws Exception;
	
	public void preprocessPut() throws Exception;
	
	public void bindPut() throws Exception;
	
	public void validatePut() throws Exception;
	
	public void setTaskInstanceBean(TaskInstanceBean taskInstanceBean);
	
	public void setRequest(HttpServletRequest request);

	public void setWorkflowDao(WorkflowDao dao);
	
	public void setWorkflowBeanFactory(WorkflowBeanFactory factory);
	
	public void setModelAndView(ModelAndView mav);
	
	public void setPermissionsHelper(PermissionsHelper permissionsHelper);
			
}
