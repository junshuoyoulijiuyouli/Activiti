package org.activiti.api.task.model.payloads;

import java.util.Map;
import java.util.UUID;

import org.activiti.api.model.shared.Payload;

public class SetTaskVariablesPayload implements Payload {

    private String id;
    private String taskId;
    private Map<String, Object> variables;

    public SetTaskVariablesPayload() {
        this.id = UUID.randomUUID().toString();
    }

    public SetTaskVariablesPayload(String taskId,
                                   Map<String, Object> variables) {
        this();
        this.taskId = taskId;
        this.variables = variables;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

}
