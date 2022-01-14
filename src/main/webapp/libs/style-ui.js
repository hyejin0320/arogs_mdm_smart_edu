$(function(){ 
  
  $('a[href="#"]').click(function(e) {
    e.preventDefault();
  });


  // all check
	$(".all_chk").on("click", function  () {
		var _this = $(this);
		if (_this.prop("checked") == false) {
			_this.parents("table").find("input[type='checkbox']").prop("checked",false);
      _this.parents("table").find("tr").removeClass("tr-checked-bg");//add bg
		}else {
			_this.parents("table").find("input[type='checkbox']").prop("checked",true);
      _this.parents("table").find("tr").addClass("tr-checked-bg");//add bg
		}
	});
	$(".chk_ele").on("click", function  () {
		var _this = $(this);
		var _leng = _this.parents("table").find(".chk_ele").length;
		var _lengChk = _this.parents("table").find("input:checked").length;
    
    _this.closest("tr").toggleClass("tr-checked-bg");//add bg
		if (_this.prop("checked") == false) {
			_this.parents("table").find(".all_chk").prop("checked",false);
		}else {
			if (_leng == _lengChk) {
				_this.parents("table").find(".all_chk").prop("checked", true);
			}
		}
	});

  
  // file upload multiple
	$("#fileUploadMulti").change(function(){
		fileList = $("#fileUploadMulti")[0].files;
		fileListTag = '';
		for(i = 0; i < fileList.length; i++){
			fileListTag += "<li class='file-dw-link'><a class='file-txt'>"+fileList[i].name+"</a><button class='bt-file-del'>삭제</button></li>";;
		}
		$('#fileListMulti').html(fileListTag);
	});



});


