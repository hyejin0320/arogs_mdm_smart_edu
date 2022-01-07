$(document).ready(function(){
    initView();
    getQnaList();

    $('#btnCreate').on('click', function(){
        $('.list-section').hide();
        $('.insert').show();
    });

    $('#btnSave').on('click', function(){
        createQna();
    });

    $('#btnCancle').on('click', function(){
        $('.list-section').show();
        $('.insert').hide();
        $('.createform').val('');
    });
});

function getQnaList(){
    $.ajax({
        type:'POST',
        url:NEXT_URL+'/qna/list',
        dataType:'json',
        contentType:"application/json; charset=utf-8",
        success: function(result){
            console.log(result);
            if(result.length>0) {
                var html = '<ul class="qna-list"></ul>';
                $('.list-section').append(html);
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
        }, complete: function(result, xhr){
            console.log(xhr);
        }
    });
}

function createQna(){
    console.log($.trim($(".questSj").val())+'\n'+$.trim($(".questCn").val())+'\n'+$.trim($(".password").val())+'\n'+$.trim($(".qstnerName").val())+'\n'+$.trim($(".qstnerEmail").val())+'\n'+$.trim($(".qstnerMoblphon").val()));

    var formData = {
        questSj: $.trim($(".questSj").val()),
        questCn: $.trim($(".questCn").val()),
        password: $.trim($(".password").val()),
        qstnerName: $.trim($(".qstnerName").val()),
        qstnerEmail: $.trim($(".qstnerEmail").val()),
        qstnerMoblphon: $.trim($(".qstnerMoblphon").val())
    }

    $.ajax({
        type:'POST',
        dataType : "json",
        url: NEXT_URL + "/qna/insert",
        contentType: 'application/json',
        accept: 'application/json',
        data:  JSON.stringify(formData),
        success: function(result){
            console.log(result);
        }, complete: function (result, xhr){
            console.log(xhr);
            $('.qna-list').remove();
            getQnaList();
            $('.list-section').show();
            $('.insert').hide();
            $('.createform').val('');
        }
    });
}