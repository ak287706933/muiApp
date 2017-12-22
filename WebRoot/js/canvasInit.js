mui.init();
(function($) {
	//阻尼系数
	var deceleration = mui.os.ios?0.003:0.0009;
	$('.mui-scroll-wrapper').scroll({
		bounce: false,
		indicators: false, //是否显示滚动条
		deceleration:deceleration
	});
})(mui);
//数据记录定位
$(function(){
	var tabIndex = parseInt(localStorage.getItem("tabIndex"));
	if(tabIndex==0){
		var firstTab = $("#navLink a:eq(0)")[0];
		mui.trigger(firstTab,'tap');
	}
	if(tabIndex>0){
		var gallery = mui('.mui-slider');
		gallery.slider().gotoItem(tabIndex);
		localStorage.removeItem("tabIndex");
	}
});
//自定义事件
//标签列表的显示
mui("body").on("tap",".jkda_more",function(){
	$(".more_pop_con").show();
});
//标签列表的隐藏
mui(".more_pop_con").on("tap",".more_tit span",function(){
	$(".more_pop_con").hide();
});
//标签列表切换样式
mui(".more_pop_con").on("tap",".more_list a",function(){
	$(".more_pop_con").hide();
	$(".more_list a").removeClass("more_active");
	$(this).addClass("more_active");
});
//横向nav标签切换样式
mui("#navLink").on("tap","a",function(){
	$(".more_list a").removeClass("more_active");
	$(".more_list a").eq($(this).index()).addClass("more_active");
});
//备注折叠展开
mui(".easy_listCon").on("tap",".list_body li",function(){
	if($(this).find(".beizhu").find("span")){
		var obj = $(this).find(".beizhu").find("span")[0];
		$(this).toggleClass("list_act");
	}
});
//年月日标签切换
mui(".selDataCon").on("tap",".selDataCon a",function(){
	$(this).parent().siblings("li").find("a").removeClass("date_active");
	$(this).addClass("date_active");
});
//血糖时段切换
mui("body").on("tap",".timeLable a",function(){
	$(this).parent().siblings("li").find("a").removeClass("lableAct");
	$(this).addClass("lableAct");
});



/**
 * 绘制对应模块的日 周 月 年的折线图
 * @param canvasid 绘制折线图的容器id
 * @param [xData] 折线图X轴的数据(日期 小时等)
 * @param [yData] 折线图Y轴的数据(对应的各指标的测量数值)
 * @return 没有返回值
 */
function drawMap(canvasid,xData,yData) {
	var xData = xData;
	var yData = yData;
	//var tagLine = tagLine;
	var option = {
		backgroundColor: '#FAFAFA',   
		grid: {
			x: 15,
			x2: 30,
			y: 30,
			y2: 30
		},
		xAxis: {
		    type: 'category',
		    data: xData,
		    axisLine: {
		        lineStyle: {
		            type: 'dashed',
		            color: '#999',//左边线的颜色
		            width:'1'//坐标线的宽度
		        }
		    }
		},
		yAxis: {
			show : true,
		    type: 'value',
		    position:'right',
		    axisLine: {
		    	show: false
		    },
		    splitLine: {
				show: true
			},
			axisTick: {
				show: false
			},
            axisLabel: {
                show: true,
                textStyle: {
                    color: '#999'
                }
            }
		},
		series: [
		    {
		    	symbol:'diamond',
		        name:'最低气温',
		        type:'line',
		        data:yData,
		        itemStyle : {  
		            normal : {  
		            	color:'#29C9B8', 
		                lineStyle:{
		                	type:"solid",
		                    color:'#29C9B8',
		                    width:"1"
		                },
		                label:{show:false}
		            }  
		        }
	        }
	    ]
		};
		var weightChart = echarts.init(document.getElementById(canvasid));
		weightChart.setOption(option);
}

//针对血压两条数据折线
/**
 * 绘制对应模块的日 周 月 年的折线图
 * @param canvasid 绘制折线图的容器id
 * @param [xData] 折线图X轴的数据(日期 小时等)
 * @param [yData] 折线图Y轴的数据(对应血压的舒张压的值)
 * @param [yData2] 折线图Y轴的数据(对应血压的收缩压的值)
 * @return 没有返回值
 */
