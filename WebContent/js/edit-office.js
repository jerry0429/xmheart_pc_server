exports = this;
exports.XPW = exports.EDIT || {};
exports.XPW.OfficeEdit = (function() {
  function OfficeEdit() {
    // 初始化页面处理。
	OfficeEdit.firstOfficeLoad();
	OfficeEdit.jumpDoctorDep()
	OfficeEdit.NewDoctor()

  }
  OfficeEdit.firstOfficeLoad = function () {
	$.ajax({
	  url: '/xmheart_pc_server/depts',
      type: 'GET'
    })
   .done(function(data) {
      var firstColumnTemplate = $('#officeTd').html();
      Mustache.parse(firstColumnTemplate);   
      var rendered = Mustache.render(firstColumnTemplate, {data});
      $('#officeTable').html(rendered);
      $('.ui-loading').hide();
   })
  }

  OfficeEdit.jumpDoctorDep = function () {
    $('#officeTable').on ('click', '.post-btn-edit', function() {
      var officeId = $(this).data('office-id');
      location.href = '/xmheart_pc_server/static/office-ueditor.html?deptId=' + officeId;
    }) 
  }
  
  
  OfficeEdit.NewDoctor = function () {
	  $('#tools').on ('click', '#columnNew', function() {
	      location.href = '/xmheart_pc_server/static/office-ueditor.html';
	  })
  }
  
  return OfficeEdit;
})();
