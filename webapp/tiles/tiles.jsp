<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>
<tiles:insert template="/WEB-INF/layout/layout.jsp" flush="true">
<tiles:put name="title"  value="Tiles"/>
<tiles:put name="content" type="string">
<c:out value="${name}"/>
</tiles:put>
</tiles:insert>