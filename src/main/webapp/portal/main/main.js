$(document).ready(function(){
   $.ajax({
       type:"POST",
       url:NEXT_URL+"/main/main",
       dataType:'json',
       contentType:"application/json; charset=utf-8",
       success: function(result){
           console.log(result);
           if(result.length>0) {
               console.log('lenght>0');
               var html = '<ul class="notice-list"></ul>';
               $('.contents').append(html);
               for (var i in result) {
                   html = '<li>' + i + ' : ' + result[i].noticeNo + '</li>';
                   $('.notice-list').append(html);
               }
           }
       },
       complete: function(result, xhr){
           console.log(xhr);
       }
   });
});