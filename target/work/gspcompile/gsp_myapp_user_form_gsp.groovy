import myapp.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_myapp_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userInstance, field: 'uid', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("user.uid.label"),'default':("Uid")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("uid"),'maxlength':("20"),'required':(""),'value':(userInstance?.uid)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'name', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("user.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("name"),'maxlength':("80"),'required':(""),'value':(userInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'email', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("user.email.label"),'default':("Email")],-1)
printHtmlPart(6)
invokeTag('textField','g',28,['name':("email"),'maxlength':("40"),'value':(userInstance?.email)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1442141288000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
