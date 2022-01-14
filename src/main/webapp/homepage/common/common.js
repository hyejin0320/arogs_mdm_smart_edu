
/**
 * jquery selectmenu를 지정한 element에 생성한다.
 * @param $elem : selectmenu를 생성할 jquery 엘리먼트 오브젝트 $("#id") 형태로 넘김
 * @param data  : selectmenu의 option 목록
 * @param textName : option 목록의 화면 표시 오브젝트 key
 * @param valueName : option 목록의 값 오브젝트 key
 */
function common_renderSelectMenu($elem, data, selected, textName, valueName) {

    if ($elem) {
        $elem.html("");

        if (data) {
            for (var i = 0; i < data.length; i++) {
                var datum = data[i];

                var selectOption = {};

                // text key가 있는 경우
                if (textName) {
                    selectOption.text = datum[textName];
                } else {
                    selectOption.text = datum.text;
                }

                // value key가 있는 경우
                if (valueName) {
                    selectOption.value = datum[valueName];
                } else {
                    selectOption.value = datum.value;
                }

                // selected key가 정의되어 있는 경우
                if (selected && selectOption.value == selected) {
                    selectOption.selected = true;
                }

                $elem.append($("<option>", selectOption));
            }
        }
    }

    return $elem;
}