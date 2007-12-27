<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>
<tiles:insert template="/WEB-INF/layout/layout.jsp" flush="true">
<tiles:put name="title"  value="Tiles"/>
<tiles:put name="content" type="string">
<b>${name}</b>
</tiles:put>
</tiles:insert>