function drawMapTwoLine(canvasid,xData,yData,yData2){
	var xData = xData;
	var yData = yData;
	//var tagLine = tagLine;
	var option = {
		backgroundColor: '#FAFAFA',   
		grid: {
			x: 15,
			x2: 30,
			y: 30,
			y2: 30
		},
		xAxis: {
		    type: 'category',
		    data: xData,
		    axisLine: {
		        lineStyle: {
		            type: 'dashed',
		            color: '#999',//左边线的颜色
		            width:'1'//坐标线的宽度
		        }
		    }
		},
		yAxis: {
			show : true,
		    type: 'value',
		    position:'right',
		    axisLine: {
		    	show: false
		    },
		    splitLine: {
				show: true
			},
			axisTick: {
				show: false
			},
            axisLabel: {
                show: true,
                textStyle: {
                    color: '#999'
                }
            }
		},
		series: [
		    {
		    	symbol:'diamond',
		        name:'收缩压',
		        type:'line',
		        data:yData,
		        itemStyle : {  
		            normal : {  
		            	color:'#29C9B8', 
		                lineStyle:{
		                	type:"solid",
		                    color:'#29C9B8',
		                    width:"1"
		                },
		                label:{show:false}
		            }  
		        }
		      },
	    	{
		    	symbol:'diamond',
		        name:'舒张压',
		        type:'line',
		        data:yData2,
		        itemStyle : {  
		            normal : {  
		            	color:'#ffc925', 
		                lineStyle:{
		                	type:"solid",
		                    color:'#ffc925',
		                    width:"1"
		                },
		                label:{show:false}
		            }  
		        }
		       }
		    ]
		};
	var weightChart = echarts.init(document.getElementById(canvasid));
	weightChart.setOption(option);
}
var id;//为数据库id
var memcardno;//会员卡
var collecttype;//大表格数据
var valname;//健康类型
var compid;//企业编码
var cname;//会员名
var canvasid;//记录容器
var week;//星期
var month;//天
var year;//月
var dayXdata =["01","02","03","04","05","06","07","08","09","10","11","12",
               "13","14","15","16","17","18","19","20","24"];
var weekXdata = ["一","二","三","四","五","六","日"];
var monthXdata = ["01","02","03","04","05","06","07",
				"08","09","10","11","12","13","14","15","16","17",
				"18","19","20","21","22","23","24","25","26","27","28","29","30"];
var yearXdata = ["01","02","03","04","05","06","07","08","09","10","11","12"];
var vaguetime="bebreakfast";//血糖时段默认值
var urlname="";//请求地址
var dateType="";//记录周月年值
var id="";



//接收页面传过来的会员号
function UrlSearch(){
   var name,value; 
   var str=location.href;
   var num=str.indexOf("?");
   str=str.substr(num+1);
   var arr=str.split("&");
   for(var i=0;i < arr.length;i++){
     num=arr[i].indexOf("="); 
      if(num>0){ 
      name=arr[i].substring(0,num);
      value=arr[i].substr(num+1);
      this[name]=value;
     } 
   } 
 } 
var Request=new UrlSearch(); 
memcardno=Request.memcardno;
compid=Request.compid;
valname=Request.valname;
cname=Request.cname;
collecttype=Request.collecttype;
valname=decodeURIComponent(valname);
cname=decodeURIComponent(cname);


