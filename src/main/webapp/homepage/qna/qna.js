$(document).ready(function(){
    initView();
    // getQnaList(1);
    initGrid();

    // $('#btnCancle').on('click', function(){
    //     $('.list-section').show();
    //     $('.insert').hide();
    //     $('.createform').val('');
    // });
    //
    // $('.input-confirm-password').on('keyup', function(){
    //     var keyCode = event.key||event.KeyCode;
    //     if(keyCode==13||keyCode=='Enter'){
    //         return;
    //     }
    // })
});

/**
 * QNA 리스트 호출
 */
// function getQnaList(currentPage){
// //
// //     var searchData = {};
// //     searchData.srchCondition = $('#search_condition').val();
// //     searchData.srchData = $('#search_data').val();
//
//
//     var postData = {
//         currentPage:currentPage,
//         srchCondition:$('#search_condition').val(),
//         srchData:$('#search_data').val()
//     }
//
//     $.ajax({
//         url:NEXT_URL+'/qna/alllist',
//         type:'POST',
//         contentType:'application/json; charset=utf8',
//         dataType:'json',
//         data:JSON.stringify(postData),
//         success: function(result){
//             console.log(result);
//         }, complete: function(result, xhr){
//             console.log(result);
//         }
//     })
// }

/**
 * jqGrid 세팅
 */
function initGrid(){
    var searchData = {};
    searchData.srchCondition = $('#search_condition').val();
    searchData.srchData = $('#search_data').val();

    $('#tableListQna').jqGrid({
        url: NEXT_URL+'/qna/list',
        mtype: 'POST',
        datatype: 'json',
        postData: searchData,
        serializeGridData: function(postData){return JSON.stringify(postData);},
        rowNum: 5,
        pager: 'tablePagerQna',
        width: '1000',
        height: 'auto',
        viewrecords: true,
        rownumbers: true,
        loadonce:false,
        colNames:['순번', '제목', '등록일', '등록자', '상태', '잠금'],
        colModel: [
            {name:'questNo', hidden:true, key:true},
            {name:'questSj', width:5, align:'left', sortable: true},
            {name:'questDt', width:1, align:'center', sortable: true},
            {name:'qstnerName', width:1, align:'center', sortable: true},
            {name:'unRspns', width:1, align:'center', sortable: false},
            {name:'isSealed', hidden:true, key:true}
        ],
        jsonReader: {root: function(obj){return obj;}, page: 'page', total: function(obj){return Math.ceil(obj.length/5);}, records:function(obj){return obj.length;}, repeatitems:false},
        ajaxGridOptions: {contentType: 'application/json; charset=utf8'},
        onSelectRow: function(rowid, status, e){
            var questNo = $("#tableListQna").jqGrid('getCell', rowid, 'questNo');
            var isSealed = $("#tableListQna").jqGrid('getCell', rowid, 'isSealed');
            // getQnaDetail(questNo, isSealed);
        },
        loadComplete: function(result) {console.log(result);},
        loadError: function(result){console.log(result);}
    });
}

