<tiles:insert template="/common/layout.jsp" flush="true">
<tiles:put name="title"  value="Tiles"/>
<tiles:put name="content" type="string">
${f:h(name)}
</tiles:put>
</tiles:insert>