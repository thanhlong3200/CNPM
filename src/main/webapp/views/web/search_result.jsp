<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tìm kiếm</title>
</head>
<body>
	<!-- Breadcrumb Section Begin -->
	<div class="breacrumb-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb-text">
						<a href="<c:url value = "/views/web/index.jsp"/>"><i
							class="fa fa-home"></i> Trang chủ</a> <span>Tìm kiếm</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Breadcrumb Section End -->



	<!-- Blog Details Section Begin -->
	<section class="blog-details spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="blog-details-inner">
						<div class="blog-detail-title">
							<h2>TÌM KIẾM</h2>
							<p>
								<span>Tìm thấy ${listProduct.size()} kết quả tìm kiếm:
									${keyword}</span>
							</p>
						</div>
					</div>
					<div class="col-lg-12 order-1 order-lg-2">
						<div class="product-show-option">
							<div class="row">
								<div class="col-lg-7 col-md-7">
									
								</div>
								
							</div>
						</div>
						<div class="product-list">
							<div class="row">
								<c:forEach items="${listProduct}" var="product">
									<div class="col-lg-3 col-sm-6">
										<div class="product-item">
											<div class="pi-pic">
												<img src="${product.imageURL}" alt="">
												<c:if test="${product.sellPrice < product.originPrice}">
													<div class="sale pp-sale">Sale</div>
												</c:if>

												<div class="icon">
													<i class="icon_heart_alt"></i>
												</div>
												<ul>
													<li class="w-icon active"><a href="#"><i
															class="icon_bag_alt"></i></a></li>
													<li class="quick-view"><a href="#">+ Quick View</a></li>
													<li class="w-icon"><a href="#"><i
															class="fa fa-random"></i></a></li>
												</ul>
											</div>
											<div class="pi-text">
												<div class="catagory-name">${product.groupName}</div>
												<div class="catagory-name">${product.brandName}</div>
												<a href="#">									
													<h5>${product.name}</h5>
												</a>
												<div class="product-price">
													<c:if test="${product.sellPrice < product.originPrice}">
														${product.sellPrice} đ<span>${product.originPrice}</span>
													</c:if>
													<c:if test="${product.sellPrice == product.originPrice}">
														${product.sellPrice} đ
													</c:if>
										
												</div>
											</div>
										</div>
									</div>
								</c:forEach>
							</div>
						</div>
					</div>
				</div>
	</section>
	<!-- Blog Details Section End -->
</body>
</html>