//输出健康档案基本数据最找信息
$.ajax({
	url:"showall.do?memcardno="+memcardno,
	type:"get",
	dataType:"json",
	success:function(data){
    var json = eval(data);
    $('#item1mobile').find("h3").html(json.HEIGHT);//身高
    $('#item1mobile').find("span:eq(0)").html(json.CREATETIME1+"");
    $('#item2mobile').find("h3").html(json.WEIGHT);//体重
    $('#item2mobile').find("span:eq(0)").html(json.CREATETIME2+"");
    $('#item3mobile').find("h3").html(json.SYSTOLIC+"/"+json.DIASTOLIC);//血压
    $('#item3mobile').find("span:eq(0)").html(json.CREATETIME7);
    $('#item4mobile').find("h3").html(json.BLOODSUGAR1);//血糖
    $('#item4mobile').find("span:eq(0)").html(json.CREATETIME9);
    $('#item5mobile').find("h3").html(json.TEMPERATURE);//体温
    $('#item5mobile').find("span:eq(0)").html(json.CREATETIME3);
    $('#item6mobile').find("h3").html(json.HEARTRATE);//心率
    $('#item6mobile').find("span:eq(0)").html(json.CREATETIME4);
    $('#item7mobile').find("h3").html(json.OXYGEN);//血氧
    $('#item7mobile').find("span:eq(0)").html(json.CREATETIME8);
    $('#item8mobile').find("h3").html(json.STEPS);//步数
    $('#item8mobile').find("span:eq(0)").html(json.CREATETIME5);
    $('#item9mobile').find("h3").html(json.GLYCOSYLATED);//血红蛋白
    $('#item9mobile').find("span:eq(0)").html(json.CREATETIME13);
    $('#item10mobile').find("h3").html(json.CHOLESTEROL);//总胆固醇
    $('#item10mobile').find("span:eq(0)").html(json.CREATETIME14);
    $('#item11mobile').find("h3").html(json.HIGHLIPOPROTEIN);//高密度脂蛋白
    $('#item11mobile').find("span:eq(0)").html(json.CREATETIME16);
    $('#item12mobile').find("h3").html(json.LOWLIPOPROTEIN);//低密度脂蛋白 
    $('#item12mobile').find("span:eq(0)").html(json.CREATETIME17);
    $('#item13mobile').find("h3").html(json.TRIGLYCERIDE);//甘油三酯
    $('#item13mobile').find("span:eq(0)").html(json.CREATETIME15);
    $('#item14mobile').find("h3").html(json.HOMOCYSTEINE);//同型半胱氯酸 
    $('#item14mobile').find("span:eq(0)").html(json.CREATETIME18);
    getRemark(id);//显示备注
	},
	error:function(data){


	}
});
//获取周月年数据
mui(".selDataCon").on("tap","li",function(){
	vaguetime="bebreakfast";//血糖时段默认值
	dateType = $(this).find("a").attr("data-datetype");
	canvasid = $(this).find("a").attr("data-canvasid");
	$("#ul_xt").find("a").attr("class","");
	$("#ul_xt").find("a:eq(0)").attr("class","lableAct");
	if(dateType=="week"){//周数据
		if(collecttype == "getbloodpressure"){//血压
			urlname="weekpressure.do?memcardno="+memcardno+"&collecttype="+collecttype;
			getweekpressure(canvasid,urlname,weekXdata);
		}else if(collecttype == "getbloodsugar"){//血糖
			urlname="getweek.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			var avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			var avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			var avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			getWeekavg(id,avgweekurl);//输出周平均值
			getMonthavg(id,avgmonthurl);//输出月平均值
			getYearavg(id,avgyearurl);//输出月平均值
			getweek(canvasid,urlname,weekXdata);
		}else if(collecttype !== "getheight"){//普通
			urlname="getweek.do?memcardno="+memcardno+"&collecttype="+collecttype;
			getweek(canvasid,urlname,weekXdata);
		}
	}else if(dateType=="month"){//月数据
		if(collecttype == "getbloodpressure"){//血压
			urlname="MonthPressure.do?memcardno="+memcardno+"&collecttype="+collecttype;
			getMonthPressure(canvasid,urlname,monthXdata);
		}else if(collecttype == "getbloodsugar"){//血糖
			urlname="getMonth.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			var avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			var avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			var avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			getWeekavg(id,avgweekurl);//输出周平均值
			getMonthavg(id,avgmonthurl);//输出月平均值
			getYearavg(id,avgyearurl);//输出月平均值
			getMonth(canvasid,urlname,monthXdata);
		}else if(collecttype !== "getheight"){//普通
			urlname="getMonth.do?memcardno="+memcardno+"&collecttype="+collecttype;
			getMonth(canvasid,urlname,monthXdata);
		}
	}else if(dateType=="day"){
		urlname="getday.do?memcardno="+memcardno+"&collecttype="+collecttype;
		getday(canvasid,urlname,dayXdata);
	}else{//年数据
		if(collecttype == "getbloodpressure"){//血压
			urlname="yearPressure.do?memcardno="+memcardno+"&collecttype="+collecttype;
			getYearPressure(canvasid,urlname,yearXdata);
		}else if(collecttype == "getbloodsugar"){//血糖
			urlname="getyear.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			var avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			var avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			var avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
			getWeekavg(id,avgweekurl);//输出周平均值
			getMonthavg(id,avgmonthurl);//输出月平均值
			getYearavg(id,avgyearurl);//输出月平均值
			getYear(canvasid,urlname,yearXdata);
		}else if(collecttype !== "getheight"){//普通
			urlname="getyear.do?memcardno="+memcardno+"&collecttype="+collecttype;
			getYear(canvasid,urlname,yearXdata);
		}
	}
});

