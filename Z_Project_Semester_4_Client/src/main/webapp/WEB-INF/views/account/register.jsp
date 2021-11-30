<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>

<mt:layout_user title="Register">
	
	<jsp:attribute name="content">
	<h3>Register</h3>
		
				<div class="title">
					<span class="title_icon"><img src="${pageContext.request.contextPath}/resources/user/images/bullet1.gif"
						alt="" title="" /></span>Register
				</div>

				<div class="feat_prod_box_details">
					<p class="details">Lorem ipsum dolor sit amet, consectetur
						adipisicing elit, sed do eiusmod tempor incididunt ut labore et
						dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. Lorem
						ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
						tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
						minim veniam, quis nostrud.</p>

					<div class="contact_form">
						<div class="form_subtitle">create new account</div>
						<form name="register" action="#">
							<div class="form_row">
								<label class="contact"><strong>Username:</strong></label> <input
									type="text" class="contact_input" />
							</div>


							<div class="form_row">
								<label class="contact"><strong>Password:</strong></label> <input
									type="text" class="contact_input" />
							</div>

							<div class="form_row">
								<label class="contact"><strong>Email:</strong></label> <input
									type="text" class="contact_input" />
							</div>


							<div class="form_row">
								<label class="contact"><strong>Phone:</strong></label> <input
									type="text" class="contact_input" />
							</div>

							<div class="form_row">
								<label class="contact"><strong>Company:</strong></label> <input
									type="text" class="contact_input" />
							</div>

							<div class="form_row">
								<label class="contact"><strong>Adrres:</strong></label> <input
									type="text" class="contact_input" />
							</div>

							<div class="form_row">
								<div class="terms">
									<input type="checkbox" name="terms" /> I agree to the <a
										href="#">terms &amp; conditions</a>
								</div>
							</div>


							<div class="form_row">
								<input type="submit" class="register" value="register" />
							</div>
						</form>
					</div>

				</div>

				<div class="clear"></div>
	</jsp:attribute>
</mt:layout_user>