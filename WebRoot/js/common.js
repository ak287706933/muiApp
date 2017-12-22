$(function(){
	position()
	$('.alert').click(function(){
		$(this).hide();
	});
	$('.alert_content').click(function(e){
		e.stopPropagation();
	})
	
})

function alertShow( target ){
	$('.alert').stop(false,true).show();
	$('.alert_content').children().stop(false,true).hide();
	$('.'+target).stop(false,true).show();

}


function tabShow( title , content ){
	$('.'+title ).addClass('on').siblings().removeClass('on');
	$('.'+content).show().siblings().hide()
}

//弹出层内容的高度
function position(){
	var $target = $('.alert_content');
	var contentH = $target.height();
	var result = contentH/2 ;
	$target.css('margin-top' ,  '-'+result +'px')
}

//function alertShow( target ){
//	$('.alert').stop(false,true).show()
//	$('.'+target).stop(false,true).show().siblings().stop(false,true).hide();
//}

function close( target ){
	$('.alert').hide()
	$('.'+target).hide();
}

function pageShow( title , content , header ){
	$('.'+title ).addClass('on').siblings().removeClass('on');
	$('.'+content).show().siblings().hide();
	$(".header_title").html( header );
}
