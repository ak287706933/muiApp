<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<meta name="Generator" content="">
	<meta name="Author" content="">
	<meta name="Keywords" content="">
	<meta name="Description" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<meta content="telephone=no" name="format-detection">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/index.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/font.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/iconfont.css">
	<script type="text/javascript" src="<%=path%>/js/jquery-2.1.3.min.js" ></script>
	<script type="text/javascript" src="<%=path%>/js/layer_mobile/layer.js" ></script>
	<script type="text/javascript" src="<%=path%>/js/common.js" ></script>
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/mui.picker.min.css"/>
	<link rel="stylesheet" href="<%=path%>/css/mui.min.css">
	<script src="<%=path%>/js/mui.min.js"></script>
	<script src="<%=path%>/js/mui.picker.min.js" type="text/javascript" charset="utf-8"></script>
	<style type="text/css">
		.layui-m-layercont{padding:0}
	</style>
	<title>新增成员</title>
	<body>
		<sf:form id="infoForm" name="infoForm" method="post" action="" modelAttribute="vo"> 
			<input type="hidden" id="cardHolderHid" name="cardHolderHid" value="${vo.crmHealthModilis.cardHolder }"/>
			<input type="hidden" id="sexHid" value="${vo.crmHealthModilis.sex }"/>
			<input type="hidden" id="ageHid" value="${vo.reg.AGE }"/>
			<input type="hidden" id="birthdayHid" value="${vo.crmHealthModilis.birthday }"/>
			<input type="hidden" id="idcardHid" value="${vo.crmHealthModilis.idcard }"/>
			<input type="hidden" id="busnoHid" value="${vo.crmHealthModilis.busno }"/>
			<input type="hidden" id="busNameHid" value="${vo.crmHealthModilis.busName }"/>
			<input type="hidden" id="compid" value="${vo.crmHealthModilis.compid }"/>
			<!--alert-->
			<div class="alert">
				<div class="alert_content">
					<!--所患疾病-->
					<div class="alert_illness_category" id="show1">
						<div class="section_title">病种选择</div>
						<div class="list_box disease_box">
							<div class="father_list_box">
								<form>
									<ul class="father_list">
										<li val="f0">糖尿病</li>
										<li val="f1">高血压</li>
										<li val="f2">血脂异常</li>
										<li val="f3">动脉硬化</li>
										<li val="f4">心率衰竭</li>
										<li val="f5">痛风</li>
										<li val="f6">肺结核</li>
									</ul>
								</form>
							</div>
							<div>
								<ul class="child_list">
									<li val='c0'>糖尿病I型</li>
									<li val='c0'>糖尿病II型</li>
									<li val='c0'>妊娠糖尿病</li>
									<li val='c0'>继发性糖尿病</li>
									<li val='c0'>糖尿病I型</li>
									<li val='c0'>糖尿病II型</li>
									<li val='c0'>妊娠糖尿病</li>
									<li val='c0'>继发性糖尿病</li>
									<li val='c0'>糖尿病I型</li>
									<li val='c0'>糖尿病II型</li>
									<li val='c0'>妊娠糖尿病</li>
									<li val='c0'>继发性糖尿病</li>
									<li val='c0'>糖尿病I型</li>
									<li val='c0'>糖尿病II型</li>
									<li val='c0'>妊娠糖尿病</li>
									<li val='c0'>继发性糖尿病</li>
									<li val='c0'>糖尿病I型</li>
									<li val='c0'>糖尿病II型</li>
									<li val='c0'>妊娠糖尿病</li>
									<li val='c0'>继发性糖尿病</li>
									<li val='c0'>糖尿病I型</li>
									<li val='c0'>糖尿病II型</li>
									<li val='c0'>妊娠糖尿病</li>
									<li val='c0'>继发性糖尿病</li>
									<li val='c0'>糖尿病I型</li>
									<li val='c0'>糖尿病II型</li>
									<li val='c0'>妊娠糖尿病</li>
									<li val='c0'>继发性糖尿病</li>
									<li val='c0'>糖尿病I型</li>
									<li val='c0'>糖尿病II型</li>
									<li val='c0'>妊娠糖尿病</li>
									<li val='c0'>继发性糖尿病</li>
								</ul>
							</div>
							<button class="next_step_btn">下一步</buttom>
						</div>
					</div>
					<!--所患疾病 end-->
					<!--治疗状态-->
					<div class="alert_illness_statue">
						<div class="section_title">治疗状态</div>
						<div class="condition_box">
							<ul class="condition_list">
								<li val="co0">治疗中</li>
								<li val="co1">已痊愈</li>
								<li val="co2">未治疗</li>
							</ul>
							<button class="save">保存</buttom>
						</div>
					</div>
					<!--治疗状态 end-->
					<!--基本病症-->
					<div class=" alert_illness_basic" id="show2">
						<div class="section_title">基本病症选择</div>
						<div class="list_box symptoms_box">
							<ul class="symptoms_list">
								<li val="s0">多尿</li>
								<li val="s1">乏力</li>
								<li val="s2">消瘦</li>
								<li val="s3">自盗自汗</li>
								<li val="s4">口干</li>
								<li val="s5">头晕</li>
								<li val="s6">消瘦</li>
							</ul>
							<div class='btn_set'>
								<button class="pre_step_btn">上一步</buttom>
								<button class="next_step_btn">下一步</buttom>
							</div>
						</div>
					</div>
					<!--基本病症 end-->
					<!--并发症-->
					<div class="alert_illness_link" id="show3">
						<div class="section_title">并发症选择</div>
						<div class="complications">
							<ul class="complications_list">
								<li val="c0">糖尿病足</li>
								<li val="c1">糖尿病肾病</li>
								<li val="c2">糖尿病性视网膜病变</li>
								<li val="c3">糖尿病并发神经末梢感觉障碍</li>
								<li val="c4">糖尿病合并感染</li>
								<li val="c5">头晕</li>
								<li val="c6">消瘦</li>
							</ul>
							<div class='btn_set'>
								<button class="pre_step_btn">上一步</buttom>
								<button class="save_btn">保存</buttom>
							</div>
						</div>
					</div>
					<!--并发症-->
					<div class="alert_notice">
						<div class="section_title">选择提醒</div>
						<div class="notice_tips">
							请选择病种!
						</div>
					</div>
				</div>
			</div>
			<!--alert-->
			<!--header-->
			<header class="header_fixed">
				<a href="javascript:history.back(-1)" class="return_pre"></a>
				<div class="header_title">基本信息</div>
				<a class="add_record add_finish">&nbsp;</a>
			</header>
			<div class="header_fixed_div"></div>
			<!--header end-->
			<!--content-->
			<div class="content medicine_record_content">
				<div class="member_details_list">
					<div class="add_member_first">
						<section class="member_detail_info">
							<div class="info_section">
								<div class="list_group">
									<div class="container">
										<sf:hidden path="crmHealthModilis.type" id="type"/>
										<div class="left">家庭成员</div>
										<div class="right family_identity">本人</div>
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<div class="left">会员卡号</div>
										<sf:hidden path="crmHealthModilis.memcardNo" id="memcardNo" />
										<div class="right">${vo.crmHealthModilis.memcardNo }</div>
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<div class="left">姓名</div>
										<div class="right info_input"><sf:input path="crmHealthModilis.cardHolder" id="cardHolder" class="form_control"/><div class="input_result" id="cardHolderDiv">${vo.crmHealthModilis.cardHolder}</div></div>
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<sf:hidden path="crmHealthModilis.sex" id="sex"/>
										<div class="left">性别</div>
										<div class="right user_sex" id="sexDiv">${vo.crmHealthModilis.sex }</div>
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<div class="left">年龄</div>
										<div class="right info_input"><input type="text" class="form_control" value="${vo.reg.AGE }"/><span class="unit">岁</span><div class="input_result" id="ageDiv">${vo.reg.AGE }</div></div>
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<div class="left">出生日期</div>
										<sf:hidden path="crmHealthModilis.birthday" id="birthday"/>
										<div class="right" class="birth_time">
										<input type="button" id="birthdayDiv" style="border: none" value="${vo.crmHealthModilis.birthday }" data-options='{}'/>
										</div>
										
										<script type="text/javascript">
										//记录日期选择
										(function($) {
											$.init();
											var pickBtn = document.querySelector("#birthdayDiv");
											pickBtn.addEventListener("tap",function(){
												var optionsJson = this.getAttribute('birthday-options') || '{}';
												var options = JSON.parse(optionsJson);
												var picker = new mui.DtPicker({
													"type":"date"
												});
												picker.show(function(rs) {
													pickBtn.value = rs.text;
													picker.dispose();
												});
											},false);
										})(mui);
										
										</script>
										
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<div class="left">身份证号</div>
										<div class="right info_input"><input type="number" name="vo.crmHealthModilis.idcard" id="idcard" value="${vo.crmHealthModilis.idcard }" class="form_control"/><div class="input_result" id="idcardDiv">${vo.crmHealthModilis.idcard }</div></div>
									</div>
								</div>
							</div>
							<div class="info_section">
								<div class="list_group">
									<div class="container">
										<sf:hidden path="crmHealthModilis.busno" id="busno"/>
										<div class="left">制卡机构</div>
										<div class="right" id="busNameDiv">${vo.crmHealthModilis.busName }</div>
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<div class="left">医保信息</div>
										<sf:hidden path="crmHealthModilis.medical" id="medical"/>
										<div class="right safeguard_info" >未选择</div>
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<div class="left">档案类型</div>
										<sf:hidden path="crmHealthModilis.fileType" id="fileType"/>
										<div class="right archives_sort">未选择</div>
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<div class="left">档案号</div>
										<div class="right"></div>
									</div>
								</div>
							</div>
							<div class="info_section">
								<div class="list_group">
									<div class="container">
										<div class="left">手机号码</div>
										<div class="right info_input"><input type="tel" name="vo.crmHealthModilis.mobile" id="mobile" class="form_control"/><div class="input_result">未填写</div></div>
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<div class="left">家庭住址</div>
										<div class="right info_input"><sf:input path="crmHealthModilis.cardAddress" id="cardAddress" class="form_control"/><div class="input_result">未填写</div></div>
									</div>
								</div>
							</div>
							<div class="info_section">
								<div class="list_group">
									<div class="container">
										<div class="left">紧急联系人</div>
										<div class="right info_input"><sf:input path="crmHealthModilis.emecontact" id="emecontact" class="form_control"/><div class="input_result">未填写</div></div>
									</div>
								</div>
								<div class="list_group">
									<div class="container">
										<div class="left">联系号码</div>
										<div class="right info_input"><input type="tel" name="vo.crmHealthModilis.tel" id="tel" class="form_control"/><div class="input_result">未填写</div></div>
									</div>
								</div>
							</div>
						</section>
						<div class="fixed_btn">
							<button class="next_btn" onclick="tabShow('sty','add_member_second')">下一步</button>
						</div>
					</div>
					<div class="add_member_second">
						<div class="health_info">
							<section class="member_details_list">
								<div class="member_details_header">
									<div class="container">体测类</div>
								</div>
								<div class="info_list_show">
									<div class="info_section">
										<div class="list_group">
											<div class="container">
												<div class="left">身高</div>
												<div class="right"><sf:input path="crmHealthModilis.height" id="height" class="form_control"/><span class="unit">CM</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">体重</div>
												<div class="right"><sf:input path="crmHealthModilis.weight" id="weight" class="form_control"/><span class="unit">KG</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">体温</div>
												<div class="right"><sf:input path="crmHealthModilis.temperature" id="temperature" class="form_control"/><span class="unit">℃</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">步数</div>
												<div class="right"><sf:input path="crmHealthModilis.steps" id="steps" class="form_control"/><span class="unit">步</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">血氧</div>
												<div class="right"><sf:input path="crmHealthModilis.oxygen" id="oxygen" class="form_control"/><span class="unit">%bmp</span></div>
											</div>
										</div>
									</div>
								</div>
							</section>
							<section class="member_details_list">
								<div class="member_details_header">
									<div class="container">血液类</div>
								</div>
								<div class="info_list_show">
									<div class="info_section">
										<div class="list_group">
											<div class="container">
												<div class="left">收缩压</div>
												<div class="right"><sf:input path="crmHealthModilis.systolic" id="systolic" class="form_control"/><span class="unit">mm/Hg</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">舒张压</div>
												<div class="right"><sf:input path="crmHealthModilis.diastolic" id="diastolic" class="form_control"/><span class="unit">mm/Hg</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">心率</div>
												<div class="right"><sf:input path="crmHealthModilis.heartrate" id="heartrate" class="form_control"/><span class="unit">bmp</span></div>
											</div>
										</div>
									</div>
								</div>
							</section>
							<section class="member_details_list">
								<div class="member_details_header">
									<div class="container">血糖类</div>
								</div>
								<div class="info_list_show">
									<div class="info_section">
										<div class="list_group">
											<div class="container">
												<div class="left">初诊血糖</div>
												<div class="right"><sf:input path="crmHealthModilis.bloodsugar8" id="bloodsugar8" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">早餐前血糖</div>
												<div class="right"><sf:input path="crmHealthModilis.bloodsugar1" id="bloodsugar1" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">早餐后血糖</div>
												<div class="right"><sf:input path="crmHealthModilis.bloodsugar2" id="bloodsugar2" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">午餐前血糖</div>
												<div class="right"><sf:input path="crmHealthModilis.bloodsugar3" id="bloodsugar3" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">午餐后血糖</div>
												<div class="right"><sf:input path="crmHealthModilis.bloodsugar4" id="bloodsugar4" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">晚餐前血糖</div>
												<div class="right"><sf:input path="crmHealthModilis.bloodsugar5" id="bloodsugar5" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">晚餐后血糖</div>
												<div class="right"><sf:input path="crmHealthModilis.bloodsugar6" id="bloodsugar6" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">随机值</div>
												<div class="right"><sf:input path="crmHealthModilis.bloodsugar7" id="bloodsugar7" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
									</div>
								</div>
							</section>
							<section class="member_details_list">
								<div class="member_details_header">
									<div class="container">血脂类</div>
								</div>
								<div class="info_list_show">
									<div class="info_section">
										<div class="list_group">
											<div class="container">
												<div class="left">糖化血红蛋白</div>
												<div class="right"><sf:input path="crmHealthModilis.glycosylated" id="glycosylated" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">总胆固醇</div>
												<div class="right"><sf:input path="crmHealthModilis.cholesterol" id="cholesterol" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">甘油三酯</div>
												<div class="right"><sf:input path="crmHealthModilis.triglyceride" id="triglyceride" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">高密度脂蛋白</div>
												<div class="right"><sf:input path="crmHealthModilis.highLipoprotein" id="highLipoprotein" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">低密度脂蛋白</div>
												<div class="right"><sf:input path="crmHealthModilis.lowLipoprotein" id="lowLipoprotein" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
										<div class="list_group">
											<div class="container">
												<div class="left">同型半胱氨酸</div>
												<div class="right"><sf:input path="crmHealthModilis.homocysteine" id="homocysteine" class="form_control"/><span class="unit">mmol/L</span></div>
											</div>
										</div>
									</div>
								</div>
							</section>
						</div>
						<div class="fixed_btn">
							<div class="btn_set">
								<button  class="next_btn" onclick="tabShow('sty','add_member_first')">上一步</button>
								<button  class="next_btn save_btn" onclick="tabShow('sty','add_member_third')">下一步</button>
							</div>
						</div>
					</div>	
					<div class="add_member_third">
						<!--增加病史-->
						<section class="illness_list add_info_list" id="disease_sec_0">
							<header>病史三</header>
							<div class="list_show">
								<div class="list_show_form">
									<div class="info_list illness_name">
										<div class="info_list_main">
											<div class="left">所患疾病</div>
											<input type="hidden" name="entityIdArr"/>
											<input type="hidden" name="diseaseIdArr"/>
											<div class="right" id="illness_name"><input type="text" name="diseaseNameArr" placeholder="请选择" class="form_control normal_gray" disabled="disabled"/></div>
										</div>
									</div>
									<div class="info_list illness_category">
										<div class="info_list_main">
											<div class="left">疾病类型</div>
											<div class="right" id="illness_category"><input type="text" name="diseaseTypeArr" placeholder="请选择" class="form_control normal_gray" disabled="disabled"/></div>
										</div>
									</div>
									<div class="info_list illness_time">
										<div class="info_list_main">
											<div class="left">诊断时间</div>
											<input type="hidden" name="shootingtimeArr" />
											<div class="right">
												<input type="button" id="shootingtimeArr_0" style="border: none" data-options='{}'/>
											</div>
											
											<script type="text/javascript">
											//记录日期选择
											(function($) {
												$.init();
												var pickBtn = document.querySelector("#shootingtimeArr_0");
												pickBtn.addEventListener("tap",function(){
													var optionsJson = this.getAttribute('data-options') || '{}';
													var options = JSON.parse(optionsJson);
													var picker = new mui.DtPicker({
														"type":"date"
													});
													picker.show(function(rs) {
														pickBtn.value = rs.text;
														picker.dispose();
													});
												},false);
											})(mui);
											
											</script>
										</div>
									</div>
									<div class="info_list illness_statue">
										<div class="info_list_main">
											<div class="left">治疗状态</div>
											<div class="right" id="illness_statue"><input type="text" name="treatmentStateArr" placeholder="请选择" class="form_control normal_gray" disabled="disabled"/></div>
										</div>
									</div>
									<div class="info_list illness_basic">
										<div class="info_list_main">
											<div class="left">基本症状</div>
											<div class="right" id="illness_basic"><input type="text" name="symptomsArr" placeholder="请选择" class="form_control normal_gray" disabled="disabled"/></div>
										</div>
									</div>
									<div class="info_list illness_link" >
										<div class="info_list_main">
											<div class="left">并发症</div>
											<div class="right" id="illness_link"><input type="text" name="concurrentArr" placeholder="请选择" class="form_control normal_gray" disabled="disabled"/></div>
										</div>
									</div>
									<div class="ill_reason">
										<div class="info_list_main">
											<div class="left">病因</div>
											<div class="right">
												<div class="ill_reason_box">
													<div class="microphone_input">
														<i class="icon_microphone"></i>
														<p>语音输入</p>
													</div>
													<div class="input_reason">
														<textarea name="pathogenyArr" placeholder="请输入" class="normal_gray"></textarea>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</section>
						<!--增加病史 end-->
						<div class="fixed_btn">
							<div class="btn_set">
								<button  class="next_btn" onclick="tabShow('sty','add_member_second')">上一步</button>
								<button  class="next_btn save_btn" onclick="tabShow('sty','add_member_fourth')">下一步</button>
							</div>
						</div>
					</div>
					<div class="add_member_fourth">
						<!--增加用药记录 section-->
						<section class="illness_list add_medicine_record" >
							<div class="list_show_form">
								<div class="info_list" onclick="clickSearch()">
									<div class="info_list_main">
										<div class="left">商品编码</div>
										<sf:hidden path="crmDrugNote.wareid" id="wareid"/>
										<div class="right info_input"><div class="input_result" id="warecodeDiv"></div></div>
									</div>
								</div>
								<div class="info_list">
									<div class="info_list_main">
										<div class="left">药品名称</div>
										<div class="right info_input"><div class="input_result" id="wareNameDiv"></div></div>
									</div>
								</div>
								<div class="info_list">
									<div class="info_list_main">
										<div class="left">生产企业</div>
										<div class="right info_input"><div class="input_result" id="factorynameDiv"></div></div>
									</div>
								</div>
								<div class="info_list">
									<div class="info_list_main">
										<div class="left">用法用量</div>
										<div class="right info_input"><sf:input path="crmDrugNote.usage" id="usage" class="form_control" /><div class="input_result"></div></div>
									</div>
								</div>
								<div class="info_list">
									<div class="info_list_main">
										<div class="left">药物规格</div>
										<div class="right info_input"><div class="input_result" id="warespecDiv"></div></div>
									</div>
								</div>
							</div>
						</section>
						<!--增加病史  section end-->
						<!--增加用药记录 section-->
						<section class="illness_list add_medicine_record" >
							<div class="list_show_form">
								<div class="info_list">
									<div class="info_list_main">
										<div class="left">可用天数</div>
										<div class="right info_input"><sf:input path="crmDrugNote.availableDays" id="availableDays" class="form_control" /><span class='unit'>天</span><div class="input_result"></div></div>
									</div>
								</div>
								<div class="info_list">
									<div class="info_list_main">
										<div class="left">使用状态</div>
										<div class="right"><sf:input path="crmDrugNote.stillUse" id="stillUse" class="form_control" /></div>
									</div>
								</div><div class="info_list">
									<div class="info_list_main">
										<div class="left">开始时间</div>
										<sf:hidden path="crmDrugNote.startTime" id="startTime" class="form_control" disabled="disabled"/>
										<div class="right">
											<input type="button" id="startTimeBtn" style="border: none" data-options='{}'/>
										</div>
										
										<script type="text/javascript">
										//记录日期选择
										(function($) {
											$.init();
											var pickBtn = document.querySelector("#startTimeBtn");
											pickBtn.addEventListener("tap",function(){
												var optionsJson = this.getAttribute('data-options') || '{}';
												var options = JSON.parse(optionsJson);
												var picker = new mui.DtPicker({
													"type":"date"
												});
												picker.show(function(rs) {
													pickBtn.value = rs.text;
													picker.dispose();
												});
											},false);
										})(mui);
										
										</script>
										
									</div>
								</div>
								<div class="info_list">
									<div class="info_list_main">
										<div class="left">结束时间</div>
										<sf:hidden path="crmDrugNote.endTime" id="endTime" class="form_control" disabled="disabled"/>
										<div class="right">
											<input type="button" id="endTimeBtn" style="border: none" data-options='{}'/>
										</div>
										
										<script type="text/javascript">
										//记录日期选择
										(function($) {
											$.init();
											var pickBtn = document.querySelector("#endTimeBtn");
											pickBtn.addEventListener("tap",function(){
												var optionsJson = this.getAttribute('data-options') || '{}';
												var options = JSON.parse(optionsJson);
												var picker = new mui.DtPicker({
													"type":"date"
												});
												picker.show(function(rs) {
													pickBtn.value = rs.text;
													picker.dispose();
												});
											},false);
										})(mui);
										
										</script>
									
									</div>
								</div>
							</div>
						</section>
						<!--增加病史  section end-->
						<!--增加用药记录 section-->
						<section class="illness_list add_medicine_remark" >
							<div class="list_show_form">
								<div class="medicine_remark">
									<div class="remark_title">备注</div>
									<div class="microphone_input_box">
										<div class="microphone_label_section">
											<div class="microphone_input">
												<i class="icon_microphone"></i>
												<p>语音输入</p>
											</div>
										</div>
										<div class="input_textarea">
											<sf:textarea path="crmDrugNote.notes" placeholder="请输入" class="normal_gray"></sf:textarea>
										</div>
									</div>
								</div>
							</div>
						</section>
						<!--增加病史  section end-->
						<div class="fixed_btn">
							<div class="btn_set">
								<button  class="next_btn" onclick="tabShow('sty','add_member_third')">上一步</button>
								<button  class="next_btn save_btn" id="save_btn" onclick="doAdd()" >保存</button>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="fixed_btn_kong"></div>
			<!--content end-->
			<div class="microphone_section ">
				<!--开始说话前-->
				<div class="before_speak" >
					<div class="before_speak_box" >
						<p>按住说话</p>
						<a href="javascript:void(0)" class="iconfont hide_microphone"></a>
						<a href="javascript:void(0)" class="iconfont deal_microphone"></a>
					</div>
				</div>
				<!--开始说话前 end-->
				<!--说话中-->
				<div class="speaking" style="display: none;">
					<div class="speaking_box">
						<p>请说话</p>
						<div class="deal_shadow" >
							<a href="javascript:void(0)" class="iconfont deal_microphone"></a>
						</div>
					</div>
				</div>
				<!--说话中 end-->
				<!--说话完成后，待确认-->
				<div class="ensure_speak" style="display: none;">
					<div class="ensure_box">
						<div class="speaking_result">这里是语音转换成文字后的区域</div>
						<a href="javascript:void(0)" class="word_deal result_cancle">取消</a>
						<a href="javascript:void(0)" class="iconfont deal_microphone"></a>
						<a href="javascript：void(0)" class="word_deal result_ensure">确定</a>
					</div>
					
				</div>
				<!--说话完成后，待确认 end-->
			</div>
			<div class="microphone_section_kong"></div>
		</sf:form>
		<div id="search_ware_div" style="display: none;">
			<!--商品检索content-->
			<div class="content medicine_searching_content">
				<div class="searching_section">
					<div class="container">
						<div class="searching_form">
								
								<div class="searching_input_group">
									<div class="searching_input">
										<i class="icon_search iconfont">&#xe601</i>	<input type="text" id="ware" class="form_control" placeholder="输入商品编码"/>
									</div>
									
								</div>
								<button class="searching_btn" onclick="findWare()" style="float: right;margin-top: -30px;margin-right: 20px">检索</button>
								
						</div>
					</div>
				</div>
				
				<div class="searching_result" id="searching_result1">
					
				</div>
			</div>
		</div>
		<!--患病信息-->
		<div class="content illness_list_content">
			<div class="container" id="con">

			</div>
		</div>
	</body>
	<script type="text/javascript">
		$(function(){
			//语音输入
			$('.microphone_input').click(function(){
				$(".microphone_section").toggleClass('animate')
			});
			$('a.hide_microphone').click(function(){
				$(".microphone_section").removeClass('animate');
			});
			//修改信息
			var temp = '';
			$('.info_input').click(function(){
				$(this).children('input.form_control').show().focus().siblings('.input_result').hide();
				temp = $(this).children('.input_result').html();
			});
			$('input.form_control').blur(function(){
				var $this = $(this);
				var result = $this.val();
				if(  ( result == '' ) && ( temp == '' )  ) {
					result = '未填写';
				}else if( ( result == '' ) && ( temp != '' ) ){
					result = temp;
				}
				$(this).hide().siblings('.input_result').html( result ).show();
			});
			//性别选择
			$('.user_sex').click(function(){
				layer.open({
					content : '<div class="select_section"><ul class="select_options"><li val="0">男</li><li val="1">女</li></ul></div>'
				});
				select( 'user_sex' ) ;
			});
			//家庭成员选择
			$('.family_identity').click(function(){
				layer.open({
					content : '<div class="select_section"><ul class="select_options"><li val="0">本人</li><li val="1">配偶</li><li val="2">父亲</li><li val="3">母亲</li></ul></div>'
				});
				select( 'family_identity' ) ;
			});
			
			//医保信息
			$('.safeguard_info').click(function(){
				layer.open({
					content : '<div class="select_section"><ul class="select_options"><li val="0">市医保</li><li val="1">省医保</li><li val="2">无医保</li></ul></div>'
				});
				select( 'safeguard_info' ) ;  
			});
			
			//档案类型选择
			$('.archives_sort').click(function(){
				layer.open({
					content : '<div class="select_section"><ul class="select_options"><li val="0">普通</li><li val="1">慢病</li></ul></div>'
				});
				select( 'archives_sort' ) ;
			});
			
			function select(target){
				$('ul.select_options li').click(function(){
					var $this = $(this);
					var html = $this.html();
					var val = $this.attr('val');
					$('.'+target ).html( html ).attr('val' ,val);
					layer.closeAll();
					if("family_identity"==target){
						changeMemberInfo(html);
					}
				});
			}
			//保存按钮
			$('.alert_illness_link .btn_set .save_btn').click(function(){
				var complications = [];
				$('ul.complications_list li.on').each(function(){
					complications.push( $(this).html() );
				})
				var $UL ='';
				if( complications[0] != undefined ){
					var $LI = '';
					for( var i = 0 ; i < complications.length ; i++ ){
						$LI += '<li>'+complications[i]+'</li>';
					}
					$UL = '<ul class="illness_label">'+$LI+'</ul>';
				}else{
					$UL = '无';
				}
				$('#'+target).children().find("#illness_link").html( $UL );
				close();
			});
			//治疗状态的选择
			$('.illness_statue').click(function(){
				var $parent = $(this).parents('.illness_list').attr('id');
				var ill_name = $("#illness_name").children('input').val();
				if( ill_name == "" ){
					alertShow('alert_notice');
					position();
					setInterval(function(){
						close()
					},1500);
				}else{
					statue( $parent )
				}
			})
			//选择治疗状态
			$('.alert_illness_statue ul.condition_list li').click(function(){
				$(this).addClass('on').siblings().removeClass('on')
			});
			function statue( target ){
				alertShow('alert_illness_statue')
				position();
				$('.alert_illness_statue button.save').click(function(){
					var state = $('.alert_illness_statue ul.condition_list li.on').html();
					if( state != undefined ){
						$('#'+target).children().find('#illness_statue').html( state )
						 close();
					}
				});
			}
			
		});
	
		//病种选择
		function name( parent ){
			var parent = parent ;
			var compid = $("#compid").val();
			$("#show1").empty();
			$.ajax({
				url:"<%=path%>/getEntity.do?compid="+compid,
				type:"get",
				dataType:"json",
				success:function(data){
					 var json = eval(data);
  				  		 var list=[];
  				  	     $("#show1").append('<div class="section_title">病种选择</div>'+
						'<div class="list_box disease_box">'+
						'<div class="father_list_box">'+
						'<form>'+
						'<ul class="father_list" id="father_list1">'+
						'</ul>'+
						'</form>'+
						'</div>'+
						'<div>'+
						'<ul class="child_list" id="child_list1">'+
						'<li >糖尿病I型</li>'+
						'<li >糖尿病II型</li>'+
						'<li >妊娠糖尿病</li>'+
						'<li >继发性糖尿病</li>'+
						'</ul>'+
					'</div>'+
					'<button class="next_step_btn" onclick="next1()">下一步</button>'+
					'</div>'
   	    			);
 				  	var tag=0;
   					$(json).each(function(i){
	       				list[i]=json[i];
	       				$("#father_list1").append('<li onclick="clickEntity()" val="f'+tag+'">'+list[i].ENTITYNAME+'</li>');
					    tag++;
   					});

   					alertShow('alert_illness_category');
					position();
					$('ul.child_list li,ul.father_list li').click(function(){
						$(this).addClass('on').siblings().removeClass('on');
					});
					
					//病种选择的下一步
					$(' .next_step_btn').click(function(){
						var child_list = $('.alert_illness_category ul.child_list li.on').html();
						var father_list = $('.alert_illness_category ul.father_list li.on').html();
						if( ( father_list != undefined ) && (child_list != undefined )  ){
							$('#'+parent).children().find("#illness_name").html( father_list );
							$('#'+parent).children().find("#illness_category").html( child_list );
							basic( parent );
						}
					});
			  	}
			});
					
		}
				
		//子病种选择()
		$('ul.child_list li,ul.father_list li').click(function(){
			$(this).addClass('on').siblings().removeClass('on')
		});
		$('.illness_name').click(function( ){
			var $parent = $(this).parents('.illness_list').attr('id');
			name( $parent )
		});
				
		//病症选择
		$(".illness_category").click(function(){
			var ill_name = $("#illness_name").children('input').val();
			if( ill_name == "" ){
				alertShow('alert_notice');
				position();
				setInterval(function(){
					close()
				},1500)
			}else{
				var $parent = $(this).parents('.illness_list').attr('id');
				name( $parent );
			}
		});
		//并发症选择
		$('.illness_link').click(function(){
			var $parent = $(this).parents('.illness_list').attr('id');
			var ill_name = $("#illness_name").children('input').val();
			if( ill_name == "" ){
				alertShow('alert_notice');
				position();
				setInterval(function(){
					close()
				},1500)
			}else{
				link( $parent );
			}
		});
		//并发症选择
		$("ul.complications_list li").click(function(){
			$(this).toggleClass('on')
		});
		//并发症选择
		function link( target ){
			alertShow('alert_illness_link')
			position();
			//上一步
			$('.alert_illness_link button.pre_step_btn').click(function(){
				basic(target)
			});
			
			//保存按钮
			$('.alert_illness_link .btn_set .save_btn').click(function(){
				var complications = [];
				$('ul.complications_list li.on').each(function(){
					complications.push( $(this).html() );
				})
				var $UL ='';
				if( complications[0] != undefined ){
					var $LI = '';
					for( var i = 0 ; i < complications.length ; i++ ){
						$LI += '<li>'+complications[i]+'</li>';
					}
					$UL = '<ul class="illness_label">'+$LI+'</ul>';
				}else{
					$UL = '无';
				}
				$('#'+target).children().find("#illness_link").html( $UL );
				close();
			});
		}
		//病症选择()
		$('ul.symptoms_list li').click(function(){
			$(this).toggleClass('on');
		});
		//基本病症选择
		function basic( target ){
			alertShow('alert_illness_basic');
			position();
			//上一步
			$('.alert_illness_basic button.pre_step_btn').click(function(){
				name( target );
			});
			//下一步
			$('.alert_illness_basic button.next_step_btn').click(function(){
				var result = selectMore( 'symptoms' );
				$('#'+target).children().find('#illness_basic').html( result );
				link( target );
			});
			
		}
		$('.illness_basic').click(function(){
			var $parent = $(this).parents('.illness_list').attr('id');
			var ill_name = $("#illness_name").children('input').val();
			if( ill_name == "" ){
				alertShow('alert_notice');
				position();
				setInterval(function(){
					close();
				},1500);
			}else{
				basic( $parent );
			}
		});
		//治疗状态的选择
		$('.illness_statue').click(function(){
			var $parent = $(this).parents('.illness_list').attr('id');
			var ill_name = $("#illness_name").children('input').val();
			if( ill_name == "" ){
				alertShow('alert_notice');
				position();
				setInterval(function(){
					close();
				},1500);
			}else{
				statue( $parent );
			}
		});
		//选择治疗状态
		$('.alert_illness_statue ul.condition_list li').click(function(){
			$(this).addClass('on').siblings().removeClass('on');
		});
		function statue( target ){
			alertShow('alert_illness_statue');
			position();
			$('.alert_illness_statue button.save').click(function(){
				var state = $('.alert_illness_statue ul.condition_list li.on').html();
				if( state != undefined ){
					$('#'+target).children().find('#illness_statue').html( state );
				}
				var entityId=$("#tagEntityId").val();
				var billno=$("#tagBillno").val();
				//alert(entityId+"=="+billno);
				$.ajax({
					url:"updateDiseaseStatus.do?entityid="+entityId+"&billno="+billno+"&compid="+compid+"&treatmentstate="+state,
	 				type:"get",
	 				dataType:"json",
	 				success:function(data){
	 					 close();
	 				}
					
				});
				
			});
		} 
		
		function clickEntity(){
			var obj_lis = document.getElementById("father_list1").getElementsByTagName("li");
		    for(i=0;i<obj_lis.length;i++){
		    	 obj_lis[i].onclick = function(){
		             entityname=this.innerHTML;
		             $.ajax({
		 				url:"<%=path%>/getEntityType.do?entityname="+entityname+"&compid="+compid,
		 				type:"get",
		 				dataType:"json",
		 				success:function(data){
		 					 $('#child_list1 li').each(function(){     
		 				        $(this).remove();  
		 				     }); 
		 					 var json = eval(data);
	   				  		 var list=[];
	     					 $(json).each(function(i){
		        				list[i]=json[i];
		        				//alert(list[i].TYPENAME); 
		        				$("#child_list1").append('<li>'+list[i].TYPENAME+'</li>');
	     					 });
	     					$('ul.child_list li,ul.father_list li').click(function(){
								$(this).addClass('on').siblings().removeClass('on')
							});
		 				}
		 		   });  
		         }
		    }
	   }
		   
       function next1(){
		   $.ajax({
				url:"<%=path%>/getEntitySymptom.do?entityname="+entityname+"&compid="+compid,
				type:"get",
				dataType:"json",
				success:function(data){
					$('#symptoms_list1 li').each(function(){     
 				        $(this).remove();  
 				     }); 
					 var json = eval(data);
				     var list=[];
				     $("#show2").append('<div class="section_title">基本病症选择</div>'+
						'<div class="list_box symptoms_box">'+
							'<ul class="symptoms_list" id="symptoms_list1">'+
							'</ul>'+
							'<div class="btn_set">'+
								'<button class="pre_step_btn">上一步</buttom>'+
								'<button class="next_step_btn" onclick="next2()">下一步</buttom>'+
							'</div>'+
						'</div>');
					 $(json).each(function(i){
       				  list[i]=json[i];
       				  $("#symptoms_list1").append('<li>'+list[i].SYMPTOM+'</li>');
					 });
						position();
						//基本病症选择
						$('.illness_basic').click(function(){
							var ill_name = $("#illness_name").children('input').val();
								if( ill_name == "" ){
									alertShow('alert_notice');
									position();
									setInterval(function(){
									 close()
									},1500);
								}else{
									alertShow('alert_illness_basic');
									position();
							}
						})
						
						//上一步
						$('.alert_illness_basic button.pre_step_btn').click(function(){
							alertShow('alert_illness_category');
							position();
						});
						//下一步
						$('.alert_illness_basic button.next_step_btn').click(function(){
							var result = selectMore( 'symptoms' );
							$('#illness_basic').html( result );
							alertShow('alert_illness_link')
							position();
						});
						//病症选择()
						$('ul.symptoms_list li').click(function(){
								$(this).toggleClass('on')
						});
						
			    	}
			   });  
	     }
	     
	     function next2(){
		   	$.ajax({
				url:"<%=path%>/getEntitySyndrome.do?entityname="+entityname+"&compid="+compid,
				type:"get",
				dataType:"json",
				success:function(data){
					$('#complications_list1 li').each(function(){     
 				        $(this).remove();  
 				     });
					 var json = eval(data);
				     var list=[];
				     $("#show3").append('<div class="section_title">并发症选择</div>'+
				 			'<div class="complications">'+
							'<ul class="complications_list" id="complications_list1">'+
							'</ul>'+
							'<div class="btn_set">'+
								'<button class="pre_step_btn" style="background: #ccc;">上一步</button>'+
								'<button class="save_btn">保存</button>'+
							'</div>'+
						'</div>');
					 $(json).each(function(i){
      					  list[i]=json[i];
      					  $("#complications_list1").append('<li>'+list[i].SYNDROME+'</li>');
					 });
					 position()
					//并发症选择
					$('.illness_link').click(function(){
						var ill_name = $("#illness_name").children('input').val();
						if( ill_name == "" ){
							alertShow('alert_notice');
							position();
							setInterval(function(){
								close()
							},1500)
						}else{
							alertShow('alert_illness_link')
							position();
						}
					});
					
					//并发症选择
					//上一步
					$('.alert_illness_link button.pre_step_btn').click(function(){
						alertShow('alert_illness_basic');
						position();
					});
					//并发症选择
					$("ul.complications_list li").click(function(){
						$(this).toggleClass('on')
					});
					
					//保存按钮
					$('.alert_illness_link .btn_set .save_btn').click(function(){
						var complications = [];
						$('ul.complications_list li.on').each(function(){
							complications.push( $(this).html() );
						})
						var $UL ='';
						if( complications[0] != undefined ){
							var $LI = '';
							for( var i = 0 ; i < complications.length ; i++ ){
								$LI += '<li>'+complications[i]+'</li>';
							}
							$UL = '<ul class="illness_label">'+$LI+'</ul>';
						}else{
							$UL = '无';
						}
						$("#illness_link").html($UL);
						close();
					})
				}
	   		 });  
	     }
		
		//多选保存选项
		function selectMore( name ){
			var options = [];
			if( options[0] != undefined ){}
			$('ul.'+name+'_list li.on').each(function(){
				options.push( $(this).html() );
			});
			var $UL ='';
			if( options[0] != undefined ){
				var $LI = '';
				for( var i = 0 ; i < options.length ; i++ ){
					$LI += '<li>'+options[i]+'</li>';
				}
				$UL = '<ul class="illness_label">'+$LI+'</ul>';
			}
			return $UL ;
		}
			
		//新增
		function doAdd(){
			$("#save_btn").attr("disabled", "true");
			$("#save_btn").val("保存中...");
			$("#birthday").val($("#birthdayDiv").val());
			alert($("#birthday").val());
			$.ajax({
				type:"POST",
				url:"<%=path%>/healthFileAdd/addCrmHealthFile.do",
				data:$("#infoForm").serialize(), 
				timeout: 1200000,
				success:function(data){
					if(data != null && data=="OK"){
						alert("保存成功");
						
					}else{
						alert("保存失败");
						$("#save_btn").removeAttr("disabled");
						$("#save_btn").val("保存");
					}
				},
				error:function(data){
				alert(data.responseText)
					alert("保存失败，请重试");
					$("#save_btn").removeAttr("disabled");
					$("#save_btn").val("保存");
				}
			});
		}
		
		
	    function clickSearch(){
	     	$(".add_member_fourth").hide();
	     	$("#search_ware_div").show();
	    }
	    
	    function findWare(){
			var ware=$("#ware").val();
			var compid=$("#compid").val();
			
			$.ajax({
				url:"<%=path%>/getWare.do?ware="+ware+'&compid='+compid,
				type:"get",
				dataType:"json",
				success:function(data){
			        var json = eval(data);
			        var list=[];
			        $(json).each(function(i){
				        list[i]=json[i];
			        	$("#searching_result1").append('<div class="medicine_record_item">'+
							'<a href="javascript:onSel(\''+list[i].WARENAME+'\',\''+list[i].WARECODE+'\',\''+list[i].WAREID+'\',\''+list[i].FACTORYNAME+'\',\''+list[i].WARESPEC+'\')"><div class="container">'+
								'<div class="medicine_info">'+
									'<div class="medicine_info_name">药品名称:'+list[i].WARENAME+'</div>'+
									'<div class="medicine_info_usage">'+
										'<span class="usage_item">药物规格:'+list[i].WARESPEC+'</span>'+
										'<span class="usage_item">用法用量:'+list[i].NOTES+'</span>'+
									'</div>'+
									'<div class="medicine_info_code">商品编码:'+list[i].WARECODE+'</div>'+
								'</div>'+
							'</div>'+
						'</div></a>');
					});
				}
	       });
			
		}
							
		function onSel(warename, warecode, wareid, factoryname, warespec){
			$("#wareNameDiv").html(warename);
			$("#warecodeDiv").html(warecode);
			$("#wareid").val(wareid);
			$("#factorynameDiv").html(factoryname);
			$("#warespecDiv").html(warespec);
			
	     	$(".add_member_fourth").show();
	     	$("#search_ware_div").hide();
		}
		
		//变更会员初始化信息
		function changeMemberInfo(html){
			$("#type").val(html);
			if(html == "本人"){
				$("#cardHolder").val($("#cardHolderHid").val());
				$("#sex").val($("#sexHid").val());
				$("#age").val($("#ageHid").val());
				$("#birthday").val($("#birthdayHid").val());
				$("#idcard").val($("#idcardHid").val());
				$("#busno").val($("#busnoHid").val());
				$("#cardHolderDiv").html($("#cardHolderHid").val());
				$("#sexDiv").html($("#sexHid").val());
				$("#ageDiv").html($("#ageHid").val());
				$("#birthdayDiv").html($("#birthdayHid").val());
				$("#idcardDiv").html($("#idcardHid").val());
				$("#busNameDiv").html($("#busNameHid").val());
			}else{
				$("#cardHolder").val("");
				$("#sex").val("");
				$("#age").val("");
				$("#birthday").val("");
				$("#idcard").val("");
				$("#busno").val("");
				$("#cardHolderDiv").html("");
				$("#sexDiv").html("");
				$("#ageDiv").html("");
				$("#birthdayDiv").html("");
				$("#idcardDiv").html("");
				$("#busNameDiv").html("");
			}
		}
	</script>
</html>