//轮播自定义事件
document.querySelector('.mui-slider').addEventListener('slide', function(event) {
	vaguetime="bebreakfast";//默认血糖时段
	$(".more_list a").removeClass("more_active");
	$(".more_list a").eq(event.detail.slideNumber).addClass("more_active");
	//console.log(event.detail.slideNumber);
	var nowBody = "#"+$(this).find(".mui-slider-group").find("div.mui-slider-item:eq("+event.detail.slideNumber+")").attr("id");
	//console.log($(this).find(".mui-slider-group").find("div.mui-slider-item:eq("+event.detail.slideNumber+")").attr("id"));
	//console.log($("#navLink a[href='"+nowBody+"']").find("span:eq(0)").attr("class"));
	//console.log($("#navLink a[href='"+nowBody+"']").find("span:eq(1)").attr("class"));
	//collecttype=$("#navLink a[href='"+nowBody+"']").find("span:eq(0)").attr("class");
	collecttype=$("#navLink a[href='"+nowBody+"']").attr("data-collecttype");
	canvasid=$("#navLink a[href='"+nowBody+"']").find("span:eq(1)").attr("class");
	id=nowBody;
	getRemark(id);//输出备注
	if(collecttype == "getbloodpressure"){//血压
		urlname="weekpressure.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		getweekpressure(canvasid,urlname,weekXdata);
		getWeekavgxueya(id,avgweekurl);//输出周平均值
		getMonthavgxueya(id,avgmonthurl);//输出月平均值
		getYearavgxueya(id,avgyearurl);//输出月平均值
	}else if(collecttype == "getbloodsugar"){//血糖
		urlname="getweek.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		var avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		var avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		var avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		getweek(canvasid,urlname,weekXdata);
		getWeekavg(id,avgweekurl);//输出周平均值
		getMonthavg(id,avgmonthurl);//输出月平均值
		getYearavg(id,avgyearurl);//输出月平均值
	}else if(collecttype == "gettemperature"){//体温
		urlname="getday.do?memcardno="+memcardno+"&collecttype="+collecttype;
		getday(canvasid,urlname,dayXdata);
	}else if(collecttype == "getheight"){
		
	}else{
		urlname="getweek.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		getweek(canvasid,urlname,weekXdata);
		getWeekavg(id,avgweekurl);//输出周平均值
		getMonthavg(id,avgmonthurl);//输出月平均值
		getYearavg(id,avgyearurl);//输出月平均值
	}
	var moduleId = nowBody;
	var firstTab = $(moduleId).find(".selDataCon").find("a").eq(0)[0];
	if(firstTab){
		mui.trigger(firstTab,'tap');
	}
	var fisrtSuger = $(moduleId).find(".time_piece").find("a").eq(0)[0];
	if(fisrtSuger){
		mui.trigger(fisrtSuger,'tap');
	}
});

