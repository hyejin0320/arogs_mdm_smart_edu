<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>REDWOOD HEALTH</title>
    <link rel="stylesheet" type="text/css" href="/libs/css/common.css" />
    <link rel="stylesheet" type="text/css" href="/libs/css/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="/libs/css/jquery-ui.theme.css">
    <link rel="stylesheet" type="text/css" href="/libs/css/ui.jqgrid.css">
  
    <script type="text/ecmascript" src="/libs/jquery.3.3.1.min.js"></script>
    <script type="text/ecmascript" src="/libs/jquery-ui.1.12.1.min.js"></script>
    <script type="text/ecmascript" src="/libs/jquery.jqgrid.4.15.3.min.js"></script>
    <script type="text/ecmascript" src="/libs/grid.locale-kr.js"></script>
    <script type="text/ecmascript" src="/libs/moment.min.js"></script>
    <script type="text/ecmascript" src="/libs/jquery.validate.min.js"></script>
    <script type="text/ecmascript" src="/libs/additional-methods.min.js"></script>
    <script type="text/ecmascript" src="/libs/localization/messages.min.js"></script>
    <script type="text/ecmascript" src="/libs/common-ui.js"></script>
    <script type="text/ecmascript" src="/libs/cube/cube.jquery.common.js"></script>
    <script type="text/ecmascript" src="/libs/cube/cube.jquery.ext.js"></script>
    
    <!-- mas common js -->
    <script type="text/ecmascript" src="/libs/css/common/properties.js"></script>
    <script type="text/ecmascript" src="/libs/css/common/common.js"></script>
    
    <script type="text/ecmascript" src="index.js"></script>
</head>
<body>
  <div class="wrapper">
    <!-- top -->
        <header class="header">
      <div class="head-inner">
        <h1 class="h1-logo"><a href="#"><img src="/libs/images/logo_gnb.png" alt="redwood logo"/></a></h1>
        <nav id="gnb" class="nav">
          <ul class="main-menu">
              <li><a href="/portal/intro/intro/intro.html">서비스 소개</a>
              <ul class="sub-menu">
                <li><a href="/portal/intro/intro/intro.html">PHR 서비스 소개</a></li>
                <li><a href="/portal/intro/notice/notice.html">공지사항</a></li>
              </ul>
            </li>
            <li><a href="/portal/support/guide/guide.html">개발지원</a>
              <ul class="sub-menu">
                <li><a href="/portal/support/guide/guide.html">개발자 가이드</a></li>
                <li><a href="/portal/support/qna/qna.html">문의하기</a></li>
              </ul>
            </li>
            <li><a href="/portal/request/platform/platform.html">이용신청</a>
              <ul class="sub-menu">
                <li><a href="/portal/request/platform/platform.html">플랫폼 이용신청</a></li>
                <li><a href="/portal/request/environment/environment.html">분석환경 이용신청</a></li>
                <li><a href="/portal/request/status/status.html">이용신청 현황</a></li>
              </ul>
            </li>
          </ul>
        </nav>
      </div>
      <div class="nav-bar"><div class="barbg"></div></div>
    </header>
    <div class="container">
      <div id="contents" class="contents">
        <div class="errpage-area"><!--수정 109725-->
          <figure class="cer-fig"><img src="/libs/images/err_fig.png" alt="에러이미지"></figure>
          <p class="cer-txt1">요청하신 PHR 플랫폼 페이지를 <br>찾을 수 없습니다.</br></p>
          <div class="btns-bottom">
            <a href="/" class="bt-md bt-red" ><span>HOME</span></a>
          </div>
        </div>
       </div><!--/contents-->
    </div><!--/container-->
       <footer class="footer">
      <div class="footer-inner">
        <figure class="footer-ci"><img src="/libs/images/logo_footer.png" alt="" /></figure>
        <div class="footer-info">
          <p><span>주소</span>서울특별시시 영등포구 여의나루로 71 동화빌딩 5층</p>
          <p><span>전화번호</span>02-780-1340</p>
          <p><span>이메일 주소</span>admin@dkitec.com</p>
          <div class="copyright">Copyright 2019 DKI Technology Co,.Ltd. All rights reserved.</div>
        </div>
      </div>
    </footer>
  </div><!--/wrapper-->
  <div class="alert-mask"></div>
</body>
</script>
</html>