<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<!-- Bootstrap core CSS-->
	<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!-- Custom fonts for this template-->
	<link href="vendor/font-awesome/css/font-awesome.min.css"
		rel="stylesheet" type="text/css">
	<!-- Page level plugin CSS-->
	<!-- Custom styles for this template-->
	<link href="css/startbootstrap.css" rel="stylesheet">
</head>
<body>
	<script	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

</body>
<!-- jsp파일 형식으로 바꾸기 일관성있게 시작할 때 바로 아파치 서버에 요청을 해서 브라우저에 띄울 수 있도록! -->
  	<script type="text/javascript">
	
		function isMobile() {
			var UserAgent = navigator.userAgent;
			if (UserAgent
					.match(/iPhone|iPod|Android|Windows CE|BlackBerry|Symbian|Windows Phone|webOS|Opera Mini|Opera Mobi|POLARIS|IEMobile|lgtelecom|nokia|SonyEricsson/i) != null
					|| UserAgent.match(/LG|SAMSUNG|Samsung/) != null) {
				return true;
			} else {
				return false;
			}
		}
		if (isMobile()) {
			location.href = "MobileMain.jsp"; //모바일페이지
		} else {
			location.href = "PCMain.jsp"; //PC용 페이지
		}
		
	</script>
		<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.1.4/Chart.bundle.min.js "></script>
	<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
	<script src="https://code.highcharts.com/highcharts.js"></script>
	<script src="https://code.highcharts.com/modules/data.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
</html>