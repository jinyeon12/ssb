<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="../resources/css/style.css" rel="stylesheet" type="text/css">
</head>

<body topmargin="0" leftmargin="0">
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td><table width="100%" height="218" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td align="center" background="../resources/image/bg.gif"><table width="595" height="218" border="0" cellpadding="0" cellspacing="0">
              <tr> 
                <td width="25" height="25"><img src="../resources/image/top_left.gif" width="25" height="25"></td>
                <td width="545" background="../resources/image/top.gif">&nbsp;</td>
                <td width="25"><img src="../resources/image/top_right.gif" width="25" height="25"></td>
              </tr>
              <tr> 
                <td background="../resources/image/left.gif">&nbsp;</td>
                <td valign="top" bgcolor="#FFFFFF"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr> 
                      <td colspan="2"><img src="../resources/image/title.gif" width="232" height="37"></td>
                    </tr>
                    <tr> 
                      <td width="19%">&nbsp;</td>
                      <td width="81%" style="padding-top:10"><table width="392" height="90" border="0" cellpadding="0" cellspacing="0">
                          <tr>
                            <td align="center" background="../resources/image/login_bg.gif"> 
                              <table width="340" border="0" cellspacing="0" cellpadding="0">
                                <tr> 
                                  <td width="75" height="20" align="right"><img src="../resources/image/id.gif" width="54" height="10">&nbsp;</td>
                                  <td width="174"><input name="loginId" type="text" class="INPUT" size="25"></td>
                                  <td width="91" rowspan="2" align="right"><a id="loginProc"><img src="../resources/image/login_button.gif" width="90" height="40" border="0"></a></td>
                                </tr>
                                <tr> 
                                  <td align="right"><img src="../resources/image/pass.gif" width="54" height="10">&nbsp;</td>
                                  <td><input name="loginPw" type="password" class="INPUT" size="25"></td>
                                </tr>
                              </table></td>
                          </tr>
                        </table></td>
                    </tr>
                  </table></td>
                <td background="../resources/image/right.gif">&nbsp;</td>
              </tr>
              <tr> 
                <td width="25" height="25"><img src="../resources/image/bottom_left.gif" width="25" height="25"></td>
                <td width="545" background="../resources/image/bottom.gif">&nbsp;</td>
                <td width="25" height="25"><img src="../resources/image/bottom_right.gif" width="25" height="25"></td>
              </tr>
            </table></td>
        </tr>
      </table></td>
  </tr>
</table>
<div id="msg"/>

<script>
$(document).ready(function() {
	$("#loginProc").click(function() {
		var param = "id="+ document.getElementById("loginId").value + "&pw="+ document.getElementById("loginPw").value;
		$.ajax({
			type : "post",
			data : param,
			url : "index.do",
			success : function(result) {
					switch(result){
						case "1" : location.href="index.do"; break; // 로그인 성공
						case "2" : document.getElementById("msg")="아이디 없습니다"; break; // 해당 아이디 없음
						case "3" : document.getElementById("msg")="비밀번호가 틀렸습니다"; break; // 비밀번호 틀림
					}
				},
			error : function(
						request,
						status,
						error) {
					alert("code="
							+ request.status
							+ " message="
							+ request.responseText
							+ " error="
							+ error);
			});
		});
	});
});
</script>
</body>
</html>