// /**
//  * QNA 리스트, 검색
//  */
// function getQnaList(){
//
//     console.log('getQnaList()');
//
//     var searchData = {};
//     searchData.srchCondition = $('#search_condition').val();
//     searchData.srchData = $('#search_data').val();
//
//     console.log(searchData);
//
//     $('#listGrid').jqGrid('clearGridData', true);
//     $('#listGrid').jqGrid('setGridParam', {
//         url: NEXT_URL+'/qna/list',
//         mtype:'POST',
//         dataType:'json',
//         postData: searchData,
//         serializeGridData: function(postData){return JSON.stringify(postData);},
//         loadComplete:function(result){
//             console.log(result);
//         }
//     }).trigger('reloadGrid');
// }
//
//
// function backToList(){
//     clearData();
//     $('#contents-main-list').show();
//     $('#contents-main-form').hide();
//     $('#content-main-detail').hide();
// }
//
// function clearData(){
//     $('*[class^=isf]').val('');
// }
//
// function getQnaDetail(questNo, isSealed){
//     clearData();
//     showPasswordPopup(questNo, Boolean(Number(isSealed)));
// }
//
// function showPasswordPopup(questNo, isSealed){
//     if(isSealed==true){
//         $('#popup-confirm_password').show();
//
//         $('.btn-confirm-password').on('click', function(){
//             getQnaDetailProcess(questNo, $('.input-confirm-password').val());
//         });
//     }else{
//         getQnaDetailProcess(questNo, $('.input-confirm-password').val());
//     }
// }
//
// function getQnaDetailProcess(questNo, password){
//     $.ajax({
//         type:"POST",
//         url:NEXT_URL+"/qna/detail",
//         dataType:'json',
//         data:JSON.stringify({questNo:questNo, password:password}),
//         contentType:"application/json; charset=utf-8",
//         success: function(result){
//             $('#popup-confirm_password').hide();
//             $('#contents-main-list').hide();
//             $('#content-main-detail').show();
//
//             var item = result.detail;
//
//             $('.questSj').text(item.questSj);
//             $('.questCn').text(item.questCn);
//             $('.qstnerName').text(item.qstnerName);
//             $('.qstnerEmail').text(item.qstnerEmail);
//             $('.qstnerMoblphon').text(item.qstnerMoblphon);
//             if(item.rspnsCn!=null&&item.rspnsCn!=""){
//                 $('.contents-detail-response').show();
//                 $('.rspnsCn').text(item.rspnsCn);
//             }else{
//                 $('.contents-detail-response').hide();
//             }
//
//             console.log(result);
//         },
//         complete: function(result, xhr){
//             console.log(xhr);
//         }
//     });
// }
//
// function getQnaIsSealed(questNo){
//     $.ajax({
//         url: NEXT_URL+'/qna/'
//     })
// }
//
// // function getQnaDetail(questNo, isSealed){
// // console.log('getQnaDetail : '+JSON.parse(isSealed));
// //     if(JSON.parse(isSealed)){
// //         console.log("패스워드 있음");
// //         confirmPassword(questNo, function(){getQnaDetailProcess(questNo)});
// //     }else{
// //         console.log("패스워드 없음");
// //         getQnaDetailProcess(questNo);
// //     }
// // }
//
// // function getQnaDetailProcess(questNo){
// //
// //     console.log('click : '+questNo);
// //     $.ajax({
// //         type:"POST",
// //         url:NEXT_URL+"/qna/detail",
// //         dataType:'json',
// //         data:JSON.stringify({questNo:questNo}),
// //         contentType:"application/json; charset=utf-8",
// //         success: function(result){
// //             $('.list-section').hide();
// //             $('.list-section-detail').show();
// //             var item = result.detail;
// //             $('.item-questNo').text(item.questNo);
// //             $('.item-questSj').text(item.questSj);
// //             $('.item-qstnerName').text(item.qstnerName);
// //             $('.item-qstnerMoblphon').text(item.qstnerMoblphon);
// //             $('.item-qstnerEmail').text(item.qstnerEmail);
// //             $('.item-questCn').text(item.questCn);
// //             $('.item-questDt').text(item.questDt);
// //         },
// //         complete: function(result, xhr){
// //             console.log(xhr);
// //         }
// //     });
// // }
//
// function confirmPassword(questNo, callback){
//     console.log('confirmPassword');
//     $('#popup-confirm_password').show();
//     $('.btn-confirm-password').unbind();
//     $('.btn-confirm-password').on('click', function(){
//         checkPassword(questNo, callback);
//     });
// }
//
// function checkPassword(questNo, callback){
//     if($('.input-confirm-password').val()==''){
//         alert('비밀번호를 입력해주세요.');
//         return;
//     }
//     var data = {
//         questNo: questNo,
//         password: $.trim($('.input-confirm-password').val())
//     }
//
//     $.ajax({
//         type:'POST',
//         dataTYpe:'json',
//         url:NEXT_URL+'/qna/confirm_password',
//         contentType: 'application/json; charset=utf-8',
//         data:JSON.stringify(data),
//         success: function(result){
//             if(JSON.parse(result.valid)&&callback){
//                 callback();
//                 $('#popup-confirm_password').hide();
//                 $('.input-confirm-password').val('');
//             }else{
//                 alert("패스워드가 일치하지 않습니다.");
//             }
//         }, complete: function(result){
//             console.log(result);
//         }
//     })
// }
//
// function createQna(){
//     $('#contents-main-list').hide();
//     $('#contents-main-form').show();
//
//
//
//
//     $('.btnSave').on('click', function(){
//         createQnaProcess();
//     });
// }
//
// function createQnaProcess(){
//     var formData = {
//         questSj: $.trim($(".questSj").val()),
//         questCn: $.trim($(".questCn").val()),
//         password: $.trim($(".password").val()),
//         qstnerName: $.trim($(".qstnerName").val()),
//         qstnerEmail: $.trim($(".qstnerEmail").val()),
//         qstnerMoblphon: $.trim($(".qstnerMoblphon").val())
//     }
//
//     $.ajax({
//         type:'POST',
//         dataType : "json",
//         url: NEXT_URL + "/qna/insert",
//         contentType: 'application/json',
//         accept: 'application/json',
//         data:  JSON.stringify(formData),
//         success: function(result){
//             console.log(result);
//         }, complete: function (result, xhr){
//             console.log(xhr);
//             $('.qna-list').remove();
//             getQnaList();
//             $('.list-section').show();
//             $('.insert').hide();
//             $('.createform').val('');
//             $('.save').hide();
//         }
//     });
// }
//
// function showList(){
//     $('.list-section-detail').hide();
//     $('.list-section').show();
//     $('.qna-list').remove();
//     getQnaList();
// }
//
// function removeItemProcess(){
//     closePopup();
//     var questNo = $('.item-questNo').text();
//     $.ajax({
//         type:'POST',
//         url: NEXT_URL+'/qna/remove',
//         contentType:'application/json; charset=utf8',
//         data:JSON.stringify({questNo:questNo}),
//         success: function(result){
//             if(result&&result=='true'){
//                 alert("삭제 완료");
//             }
//         }, complete: function(result, xhr){
//             console.log(xhr);
//             showList();
//         }
//     })
// }
//
// function updateItem(){
//     closePopup();
//     $('.list-section-detail').hide();
//     $('.insert').show();
//     $('.update').show();
//     console.log('updateItem');
//     $('.btnSave').on('click', function(){
//         //공백 검사------
//         console.log('updateItemProcess Before');
//         updateItemProcess();
//     });
// }
//
// function updateItemProcess(){
//     var data = {
//         questNo: $('.item-questNo').text(),
//         qstnerName: $('.qstnerName').val(),
//         qstnerEmail: $('.qstnerEmail').val(),
//         qstnerMoblphon: $('.qstnerMoblphon').val(),
//         questSj: $('.questSj').val(),
//         questCn: $('.questCn').val(),
//         password: $('.pasword').val()
//     }
//     $.ajax({
//         type: 'POST',
//         url: NEXT_URL+'/qna/update',
//         contentType: 'application/json; charset=utf8',
//         data:JSON.stringify(data),
//         beforeSend: function(xhr){
//
//         }, success: function(result){
//             console.log(result);
//             if(result.valid=='true'){
//                 console.log(result.valid=='true')
//                 alert("수정 완료");
//             }
//         }, complete: function(result, xhr){
//             console.log(xhr);
//             $('.list-section-detail').show();
//             $('.insert').hide();
//             $('.update').hide();
//             showList();
//         }
//     })
// }
//
//
// function closePopup(){
//     $('*[id^=popup-]').hide();
// }
//
// function confirmPopup(value, event){
//     $('#popup-confirm-alert').show();
//     $('#popup-confirm-alert').children('p').text('문의사항 '+value);
//     $('.popup-confirm-btn').attr('value', value);
//     $('.popup-confirm-btn').on('click', function(){event();});
// }
