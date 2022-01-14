$(document).ready(function() {
    initView();
    getList();
});

function getList(){
    getNotice();
    getQna();
}

/**
 * FAQ 리스트 조회 (개수 제한 : 4)
 */
function getNotice(){
    $.ajax({
        type:"POST",
        url:NEXT_URL+"/main/notice",
        dataType:'json',
        contentType:"application/json; charset=utf-8",
        success: function(result){
            console.log(result);
            if(result.length>0) {
                var html = '<ol>';
                for (var i in result) {
                    html+='<li><a href="#" onclick="getNoticeDetail('+result[i].noticeNo+')">' +
                        '<span class="title"><b class="bracket">자주묻는 질문</b>'+result[i].noticeSj+'</span>' +
                        '</a></li>';
                }
                html+='</ol>';
                $('.board-preview-faq').append(html);
            }
        },
        complete: function(result, xhr){
            console.log(xhr);
        }
    });
}

// function getNoticeDetail(noticeNo){
//     $.ajax({
//         type:'POST',
//         url:NEXT_URL+'/notice/detail',
//         contentType:'application/json; charset=utf-8',
//         data:JSON.stringify({noticeNo:noticeNo}),
//         success: function(result){
//             $('#popup-contents').show();
//             var item = result.detail;
//             $('.popup-title').text("공지사항");
//             $('.popup-title-lower').text(item.noticeSj);
//             $('.popup-head-date').text(item.creatDt);
//             $('.popup-head-name').text(item.crtrId);
//             $('.popup-body-Cn').text(item.noticeCn);
//         }, complete: function(result, xhr){
//             console.log(xhr)
//         }
//     })
// }


/**
 * QNA 리스트 조회 (개수 제한 : 4)
 */
function getQna(){
    $.ajax({
        type:"POST",
        url:NEXT_URL+"/main/qna",
        dataType:'json',
        contentType:"application/json; charset=utf-8",
        success: function(result){
            console.log(result);
            if(result.length>0) {
                var html = '<ol>';
                for (var i in result) {
                    html+=' <li><a href="#" onclick="getQnaDetail('+result[i].questNo+','+result[i].isSealed+')">' +
                        '<span class="title '+result[i].recent+'">'+result[i].questSj+'</span></a></li>';
                }
                html+='</ol>';
                $('.board-preview-qna').append(html);
            }
        },
        complete: function(result, xhr){
            console.log(xhr);
        }
    });
}

// function getQnaDetail(questNo, isSealed){
//     if(JSON.parse(isSealed)){
//         console.log("패스워드 있음");
//         confirmPasswrod(questNo, function(){getQnaDetailProcess(questNo)});
//     }else{
//         console.log("패스워드 없음");
//         getQnaDetailProcess(questNo);
//     }
// }
//
// function getQnaDetailProcess(questNo){
//
//     console.log('click : '+questNo)
//     $.ajax({
//         type:"POST",
//         url:NEXT_URL+"/qna/detail",
//         dataType:'json',
//         data:JSON.stringify({questNo:questNo}),
//         contentType:"application/json; charset=utf-8",
//         success: function(result){
//             $('#popup-contents').show();
//             var item = result.detail;
//             $('.popup-title').text("문의사항");
//             $('.popup-title-lower').text(item.questSj);
//             $('.popup-head-date').text(item.questDt);
//             $('.popup-head-name').text(item.qstnerName);
//             $('.popup-head-phone').text(item.qstnerMoblphon);
//             $('.popup-head-email').text(item.qstnerEmail);
//             $('.popup-body-Cn').text(item.questCn);
//         },
//         complete: function(result, xhr){
//             console.log(xhr);
//         }
//     });
// }
//
// function confirmPasswrod(questNo, callback){
//      $('#popup-confirm_password').show();
//      $('.btn-confirm-password').unbind();
//      $('.btn-confirm-password').on('click', function(){
//         checkPassword(questNo, callback);
//      });
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
// function closePopup(){
//     $('*[id^=popup-]').hide();
//     $('.popup-text').text('');
// }