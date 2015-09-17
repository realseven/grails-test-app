<%@ page import="myapp.Test" %>



<div class="fieldcontain ${hasErrors(bean: testInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="test.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="80" required="" value="${testInstance?.name}"/>

</div>