//获取导航条事件绘制图形
mui("body").on("tap",".my-control",function(){
	vaguetime="bebreakfast";//默认血糖时段
	collecttype=$(this).attr("data-collecttype");
	valname=$(this).attr("data-datetype");
	id=$(this).attr("href");
	canvasid=$(this).find("span:eq(1)").attr("class");
	getRemark(id);//输出备注
	if(collecttype == "getbloodpressure"){//血压
		urlname="weekpressure.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		getweekpressure(canvasid,urlname,weekXdata);
		getWeekavgxueya(id,avgweekurl);//输出周平均值
		getMonthavgxueya(id,avgmonthurl);//输出月平均值
		getYearavgxueya(id,avgyearurl);//输出月平均值
	}else if(collecttype == "getbloodsugar"){//血糖
		urlname="getweek.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		var avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		var avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		var avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		getweek(canvasid,urlname,weekXdata);
		getWeekavg(id,avgweekurl);//输出周平均值
		getMonthavg(id,avgmonthurl);//输出月平均值
		getYearavg(id,avgyearurl);//输出月平均值
	}else if(collecttype == "gettemperature"){//体温
		urlname="getday.do?memcardno="+memcardno+"&collecttype="+collecttype;
		getday(canvasid,urlname,dayXdata);
	}else if(collecttype == "getheight"){
		
	}else{
		urlname="getweek.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		var avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype;
		getweek(canvasid,urlname,weekXdata);
		getWeekavg(id,avgweekurl);//输出周平均值
		getMonthavg(id,avgmonthurl);//输出月平均值
		getYearavg(id,avgyearurl);//输出月平均值
	}
	var moduleId = $(this).attr("href");
	var firstTab = $(moduleId).find(".selDataCon").find("a").eq(0)[0];
	if(firstTab){
		mui.trigger(firstTab,'tap');
	}
	var fisrtSuger = $(moduleId).find(".time_piece").find("a").eq(0)[0];
	if(fisrtSuger){
		mui.trigger(fisrtSuger,'tap');
	}
});

//获取血糖不同时段的图形
mui("#ul_xt").on("tap","li",function(){
	vaguetime=$(this).find("a").attr("data-valtime");
	if(dateType=="week"){
		urlname="getweek.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		getweek(canvasid,urlname,weekXdata);
		getWeekavg(id,avgweekurl);//输出周平均值
		getMonthavg(id,avgmonthurl);//输出月平均值
		getYearavg(id,avgyearurl);//输出月平均值
		getweek(canvasid,urlname,weekXdata);
	}else if(dateType=="month"){
		urlname="getMonth.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		getweek(canvasid,urlname,weekXdata);
		getWeekavg(id,avgweekurl);//输出周平均值
		getMonthavg(id,avgmonthurl);//输出月平均值
		getYearavg(id,avgyearurl);//输出月平均值
		getMonth(canvasid,urlname,monthXdata);
	}else{
		urlname="getyear.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		avgweekurl="weekavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		avgmonthurl="monthavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		avgyearurl="yearavg.do?memcardno="+memcardno+"&collecttype="+collecttype+"&vaguetime="+vaguetime;
		getweek(canvasid,urlname,weekXdata);
		getWeekavg(id,avgweekurl);//输出周平均值
		getMonthavg(id,avgmonthurl);//输出月平均值
		getYearavg(id,avgyearurl);//输出月平均值
		getYear(canvasid,urlname,yearXdata);
	}
	
});

