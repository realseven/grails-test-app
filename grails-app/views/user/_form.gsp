<%@ page import="myapp.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'uid', 'error')} required">
	<label for="uid">
		<g:message code="user.uid.label" default="Uid" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="uid" maxlength="20" required="" value="${userInstance?.uid}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="user.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="80" required="" value="${userInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		
	</label>
	<g:textField name="email" maxlength="40" value="${userInstance?.email}"/>

</div>

