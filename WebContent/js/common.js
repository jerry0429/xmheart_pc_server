// 轮播
var mySwiper = new Swiper ('#bannerSwiper', {
  loop: true,
  paginationClickable :true,
  pagination: '.swiper-pagination'
})

var mySwiper2 = new Swiper ('#noticeSwiper', {
	direction: 'vertical',
  loop: true,
  paginationClickable :true,
  pagination: '.swiper-pagination'
})

// 导航
$(function(){
	$(".xm-navbar-nav .xm-navbar-item").hover(function(){
  	$t=$(this);
  	$obj=$t.find(".navboxBase");
  	$obj.css({"left":-$t.offset().left+"px","width":$("body").width()});
  	$obj.show();
  },function(){
    $(this).find('.navboxBase').hide();
  });

  // 导航悬浮
  var $xmNav = $('.xm-nav');

  var fixTop = $xmNav.offset().top;
  var fixHeight = $xmNav.height();

  $(window).scroll(function(event) {
  	 var docTop = Math.max(document.body.scrollTop, document.documentElement.scrollTop);
  	 if (fixTop < docTop) {
      $xmNav.addClass('xm-nav-fixed');
    } else {
      $xmNav.removeClass('xm-nav-fixed');
    }
  });

  // 专家轮播
  var swiper = new Swiper('#expertSwiper', {
    slidesPerView: 5,
    paginationClickable: true,
    spaceBetween: 0,
    freeMode: true,
    prevButton:'.doctorsBase .Aprev',
    nextButton:'.doctorsBase .Anext',
  });
  // 科室轮播
  var swiper = new Swiper('#officeSwiper', {
    slidesPerView: 4,
    paginationClickable: true,
    spaceBetween: 0,
    freeMode: true,
    prevButton:'.officesBase .Aprev',
    nextButton:'.officesBase .Anext',
  });

  // 胸痛中心
  $(".quickMenus li.first").hover(function(){
		$t=$(this);
		$obj=$t.find(".QMSub");
		if($obj.length>0){
			$obj.css("top",-(12+$t.index()*61)+"px");
			$obj.show();
		}
	},function(){
		$t=$(this);
		$obj=$t.find(".QMSub");
		if($obj.length>0){
			$obj.hide();
		}
	});

  var mySwiper = new Swiper ('#xtSwiper', {
    loop: true,
    paginationClickable :true,
    pagination: '.swiper-pagination'
  })

})