//获取周平均值
function getWeekavg(id,avgurl){
	$.ajax({
		url:avgurl,
		type:"get",
		dataType:"json",
		success:function(data){
			if(data!=null){
	        var json = eval(data);
			$(id).find(".avg:eq(0)").html(json.VALUE1);
			}
		},
		error:function(data){
		}
	});
}
//周平均值血压
function getWeekavgxueya(id,avgurl){
	$.ajax({
		url:avgurl,
		type:"get",
		dataType:"json",
		success:function(data){
			if(data!=null){
			var json = eval(data);
			$(id).find(".avg:eq(0)").html(json.VALUE1+"/"+json.VALUE2);
			}
		},
		error:function(data){
		}
	});
}
//获取月平均值
function getMonthavg(id,avgurl){
	$.ajax({
		url:avgurl,
		type:"get",
		dataType:"json",
		success:function(data){
			if(data!=null){
				var json = eval(data);
				$(id).find(".avg:eq(1)").html(json.VALUE1);
			}
		},
		error:function(data){
		}
	});
}
//月平均值血压
function getMonthavgxueya(id,avgurl){
	$.ajax({
		url:avgurl,
		type:"get",
		dataType:"json",
		success:function(data){
			if(data!=null){
	        var json = eval(data);
			$(id).find(".avg:eq(1)").html(json.VALUE1+"/"+json.VALUE2);
			}
		},
		error:function(data){
		}
	});
}
//获取年平均值
function getYearavg(id,avgurl){
	$.ajax({
		url:avgurl,
		type:"get",
		dataType:"json",
		success:function(data){
			if(data!=null){
				var json = eval(data);
				$(id).find(".avg:eq(2)").html(json.VALUE1);
			}
		},
		error:function(data){
		}
	});
}
//年平均值血压
function getYearavgxueya(id,avgurl){
	$.ajax({
		url:avgurl,
		type:"get",
		dataType:"json",
		success:function(data){
			if(data!=null){
	        var json = eval(data);
			$(id).find(".avg:eq(2)").html(json.VALUE1+"/"+json.VALUE2);
			}
		},
		error:function(data){
		}
	});
}
//获取备注
function getRemark(id){
	$.ajax({
		url:"getremark.do?memcardno="+memcardno+"&collecttype="+collecttype,
		type:"get",
		dataType:"json",
		success:function(data){
			$(id).find(".list_body").empty();
	        var json = eval(data);
	        var list=[];
			$(json).each(function(i){
			list[i]=json[i];
			$(id).find(".list_body").append(
					'<li>'+
					'<a href="#" class="clearfix">'+
						'<p class="rec_date">'+list[i].CREATETIME+'</p>'+
						'<p class="beizhu">备注<span></span></p>'+
						'<p class="rec_data">'+list[i].VALUE1+'</p>'+
					'</a>'+
		            '<div class="list_toggle">'+
				        '<p>'+list[i].REMARK+'</p>'+
				    '</div>'+
				'</li>'
					);
			});
		},
		error:function(data){
		}
	});
}
//获取日数据
function getday(canvasid,urlname,dayXdata){
	$.ajax({
		url:urlname,
		type:"get",
		dataType:"json",
		success:function(data){
			var dayYdata = new Array();
	        var json = eval(data);
	        var list=[];
			$(json).each(function(i){
			list[i]=json[i];
			if(list[i].CREATETIME!=null){
			daytime=getdaytime(list[i].CREATETIME);
			for(var a=0;a<=23;a++){
				if(daytime==dayXdata[a]){
					dayYdata[a]=list[i].VALUE1;
				}
			}
			}
			});
			drawMap(canvasid,dayXdata,dayYdata);
		},
		error:function(data){
		}
	});
}
//获取周数据
function getweek(canvasid,urlname,weekXdata){
	$.ajax({
		url:urlname,
		type:"get",
		dataType:"json",
		success:function(data){
			var weekYdata = new Array();
	        var json = eval(data);
	        var list=[];
			$(json).each(function(i){
			list[i]=json[i];
			week=getMyDay(new Date(list[i].CREATETIME));
			if(week=='周日'){
				weekYdata[6]=list[i].VALUE1;
			}else if(week=='周一'){
				weekYdata[0]=list[i].VALUE1;
			}else if(week=='周二'){
				weekYdata[1]=list[i].VALUE1;
			}else if(week=='周三'){
				weekYdata[2]=list[i].VALUE1;
			}else if(week=='周四'){
				weekYdata[3]=list[i].VALUE1;
			}else if(week=='周五'){
				weekYdata[4]=list[i].VALUE1;
			}else{
				weekYdata[5]=list[i].VALUE1;
			}
			});
			//console.log(weekYdata);
			drawMap(canvasid,weekXdata,weekYdata);
		},
		error:function(data){
		}
	});
}
//获取周数据血压
function getweekpressure(canvasid,urlname,weekXdata){
	$.ajax({
		url:urlname,
		type:"get",
		dataType:"json",
		success:function(data){
			var weekYdata = new Array();
			var weekYdata2= new Array();
	        var json = eval(data);
	        var list=[];
			$(json).each(function(i){
			list[i]=json[i];
			week=getMyDay(new Date(list[i].CREATETIME));
			if(week=='周日'){
				weekYdata[6]=list[i].VALUE1;
				weekYdata2[6]=list[i].VALUE2;
			}else if(week=='周一'){
				weekYdata[0]=list[i].VALUE1;
				weekYdata2[0]=list[i].VALUE2;
			}else if(week=='周二'){
				weekYdata[1]=list[i].VALUE1;
				weekYdata2[1]=list[i].VALUE2;
			}else if(week=='周三'){
				weekYdata[2]=list[i].VALUE1;
				weekYdata2[2]=list[i].VALUE2;
			}else if(week=='周四'){
				weekYdata[3]=list[i].VALUE1;
				weekYdata2[3]=list[i].VALUE2;
			}else if(week=='周五'){
				weekYdata[4]=list[i].VALUE1;
				weekYdata2[4]=list[i].VALUE2;
			}else{
				weekYdata[5]=list[i].VALUE1;
				weekYdata2[5]=list[i].VALUE2;
			}
			});
			drawMapTwoLine(canvasid,weekXdata,weekYdata,weekYdata2);
		},
		error:function(data){
			
		}
	});
}

