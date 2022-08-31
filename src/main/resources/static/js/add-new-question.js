$(document).ready(function() {
    var wrapper = $(".container1");
    var add_button = $(".add_form_field");

    $(add_button).click(function(e) {
        e.preventDefault();
        newRowAdd = '<div>' +
        '<input type="text" name="mytext[]"/>' +
        '<a href="#" class="delete">Delete</a>' +
        '</div>';

        $(wrapper).append(newRowAdd); //add input box
    });

    $(wrapper).on("click", ".delete", function(e) {
        e.preventDefault();
        $(this).parent('div').remove();
    });
});