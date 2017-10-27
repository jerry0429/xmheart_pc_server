exports = this;
exports.XPW = exports.EDIT || {};
var articleTitle = $('#articleTitle');
var secondColumn = $('#secondColumn');
var publishTime = $('#publishTime');
var brief = $('#brief');
var navId;
var col;
exports.XPW.NavEdit = (function() {
  function NavEdit() {
    // 初始化页面处理。
	NavEdit.initDate();
	NavEdit.uploadImg();
	navId = NavEdit.getUrlParam("navId");
	col = NavEdit.getUrlParam("col");
	NavEdit.getNav(navId);
	NavEdit.bindSearchArticle();
    NavEdit.postDialogHandle();
    NavEdit.select2Handle();
    NavEdit.bindNavNews();
    NavEdit.publish();
    NavEdit.cancel();
  }
  
    NavEdit.getUrlParam = function(name) {
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); // 构造一个含有目标参数的正则表达式对象
		var r = window.location.search.substr(1).match(reg); // 匹配目标参数
		if (r != null)
			return unescape(r[2]);
		return null; // 返回参数值
		
    }
    NavEdit.initDate = function() {
		$('[data-toggle="datepicker"]').datepicker({
		    language: 'zh-CN',
		    format: 'yyyy-mm-dd'
		 });
    }
    
    NavEdit.getNav = function (navId) {
        var url = '/navs/' + navId;
	        $.get(url, function (res) {
	        	$('#secondColumn').text(res.childColumnName);
	        	$('#articleTitle').text(res.articleTitle);
	        	$('#publishTime').text(NavEdit.dateFilter(res.publishTime));
	        	$('#brief').val(res.brief);
	        	$('#url').text(res.url);
	        	
	        	// 为 secondColumnId 设置分量
	        	$('#secondColumnId').data('nav-id', res.id)
	        	$('#secondColumnId').data('column-id', res.columnId)
	        	$('#secondColumnId').data('column-name', res.childColumnName)
	        	$('#articleId').text(res.url.substr(res.url.indexOf('=')+1));
        });
    },
    
    NavEdit.publish = function () {
	    $('#publish').on('click', function(){
		    var $this = $(this);
		    var imgUrl = $('#upload-img').attr('src');
		    
//	        	console.log(articleTitle.text());
//	        	console.log(publishTime.text());
//	        	console.log(secondColumn.text());
//	        	console.log(imgUrl);
//	        	console.log($('#articleId').text());
			var params = {
				imgUrl : imgUrl,
				id: navId,
				articleId: $('#articleId').text(),
				brief: $('#brief').val()
			};
	
			if (!NavEdit.valid(params, 'publish')) {
				return;
			}
			$this.attr('disabled', 'disabled');
			var url = '/navs/' + navId;
			$.post(url, params, function(res) {
				$this.removeAttr('disabled');
				swal({
					title : "更新成功",
					text : "返回上一页？",
					type : "success",
					showCancelButton : true,
					confirmButtonColor : "#8cd4f5",
					confirmButtonText : "返回上一页",
					cancelButtonText : "继续编辑",
					closeOnConfirm : false
				}, function() {
					window.history.go(-1);
				});
			});

			return;
  	    });
    }
    
    NavEdit.valid = function(params, type) {
		if (!params.articleId) {
			sweetAlert("信息不完整", "请选择文章", "error");
			return false;
		}

		return true;
	},
    
    NavEdit.uploadImg = function () {
		$('.add-img-list').on('click', '#addImgBtn', function (){
			$(this).siblings('.upload-form').find('.add-img-file').trigger('click');
		})
		$('.add-img-list').on('change', '.add-img-file', function (){
			$(this).siblings('.add-img-submit').trigger('click');
		})
		$('#uploadForm').submit(function(){
			$this = $(this);
			$this.ajaxSubmit({
				success: function (responseText) {
					var img = responseText;
					$this.siblings('.add-image-url').find('.upload-img').attr('src', img);
					$this.siblings('.add-image-button').hide();
					$this.siblings('.add-image-url').show();
				}
			});
			return false;
		})
		$('.add-img-list').on('mouseover', '.add-image-url, .add-image-edit', function (){
			$('.add-image-edit').show();
		})
		$('.add-img-list').on('mouseleave', '.add-image-url, .add-image-edit', function (){
			$('.add-image-edit').hide();
		})
		$('.add-img-list').on('click', '.add-image-edit', function (){
			$(this).siblings('.upload-form').find('.add-img-file').trigger('click');
		})
    }
    
    NavEdit.bindSearchArticle = function () {
        $('#postModal').on('click', '#bindNavTitle', function() {
            var articleId = $('#postSelect').val();
            $.get('/articles/' + articleId, function(data) {
//                console.log(data);
	 	        	$('#articleTitle').text(data.title);
	 	        	$('#publishTime').text(NavEdit.dateFilter(data.publishTime));
	 	        	$('#brief').val(data.brief);
	 	        	$('#articleId').text(data.id);
	 	       	$('#url').text(data.url);
	 	        	$('#upload-img').attr('src', data.imgUrl);
	 	        $('#add-image-url').show();
	 	        $('#addImgBtn').hide();
//                 data.publishTime = NavEdit.dateFilter(data.publishTime)
                 
//               var template = $('#J_articles_tmpl').html();
//               Mustache.parse(template);
//               var rendered = Mustache.render(template, {
//                   result : data
//               });
//               if (data.length === 0) {
//                   $('.ui-nodata').show();
//                   $("#J_articles").html('');
//               } else {
//                   $('.ui-nodata').hide();
//                   $("#J_articles").html(rendered);
//               }
               $('.ui-loading').hide();
           })
             .done(function() {
                 $('#postModal').modal('hide');
              })
        })
    }
    
    NavEdit.dateFilter = function(date, formatString) {
        if (!date) return '';
        var date = new Date(date);

        formatString = formatString || 'yyyy-MM-dd';

        var dateMap = {
            year : date.getFullYear(),
            month : date.getMonth() + 1,
            day : date.getDate(),
            hour : date.getHours(),
            minutes : date.getMinutes(),
            seconds : date.getSeconds()
        };

        for ( var key in dateMap) {
            var value = dateMap[key];
            value = value < 10 ? '0' + value : value;
            dateMap[key] = value.toString();
        }

        var year = dateMap.year, month = dateMap.month, day = dateMap.day, hour = dateMap.hour, minutes = dateMap.minutes, seconds = dateMap.seconds;

        var formatDate = formatString.replace(/y+/, function($0) {
            return year.substring(year.length, -$0.length);
        }).replace(/M+/, function() {
            return month;
        }).replace(/d+/, function() {
            return day;
        }).replace(/H+/, function() {
            return hour;
        }).replace(/h+/, function() {
            return hour % 12 === 0 ? 12 : hour % 12;
        }).replace(/m+/, function() {
            return minutes;
        }).replace(/s+/, function() {
            return seconds;
        });
        return formatDate;
    }
    

    NavEdit.postDialogHandle = function () {
//        $('#secondTable').on('click', '.post-btn-edit', function() {
//        		console.log($(this).data('column-name'));
//	  	    $('#secondColumnId').val($(this).data('column-name'));
//	  	    $('#secondColumnId').data('nav-id', $(this).data('nav-id'))
//	  	    $('#secondColumnId').data('column-id', $(this).data('column-id'))
//	  	    $('#secondColumnId').data('column-name', $(this).data('column-name'))
//	  	    $('#postModal').modal('show');
//      ·	})
    		
		$('.post-btn-edit').on('click', function() {
			$('#secondColumnId').val($('#secondColumnId').data('column-name'));
	        $('#postModal').modal('show');
	    })
  	  }
    
    NavEdit.select2Handle = function () {
  	  $('#postModal').on('shown.bs.modal', function(e) {
  		  $('#postSelect').select2({
  		      placeholder: '请输入要查询的文章标题...',
  		      allowClear: true,
  		      minimumInputLength: 1,
  		      minimumResultsForSearch: Infinity,
  		      ajax: {
  		        url: '/articles/show',
  		        dataType: 'json',
  		        data: function (params) {
  		        		var query = {
  		        			  columnName: $('#secondColumnId').data('column-name'),
  	  		        		  keyword: params.term
  	  		            }
  	  		        return query;
  		        },
  		        processResults: function (data, params) {
  		          var de;
  		          return {
  		            results: (function () {
  		              var i, len, results;
  		              results = [];
  		              for (i = 0, len = data.length; i < len; i++) {
  		                de = data[i];
  		                results.push({
  		                  id: de.id,
  		                  text: de.title
  		                });
  		              }
  		              return results;
  		            })()
  		          };
  		        },
  		        cache: true
  		      },
  		      language: 'zh-CN',
  		    });
  	  })
  	  //	 解决 select2 在 bootstarp 弹窗中无法输入问题
  	  $.fn.modal.Constructor.prototype.enforceFocus = function () { };
    }
    
    NavEdit.bindNavNews = function () {
  	  $('#postModal').on('click', '#bindNavTitle', function() {
  		  var id = $('#secondColumnId').data('nav-id')
  		  var postId = $('#postSelect').val();
  		  $.ajax({
  		      url: '/navs/' + id,
  		      type: 'POST',
  		      data: {id: id, articleId: postId}
  		   })
  		   .done(function() {
  			   $('#postModal').modal('hide');
//  			   window.location.reload()
  		    })
  	  })
    }

    NavEdit.cancel = function() {
        $('#cancel').on('click', function(){
			// 取消(直接返回上一级，不做接口交互)
			window.history.go(-1);
			location.href="../nav_list.html?col=" + col;
        });
	}
  return NavEdit;
})();
