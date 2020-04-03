jQuery(document).ready(function () {
    $.get(
        root + "/system/copyright",
        function (data) {
            $("#left").append("<b>" + data + "</b>>")
        }
    );
    $.get(
        root + "/system/version", function (data) {
            $("#right").append("<b>" + data + "</b>>")
        }
    );
});