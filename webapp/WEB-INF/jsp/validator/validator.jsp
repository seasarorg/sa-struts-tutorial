<html>
<head>
<title>Validator</title>
</head>
<body>
<html:errors/>
<s:form action="/validator">
<table>
<tr>
<td>バイト:</td><td><html:text property="byteText"/></td>
</tr>
<tr>
<td>短整数:</td><td><html:text property="shortText"/></td>
</tr>
<tr>
<td>整数:</td><td><html:text property="integerText"/></td>
</tr>
<tr>
<td>長整数:</td><td><html:text property="longText"/></td>
</tr>
<tr>
<td>短精度実数:</td><td><html:text property="floatText"/></td>
</tr>
<tr>
<td>長精度実数:</td><td><html:text property="doubleText"/></td>
</tr>
<tr>
<td>日付:</td><td><html:text property="dateText"/></td>
</tr>
<tr>
<td>クレジットカード(9999999999999999の形式):</td><td><html:text property="creditcardText"/></td>
</tr>
<tr>
<td>メールアドレス:</td><td><html:text property="emailText"/></td>
</tr>
<tr>
<td>URL:</td><td><html:text property="urlText"/></td>
</tr>
<tr>
<td>整数(3～10):</td><td><html:text property="intRangeText"/></td>
</tr>
<tr>
<td>長整数(3～10):</td><td><html:text property="longRangeText"/></td>
</tr>
<tr>
<td>短精度実数(3.0～10.0):</td><td><html:text property="floatRangeText"/></td>
</tr>
<tr>
<td>倍精度実数(3.0～10.0):</td><td><html:text property="doubleRangeText"/></td>
</tr>
<tr>
<td>文字列の長さの最小値が3:</td><td><html:text property="minlengthText"/></td>
</tr>
<tr>
<td>文字列の長さの最大値が10:</td><td><html:text property="maxlengthText"/></td>
</tr>
<tr>
<td>文字列のバイト長の最小値が3:</td><td><html:text property="minbytelengthText"/></td>
</tr>
<tr>
<td>文字列のバイト長の最大値が10:</td><td><html:text property="maxbytelengthText"/></td>
</tr>
<tr>
<td>電話番号:</td><td><html:text property="phoneText"/></td>
</tr>
<tr>
<td>validwhen1Text:</td><td><html:text property="validwhen1Text"/></td>
</tr>
<tr>
<td>validwhen2Text<br />
(validwhen1Textが入力されたときには入力必須):</td><td><html:text property="validwhen2Text"/></td>
</tr>
</table>
<input type="submit" name="submit" value="サブミット"/>
</s:form>
</body>
</html>