//获取月数据
function getMonth(canvasid,urlname,monthXdata){
	$.ajax({
		url:urlname,
		type:"get",
		dataType:"json",
		success:function(data){
			var monthYdata = new Array();
	        var json = eval(data);
	        //console.log(json);
	        var list=[];
			$(json).each(function(i){
			list[i]=json[i];
			month=getmonthday(list[i].CREATETIME);
			for(var a=0;a<=30;a++){
				if(month==monthXdata[a]){
					monthYdata[a]=list[i].VALUE1;
				}
			}
			});
			console.log(monthYdata);
			drawMap(canvasid,monthXdata,monthYdata);
		},
		error:function(data){
		}
	});
}
//获取月数据血压
function getMonthPressure(canvasid,urlname,monthXdata){
	$.ajax({
		url:urlname,
		type:"get",
		dataType:"json",
		success:function(data){
			var monthYdata = new Array();
			var monthYdata2=new Array();
	        var json = eval(data);
	        var list=[];
			$(json).each(function(i){
			list[i]=json[i];
			month=getmonthday(list[i].CREATETIME);
			for(var a=0;a<=30;a++){
				if(month==monthXdata[a]){
					monthYdata[a]=list[i].VALUE1;
					monthYdata2[a]=list[i].VALUE2;
				}
			}
			});
			drawMapTwoLine(canvasid,monthXdata,monthYdata,monthYdata2);
		},
		error:function(data){
			
		}
	});
}
//获取年数据
function getYear(canvasid,urlname,yearXdata){
	$.ajax({
		url:urlname,
		type:"get",
		dataType:"json",
		success:function(data){
			var yearYdata = new Array();
	        var json = eval(data);
	        var list=[];
			$(json).each(function(i){
			list[i]=json[i];
			year=getyearday(list[i].CREATETIME);
			for(var a=0;a<=11;a++){
				if(year==yearXdata[a]){
					yearYdata[a]=list[i].VALUE1;
				}
			}
			});
			drawMapTwoLine(canvasid,yearXdata,yearYdata);
		},
		error:function(data){
			
		}
	});
}
//获取年数据血压
function getYearPressure(canvasid,urlname,yearXdata){
	$.ajax({
		url:urlname,
		type:"get",
		dataType:"json",
		success:function(data){
			var yearYdata=new Array();
			var yearYdata2=new Array();
	        var json = eval(data);
	        var list=[];
			$(json).each(function(i){
			list[i]=json[i];
			year=getyearday(list[i].CREATETIME);
			for(var a=0;a<=11;a++){
				if(year==yearXdata[a]){
					yearYdata[a]=list[i].VALUE1;
					yearYdata2[a]=list[i].VALUE2;
				}
			}
			});
			drawMapTwoLine(canvasid,yearXdata,yearYdata,yearYdata2);
		},
		error:function(data){
		}
	});
}
//输出每天的小时
function getdaytime(date){
	daytime=date.substring(11,13);
	return daytime;
}
//日期转星期
function getMyDay(date){
	if(date.getDay()==0) week="周日";
	if(date.getDay()==1) week="周一";
	if(date.getDay()==2) week="周二";
	if(date.getDay()==3) week="周三";
	if(date.getDay()==4) week="周四";
	if(date.getDay()==5) week="周五";
	if(date.getDay()==6) week="周六";
	return week;
}
//输出天
function getmonthday(date){
    month=date.substring(8,10);
	return month;
}
//输出月
function getyearday(date){
	year=date.substring(5,7);
	return year;
}

//添加健康数据事件
mui("body").on("tap",".add_btn",function(){
	location.href="rec_pressure.html?valname="+valname+"&memcardno="+memcardno+"&cname="+cname+"&compid="+compid+"&collecttype="+collecttype;
});
