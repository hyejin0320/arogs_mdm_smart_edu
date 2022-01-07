$(document).ready(function(){
    initView();
    getList();
});

function getList(){
    getNotice();
    getQna();
}

function getNotice(){
    $.ajax({
        type:"POST",
        url:NEXT_URL+"/main/notice",
        dataType:'json',
        contentType:"application/json; charset=utf-8",
        success: function(result){
            console.log(result);
            if(result.length>0) {
                console.log('lenght>0');
                var html = '<ul class="notice-list"></ul>';
                $('.contents').append(html);
                for (var i in result) {
                    html = '<li>' +
                        '<span>' + i + '</span>' +
                        '<span>' + result[i].noticeNo +'</span>' +
                        '<span>'+result[i].noticeSj+'</span>' +
                        '<span>'+result[i].noticeCn+'</span>' +
                        '<span>'+result[i].creatDt+'</span>' +
                        '</li>';
                    $('.notice-list').append(html);
                }
            }
        },
        complete: function(result, xhr){
            console.log(xhr);
        }
    });
}

function getQna(){
    $.ajax({
        type:"POST",
        url:NEXT_URL+"/main/qna",
        dataType:'json',
        contentType:"application/json; charset=utf-8",
        success: function(result){
            console.log(result);
            if(result.length>0) {
                var html = '<ul class="qna-list"></ul>';
                $('.contents').append(html);
                for (var i in result) {
                    html = '<li>' +
                        '<span>' + i + '</span>' +
                        '<span>' + result[i].questNo +'</span>' +
                        '<span>'+result[i].questSj+'</span>' +
                        '<span>'+result[i].questCn+'</span>' +
                        '<span>'+result[i].questDt+'</span>' +
                        '</li>';
                    $('.qna-list').append(html);
                }
            }
        },
        complete: function(result, xhr){
            console.log(xhr);
        }
    });
}