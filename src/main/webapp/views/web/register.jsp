<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng ký</title>
</head>
<body>
	<!-- Breadcrumb Section Begin -->
    <div class="breacrumb-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-text">
                        <a href="<c:url value = "/trang-chu" />"><i class="fa fa-home"></i> Trang chủ</a>
                        <span>Đăng ký</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb Form Section Begin -->

    <div class="register-login-section spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 offset-lg-3">
                <div class="register-form">
                    <h2>Đăng ký</h2>
                    <form id="registry" action="<c:url value="/dang-ky"/> " method="POST">
                        <div class="group-input">
                            <label for="fullname">Họ tên *</label>
                            <input type="text" name="fullname" id="fullname"
                                   value="<%=request.getAttribute("fullname")==null?"":request.getAttribute("fullname")%>"/>
                            <label style="color: #F00" class="error" for="fullname"></label>
                        </div>
                        
                        <div class="group-input">
                            <label for="username">Tên tài khoản *</label>
                            <input value="" type="text" name="username" id="username"/>
                            <label style="color: #F00" class="error" for="username">
                                <%=request.getAttribute("uname-err") == null ? "" :
                                        request.getAttribute("uname-err")%>
                            </label>
                        </div>
                        
                        <div class="group-input">
                            <label for="password">Mật khẩu *</label>
                            <input value="" type="password" name="password" id="password">
                            <label style="color: #F00" class="error" for="password"></label>
                        </div>
                        <div class="group-input">
                            <label for="confirmPassword">Nhập lại mật khẩu *</label>
                            <input value="" type="password" name="confirmPassword" id="confirmPassword">
                            <label style="color: #F00" class="error" for="confirmPassword"></label>
                        </div>
                        <div class="group-input">
                            <label for="gender">Giới tính *</label>
                            <select id="gender" name = "gender">
                            	<option value ="">--Chọn giới tính--</option>
                            	<option value = "male">Nam</option>
                            	<option value = "female">Nữ</option>
                            	<option value = "other">Khác</option>
                            </select>
                            <label style="color: #F00" class="error" for="gender"></label>
                        </div>
                        <div class="group-input">
                            <label for="email">Email *</label>
                            <input type="text" name="email" id="email"
                                   value="<%=request.getAttribute("email")==null?"":request.getAttribute("email")%>">
                            <label style="color: #F00" class="error" for="email"></label>
                        </div>
                        
                         <div class="group-input">
                            <label for="phone">Số điện thoại *</label>
                            <input type="text" name="phone" id="phone"
                                   value="<%=request.getAttribute("phone")==null?"":request.getAttribute("phone")%>">
                            <label style="color: #F00" class="error" for="phone"></label>
                        </div>
                        
                        <div class="group-input">
                            <label for="address">Địa chỉ *</label>
                            <input type="text" name="address" id="address"
                                   value="<%=request.getAttribute("address")==null?"":request.getAttribute("address")%>">
                            <label style="color: #F00" class="error" for="address"></label>
                        </div>
        
                        <button id="registryBtn" type="submit" class="site-btn login-btn">Đăng Ký</button>
                    </form>
                    <div class="switch-login">
                        <a href="<c:url value="/dang-nhap"/>" class="or-login">Hoặc Đăng Nhập</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Register Form Section End -->
<script src="<c:url value="/template/web/js/register.js" />"></script>
</body>

</html>