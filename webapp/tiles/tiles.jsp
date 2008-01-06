<tiles:insert template="/common/layout.jsp" flush="true">
<tiles:put name="title"  value="Tiles"/>
<tiles:put name="content" type="string">
<c:out value="${name}"/>
</tiles:put>
</tiles:insert>